package com.abhi.fbsmoney;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.abhi.fbsmoney.AccountWallet.Wallet;
import com.abhi.fbsmoney.Adapter.ViewPagerAdapter4;
import com.abhi.fbsmoney.Beneficent.Beneficent;
import com.abhi.fbsmoney.SendMoney.EnterAmount;
import com.abhi.fbsmoney.Transaction.Transaction;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Filtter extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_filtter);
        radioGroup = findViewById(R.id.radioGroup);


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
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
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
                    Intent intent1 = new Intent(getApplicationContext(), Wallet.class);
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
        });

        navigationView.setCheckedItem(R.id.chat);
    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(this, radioButton.getText()+" is selected", Toast.LENGTH_SHORT).show();
    }

    public void n(View view) {
        Intent intent = new Intent(getApplicationContext(), Notification.class);
        startActivity(intent);
    }

    public void pr(View view) {
    }

}