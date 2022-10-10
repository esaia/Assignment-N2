package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    @SuppressLint("CutPasteId", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.firstnum)
        val num2 = findViewById<EditText>(R.id.secnum)
        val plusbtn = findViewById<Button>(R.id.plusbtn)
        val minusbtn = findViewById<Button>(R.id.minus)
        val multipbtn = findViewById<Button>(R.id.multip)
        val devidebtn = findViewById<Button>(R.id.devide)

        plusbtn.setOnClickListener{
            val firstnumber = num1.text.toString()
            val secondnumber = num2.text.toString()
            if(validateinputs(firstnumber,secondnumber)){
                val result = firstnumber.toInt() + secondnumber.toInt()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("RESULTVALUE", result.toString())
                startActivity(intent)
                num1.setText("")
                num2.setText("")
            }
        }
        minusbtn.setOnClickListener{
            val firstnumber = num1.text.toString()
            val secondnumber = num2.text.toString()
            if(validateinputs(firstnumber,secondnumber)){
                val result = firstnumber.toInt() - secondnumber.toInt()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("RESULTVALUE", result.toString())
                startActivity(intent)
                num1.setText("")
                num2.setText("")
            }
        }
        multipbtn.setOnClickListener{
            val firstnumber = num1.text.toString()
            val secondnumber = num2.text.toString()
            if(validateinputs(firstnumber,secondnumber)){
                val result = firstnumber.toInt() * secondnumber.toInt()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("RESULTVALUE", result.toString())
                startActivity(intent)
                num1.setText("")
                num2.setText("")
            }
        }
        devidebtn.setOnClickListener{
            val firstnumber = num1.text.toString()
            val secondnumber = num2.text.toString()
            if(validateinputs(firstnumber,secondnumber)){
                val result = firstnumber.toInt() / secondnumber.toInt()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("RESULTVALUE", result.toString())
                startActivity(intent)
                num1.setText("")
                num2.setText("")
            }
        }


    }

    private fun validateinputs(num1:String?, num2:String?):Boolean{

        return when{
            num1.isNullOrEmpty() -> {
                Toast.makeText(this,"Please enter first value", Toast.LENGTH_SHORT).show()
                return false
            }
            num2.isNullOrEmpty() -> {
                Toast.makeText(this,"Please enter second value", Toast.LENGTH_SHORT).show()
                return false
            }
            else -> {
                return true
            }
        }
    }

}
