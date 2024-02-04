package com.abhi.fbsmoney.SendMoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.abhi.fbsmoney.R;

public class AddBeneficiary extends AppCompatActivity {

    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_add_beneficiary);

        searchView = findViewById(R.id.search_bar);
        searchView.setIconified(false);
    }


    public void back13(View view) {
        Intent intent = new Intent(getApplicationContext(), EnterAmount.class);
        startActivity(intent);
    }

    public void noti_imagebuttonn(View view) {
    }

    public void profile_imagebuttonn(View view) {
    }


    public void deltaRelative8(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }

    public void deltaRelative7(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }

    public void deltaRelative6(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }

    public void deltaRelative5(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }

    public void deltaRelative4(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }

    public void deltaRelative3(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }

    public void deltaRelative1(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }

    public void deltaRelative(View view) {
        Intent intent = new Intent(getApplicationContext(), MoneyDetails.class);
        startActivity(intent);
    }
}