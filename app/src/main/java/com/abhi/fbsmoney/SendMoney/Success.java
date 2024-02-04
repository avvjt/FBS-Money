package com.abhi.fbsmoney.SendMoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.R;

public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_success);
    }

    public void noti_image(View view) {
    }

    public void back14(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }

    public void profile_image(View view) {
    }

    public void share_btn1(View view) {
        Toast.makeText(this, "Share button is working...", Toast.LENGTH_SHORT).show();
    }

    public void okey_btn1(View view) {
        Toast.makeText(this, "Ok button is working...", Toast.LENGTH_SHORT).show();
    }
}