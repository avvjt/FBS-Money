package com.abhi.fbsmoney.SendMoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.abhi.fbsmoney.R;

public class MoneyDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_money_details);
    }

    public void send_btn(View view) {

        Intent intent = new Intent(getApplicationContext(), Success.class);
        startActivity(intent);
    }

    public void back15(View view) {
        Intent intent = new Intent(getApplicationContext(), AddBeneficiary.class);
        startActivity(intent);
    }

    public void noti_imagtton(View view) {
    }

    public void profilebutton(View view) {
    }
}