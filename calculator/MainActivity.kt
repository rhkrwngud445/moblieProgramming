package com.univ.moblieprogramming

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var button : Button
    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    lateinit var button4 : Button
    lateinit var result : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit1 = findViewById(R.id.Edit1)
        edit2 = findViewById(R.id.Edit2)
        button = findViewById(R.id.BtnAdd)
        button1 = findViewById(R.id.BtnSub)
        button2 = findViewById(R.id.BtnMul)
        button3 = findViewById(R.id.BtnDiv)
        button4 = findViewById(R.id.BtnRem)
        result = findViewById(R.id.TextResult)


        button.setOnClickListener {
            if(edit1.text.toString()==null || edit2.text.toString()==null){
                Toast.makeText(this,"값을 입력해 주세요",Toast.LENGTH_SHORT).show()
            }
            else{
                result.text= ((edit1.text).toString().toDouble()+(edit2.text).toString().toDouble()).toString()
            }

        }
        button1.setOnClickListener {
            if(edit1.text.toString()==null || edit2.text.toString()==null){
                Toast.makeText(this,"값을 입력해 주세요",Toast.LENGTH_SHORT).show()
            }
            else{
                result.text= ((edit1.text).toString().toDouble()-(edit2.text).toString().toDouble()).toString()
            }

        }
        button2.setOnClickListener {
            if(edit1.text.toString()==null || edit2.text.toString()==null){
                Toast.makeText(this,"값을 입력해 주세요",Toast.LENGTH_SHORT).show()
            }
            else {
                result.text= ((edit1.text).toString().toDouble()*(edit2.text).toString().toDouble()).toString()
            }
        }
        button3.setOnClickListener {
            if(edit1.text.toString()==null || edit2.text.toString()==null){
                Toast.makeText(this,"값을 입력해 주세요",Toast.LENGTH_SHORT).show()
            }
            else {
                if(edit2.text.toString()=="0"){
                    Toast.makeText(this,"0으로 나누지 마세요",Toast.LENGTH_SHORT).show()
                }
                else{
                    result.text= ((edit1.text).toString().toDouble()/(edit2.text).toString().toDouble()).toString()
                }

            }

        }
        button4.setOnClickListener {
            if(edit1.text.toString()==null || edit2.text.toString()==null){
                Toast.makeText(this,"값을 입력해 주세요",Toast.LENGTH_SHORT).show()
            }
            else {
                result.text= ((edit1.text).toString().toDouble()%(edit2.text).toString().toDouble()).toString()
            }

        }
    }
}