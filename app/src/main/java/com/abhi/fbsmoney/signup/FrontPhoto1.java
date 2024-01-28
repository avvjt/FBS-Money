package com.abhi.fbsmoney.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.R;

public class FrontPhoto1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.parseColor("#FF000000"));

        setContentView(R.layout.activity_front_photo);
    }

    public void submit_btn(View view) {

        Intent intent = new Intent(getApplicationContext(), BackPhoto1.class);
        startActivity(intent);
    }

    public void retake_btn(View view) {

        Toast.makeText(FrontPhoto1.this, "Capture photo !!", Toast.LENGTH_SHORT).show();
    }

    public void back2(View view) {

        Intent intent = new Intent(getApplicationContext(), Signup2.class);
        startActivity(intent);
    }
}