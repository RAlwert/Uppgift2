package se.ralwert.uppgift2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import se.ralwert.uppgift2.ui.theme.Uppgift2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Uppgift2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
Buttonlist()                }
            }
        }
    }
}

@Composable
fun Buttonlist() {

    var addX by remember {
        mutableStateOf("x")
    }

    var addY by remember {
        mutableStateOf("y")
    }
    var Listitems = remember {
        mutableStateListOf<Mylist>()
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.Blue),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                var xAdd = Mylist(addX)
                Listitems.add(xAdd)
            }) {
                Text("X")
            }
            Button(onClick = {
                var yAdd = Mylist(addY)
                Listitems.add(yAdd)
            }) {
                Text("Y")
            }
        }
LazyColumn(modifier = Modifier
    .fillMaxWidth()
    .height(500.dp)
    .background(Color.LightGray)){
    items(Listitems){myrowitem ->
        myRow(myrowitem)
    }

}
Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.height(150.dp)) {
    Spacer(modifier = Modifier.weight(1f))
    Button(onClick = { Listitems.clear()}) {
        Text("Reset")
    }
    Spacer(modifier = Modifier.weight(1f))

}
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Uppgift2Theme {
        Buttonlist()
    }
}