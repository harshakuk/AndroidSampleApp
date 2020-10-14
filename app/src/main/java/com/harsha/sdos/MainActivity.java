package com.harsha.sdos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.harsha.sdos.utils.Intents;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intents.goToLogin(this);
        finish();
    }
}
