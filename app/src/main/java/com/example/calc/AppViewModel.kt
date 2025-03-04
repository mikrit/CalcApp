package com.example.calc

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AppViewModel: ViewModel() {
    private val _firstNumber:MutableStateFlow<Double> = MutableStateFlow(0.0)
    val firstNumber = _firstNumber.asStateFlow()

    private val _secondNumber:MutableStateFlow<Double> = MutableStateFlow(0.0)
    val secondNumber = _secondNumber.asStateFlow()

    private val _action:MutableStateFlow<String> = MutableStateFlow("")
    val action = _action.asStateFlow()

    fun setFirstNumber(input:Double){
        _firstNumber.update { input }
    }

    fun setSecondNumber(input:Double){
        _secondNumber.update { input }
    }

    fun setAction(action:String){
        _action.update { action }
    }
}