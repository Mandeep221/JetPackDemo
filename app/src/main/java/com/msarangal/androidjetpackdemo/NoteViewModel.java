package com.msarangal.androidjetpackdemo;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by Mandeep Sarangal on 27,April,2019
 */
public class NoteViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public NoteViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG, "NoteViewModel destroyed");
    }
}
