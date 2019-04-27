package com.msarangal.androidjetpackdemo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

/**
 * Created by Mandeep Sarangal on 27,April,2019
 */
public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<String> randomNumber;
    private String TAG = this.getClass().getSimpleName();

    public MutableLiveData<String> getRandomNumber() {
        Log.d(TAG, "getRandomNumber");
        if (randomNumber == null) {
            randomNumber = new MutableLiveData<>();
            createRandomNumber();
        }
        return randomNumber;
    }

    public void createRandomNumber() {
        Log.d(TAG, "createRandomNumber");
        Random random = new Random();
        randomNumber.setValue("Number is: "+ random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG, "onCleared");
    }
}
