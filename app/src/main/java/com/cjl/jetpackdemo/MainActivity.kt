package com.cjl.jetpackdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cjl.jetpackdemo.lifecycle.LifecycleActivity
import com.cjl.jetpackdemo.viewmodel.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_lifecycle.setOnClickListener { startActivity(Intent(this@MainActivity, LifecycleActivity::class.java)) }
        btn_viewmodel.setOnClickListener {startActivity(Intent(this@MainActivity, ViewModelActivity::class.java)) }
    }
}
