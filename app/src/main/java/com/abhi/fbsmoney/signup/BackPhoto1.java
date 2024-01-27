package com.abhi.fbsmoney.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.R;

public class BackPhoto1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_photo1);
    }
    public void submit_btn2(View view) {

        Intent intent = new Intent(getApplicationContext(), VerifyPending.class);
        startActivity(intent);
    }

    public void retake_btn2(View view) {

        Toast.makeText(BackPhoto1.this, "Capture photo !!", Toast.LENGTH_SHORT).show();
    }

    public void back3(View view) {

        Intent intent = new Intent(getApplicationContext(), FrontPhoto1.class);
        startActivity(intent);
    }
}