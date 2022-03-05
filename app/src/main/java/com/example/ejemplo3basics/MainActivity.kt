package com.example.ejemplo3basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val constante: String = "Una constante"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val a: Int = 1
        */
        //a = 5
        var b: Int = 2
        b = 3

        Log.i("Basics", "Valor de B = $b")
        Log.i("Basics", constante)
        Log.d("Basics", "d")
        Log.w("Basics", "w")
        Log.e("Basics", "e")
        val toast = Toast.makeText(this, "Balor de B = $b", Toast.LENGTH_LONG)
        toast.show()
        unSwitch()
        unIf(1)
        unosFor()
        unosWhile()
    }

    fun unSwitch(){
        val x = 1
        when(x){
            1 -> {
                var algo = "djfvj"
                var otro = "jlbsdjb"
                Log.i("Basics", algo + otro)
            }
        }
    }

    fun unIf(a:Int):Boolean{
        var array  = arrayOf(1,2,3,4,5)
        if(a in array)
            return true
        else
            return false

    }

    fun unosFor(){
        var array  = arrayOf(1,2,3,4,5)
        Log.i("Basics", "numero in array")
        for (i in array){
            Log.i("Basics", i.toString())
        }

        Log.i("Basics", "1..3")
        for (numero in 1..3){
            Log.i("Basics", numero.toString())
        }

        Log.i("Basics", "6 downTo 0 step 2")
        for (j in 6 downTo 0 step 3){
            Log.i("Basics", j.toString())
        }
    }

    fun unosWhile(){
        var x = 0
        while(x < 5){
            Log.i("Basics", x.toString())
            x++
        }

        x = 0
        do{
            Log.i("Basics", x.toString())
            x++
        }while(x < 5)
    }
}