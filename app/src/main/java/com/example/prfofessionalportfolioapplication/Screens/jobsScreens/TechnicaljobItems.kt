package com.example.prfofessionalportfolioapplication.Screens.jobsScreens


import android.graphics.drawable.Icon
import com.example.prfofessionalportfolioapplication.R

data class TechnicaljobItems(
    val designation: String,
    val areaIcon: Int,
    val area: String,
    val experience: String,
    val timeIcon: Int,
    val jobType: String, // full time , contract , part time
    val bagIcon: Int,
    val textByCompany: String,
    val companyName: String,
    val durationWhenCompanyPostTheJob: String
)


// here i create one function which return me the list of all these data
fun getAllTechnicalJobsItems(): List<TechnicaljobItems> {
    return listOf(
        TechnicaljobItems(
            "Android Developer",
            R.drawable.location,
            "Dehradun",
            "0-4 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "Seeking a skilled Mobile App Developer to design and develop engaging mobile applications for Android and iOS. You will work with designers and backend developers to create seamless user experiences.\n" +
                    "\n",
            "Novanectar",
            "5 min ago"
        ),

        TechnicaljobItems(
            "Web Developer",
            R.drawable.location,
            "Dehradun",
            "4 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "Join our dynamic team as a Web Developer to create responsive, user-friendly websites and web applications. You will be responsible for front-end and back-end development using modern web technologies.\n" +
                    "\n",

            "Novanectar",
            "4 days"
        ),

        TechnicaljobItems(
            "Data Scientist",
            R.drawable.location,
            "Dehradun",
            "1 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We are looking for a Data Scientist who can turn raw data into actionable insights. You will build predictive models, analyze trends, and help guide business strategies using data-driven approaches.",

            "Novanectar",
            "3 days"
        ),

        TechnicaljobItems(
            "DevOps Engineer",
            R.drawable.location,
            "Dehradun",
            "0-2 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "Seeking a DevOps Engineer to automate infrastructure, manage CI/CD pipelines, and support scalable deployments. You’ll collaborate with developers to ensure fast and reliable software delivery.",

            "Novanectar",
            "now"
        ),

        TechnicaljobItems(
            "Cybersecurity Analyst",
            R.drawable.location,
            "Dehradun",
            "1 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "Looking for a proactive Cybersecurity Analyst to safeguard our systems from digital threats. Responsibilities include monitoring security events, conducting vulnerability assessments, and implementing protection measures.",

            "Novanectar",
            "34 min ago"
        ),

        TechnicaljobItems(
            "Cloud Engineer",
            R.drawable.location,
            "Dehradun",
            "00 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We’re hiring a Cloud Engineer to manage and optimize our cloud infrastructure. You’ll be responsible for deploying, monitoring, and securing applications on platforms like AWS, Azure, or Google Cloud.\n" +
                    "\n",

            "Novanectar",
            "4 days"
        ),

        TechnicaljobItems(
            "Database Administrator (DBA)",
            R.drawable.location,
            "Dehradun",
            "1 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "Join us as a Database Administrator to oversee the installation, configuration, and performance tuning of our databases. Ensure data integrity, security, and high availability across all systems.\n" +
                    "\n",
            "Novanectar",
            "30 days"
        ),

        TechnicaljobItems(
            "Machine Learning Engineer",
            R.drawable.location,
            "Dehradun",
            "6+ Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We are looking for a Machine Learning Engineer to develop ML models and integrate them into our products. You will work with large datasets and deploy AI solutions to solve real-world problems.",
            "Novanectar",
            "40 days"
        ),

        TechnicaljobItems(
            " UI/UX Designer",
            R.drawable.location,
            "Dehradun",
            "4 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "We are seeking a creative UI/UX Designer to craft intuitive and visually appealing user interfaces. You’ll work closely with developers and product managers to improve user experience and interaction design",
            "Novanectar",
            "21 days"
        ),

        TechnicaljobItems(
            " System Administrator",
            R.drawable.location,
            "Dehradun",
            "0 Years",
            R.drawable.clock,
            "Full Time",
            R.drawable.bag,
            "Join our IT team as a System Administrator responsible for maintaining and troubleshooting servers, networks, and hardware. You’ll ensure system reliability, security, and efficient performance for all internal users.",
            "Novanectar",
            "4 hr ago"
        ),


        )
}

