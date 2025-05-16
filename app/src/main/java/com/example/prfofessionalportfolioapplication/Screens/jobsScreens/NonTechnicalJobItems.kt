package com.example.prfofessionalportfolioapplication.Screens.jobsScreens

import android.graphics.drawable.Icon
import com.example.prfofessionalportfolioapplication.R

data class NonTechnicalJobItems(
    val designation: String,
    val area: String,
    val areaIcon: Icon,
    val experience: String,
    val timeIcon: Icon,
    val jobType: String, // full time , contract , part time
    val bagIcon: Icon,
    val textByCompany: String,
    val companyName: String,
    val role: String
)

// here i create one function which return me the list of all these data
fun getAllNonTechnicalJobsItems(): List<TechnicaljobItems> {
    return listOf(
        TechnicaljobItems(
            "Project Manager",
            R.drawable.location,
            "Dehradun",
            "0-4 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We are looking for a skilled Project Manager to lead our IT projects from start to finish. You will coordinate with teams, manage timelines, and ensure successful project delivery within scope and budget.",
            "Novanectar",
            "5 min ago"
        ),

        TechnicaljobItems(
            "Business Analyst ",
            R.drawable.location,
            "Dehradun",
            "4 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "Join our team as a Business Analyst to help bridge the gap between our clients and development teams. You will analyze business needs and help design effective software solutions that meet user expectations.",

            "Novanectar",
            "4 days"
        ),

        TechnicaljobItems(
            "HR Specialist / IT Recruiter  ",
            R.drawable.location,
            "Dehradun",
            "1 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We are hiring an enthusiastic HR Specialist to manage recruitment, employee engagement, and HR operations. If you have a passion for people and strong organizational skills, we’d love to meet you.",
            "Novanectar",
            "3 days"
        ),

        TechnicaljobItems(
            "Technical Writer ",
            R.drawable.location,
            "Dehradun",
            "0-2 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We need a detail-oriented Technical Writer to create user guides, manuals, and product documentation. You’ll work closely with developers to turn complex information into clear, user-friendly content.",
            "Novanectar",
            "now"
        ),

        TechnicaljobItems(
            " Quality Analyst (Manual Testing)",
            R.drawable.location,
            "Dehradun",
            "1 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We’re looking for a Manual Tester to join our QA team. You’ll be responsible for finding bugs, improving product quality, and ensuring our software runs smoothly before it reaches customers.",
            "Novanectar",
            "34 min ago"
        ),

        TechnicaljobItems(
            "Customer Support / Helpdesk Executive",
            R.drawable.location,
            "Dehradun",
            "00 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We are hiring friendly and tech-savvy Customer Support Executives to assist our users. Your role is to troubleshoot issues and provide a smooth support experience through chat, email, or phone.\n" +
                    "\n",
            "Novanectar",
            "4 days"
        ),

        TechnicaljobItems(
            "Sales Executive (IT Sales)",
            R.drawable.location,
            "Dehradun",
            "1 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "If you have a passion for technology and strong communication skills, join us as an IT Sales Executive. You’ll be responsible for identifying leads, building relationships, and closing software sales.",
            "Novanectar",
            "30 days"
        ),

        TechnicaljobItems(
            "Digital Marketing Executive ",
            R.drawable.location,
            "Dehradun",
            "6+ Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We’re expanding our digital team! As a Digital Marketing Executive, you’ll plan and execute online campaigns, manage social media, and help grow our online presence through SEO and content marketing.",
            "Novanectar",
            "40 days"
        ),

        TechnicaljobItems(
            " Content Writer / Copywriter",
            R.drawable.location,
            "Dehradun",
            "4 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We are looking for a creative Content Writer to develop engaging content for blogs, websites, and marketing materials. A good command of language and interest in tech is a plus.",
            "Novanectar",
            "21 days"
        ),

        TechnicaljobItems(
            " Product Manager",
            R.drawable.location,
            "Dehradun",
            "0 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We’re seeking a Product Manager to define the product vision, plan feature releases, and collaborate with cross-functional teams. Help us build solutions that our users will love.",
            "Novanectar",
            "4 hr ago"
        ),


        )
}