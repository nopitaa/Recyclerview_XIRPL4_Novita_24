package com.recyclerview_novitasyahwath_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailNovel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_novel)
            val actionBar = supportActionBar
                actionBar?.setDisplayHomeAsUpEnabled(true)

                val image = intent.getParcelableExtra<novel>(MainActivity.INTENT_PARCELABLE)

                val imgSrc = findViewById<ImageView>(R.id.fotodetail)
                val imgTitle = findViewById<TextView>(R.id.teksdetail)
                val imgDesc = findViewById<TextView>(R.id.deskripsidetail)

                if (image != null) {
                    imgSrc.setImageResource(image.foto)
                    imgTitle.text = image.nama
                    imgDesc.text = image.deskripsi
                }
            }

            override fun onSupportNavigateUp(): Boolean {
                onBackPressed()
                return true
    }
}