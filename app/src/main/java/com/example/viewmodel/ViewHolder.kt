package com.example.viewmodel

import androidx.lifecycle.ViewModel

class ViewHolder : ViewModel() {



    var number = 0
    fun addNumber(){
        number++
    }
}