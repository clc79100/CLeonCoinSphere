package com.example.coinsphere

data class InfoItem(
    val category: String,
    val title: String
)

val InfoList =listOf(
    InfoItem("Global Market Cap", "$2.18T"),
    InfoItem("Fear & Greed", "Neutral (54)"),
    InfoItem("Altcoin Season", "No")
)