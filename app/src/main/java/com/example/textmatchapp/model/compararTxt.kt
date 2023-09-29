package com.example.textmatchapp.model

    class CompararTxt(private val text1: String, private val text2: String) {
        fun sonIguales(): Boolean {
            return text1 == text2
        }
    }
