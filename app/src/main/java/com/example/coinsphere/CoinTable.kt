package com.example.coinsphere

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

@Composable
fun CoinTable(horizontalPadding: Dp){
    Column (){
        ColumnTitle(horizontalPadding)
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth(),
            thickness = DividerDefaults.Thickness,
            color = Surface
        )
        CoinCardTable(horizontalPadding)

    }
}

@Composable
fun ColumnTitle(horizontalPadding: Dp){
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal =  horizontalPadding),
    ){
        Text(
            text = "#",
            fontSize = 12.sp,
            color = TextDim
        )
        Text(
            text = "Name",
            fontSize = 12.sp,
            color = TextDim
        )
        Text(
            text = "Price",
            fontSize = 12.sp,
            color = TextDim
        )
    }

}

@Composable
fun CoinCardTable(horizontalPadding: Dp){
    LazyColumn(){
        items(CoinList) { coin ->
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .padding(horizontal = horizontalPadding, vertical = 6.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Surface)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                ) {
                    Text(
                        text = coin.relevance.toString(),
                        fontSize = 13.sp,
                        color = TextDim
                    )

                    AsyncImage(
                        model = coin.image,
                        contentDescription = coin.name,
                        modifier = Modifier
                            .size(10.dp),
                            //.clip(CircleShape),
                        contentScale = ContentScale.Companion.Crop
                    )

                    Text(
                        text = coin.name,
                        fontSize = 14.sp,
                        color = TextMain
                    )

                    Text(
                        text = "$${coin.price.toString()}",
                        fontSize = 14.sp,
                        color = TextMain
                    )
                }
            }
        }
    }
}