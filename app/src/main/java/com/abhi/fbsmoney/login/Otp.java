package com.abhi.fbsmoney.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.R;

public class Otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
    }

    public void sendCode(View view) {

        Toast.makeText(this, "Next day works...", Toast.LENGTH_SHORT).show();

    }

    public void back10(View view) {

        Intent intent = new Intent(getApplicationContext(), VerifyEmail.class);
        startActivity(intent);

    }

}