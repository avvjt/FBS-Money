package com.abhi.fbsmoney.AccountWallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.abhi.fbsmoney.Notification;
import com.abhi.fbsmoney.R;

public class BankAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_bank_account);
    }

    public void back17(View view) {
        Intent intent = new Intent(getApplicationContext(), withdraw.class);
        startActivity(intent);
    }

    public void noti_ge(View view) {
        Intent intent = new Intent(getApplicationContext(), Notification.class);
        startActivity(intent);
    }

    public void profi_ige(View view) {
    }

    public void add(View view) {
        Intent intent = new Intent(getApplicationContext(), AddBank.class);
        startActivity(intent);
    }

    public void Coni(View view) {

        Intent intent = new Intent(getApplicationContext(), withdraw_succ.class);
        startActivity(intent);
    }
}