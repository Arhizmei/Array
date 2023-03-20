package com.zmei.array_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* var array : Array<Int> = arrayOf(4,5,1,7,7,1,0)
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

        val q = c.sortedArray()
        Log.d( "my log", "${q.contentToString()}")

        var qw = arrayOf(2,2,6,7,4,3,7,8,2,7,4)
       var bb = qw.sortedArrayDescending()
        Log.d("my log", "${qw.contentToString()}")

        var ct = qw.contains(2)
        Log.d("my log", "${qw.contentToString()}")

        for ( a in 99..105){
            Log.d("my log", "$a")
        }*/
    val abc = listOf<String>("one","two", "three")

        for (i in 0..2) Log.d("my log", "${abc[i]}")

        for (i in abc) Log.d("my log", "$i")

        Log.d("my log", "${abc.indices}")

        for ((index, item) in abc.withIndex()) Log.d("my log", "$index $item")

        for (i in 100 downTo 77 step 3) Log.d("my log" , "$i")

        var a = arrayOf(4,5,6,8,32,3,77,22,7734,22)

        for ( i in a.indices) Log.d("my log", "$i")

        for (i in 1 until a.size) {Log.d("my log", "${a[i]}")
        if (a[i] == 32) break
        }








    }
}