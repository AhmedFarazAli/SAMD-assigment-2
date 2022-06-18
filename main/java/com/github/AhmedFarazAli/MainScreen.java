package com.github.AhmedFarazAli;
//https://github.com/AhmedFarazAli

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {

    final Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //https://github.com/AhmedFarazAli
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            //https://github.com/AhmedFarazAli
            @Override
            public void run() {
                Intent i = new Intent(MainScreen.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, 2500);
    }
}
