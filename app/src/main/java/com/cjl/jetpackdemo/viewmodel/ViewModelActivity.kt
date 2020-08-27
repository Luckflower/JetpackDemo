package com.cjl.jetpackdemo.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.cjl.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_viewmodel.*

class ViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)

        val myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        tvCount.text = "MyViewModel中的数为：${myViewModel.count}"

    }
}