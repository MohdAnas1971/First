package com.example.mrenglish

import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.mrenglish.chatBot.State
import com.example.mrenglish.ui.theme.MrEnglishTheme
import com.example.mrenglish.BuildConfig

class MainActivity : ComponentActivity() {

    private lateinit  var launcherStart : ActivityResultLauncher<Intent>//variable to Start MIC
    private var stateVoice =  State()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        launcherStart=           //declaration of launcherStart actual value
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                if(it.resultCode== RESULT_OK && it.data !=null) {
                    val resultData = it.data
                    val resultArray = resultData?.getStringArrayListExtra((RecognizerIntent.EXTRA_RESULTS))
                   stateVoice.inputText.value = resultArray?.get(0).toString()

                }
            }
        setContent {

            MrEnglishTheme {


                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NaveControllerClass(stateVoice, launcherStart)
                }
            }
        }
    }
}
