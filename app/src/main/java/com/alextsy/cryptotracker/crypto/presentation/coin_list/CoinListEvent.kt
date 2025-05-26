package com.alextsy.cryptotracker.crypto.presentation.coin_list

import com.alextsy.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}