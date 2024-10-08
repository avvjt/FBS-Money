package com.abhi.fbsmoney;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.abhi.fbsmoney.AccountWallet.Wallet;
import com.abhi.fbsmoney.Beneficent.Beneficent;
import com.abhi.fbsmoney.SendMoney.AddBeneficiary;
import com.abhi.fbsmoney.SendMoney.EnterAmount;
import com.abhi.fbsmoney.Transaction.Transaction;
import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);

        /*int in every activity's*/
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.dashboard);

        //get the first spinner from the xml.
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.noting,android.R.layout.simple_spinner_item);
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



        //get the sec spinner from the xml.
        Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.noting2,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text+" is clicked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int itemId = menuItem.getItemId();
        if (itemId == R.id.dashboard) {
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
        } else if (itemId == R.id.sendmoney) {
            Intent intent1 = new Intent(getApplicationContext(), EnterAmount.class);
            startActivity(intent1);
        } else if (itemId == R.id.accounts) {
            Intent intent1 = new Intent(getApplicationContext(), Wallet.class);
            startActivity(intent1);
        }else if (itemId == R.id.cards) {
            Intent intent1 = new Intent(getApplicationContext(), Card.class);
            startActivity(intent1);
        }else if (itemId == R.id.referrals) {
            Intent intent1 = new Intent(getApplicationContext(), Referral.class);
            startActivity(intent1);
        }else if (itemId == R.id.beneficent) {
            Intent intent1 = new Intent(getApplicationContext(), Beneficent.class);
            startActivity(intent1);
        }else if (itemId == R.id.transaction) {
            Intent intent1 = new Intent(getApplicationContext(), Transaction.class);
            startActivity(intent1);
        }else if (itemId == R.id.chat) {
            Intent intent1 = new Intent(getApplicationContext(), Filtter.class);
            startActivity(intent1);
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void sendmoney_page(View view) {
        Intent intent = new Intent(getApplicationContext(), EnterAmount.class);
        startActivity(intent);
    }

    public void wallet_page(View view) {
        Intent intent = new Intent(getApplicationContext(), Wallet.class);
        startActivity(intent);
    }

    public void translations_page(View view) {
    }

    public void toolbar_image_profile(View view) {
    }
}