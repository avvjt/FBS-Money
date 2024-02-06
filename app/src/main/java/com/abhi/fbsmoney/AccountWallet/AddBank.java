package com.abhi.fbsmoney.AccountWallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.abhi.fbsmoney.Notification;
import com.abhi.fbsmoney.R;
import com.abhi.fbsmoney.SendMoney.MoneyDetails;

public class AddBank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_add_bank);


        //get the first spinner from the xml.
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.noting4,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text+" is selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void back19(View view) {
        Intent intent = new Intent(getApplicationContext(), BankAccount.class);
        startActivity(intent);
    }

    public void noti_ge(View view) {
        Intent intent = new Intent(getApplicationContext(), Notification.class);
        startActivity(intent);
    }

    public void profle_ige(View view) {
    }

    public void shrn1(View view) {
        Toast.makeText(getApplicationContext(), "Cancel is clicked", Toast.LENGTH_SHORT).show();
    }

    public void oke1(View view) {
        Intent intent = new Intent(getApplicationContext(), Balance.class);
        startActivity(intent);
    }
}