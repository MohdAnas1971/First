package com.example.mrenglish.all_UI


import android.graphics.Paint
import android.graphics.Paint.Align
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mrenglish.R


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TopPart(){

TopMenu(Modifier)
}



@Composable
fun TopMenu(modifier: Modifier){
val iconSize=36
    Column {

        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Icon(Icons.Rounded.Menu, contentDescription ="Profile logo",
                Modifier.size(iconSize.dp))
            Text(text = "Mr.English",
                color = Color.Green,
                modifier=Modifier,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W500,
                fontSize = 40.sp )
            Icon(Icons.Rounded.Notifications, contentDescription ="Notification logo",
                Modifier.size(iconSize.dp))

            Icon(Icons.Rounded.Share, contentDescription ="share logo" ,
                Modifier.size(iconSize.dp))
        }

        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {

            Icon(
                painterResource(id = R.drawable.my), contentDescription ="Profile logo",
                Modifier.size(60.dp))
            InputField()
          //  Text(text = "HOME", modifier=Modifier, fontSize = 36.sp )
Row(verticalAlignment = Alignment.CenterVertically,
    modifier=Modifier.height(50.dp)) {

    Icon(Icons.Rounded.Search, contentDescription ="search logo",
        Modifier.size(iconSize.dp))
}

        }
    }
}



@Composable
fun InputField(){
    val text= remember {
        mutableStateOf("")
    }
    Row(verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(value = text.value,
            onValueChange ={text.value=it},
            textStyle = TextStyle(fontSize =15.sp, textAlign = TextAlign.Center),
            shape = CircleShape,
            modifier = Modifier
                .align (Alignment.CenterVertically)
                .size(height = 45.dp, width = 250.dp)
        )    }




}


