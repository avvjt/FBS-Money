package com.abhi.fbsmoney.AccountWallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.Notification;
import com.abhi.fbsmoney.R;

public class withdraw_succ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_withdraw_succ);
    }

    public void back18(View view) {
        Intent intent = new Intent(getApplicationContext(), BankAccount.class);
        startActivity(intent);
    }

    public void note(View view) {
        Intent intent = new Intent(getApplicationContext(), Notification.class);
        startActivity(intent);
    }

    public void profilimage(View view) {
    }

    public void sharn1(View view) {
        Toast.makeText(this, "Share button is working...", Toast.LENGTH_SHORT).show();

    }

    public void oken1(View view) {
        Toast.makeText(this, "Ok button is working...", Toast.LENGTH_SHORT).show();

    }
}