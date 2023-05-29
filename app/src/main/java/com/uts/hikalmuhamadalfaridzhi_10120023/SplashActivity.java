/**
 *
 * Nama : HIKAL MUHAMAD ALFARIDZHI
 * Nim : 10120023
 * Kelas : IF 1
 * Email : HIKAL MUHAMAD ALFARIDZHI
 *
 */


package com.uts.hikalmuhamadalfaridzhi_10120023;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent is used to switch from one activity to another.
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i); // invoke the SecondActivity.
                finish(); // the current activity will get finished.
            }
        }, 1500);
    }
}
