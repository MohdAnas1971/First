package com.example.smartalaxa.speakerForText

import android.content.Context
import android.speech.tts.TextToSpeech
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SpeakerViewModel:ViewModel() {

    private val _state= mutableStateOf(SpeakerState())
    val state:State<SpeakerState> = _state


    private var textToSpeech:TextToSpeech? = null


    fun onTextFieldValueChange(text:String){

        _state.value=state.value.copy(
            text = text
        )
    }

    fun textToSpeech(context: Context, message: String){
        _state.value=state.value.copy(
            isButtonEnabled = false
        )

        textToSpeech=TextToSpeech(
            context
        ){

            if(it==TextToSpeech.SUCCESS){
                textToSpeech?.let { textToSpeech ->
                    textToSpeech.language=java.util.Locale.US

                    textToSpeech.setSpeechRate(1.0f)//For Audio Speed

                    textToSpeech.speak(
                     //   _state.value.text,
                        message,
                        TextToSpeech.QUEUE_ADD,
                        null,
                        null

                    )

                }
            }

            _state.value=state.value.copy(
                isButtonEnabled = true
            )
        }
    }

}