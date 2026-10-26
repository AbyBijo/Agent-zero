package com.abybijo.agent0.data

/** v2.0 Phase 4c: cases linked to CH-14 Travel briefs. Real incidents, public sources named. General information, not legal advice. */
object Cases14 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "ryanair-belarus-2021",
            title = "Ryanair Flight Diverted in Belarus (2021)",
            year = "2021",
            tags = listOf("Travel", "Threat Model", "State"),
            summary = "In 2021, a Ryanair flight from Athens to Vilnius was diverted to Minsk, where journalist Roman Protasevich was arrested after landing.",
            details = "Belarusian authorities claimed a bomb threat and sent a fighter jet to escort the plane to Minsk. Protasevich, a dissident journalist, was detained on arrival. The incident showed that a traveller's threat model must include the states whose airspace they cross, not only their destination.",
            lessons = listOf(
                "A travel threat model includes transit states and airspace, not only the destination.",
                "Journalists, activists, and dissidents face state adversaries that other travellers do not. Plan for your own adversary.",
                "Routes are risk decisions. A cheaper route through a hostile jurisdiction is not cheaper."
            ),
            briefKey = "travel/travel-threat-model",
            source = "Reuters (2021)"
        ),
        CaseStudy(
            id = "us-laptop-ban-2017",
            title = "US Laptop Ban on Flights (2017)",
            year = "2017",
            tags = listOf("Travel", "Packing", "Devices"),
            summary = "In 2017, the US banned large electronics from cabins on flights from several Middle Eastern and North African airports, forcing laptops into checked luggage.",
            details = "The ban, introduced on security grounds, meant travellers had to place laptops in hold baggage, where they were out of their control, unencrypted in many cases, and exposed to theft and inspection. Travellers who had packed for cabin-only security suddenly faced hold-baggage exposure.",
            lessons = listOf(
                "Pack for the worst case: assume a device may leave your control, and prepare it accordingly.",
                "What travels in the hold needs the same protection as what travels in the cabin — encryption, minimisation, backup.",
                "Travel rules change. Check them before packing, not at the airport."
            ),
            briefKey = "travel/travel-packing",
            source = "US Department of Homeland Security (2017)"
        ),
        CaseStudy(
            id = "bikkannavar-border-phone-2017",
            title = "NASA Engineer Detained at the Border (2017)",
            year = "2017",
            tags = listOf("Travel", "Border", "Devices"),
            summary = "In 2017, NASA engineer Sidd Bikkannavar, a US citizen, was detained on return to the US and pressured to hand over his phone and its PIN for inspection.",
            details = "Bikkannavar, returning from abroad, was held by Customs and Border Protection and asked for his phone's passcode. He complied after being told he could be detained further. The case, taken up by civil liberties groups, showed that border device searches apply to citizens returning home, not only to visitors.",
            lessons = listOf(
                "Border device searches are a real risk for returning citizens, not only for visitors.",
                "Decide in advance what you will do if asked for a device password, and minimise the device before travel.",
                "Record what happens at a border: who, when, what was asked, and what was done."
            ),
            briefKey = "travel/travel-border",
            source = "The Verge and ACLU (2017)"
        ),
        CaseStudy(
            id = "xinjiang-border-app-2019",
            title = "Border Surveillance App in Xinjiang (2019)",
            year = "2019",
            tags = listOf("Travel", "Clean Device", "Surveillance"),
            summary = "In 2019, investigations found that travellers crossing into Xinjiang, China, had a surveillance app installed on their phones by border officials.",
            details = "The app, identified by researchers, collected contacts, messages, and device data, and scanned for content deemed suspicious. Travellers' own phones became surveillance tools at the border. The findings showed why a clean device — carrying only what the trip requires — matters most where border inspection is most intrusive.",
            lessons = listOf(
                "Where border inspection is intrusive, a clean device is not paranoia; it is proportionate.",
                "A device that returns from a border may not be the device that crossed it. Treat it as untrusted until checked.",
                "Leave personal data at home when crossing a border where inspection is known to be intrusive."
            ),
            briefKey = "travel/travel-clean-device",
            source = "The Guardian and New York Times (2019)"
        ),
        CaseStudy(
            id = "wyndham-breaches-2012",
            title = "Wyndham Hotels Breaches (2008-2010)",
            year = "2012",
            tags = listOf("Travel", "Hotels", "Breach"),
            summary = "Wyndham Hotels suffered three breaches between 2008 and 2010, exposing payment card data of hundreds of thousands of guests, and the US Federal Trade Commission sued over its security failures.",
            details = "Attackers accessed Wyndham's systems through a hotel's local network, then moved to corporate systems. The FTC alleged that Wyndham had failed to use basic protections, including firewalls and proper passwords. Guests who had simply stayed at a hotel found their payment data exposed through the hotel's systems.",
            lessons = listOf(
                "A hotel's systems are part of your exposure when you stay there. Use payment methods with fraud protection, and monitor statements after travel.",
                "Shared hospitality networks are untrusted networks. Treat them as such.",
                "Basic protections — firewalls, strong passwords, segmentation — are not optional for businesses holding guest data."
            ),
            briefKey = "travel/travel-hotels",
            source = "US Federal Trade Commission (2012)"
        ),
        CaseStudy(
            id = "darkhotel-2014",
            title = "Darkhotel and Hotel Wi-Fi (2014)",
            year = "2014",
            tags = listOf("Travel", "Networks", "APT"),
            summary = "Kaspersky revealed in 2014 that an operation called Darkhotel had targeted hotel guests, particularly executives, through compromised hotel Wi-Fi networks.",
            details = "Guests connecting to hotel Wi-Fi were tricked into downloading malicious software updates, giving attackers access to their devices. The operation targeted senior executives travelling in Asia, and had run for years. The hotel network, trusted by guests, was the attack vector.",
            lessons = listOf(
                "Hotel Wi-Fi is an untrusted network, however reputable the hotel. Use protections on every connection.",
                "Never install software updates offered by a hotel network. Updates come from the vendor, not from Wi-Fi.",
                "Senior travellers are targeted travellers. The more senior the guest, the more the network is worth attacking."
            ),
            briefKey = "travel/travel-networks",
            source = "Kaspersky (2014)"
        ),
        CaseStudy(
            id = "khashoggi-consulate-2018",
            title = "Khashoggi and the Istanbul Consulate (2018)",
            year = "2018",
            tags = listOf("Travel", "Meetings", "Safety"),
            summary = "In 2018, journalist Jamal Khashoggi entered the Saudi consulate in Istanbul to obtain documents and was killed inside, in a case investigated by the United Nations and Turkish authorities.",
            details = "Khashoggi, a US-based journalist critical of the Saudi government, had an appointment at the consulate. He was killed after entering. The case is the starkest possible lesson in meeting safety: a meeting in a place controlled by an adversary, without independent safeguards, can be fatal. It is included here soberly, as a warning, not as a detail.",
            lessons = listOf(
                "Never meet an adversary on ground they control, without independent safeguards and people who know where you are.",
                "A routine appointment is not routine when the other party is an adversary. Assess every meeting, however ordinary it seems.",
                "Tell a trusted contact where you are going, when you expect to return, and what to do if you do not."
            ),
            briefKey = "travel/travel-meetings",
            source = "United Nations and Turkish investigation (2018-2019)"
        ),
        CaseStudy(
            id = "clearview-ai-2020",
            title = "Clearview AI and Facial Recognition (2020)",
            year = "2020",
            tags = listOf("Travel", "Surveillance", "Recognition"),
            summary = "In 2020, the New York Times revealed that Clearview AI had scraped billions of images from the web and sold facial recognition services to law enforcement agencies.",
            details = "Clearview built its database by scraping photos from social media and other websites, without the consent of the people in them. Anyone whose face appeared online could be identified from a single photo. The case showed that surveillance while travelling is not only about cameras in streets; it is about databases built from your own public photos.",
            lessons = listOf(
                "Your face, published online, is searchable. Limit public photos, especially with location and time data.",
                "Surveillance awareness includes databases, not only cameras. A photo taken by a stranger can identify you.",
                "Assume that public images of you can be matched, and plan accordingly when travelling."
            ),
            briefKey = "travel/travel-surveillance",
            source = "New York Times (2020)"
        ),
        CaseStudy(
            id = "russian-border-phone-searches-2022",
            title = "Russian Border Phone Searches (2022)",
            year = "2022",
            tags = listOf("Travel", "Device Taken", "Border"),
            summary = "In 2022, reports documented Russian border officials searching the phones of people leaving the country, looking for content critical of the war in Ukraine.",
            details = "Travellers reported that border guards inspected phones, read messages, and checked social media, and that those found with critical content faced detention or denial of exit. The searches turned a routine border crossing into a content inspection, with real consequences for what a device contained.",
            lessons = listOf(
                "A device taken at a border, for any time, is untrusted until it is checked on return.",
                "Content on a device is evidence at a border. Minimise it before crossing, and do not carry what you cannot afford to have read.",
                "Record border inspections, and treat the return-home sequence as mandatory, not optional."
            ),
            briefKey = "travel/travel-device-taken",
            source = "News reports (2022)"
        ),
        CaseStudy(
            id = "desjardins-insider-2019",
            title = "Desjardins Insider Breach (2019)",
            year = "2019",
            tags = listOf("Travel", "Return Home", "Insider"),
            summary = "In 2019, Canadian financial cooperative Desjardins revealed that an employee had copied personal data of 4.2 million members, in a breach discovered only after the data had been taken.",
            details = "The employee, who worked in marketing, accessed and copied member data over time, and the breach was discovered when police informed Desjardins. The case shows that exposure discovered after the fact — like exposure discovered after a trip — needs a deliberate closure sequence: what was taken, who was affected, and what changes now.",
            lessons = listOf(
                "Exposure discovered late still needs closure: scope it, notify, and change what allowed it.",
                "Insider access needs auditing, not only trust. A marketing employee should not be able to copy millions of records unnoticed.",
                "After any exposure, run the full sequence: review, revoke, change, restore, and learn — in order."
            ),
            briefKey = "travel/travel-return-home",
            source = "Desjardins and Quebec regulator (2019)"
        ),
        CaseStudy(
            id = "airbnb-hidden-cameras-2019",
            title = "Hidden Cameras in Rentals (2019)",
            year = "2019",
            tags = listOf("Travel", "Routine", "Rentals"),
            summary = "In 2019, reports documented guests finding hidden cameras in rented accommodation, including in bedrooms and bathrooms, in several countries.",
            details = "Guests discovered cameras disguised as smoke detectors, chargers, and other ordinary objects. Platforms responded by banning indoor cameras, but the discoveries showed that a rental, like a hotel room, is a space you do not control. A routine check on arrival — for unfamiliar devices, especially facing beds and bathrooms — became part of travel advice.",
            lessons = listOf(
                "A rental is a shared space, not a private one. Check it on arrival, as part of your routine.",
                "Routine checks work only when they are routine: the same check, on every trip, not only on suspicious ones.",
                "Report what you find, and preserve evidence. The next guest depends on it."
            ),
            briefKey = "travel/travel-routine",
            source = "News reports and Airbnb policy (2019)"
        )
    )
}
