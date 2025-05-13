package com.example.prfofessionalportfolioapplication.Screens.jobsScreens

import android.graphics.drawable.Icon

data class NonTechnicalJobItems(
val designation : String,
val area :String,
val areaIcon : Icon,
val experience : String,
val timeIcon : Icon,
val jobType : String, // full time , contract , part time
val bagIcon : Icon,
val textByCompany : String,
val companyName : String,
val role : String
)

