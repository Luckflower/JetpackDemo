package com.cjl.jetpackdemo.viewmodel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.cjl.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_viewmodel2.*

class ViewModelSecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel2)

        val myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        tvCount2.text = "MyViewModel中的数为：" + myViewModel.count
    }
}