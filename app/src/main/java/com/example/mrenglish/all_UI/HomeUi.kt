package com.example.mrenglish.all_UI

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeUI(){
  Column(verticalArrangement = Arrangement.SpaceEvenly) {
      TopPart()
      Box(modifier = Modifier.height(600.dp)
          ){
          VocabData()
      }

      BottomMenu()
  }
}