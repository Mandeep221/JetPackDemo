package com.msarangal.androidjetpackdemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

/**
 * Created by Mandeep Sarangal on 27,April,2019
 */

/**
 * So, In destructive phase of Activity,
 * This LifeCycle Observer class gets all the events before
 * the Lifecycle Owner. This enables to perform actions that are required
 * just before an activity is about enter a destructive phase.
 */
public class MainActivityObserver implements LifecycleObserver {

    private String TAG = MainActivityObserver.class.getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent(){
        //Log.d(TAG, "Observer onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent(){
        //Log.d(TAG, "Observer onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent(){
        //Log.d(TAG, "Observer onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent(){
       // Log.d(TAG, "Observer onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent(){
       // Log.d(TAG, "Observer onStop");
    }
}
