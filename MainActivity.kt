package com.example.valet

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
}
    fun test7(view: View) {
        val resourceId = resources.getIdentifier(view.tag.toString(), "drawable", packageName)
        imageView.setImageResource(resourceId)
    }
}
