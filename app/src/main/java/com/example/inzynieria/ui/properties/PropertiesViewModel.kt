package com.example.inzynieria.ui.properties

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PropertiesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is properties Fragment"
    }
    val text: LiveData<String> = _text
}