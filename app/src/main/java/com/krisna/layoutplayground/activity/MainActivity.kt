package com.krisna.layoutplayground.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.krisna.layoutplayground.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickLanjut = findViewById<Button>(R.id.btn_lanjut)
        clickLanjut.setOnClickListener{
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }

    }
}