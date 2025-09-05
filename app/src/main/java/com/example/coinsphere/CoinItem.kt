package com.example.coinsphere
data class CoinItem (
    val relevance: Int,
    val name: String,
    val price: Float,
    val image: String
)

val CoinList = listOf(
    CoinItem(1, "BitCoin", 109_797.37f, "https://oem.com.mx/diariodequeretaro/img/18751754/1664355593/BASE_LANDSCAPE/1200/Cleopatra.jpg"),//"https://cryptologos.cc/logos/bitcoin-btc-logo.png"),
    CoinItem(2, "Etherum", 4_321.21f, "https://cryptologos.cc/logos/ethereum-eth-logo.png"),
    CoinItem(3, "Tether", 1.000f, "https://cryptologos.cc/logos/tether-usdt-logo.png"),
    CoinItem(4, "XPR", 2.8100f, "https://cryptologos.cc/logos/xrp-xrp-logo.png"),
    CoinItem(5, "BNB", 845.0000f, "https://cryptologos.cc/logos/bnb-bnb-logo.png"),
    CoinItem(6, "Solana", 201.8500f, "https://cryptologos.cc/logos/solana-sol-logo.png"),
    CoinItem(7, "USDC", 0.9998f, "https://cryptologos.cc/logos/usd-coin-usdc-logo.png"),
    CoinItem(8, "DogeCoin", 0.1320f, "https://cryptologos.cc/logos/dogecoin-doge-logo.png"),
    CoinItem(9, "TRON", 0.3630f, "https://cryptologos.cc/logos/tron-trx-logo.png")
)