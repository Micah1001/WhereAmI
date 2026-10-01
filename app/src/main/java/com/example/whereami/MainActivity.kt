package com.example.mapdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.whereami.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load the custom MapFragment into the container
        supportFragmentManager.beginTransaction()
            .replace(R.id.mapFragmentContainer, MapFragment())
            .commit()

        startbtn.setOnClickListener {
            // Logic to show the current location is now handled inside the MapFragment
        }
    }
}
