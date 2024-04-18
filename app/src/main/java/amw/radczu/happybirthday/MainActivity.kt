package amw.radczu.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import amw.radczu.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // GreetingPreview()
                    //BirthDayCardPreview()
                    GreetingText(messageFrom = "Radek", messageTo = "Też Radek")
                }
            }
        }
    }
}

@Composable
fun GreetingText(messageFrom: String, messageTo: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = messageFrom,
            fontSize = 50.sp,
            lineHeight = 56.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
        Text(
            text = messageTo,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My preview"
)
@Composable
fun BirthDayCardPreview() {
    HappyBirthdayTheme {
        GreetingText("its me","Happy birthday bro")
    }
}