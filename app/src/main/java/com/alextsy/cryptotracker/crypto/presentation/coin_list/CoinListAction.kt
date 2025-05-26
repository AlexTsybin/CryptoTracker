package com.alextsy.cryptotracker.crypto.presentation.coin_list

import com.alextsy.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
//    data object OnRefresh: CoinListAction
}