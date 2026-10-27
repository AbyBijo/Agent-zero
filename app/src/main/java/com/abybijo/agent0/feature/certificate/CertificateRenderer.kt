package com.abybijo.agent0.feature.certificate

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Typeface
import android.graphics.pdf.PdfDocument
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.abybijo.agent0.R
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * v2.0 Phase 5e — Certificate rendering.
 *
 * The certificate carries the Agent-0 sigil (the app's own vector
 * logo), "AGENT-0" text, the learner's real name, and the wording
 * "has completed the Agent Zero OPSEC Course" (user decision
 * 2026-10-27). It also states plainly that it is a self-paced,
 * on-device completion record, not an accredited qualification.
 * Notes, bookmarks, and every other personal record are excluded
 * from the certificate by construction: only the name and the
 * completion date go on it.
 *
 * Everything here is local: PNG/PDF are drawn on-device, downloads
 * go to the user's own Downloads folder, and sharing goes through
 * the system chooser via a non-exported FileProvider that exposes
 * only the app cache's certificates directory.
 */
object CertificateRenderer {

    const val PNG_NAME = "Agent-0-Certificate.png"
    const val PDF_NAME = "Agent-0-Certificate.pdf"

    private const val WIDTH = 1800
    private const val HEIGHT = 1273 // A4 landscape ratio
    private val CREAM = 0xFFF5F0E1.toInt()
    private val YELLOW = 0xFFFFC107.toInt()

    fun formatDate(dateMillis: Long): String =
        SimpleDateFormat("d MMMM yyyy", Locale.ENGLISH).format(Date(dateMillis))

    /** Draws the certificate into a bitmap, identical for PNG and PDF. */
    fun renderBitmap(context: Context, name: String, dateMillis: Long): Bitmap {
        val bitmap = Bitmap.createBitmap(WIDTH, HEIGHT, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        canvas.drawColor(Color.BLACK)

        val cream = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = CREAM
            textAlign = Paint.Align.CENTER
        }

        // Border: thick outer rule, thin inner rule.
        val border = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = CREAM
            style = Paint.Style.STROKE
        }
        border.strokeWidth = 10f
        canvas.drawRect(50f, 50f, WIDTH - 50f, HEIGHT - 50f, border)
        border.strokeWidth = 3f
        canvas.drawRect(80f, 80f, WIDTH - 80f, HEIGHT - 80f, border)

        // Sigil logo, centred.
        ContextCompat.getDrawable(context, R.drawable.ic_sigil)?.let { sigil ->
            val size = 260
            sigil.setBounds(
                WIDTH / 2 - size / 2, 150,
                WIDTH / 2 + size / 2, 150 + size
            )
            sigil.draw(canvas)
        }

        var y = 520f
        cream.typeface = Typeface.DEFAULT_BOLD
        cream.letterSpacing = 0.25f
        y = drawCentered(canvas, "AGENT-0", y, cream, 64f, WIDTH - 300f)

        cream.letterSpacing = 0f
        y += 60f
        cream.typeface = Typeface.DEFAULT_BOLD
        y = drawCentered(canvas, "Certificate of Completion", y, cream, 118f, WIDTH - 300f)

        // Yellow accent rule (the only colour on the certificate).
        val rule = Paint(Paint.ANTI_ALIAS_FLAG).apply { color = YELLOW }
        y += 40f
        canvas.drawRect(WIDTH / 2 - 300f, y, WIDTH / 2 + 300f, y + 4f, rule)
        y += 90f

        cream.typeface = Typeface.DEFAULT
        y = drawCentered(canvas, "This certifies that", y, cream, 58f, WIDTH - 300f)
        y += 50f
        cream.typeface = Typeface.DEFAULT_BOLD
        y = drawCentered(canvas, name, y, cream, 128f, WIDTH - 300f)
        y += 60f
        cream.typeface = Typeface.DEFAULT
        y = drawCentered(
            canvas, "has completed the Agent Zero OPSEC Course",
            y, cream, 62f, WIDTH - 300f
        )
        y += 120f
        cream.typeface = Typeface.DEFAULT
        y = drawCentered(
            canvas, "Completed on ${formatDate(dateMillis)}",
            y, cream, 48f, WIDTH - 300f
        )
        y += 90f
        val small = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = CREAM
            textAlign = Paint.Align.CENTER
        }
        drawCentered(
            canvas,
            "Self-paced, on-device completion record \u2014 not an accredited qualification",
            y, small, 40f, WIDTH - 300f
        )
        return bitmap
    }

    private fun drawCentered(
        canvas: Canvas, text: String, y: Float,
        paint: Paint, size: Float, maxWidth: Float
    ): Float {
        paint.textSize = size
        var fitted = size
        while (paint.measureText(text) > maxWidth && fitted > 20f) {
            fitted -= 4f
            paint.textSize = fitted
        }
        canvas.drawText(text, WIDTH / 2f, y, paint)
        return y
    }

    fun renderPng(context: Context, name: String, dateMillis: Long): ByteArray {
        val out = ByteArrayOutputStream()
        renderBitmap(context, name, dateMillis)
            .compress(Bitmap.CompressFormat.PNG, 100, out)
        return out.toByteArray()
    }

    /** Same artwork as the PNG, drawn onto one A4-landscape PDF page. */
    fun renderPdf(context: Context, name: String, dateMillis: Long): ByteArray {
        val bitmap = renderBitmap(context, name, dateMillis)
        val doc = PdfDocument()
        val page = doc.startPage(PdfDocument.PageInfo.Builder(842, 595, 1).create())
        page.canvas.drawColor(Color.BLACK)
        page.canvas.drawBitmap(bitmap, null, Rect(0, 0, 842, 595), null)
        doc.finishPage(page)
        val out = ByteArrayOutputStream()
        doc.writeTo(out)
        doc.close()
        return out.toByteArray()
    }

    /** Saves to the user's Downloads/Agent-0 folder; returns its Uri, or null. */
    fun saveToDownloads(context: Context, bytes: ByteArray, fileName: String, mime: String): Uri? {
        return runCatching {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                val values = ContentValues().apply {
                    put(MediaStore.Downloads.DISPLAY_NAME, fileName)
                    put(MediaStore.Downloads.MIME_TYPE, mime)
                    put(MediaStore.Downloads.RELATIVE_PATH, "Download/Agent-0")
                    put(MediaStore.Downloads.IS_PENDING, 1)
                }
                val resolver = context.contentResolver
                val uri = resolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, values)
                    ?: return null
                resolver.openOutputStream(uri)?.use { it.write(bytes) }
                values.clear()
                values.put(MediaStore.Downloads.IS_PENDING, 0)
                resolver.update(uri, values, null, null)
                uri
            } else {
                val dir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)
                    ?: return null
                if (!dir.exists()) dir.mkdirs()
                val file = File(dir, fileName)
                FileOutputStream(file).use { it.write(bytes) }
                Uri.fromFile(file)
            }
        }.getOrNull()
    }

    /** Shares one certificate file through the system chooser. */
    fun share(context: Context, bytes: ByteArray, fileName: String, mime: String) {
        runCatching {
            val dir = File(context.cacheDir, "certificates")
            if (!dir.exists()) dir.mkdirs()
            val file = File(dir, fileName)
            FileOutputStream(file).use { it.write(bytes) }
            val uri = FileProvider.getUriForFile(
                context, "${context.packageName}.fileprovider", file
            )
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = mime
                putExtra(Intent.EXTRA_STREAM, uri)
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }
            context.startActivity(Intent.createChooser(intent, "Share certificate"))
        }
    }
}
