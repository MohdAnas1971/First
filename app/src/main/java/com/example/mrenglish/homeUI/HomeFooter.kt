package com.example.mrenglish.homeUI

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mrenglish.R

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeFooter(navyController: NavHostController) {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.fillMaxSize()) {
        AllIcons(navyController)
    }

}


@Composable
fun AllIcons(navyController: NavHostController) {

    Row( modifier= Modifier
        .fillMaxWidth()
        .height(70.dp)
        .padding(top = 8.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        ) {
        IconF(R.drawable.baseline_account_circle_24,navyController,"UserProfile")
        IconF(R.drawable.baseline_person_search_24, navyController, "CallHomeUI")
        IconF(R.drawable.baseline_home_24, navyController, "HomeUi")
        IconF(R.drawable.baseline_voice_chat_24, navyController, "ChatBot")
        IconF(R.drawable.baseline_more_vert_24, navyController,  "MoreFeature")


    }

}

@Composable
fun IconF(ico: Int, navyController: NavHostController, screenName: String) {

    IconButton(onClick = {navyController.navigate( screenName) }) {
        Icon(painter = painterResource(id = ico), contentDescription = "",
            modifier=Modifier.size(75.dp))
    }

}
