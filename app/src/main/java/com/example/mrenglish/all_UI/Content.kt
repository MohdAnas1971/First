package com.example.mrenglish.all_UI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mrenglish.data_all.imaData

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VocabData(){

    LazyColumn(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(1.dp)
            .fillMaxWidth(),
        content = {
            items(imaData()){ item ->

                Card {
Row(horizontalArrangement = Arrangement.SpaceEvenly) {
    ContentBox(item.id,item.name)
    ContentBox(item.id,item.name)
}

                }
            }
        }
        )


}


@Composable
fun ContentBox(imgId:Int,name:String){
    Column {

        Image(painterResource(id = imgId) ,
            contentDescription = "Vocab image",
            modifier= Modifier
                .padding(3.dp)
                .background(color = Color.Black)
               .width(185.dp)
                .height(185.dp)
        )
        Text(text =name,
            fontSize = 40.sp)
    }
}

