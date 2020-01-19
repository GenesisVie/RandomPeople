package com.example.projectandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val extras = intent.extras
        if (extras != null) {
            displayBigger(extras.getString("LargeAvatar"))
        }
    }
    private fun displayBigger(avatarUrl: String?) {
        Glide.with(this)
            .load(avatarUrl)
            .into(imageLarge)
    }
}
