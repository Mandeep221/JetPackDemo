package com.msarangal.androidjetpackdemo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private String TAG = this.getClass().getSimpleName();
    private NoteViewModel noteViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Log.d(TAG, "Owner onCreate");
        getLifecycle().addObserver(new MainActivityObserver());

        final TextView tv = findViewById(R.id.tv);
        final MainActivityViewModel model = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        LiveData<String> randomNum = model.getRandomNumber();
        randomNum.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tv.setText(s);
                Log.d(TAG, "onChanged");
            }
        });

        findViewById(R.id.btnGenerate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.createRandomNumber();
            }
        });

        findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        noteViewModel = ViewModelProviders.of(this).get(NoteViewModel.class);
    }

    @Override
    protected void onStart() {
        super.onStart();
       // Log.d(TAG, "Owner onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
      //  Log.d(TAG, "Owner onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
      //  Log.d(TAG, "Owner onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
       // Log.d(TAG, "Owner onStop");
    }
}
