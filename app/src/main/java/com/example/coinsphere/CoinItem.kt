package com.example.coinsphere
data class CoinItem (
    val relevance: Int,
    val name: String,
    val price: Float,
    val image: String
)

val CoinList = listOf(
    CoinItem(1, "BitCoin", 109_797.37f, "https://assets.coingecko.com/coins/images/1/standard/bitcoin.png?1696501400"),
    CoinItem(2, "Etherum", 4_321.21f, "https://assets.coingecko.com/coins/images/279/standard/ethereum.png?1696501628"),
    CoinItem(3, "Tether", 1.000f, "https://assets.coingecko.com/coins/images/325/standard/Tether.png?1696501661"),
    CoinItem(4, "XPR", 2.8100f, "https://assets.coingecko.com/coins/images/44/standard/xrp-symbol-white-128.png?1696501442"),
    CoinItem(5, "BNB", 845.0000f, "https://assets.coingecko.com/coins/images/825/standard/bnb-icon2_2x.png?1696501970"),
    CoinItem(6, "Solana", 201.8500f, "https://assets.coingecko.com/coins/images/4128/standard/solana.png?1718769756"),
    CoinItem(7, "USDC", 0.9998f, "https://assets.coingecko.com/coins/images/6319/standard/usdc.png?1696506694"),
    CoinItem(8, "DogeCoin", 0.1320f, "https://assets.coingecko.com/coins/images/5/standard/dogecoin.png?1696501409"),
    CoinItem(9, "TRON", 0.3630f, "https://assets.coingecko.com/coins/images/1094/standard/tron-logo.png?1696502193")
)