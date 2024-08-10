package com.example.databindingkotlin

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.databindingkotlin.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MyEquation(var binding: ActivityMainBinding) : BaseObservable() {
    @Bindable
    var a: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.a)
        }

    @Bindable
    var b: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }

    @Bindable
    var c: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.c)
        }

    fun solveEquation(view: View) {
        val a = a.toInt()
        val b = b.toInt()
        val c = c.toInt()
        val discriminant = ((b * b) - (4 * a * c))
        val x1: Double
        val x2: Double
        if (discriminant > 0) {
            x1 = (-b + sqrt(discriminant.toDouble())) / (2 * a)
            x2 = (-b - sqrt(discriminant.toDouble())) / (2 * a)
            binding.result.text = "X1 = $x1 \nX2 = $x2"
        }else if (discriminant < 0){
            binding.result.text = "No real roots"
        }else{
            x1 = (-b / (2 * a).toDouble())
            binding.result.text = "X = $x1"
        }


    }


}