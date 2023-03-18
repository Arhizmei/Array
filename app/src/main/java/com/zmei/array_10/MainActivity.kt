package com.zmei.array_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array : Array<Int> = arrayOf(4,5,1,7,7,1,0)
        var a = array[0]
        Log.d("my log", "Result = $a")
        array[2] = 22
        Log.d("my log", "$array[0]")

        Log.d("my log", "${array.contentToString()}")
        var b = arrayOfNulls<Int>(6)
        Log.d("my log", "${b.contentToString()}")
        val c = arrayOf(1,4,3,5,6,2,1,2,3,5,6)
        Log.d("my log", "${c.size}")

        val d = c.reversedArray()
        Log.d("my log", "${d.contentToString()}")




    }
}