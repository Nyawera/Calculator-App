package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var ettextOne:EditText
    lateinit var ettextTwo:EditText
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        ettextOne=findViewById(R.id.ettextOne)
        ettextTwo=findViewById(R.id.ettextTwo)
        tvResult=findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {
            var number1=ettextOne.text.toString().toDouble()
            var number2=ettextTwo.text.toString().toDouble()
            addNums(number1,number2)
        }

        btnSubtract.setOnClickListener {
            var number1 = ettextOne.text.toString().toDouble()
            var number2 = ettextTwo.text.toString().toDouble()
            subNums(number1,number2)
        }

        btnMultiply.setOnClickListener {
            var number1 = ettextOne.text.toString().toDouble()
            var number2 = ettextTwo.text.toString().toDouble()
            multNums(number1,number2)
        }
        btnModulus.setOnClickListener {
            var number1 = ettextOne.text.toString().toDouble()
            var number2 = ettextTwo.text.toString().toDouble()
            moduleNums(number1,number2)
        }
    }


    fun addNums(num1:Double,num2:Double){
        var adds = num1+num2
        tvResult.text=adds.toString()
    }
    fun subNums(num1:Double,num2:Double){
        var subs = num1-num2
        tvResult.text=subs.toString()
    }
    fun multNums(num1:Double,num2:Double){
        var mods = num1%num2
        tvResult.text=mods.toString()
    }
    fun moduleNums(num1:Double,num2:Double){
        var mults= num1*num2
        tvResult.text=mults.toString()
    }

}
