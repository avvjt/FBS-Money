package com.abhi.fbsmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.abhi.fbsmoney.signup.Signup1;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 2000;

    TextView textView;
    Animation slideAnim, bottomAnim;
    SharedPreferences onBoardingScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        textView = findViewById(R.id.splash_text);
        slideAnim = AnimationUtils.loadAnimation(this, R.anim.slide_anim);
        textView.setAnimation(slideAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                onBoardingScreen = getSharedPreferences("onBoardingScreen", MODE_PRIVATE);
                boolean isFirstTime = onBoardingScreen.getBoolean("firstTime", true);

                if (isFirstTime){
                    SharedPreferences.Editor editor = onBoardingScreen.edit();
                    editor.putBoolean("firstTime", false);
                    editor.apply();

                    Intent intent = new Intent(SplashScreen.this, OnBoarding.class);
                    startActivity(intent);
                    finish();
                } else {

                    Intent intent = new Intent(SplashScreen.this, Signup1.class);
                    startActivity(intent);
                    finish();

                }


            }
        }, SPLASH_TIMER);

    }

}