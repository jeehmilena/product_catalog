package br.com.jessica.productcatalog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun MyText() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Este é um exemplo")
        Text(text = "Este é um exemplo de cor", color = Color.Magenta)
        Text(text = "Este é um exemplo de fonte bold", fontWeight = FontWeight.ExtraBold)
        Text(text = "Este é um exemplo de fonte light", fontWeight = FontWeight.Light)
        Text(
            text = "Este é um exemplo de fonte cursiva com tamanho grande",
            style = TextStyle(fontFamily = FontFamily.Cursive, fontSize = 30.sp )
        )
    }
}
