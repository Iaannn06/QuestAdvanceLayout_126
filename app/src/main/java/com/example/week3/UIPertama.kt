package com.example.week3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = modifier
                .padding(top = 70.dp, bottom = 80.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.prodi),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.univ),
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(20.dp))


            CardItem(
                imageRes = R.drawable.gambar1, // 🔹 Gambar 1
                backgroundColor = Color.DarkGray,
                textColor = Color.White,
                subTextColor = Color.Yellow,
                nameRes = R.string.nama1,
                nimRes = R.string.nim1,
                alamatRes = R.string.alamat1
            )


            CardItem(
                imageRes = R.drawable.gambar2, // 🔹 Gambar 2
                backgroundColor = Color(0xFF1E88E5),
                textColor = Color.White,
                subTextColor = Color.Yellow,
                nameRes = R.string.nama2,
                nimRes = R.string.nim2,
                alamatRes = R.string.alamat2
            )


            CardItem(
                imageRes = R.drawable.gambar3, // 🔹 Gambar 3
                backgroundColor = Color(0xFFD32F2F),
                textColor = Color.White,
                subTextColor = Color.Yellow,
                nameRes = R.string.nama3,
                nimRes = R.string.nim3,
                alamatRes = R.string.alamat3
            )
        }


        Text(
            text = stringResource(id = R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 25.dp),
            fontSize = 14.sp,
            color = Color.Gray
        )
    }
}

@Composable
fun CardItem(
    imageRes: Int,
    backgroundColor: Color,
    textColor: Color,
    subTextColor: Color,
    nameRes: Int,
    nimRes: Int,
    alamatRes: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        shape = CardDefaults.shape
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(110.dp)
                    .padding(end = 16.dp)
            )

            Column {
                Text(
                    text = stringResource(id = nameRes),
                    fontSize = 24.sp,
                    fontFamily = FontFamily.Cursive,
                    color = textColor
                )
                Text(
                    text = stringResource(id = nimRes),
                    fontSize = 20.sp,
                    color = Color.White
                )
                Text(
                    text = stringResource(id = alamatRes),
                    fontSize = 18.sp,
                    color = subTextColor
                )
            }
        }
    }
}
