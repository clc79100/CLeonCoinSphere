package com.example.coinsphere
data class CoinItem (
    val name: String,
    val price: Float
)

val CoinList = listOf(
    CoinItem("BitCoin", 109_797.37f),
    CoinItem("Etherum", 4_321.21f),
    CoinItem("Tether", 1.000f),
    CoinItem("XPR", 2.8100f),
    CoinItem("BNB", 845.0000f),
    CoinItem("Solana", 201.8500f),
    CoinItem("USDC",0.9998f),
    CoinItem("DogeCoin", 0.1320f),
    CoinItem("TRON",0.3630f)
)