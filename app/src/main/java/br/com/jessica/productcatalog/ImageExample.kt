package br.com.jessica.productcatalog

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyImage() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "Exemplo"
    )
}

@Composable
fun MyImageAdvance() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "Exemplo",
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Magenta, CircleShape)
    )
}

@Preview
@Composable
fun MyIcon() {
    Column(modifier = Modifier.fillMaxSize()) {
        Icon(
            imageVector = Icons.Rounded.Star,
            contentDescription = "Icone de estrela",
            tint = Color.White
        )
    }
}