package com.example.f6.ui.prog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProgViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is prog Fragment"
    }
    val text: LiveData<String> = _text
}