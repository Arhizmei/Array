package com.zmei.array_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array : Array<Int> = arrayOf(4,5,1,7,7,1,0)

        Log.d("my log", "Result = $array")

    }
}