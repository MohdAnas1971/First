package com.example.mrenglish.chatBot

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class State {
    var inputText: MutableState<String> = mutableStateOf("")
    val isButtonEnabled:Boolean=true
}
