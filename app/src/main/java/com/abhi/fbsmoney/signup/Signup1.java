package com.abhi.fbsmoney.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.OnBoarding;
import com.abhi.fbsmoney.R;

public class Signup1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));

        setContentView(R.layout.activity_signup1);
    }

    public void signup_btn(View view) {

        Intent intent = new Intent(getApplicationContext(), Signup2.class);
        startActivity(intent);

    }

    public void back7(View view) {

        Intent intent = new Intent(getApplicationContext(), OnBoarding.class);
        startActivity(intent);

    }

    public void facebook(View view) {

        Toast.makeText(getApplicationContext(), "Redirect to Login with facebook page !!", Toast.LENGTH_SHORT).show();
    }

    public void google(View view) {

        Toast.makeText(getApplicationContext(), "Redirect to Login with google page !!", Toast.LENGTH_SHORT).show();
    }

    public void apple(View view) {

        Toast.makeText(getApplicationContext(), "Redirect to Login with apple page !!", Toast.LENGTH_SHORT).show();
    }
}