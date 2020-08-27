package com.cjl.jetpackdemo.lifecycle

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.*
import com.cjl.jetpackdemo.R

class LifecycleSecondActivity : Activity(), LifecycleOwner{

    private lateinit var lifecycleRegistry : LifecycleRegistry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle2)

        lifecycleRegistry = LifecycleRegistry(this)
        lifecycleRegistry.addObserver(MyObserver())

        lifecycleRegistry.currentState = Lifecycle.State.CREATED

        var state : Lifecycle.State = lifecycleRegistry.currentState
        val isCreated = state.isAtLeast(Lifecycle.State.CREATED)
        Log.d("SecondMyObserver", "isCreated = "+isCreated)
    }

    override fun onResume() {
        super.onResume()
        lifecycleRegistry.currentState = Lifecycle.State.RESUMED
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycleRegistry.currentState = Lifecycle.State.DESTROYED
    }

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }

    class MyObserver : LifecycleObserver {

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        fun onMyCreate() {
            Log.d("SecondMyObserver", "onMyCreate")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        fun onMyStart() {
            Log.d("SecondMyObserver", "onMyStart")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        fun onMyResume() {
            Log.d("SecondMyObserver", "onMyResume")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        fun onMyPause() {
            Log.d("SecondMyObserver", "onMyPause")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        fun onMyOnStop() {
            Log.d("SecondMyObserver", "onMyStop")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        fun onMyOnDestroy() {
            Log.d("SecondMyObserver", "onMyDestroy")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        fun onMyAny() {
            Log.d("SecondMyObserver", "onMyAny")
        }

    }


}
