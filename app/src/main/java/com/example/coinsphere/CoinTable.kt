package com.example.coinsphere

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
            color = TextDim
        )


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
            color = TextDim
        )
        Text(
            text = "Name",
            color = TextDim
        )
        Text(
            text = "Price",
            color = TextDim
        )
    }
}


@Composable
fun CoinList(){

}