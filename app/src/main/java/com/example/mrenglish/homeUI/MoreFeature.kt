package com.example.mrenglish.homeUI

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.mrenglish.R


@Composable
fun MoreFeature(navyController: NavHostController) {

    Row(horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()) {
        IconF(R.drawable.baseline_person_search_24, navyController, "CallHomeUI")
        IconF(R.drawable.baseline_voice_chat_24, navyController, "TalkWithMeHOmeUI")
        IconF(R.drawable.baseline_chat_24, navyController, "ChatBotHomeUI")
        IconF(R.drawable.baseline_collections_24, navyController, "VocabHomeUI")
        IconF(R.drawable.baseline_videocam_24, navyController,  "CameraVideoHomeUI")
    }
}


