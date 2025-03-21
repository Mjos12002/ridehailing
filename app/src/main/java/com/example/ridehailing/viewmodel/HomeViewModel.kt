package com.example.ridehailing.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeViewModel: ViewModel() {

    val status: Flow<String> = flow {
        emit("Kigali")
        emit("Kampala")
        emit("Bujumbura")
        emit("Nairobi")
    }
}