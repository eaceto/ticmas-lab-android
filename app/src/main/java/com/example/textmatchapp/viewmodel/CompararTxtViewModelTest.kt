package com.example.textmatchapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.textmatchapp.model.CompararTxt

class CompararTextViewModel : ViewModel() {

    val result = MutableLiveData<String>()

    fun compareText(text1: String, text2: String) {
        val model = CompararTxt(text1, text2)
        result.value = if (model.sonIguales()) {
            "Los textos son iguales"
        } else {
            "Los textos son diferentes"
        }
    }
}

