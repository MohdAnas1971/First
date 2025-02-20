package com.example.mrenglish.chatBot

import android.content.Context
import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartalaxa.speakerForText.SpeakerViewModel
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.launch
import com.example.mrenglish.BuildConfig
class ViewModelCha : ViewModel() {


    private val apiKey=BuildConfig.API_KEY

    val list by lazy {
        mutableStateListOf<ChatData>()
    }

    private val genAI by lazy {
        GenerativeModel(
            modelName ="gemini-pro",
            apiKey =apiKey //"AIzaSyAcOkUgCkQKu0Aj0MKdvej-C6HhsA3lblY"
        )
    }

    fun sendMassageF(  viewModelSpeaker: SpeakerViewModel,context:Context,message: String) = viewModelScope.launch {

        val chat =genAI.startChat()
        list.add(ChatData(message,ChatRoleEnum.USER.role))

        chat.sendMessage(content(ChatRoleEnum.USER.role
        ) { text(message) }).text?.let {
            list.add(ChatData(it,ChatRoleEnum.MODEL.role))
            viewModelSpeaker.textToSpeech(context,it)
        }
        val response: String? = genAI.startChat().sendMessage(prompt = message).text

        Log.d("AI_ANS", response.toString())
    }

}