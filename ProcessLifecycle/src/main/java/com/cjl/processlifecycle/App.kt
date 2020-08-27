package com.cjl.processlifecycle

import android.app.Application
import android.util.Log
import androidx.lifecycle.*

class App : Application{

    constructor()

    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(object : LifecycleObserver {

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            fun onAppBackground() {
                // 应用进入后台
                Log.e("test", "onAppBackground ON_STOP");
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            fun onAppForeground() {
                // 应用进入前台
                Log.e("test", "onAppForeground ON_START");

            }
        })
    }
}