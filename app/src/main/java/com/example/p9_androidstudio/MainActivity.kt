package com.example.p9_androidstudio

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // number di set jadi 0
    private var number = 0

    private lateinit var stateTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // variabel textview dicari by id dengan nama stateTextView di class main
        stateTextView = findViewById(R.id.textView)

        // button variabel
        val buttonPlus1 = findViewById<Button>(R.id.bp1)
        val buttonPlus2 = findViewById<Button>(R.id.bp2)
        val buttonPlus5 = findViewById<Button>(R.id.bp5)

        val buttonMinus1 = findViewById<Button>(R.id.bm1)
        val buttonMinus2 = findViewById<Button>(R.id.bm2)
        val buttonMinus5 = findViewById<Button>(R.id.bm5)

        val buttonReset = findViewById<Button>(R.id.breset)


        // call update number agar bisa digunakan secara private di method oncreate
        updateNumber()

        buttonPlus1.setOnClickListener {
            number += 1
            updateNumber()
        }

        buttonPlus2.setOnClickListener{
            number += 2
            updateNumber()
        }

        buttonPlus5.setOnClickListener{
            number += 5
            updateNumber()
        }

        buttonMinus1.setOnClickListener{
            number -= 1
            updateNumber()
        }

        buttonMinus2.setOnClickListener{
            number -= 2
            updateNumber()
        }

        buttonMinus5.setOnClickListener{
            number -= 5
            updateNumber()
        }

        buttonReset.setOnClickListener{
            number = 0
            updateNumber()
        }
    }

    private fun updateNumber() {
        stateTextView.text = number.toString()
    }


}