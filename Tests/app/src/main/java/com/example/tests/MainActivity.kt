package com.example.tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var textFirstNum: TextView = findViewById(R.id.txtFirstNumber);
    var textSecondNum: TextView = findViewById(R.id.txtSecopndNumber);
    var textSignNum: TextView = findViewById(R.id.txtSign);

    var firstNum:Int = 0
    var secondNum:Int = 0
    var indexSign:Int = 0
    var signArray:CharArray = charArrayOf('+','-','*','/')

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickStart(view: View)
    {
        firstNum = (0..99).random()
        secondNum = (0..99).random()
        indexSign = (0..3).random()

        textFirstNum.text = firstNum.toString()
        textSecondNum.text = secondNum.toString()
        textSignNum.text = signArray[indexSign].toString()
    }

    fun onClickCheck()
    {

    }
}