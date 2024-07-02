package com.example.myhomework

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navview: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navview=findViewById(R.id.bottomNavView)
        replace(Home())
        navview.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.navMap -> replace(Map())
                R.id.navHome -> replace(Home())
                R.id.navOther -> replace(Other())
                R.id.navSearch -> replace(Search())
                R.id.navMenu -> replace(Menu())
            }
            true
        }

    }
    private fun replace(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmenttransaction=fragmentManager.beginTransaction()
        fragmenttransaction.replace(R.id.bottomNavView,fragment)
        fragmenttransaction.commit()

    }    }

