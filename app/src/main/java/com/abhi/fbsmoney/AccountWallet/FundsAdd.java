package com.abhi.fbsmoney.AccountWallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.abhi.fbsmoney.Notification;
import com.abhi.fbsmoney.R;

public class FundsAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_funds_add);
    }

    public void okey_pay(View view) {
        Intent intent = new Intent(getApplicationContext(), FundsTransfar.class);
        startActivity(intent);
    }

    public void back21(View view) {
        Intent intent = new Intent(getApplicationContext(), Wallet.class);
        startActivity(intent);
    }

    public void noti_g1e(View view) {
        Intent intent = new Intent(getApplicationContext(), Notification.class);
        startActivity(intent);
    }

    public void profle1_ige(View view) {
    }
}