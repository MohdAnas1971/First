
package com.example.mrenglish.chatBot


import android.content.Intent
import androidx.activity.result.ActivityResultLauncher
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.smartalaxa.speakerForText.SpeakerViewModel


@Composable
fun ChatBot(
    navController: NavHostController,
    stateVoice:State,
    launcherStart: ActivityResultLauncher<Intent>,
    viewModel:ViewModelCha= viewModel()
) {
    val viewModelSpeaker: SpeakerViewModel = viewModel()
    val context= LocalContext.current
    Column(
        verticalArrangement = Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    )
    {
        ChatHeader(navController)
        
        Box(
            modifier = Modifier
                .weight(1f),
         contentAlignment = Alignment.Center
        ){


            if ( viewModel.list.isEmpty()){
                ChatSuggestion( navController, stateVoice)
            }else{
                ChatList( list = viewModel.list,stateVoice)
            }
           
        }
        ChatFooter( stateVoice,context, launcherStart) {

            if (it.isNotEmpty()){

viewModel.sendMassageF( viewModelSpeaker,context,it)

            }
        }
    }

}



