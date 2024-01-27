package com.abhi.fbsmoney.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.abhi.fbsmoney.OnBoarding;
import com.abhi.fbsmoney.R;
import com.abhi.fbsmoney.signup.Signup2;

public class VerifyEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_email);
    }

    public void sendCode(View view) {

        Intent intent = new Intent(getApplicationContext(), Otp.class);
        startActivity(intent);

    }

    public void back9(View view) {

        Intent intent = new Intent(getApplicationContext(), Login1.class);
        startActivity(intent);

    }
}