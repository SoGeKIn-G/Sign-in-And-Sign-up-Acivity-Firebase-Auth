package com.gauravbora.librarymanagementsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.gauravbora.librarymanagementsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var toggle: ActionBarDrawerToggle
lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)


    }

}