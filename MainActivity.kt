package com.example.valet

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var ash: Button
    private lateinit var dic: Button
    private lateinit var fix: Button
    private lateinit var len: Button
    private lateinit var ok: Button
    private lateinit var x5: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        ash = findViewById(R.id.ash)
        dic = findViewById(R.id.dic)
        fix = findViewById(R.id.fix)
        len = findViewById(R.id.len)
        ok = findViewById(R.id.ok)
        x5 = findViewById(R.id.x5)

        ash.setOnClickListener {
            imageView.setImageResource(R.drawable.ash)
        }
        dic.setOnClickListener {
            imageView.setImageResource(R.drawable.dic)
        }
        fix.setOnClickListener {
            imageView.setImageResource(R.drawable.fix)
        }
        len.setOnClickListener {
            imageView.setImageResource(R.drawable.len)
        }
        ok.setOnClickListener {
            imageView.setImageResource(R.drawable.ok)
        }
        x5.setOnClickListener {
            imageView.setImageResource(R.drawable.x5)
        }
}}