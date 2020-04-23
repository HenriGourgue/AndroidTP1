package com.example.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra("name")
        val following = intent.getStringExtra("following")
        val follower = intent.getStringExtra("follower")

        val nameTextView = findViewById<TextView>(R.id.name)
        val followingTextView = findViewById<TextView>(R.id.followingText)
        val followerTextView = findViewById<TextView>(R.id.followerText)

        nameTextView.text = name
        followingTextView.text = "Following " + following
        followerTextView.text = "Follower " + follower
    }
}
