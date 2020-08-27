package com.cjl.jetpackdemo.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.cjl.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_lifecycle.*

class LifecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MainMyObserver", "[onCreate start] lifecycle is---->"+lifecycle.currentState)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        btn_second.setOnClickListener { startActivity(Intent(this@LifecycleActivity, LifecycleSecondActivity::class.java)) }
        lifecycle.addObserver(MyObserver())
        Log.d("MainMyObserver", "[onCreate end] lifecycle is---->"+lifecycle.currentState)
    }

    override fun onStart() {
        Log.d("MainMyObserver", "[onStart start] lifecycle is---->"+lifecycle.currentState)
        super.onStart()
        Log.d("MainMyObserver", "[onStart end] lifecycle is---->"+lifecycle.currentState)
    }

    override fun onResume() {
        Log.d("MainMyObserver", "[onResume start] lifecycle is---->"+lifecycle.currentState)
        super.onResume()
        Log.d("MainMyObserver", "[onResume end] lifecycle is---->"+lifecycle.currentState)
    }

    override fun onPause() {
        Log.d("MainMyObserver", "[onPause start] lifecycle is---->"+lifecycle.currentState)
        super.onPause()
        Log.d("MainMyObserver", "[onPause end] lifecycle is---->"+lifecycle.currentState)
    }

    override fun onStop() {
        Log.d("MainMyObserver", "[onStop start] lifecycle is---->"+lifecycle.currentState)
        super.onStop()
        Log.d("MainMyObserver", "[onStop end] lifecycle is---->"+lifecycle.currentState)
    }

    override fun onDestroy() {
        Log.d("MainMyObserver", "[onDestroy start] lifecycle is---->"+lifecycle.currentState)
        super.onDestroy()
        Log.d("MainMyObserver", "[onDestroy end] lifecycle is---->"+lifecycle.currentState)
    }



    class MyObserver : LifecycleObserver {

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        fun onMyCreate() {
            Log.d("MainMyObserver", "onMyCreate")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        fun onMyStart() {
            Log.d("MainMyObserver", "onMyStart")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        fun onMyResume() {
            Log.d("MainMyObserver", "onMyResume")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        fun onMyPause() {
            Log.d("MainMyObserver", "onMyPause")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        fun onMyOnStop() {
            Log.d("MainMyObserver", "onMyStop")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        fun onMyOnDestroy() {
            Log.d("MainMyObserver", "onMyDestroy")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        fun onMyAny() {
//            Log.d("MainMyObserver", "onMyAny")
        }
    }
}