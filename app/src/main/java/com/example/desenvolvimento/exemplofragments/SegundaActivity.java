package com.example.desenvolvimento.exemplofragments;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class SegundaActivity extends AppCompatActivity {
    private static final String TAG = "SegundaActivity";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        setContentView(R.layout.activity_segunda);
        Log.d(TAG, "onCreate iniciado!");
    }
}
