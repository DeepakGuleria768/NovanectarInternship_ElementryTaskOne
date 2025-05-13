package com.example.prfofessionalportfolioapplication.Screens.jobsScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.prfofessionalportfolioapplication.ui.theme.SoftWhite
import com.example.prfofessionalportfolioapplication.ui.theme.iconColor
import com.example.prfofessionalportfolioapplication.ui.theme.jobCardColor

@Composable
fun TechnicalJobsScreen(
    navController: NavController
) {

    val myList = getAllTechnicalJobsItems()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = SoftWhite),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        LazyColumn(

        ) {
            items(myList) { item ->
                TechnicalJobSingleComponent(
                    designation = item.designation,
                    areaIcon = item.areaIcon,
                    area = item.area,
                    experience = item.experience,
                    timeIcon = item.timeIcon,
                    jobType = item.jobType,
                    bagIcon = item.bagIcon,
                    textByCompany = item.textByCompany,
                    companyName = item.companyName,
                    durationWhenCompanyPostTheJob = item.durationWhenCompanyPostTheJob,
                    navController = navController
                )
            }

        }
    }
}

@Composable
fun TechnicalJobSingleComponent(
    designation: String,
    areaIcon: Int,
    area: String,
    experience: String,
    timeIcon: Int,
    jobType: String, /* full time , contract , part time */
    bagIcon: Int,
    textByCompany: String,
    companyName: String,
    durationWhenCompanyPostTheJob: String,
    navController: NavController
) {

    ElevatedCard(
        onClick = {navController.navigate("from_filling")},
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        colors = CardDefaults.elevatedCardColors(
            containerColor = jobCardColor
        ),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 9.dp
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(start = 10.dp , end = 10.dp)
        ) {
            Text(
                text = designation,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp)
            )
            Spacer(Modifier.height(5.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = areaIcon),
                    contentDescription = "area icon",
                    modifier = Modifier
                        .size(25.dp)
                        .padding(start = 10.dp),
                    tint = iconColor
                )
                Spacer(Modifier.width(5.dp))
                Text(
                    text = area,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Icon(
                    painter = painterResource(id = timeIcon),
                    contentDescription = "area icon",
                    modifier = Modifier
                        .size(25.dp)
                        .padding(start = 10.dp), tint = iconColor
                )
                Spacer(Modifier.width(5.dp))
                Text(
                    text = experience,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Icon(
                    painter = painterResource(id = bagIcon),
                    contentDescription = "area icon",
                    modifier = Modifier
                        .size(25.dp)
                        .padding(start = 10.dp),
                    tint = iconColor
                )
                Spacer(Modifier.width(5.dp))
                Text(
                    text = jobType,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(Modifier.height(5.dp))

            Text(
                text = textByCompany,
                fontSize =20.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(start = 10.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "Posted by",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(
                        text = companyName,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = timeIcon),
                        contentDescription = "time icon",
                        modifier = Modifier.size(14.dp),
                        tint = iconColor
                    )
                    Text(
                        text = durationWhenCompanyPostTheJob,
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun TechnicalJobSingleItemsPreview() {
    val navController = rememberNavController()
    TechnicalJobsScreen(navController = navController)
}