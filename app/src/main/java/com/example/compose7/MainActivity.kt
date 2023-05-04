package com.example.compose7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose7.ui.theme.Compose7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose7Theme {
                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                    ItemLists(name = "Stanislav Kniazev", profession = "Mobile Developer")
                }


            }
        }
    }
}

@Composable
fun ItemLists(name: String, profession: String) {

    var counter = remember {
        mutableStateOf(0)
    }

    var buttonColor = remember {
        mutableStateOf(Color.LightGray)
    }

    var finalResult = remember {
        mutableStateOf("Grey Color")
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        elevation = 12.dp, shape = RoundedCornerShape(10.dp)
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.me), contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(80.dp)
                        .clip(CircleShape)
                )

                Column(modifier = Modifier.padding(start = 5.dp, end = 50.dp)) {
                    Text(text = counter.value.toString(), fontWeight = FontWeight.Bold)
                    Text(text = finalResult.value)
                }


                Button(onClick = {
                    counter.value++


                }, colors = ButtonDefaults.buttonColors(buttonColor.value)) {
                    Text(text = "Click")

                    if (counter.value >= 10) {
                        buttonColor.value = MaterialTheme.colors.primary
                        finalResult.value = "Primary Color"
                    }
                    if (counter.value >= 20) {
                        buttonColor.value = MaterialTheme.colors.secondary
                        finalResult.value = "Secondary Color"
                    }
                }


            }
        }
    }
}