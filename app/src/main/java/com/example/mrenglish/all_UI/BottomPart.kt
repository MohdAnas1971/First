package com.example.mrenglish.all_UI

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mrenglish.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomMenu() {
    IconsF()

}


@Composable
fun IconsF() {

    Row( modifier=Modifier
        .fillMaxWidth()
        .padding( top = 8.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        ) {
        IconF(R.drawable.baseline_home_24)
        IconF(R.drawable.baseline_contact_phone_24)
        IconF(R.drawable.baseline_voice_chat_24)
        IconF(R.drawable.baseline_home_work_24)
    }

}

@Composable
fun IconF(ico:Int) {

    IconButton(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = ico), contentDescription = "",
            modifier=Modifier.size(75.dp))
    }

}
