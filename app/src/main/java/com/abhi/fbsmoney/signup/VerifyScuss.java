package com.abhi.fbsmoney.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.abhi.fbsmoney.MainActivity;
import com.abhi.fbsmoney.R;

public class VerifyScuss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));

        setContentView(R.layout.activity_verify_scuss);
    }

    public void startApp(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void back6(View view) {

        Intent intent = new Intent(getApplicationContext(), VerifyError.class);
        startActivity(intent);
    }
}