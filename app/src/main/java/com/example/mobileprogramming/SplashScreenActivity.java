package com.example.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity {
    ImageView gambar;
    ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        gambar = findViewById(R.id.image);
        loading = findViewById(R.id.loading);

        if(Build.VERSION.SDK_INT>9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        final int welcomeScreenDisplay = 3000;
        Thread welcomeThread = new Thread(){
            int wait = 0;

            @Override
            public void run(){
                try {
                    super.run();
                    while(wait < welcomeScreenDisplay){
                        sleep(100);
                        wait += 100;
                    }
                } catch (Exception e){
                    System.out.println("EXc="+e.toString());
                } finally {
                    Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}