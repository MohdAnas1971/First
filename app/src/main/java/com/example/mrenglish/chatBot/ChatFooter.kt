package com.example.mrenglish.chatBot

import android.content.Context
import android.content.Intent
import androidx.activity.result.ActivityResultLauncher
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mrenglish.R


@Composable
fun  ChatFooter(
    stateVoice: State,
    context:Context,
    launcherStart: ActivityResultLauncher<Intent>,
    onClick: (text: String) -> Unit

) {
    // for Alexa


    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            //.background(Blue)
            .padding(10.dp)
        ) {


        OutlinedTextField(value =stateVoice.inputText.value ,
            onValueChange ={stateVoice.inputText.value=it},
            placeholder ={ Text(text = "F-AID : Ask For Your Health")},
//singleLine=true,
            modifier = Modifier
                .weight(1f)
               // .background(BlueLight)
            )



        IconButton(onClick = { AlexaUi(
           // stateVoice,
            context, launcherStart)}
        ) {
            Icon(
                painterResource(id = R.drawable.baseline_mic_24),
                contentDescription = "MIC for speak",
                modifier=Modifier
                    .size(30.dp)
                    //.rotate(270f)
                    .clip(CircleShape)
                   // .background(Color.Blue)
                    .padding(8.dp),
                //tint = Color.Green
            )
        }
        IconButton(onClick = {
            onClick(stateVoice.inputText.value)
            stateVoice.inputText.value="" }
        ) {
Icon(Icons.Rounded.ArrowForward,
    contentDescription = "send button",
    modifier=Modifier
        .size(50.dp)
        .rotate(270f)
        .clip(CircleShape)
        .background(Color.Black)
        .padding(8.dp),
    tint = Color.Blue

    )

        }
    }
}