package com.example.mrenglish.chatBot

import android.content.Context
import android.content.Intent
import android.speech.RecognizerIntent
import androidx.activity.result.ActivityResultLauncher


fun AlexaUi(
   // speechText: State,
    context: Context,
    launcherStart: ActivityResultLauncher<Intent>,
) {


    val intent= Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)

    intentLauncher(intent,launcherStart,context)

}

fun intentLauncher(intent: Intent, launcherStart: ActivityResultLauncher<Intent>, context: Context) {
    intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
    intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,java.util.Locale.getDefault())
    intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Speak Now")
    context.startActivity(intent)
    launcherStart.launch(intent)
}