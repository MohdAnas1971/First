package com.example.mrenglish.homeUI


import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeHeader(context: Context) {

TopMenu(context)
}



@Composable
fun TopMenu(context: Context) {
val iconSize=25
    Column(Modifier.padding(5.dp)) {

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


            IconButton(onClick = {
                shareButtonAction(context)
            },
                modifier = Modifier
                    .clip(RoundedCornerShape(100f))
                    .background(Color.White),
            ) {
                Icon(Icons.Rounded.Share, contentDescription ="share logo" ,
                    Modifier.size(iconSize.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Text(text = "HOME")
        }

        Text(text = "TODAY TASK")
        Text(text = "TODAY ACHIEVEMENT")


//        Row(modifier= Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween) {
//
////            Icon(
////                painterResource(id = R.drawable.my), contentDescription ="Profile logo",
////                Modifier.size(60.dp))
//          //  InputField()
//          //  Text(text = "HOME", modifier=Modifier, fontSize = 36.sp )
////Row(verticalAlignment = Alignment.CenterVertically,
////    modifier=Modifier.height(50.dp)) {
////
////    Icon(Icons.Rounded.Search, contentDescription ="search logo",
////        Modifier.size(iconSize.dp))
////}
//
//        }
    }
}



@Composable
fun InputField() {

    val text= remember {
        mutableStateOf("")
    }
  //  val text= viewModel.text

    Row(verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(value =text.value, //text.value,
            onValueChange ={
                         text.value=it//text.value=it//text.value=it
                 },
            textStyle = TextStyle(fontSize =15.sp, textAlign = TextAlign.Center),
            shape = CircleShape,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .size(height = 45.dp, width = 250.dp)
        )    }
}


fun shareButtonAction(context: Context) {
    val shareIntent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, "Check Out this Link: https://github.com/MohdAnas1971/F-AID.git")
        type = "text/plain"
    }
    val chooserIntent = Intent.createChooser(shareIntent, null)
    context.startActivity(chooserIntent)
}