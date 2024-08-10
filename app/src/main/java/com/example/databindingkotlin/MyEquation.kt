package com.example.databindingkotlin

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.databindingkotlin.databinding.ActivityMainBinding

class MyEquation : BaseObservable() {
    @Bindable
    var a : String = ""
    var b : String = ""
    var c : String = ""
    lateinit var binding : ActivityMainBinding
}