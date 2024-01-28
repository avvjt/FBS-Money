package com.abhi.fbsmoney.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.MainActivity;
import com.abhi.fbsmoney.OnBoarding;
import com.abhi.fbsmoney.R;

public class Login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void back8(View view) {

        Intent intent = new Intent(getApplicationContext(), OnBoarding.class);
        startActivity(intent);
    }

    public void continuee(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void forget_pass(View view) {

        Intent intent = new Intent(getApplicationContext(), VerifyEmail.class);
        startActivity(intent);
    }

    public void facebook1(View view) {

        Toast.makeText(getApplicationContext(), "Redirect to Login with facebook page !!", Toast.LENGTH_SHORT).show();
    }

    public void google1(View view) {

        Toast.makeText(getApplicationContext(), "Redirect to Login with google page !!", Toast.LENGTH_SHORT).show();
    }

    public void apple1(View view) {

        Toast.makeText(getApplicationContext(), "Redirect to Login with apple page !!", Toast.LENGTH_SHORT).show();
    }
}