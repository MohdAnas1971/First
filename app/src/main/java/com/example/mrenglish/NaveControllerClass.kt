package com.example.mrenglish

import android.content.Intent
import androidx.activity.result.ActivityResultLauncher
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mrenglish.cameraVideo.CameraVideoHomeUI
import com.example.mrenglish.chatBot.ChatBot
import com.example.mrenglish.chatBot.State
import com.example.mrenglish.chatBotMr.TalkWithMeHOmeUI
import com.example.mrenglish.homeUI.HomeUI
import com.example.mrenglish.homeUI.MoreFeature
import com.example.mrenglish.talkWithOther.CallHomeUI
import com.example.mrenglish.userProfile.UserProfile
import com.example.mrenglish.vocabularyMr.VocabHomeUI

@Composable
fun NaveControllerClass(stateVoice: State, launcherStart: ActivityResultLauncher<Intent>) {
    lateinit  var stat:MutableState<String>
    val navyController=rememberNavController()


    NavHost(navController = navyController, startDestination ="HomeUi" ) {


        composable(route = "HomeUi"){ HomeUI(navyController)}
        composable(route = "VocabHomeUI"){  VocabHomeUI(navyController)   }
        composable(route = "CallHomeUI"){ CallHomeUI(navyController)  }
        composable(route = "ChatBot"){ChatBot((navyController),stateVoice, launcherStart) }
        composable(route = "TalkWithMeHOmeUI"){   TalkWithMeHOmeUI(navyController)  }
        composable(route = "CameraVideoHomeUI"){  CameraVideoHomeUI(navyController)  }
        composable(route = "UserProfile"){  UserProfile(navyController)   }
        composable(route = "MoreFeature"){  MoreFeature(navyController)  }

    }

}