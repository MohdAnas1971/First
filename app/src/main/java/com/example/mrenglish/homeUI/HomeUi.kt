package com.example.mrenglish.homeUI

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeUI(navyController: NavHostController) {

    val context= LocalContext.current

  Column(verticalArrangement = Arrangement.SpaceEvenly) {

      HomeHeader(context)
      HomeFooter(navyController)
  }
}