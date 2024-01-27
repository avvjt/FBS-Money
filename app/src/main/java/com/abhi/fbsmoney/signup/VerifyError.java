package com.abhi.fbsmoney.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.abhi.fbsmoney.R;

public class VerifyError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_error);
    }

    public void next2(View view) {

        Intent intent = new Intent(getApplicationContext(), VerifyScuss.class);
        startActivity(intent);
    }

    public void back5(View view) {

        Intent intent = new Intent(getApplicationContext(), VerifyPending.class);
        startActivity(intent);
    }
}