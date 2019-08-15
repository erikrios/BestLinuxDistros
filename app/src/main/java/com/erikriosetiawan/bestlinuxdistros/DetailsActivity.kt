package com.erikriosetiawan.bestlinuxdistros

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.ImageView
import android.widget.TextView
import com.erikriosetiawan.bestlinuxdistros.model.LinuxDistro
import com.squareup.picasso.Picasso

class DetailsActivity : AppCompatActivity() {

    private lateinit var imgPhoto: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDescription: TextView

    companion object {
        const val DATA_KEY: String = "AbF85kaier"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        imgPhoto = findViewById(R.id.img_photo)
        tvName = findViewById(R.id.tv_name)
        tvDescription = findViewById(R.id.tv_desc)

        val linuxDistro: LinuxDistro = intent.getParcelableExtra(DATA_KEY)

        Picasso.get()
                .load(linuxDistro.photos)
                .into(imgPhoto)

        tvName.text = linuxDistro.distroName
        tvDescription.text = linuxDistro.description

        setActionBar(tvName.text.toString())
    }

    private fun setActionBar(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
