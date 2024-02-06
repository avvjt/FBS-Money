package com.abhi.fbsmoney.AccountWallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.Notification;
import com.abhi.fbsmoney.R;

public class FundsTransfar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_funds_transfar);
    }

    public void noti_email(View view) {
        Toast.makeText(this, "Email has been sent !!", Toast.LENGTH_SHORT).show();
    }

    public void back22(View view) {
        Intent intent = new Intent(getApplicationContext(), FundsAdd.class);
        startActivity(intent);
    }

    public void noti_trans(View view) {
        Intent intent = new Intent(getApplicationContext(), Notification.class);
        startActivity(intent);
    }

    public void profilimage(View view) {
    }
}