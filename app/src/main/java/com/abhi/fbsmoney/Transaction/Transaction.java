package com.abhi.fbsmoney.Transaction;

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

import com.abhi.fbsmoney.AccountWallet.Wallet;
import com.abhi.fbsmoney.Adapter.ViewPagerAdapter3;
import com.abhi.fbsmoney.Adapter.ViewPagerAdapter4;
import com.abhi.fbsmoney.Beneficent.Beneficent;
import com.abhi.fbsmoney.Filtter;
import com.abhi.fbsmoney.Home;
import com.abhi.fbsmoney.Notification;
import com.abhi.fbsmoney.R;
import com.abhi.fbsmoney.Referral;
import com.abhi.fbsmoney.SendMoney.EnterAmount;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Transaction extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    ViewPagerAdapter4 viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
        setContentView(R.layout.activity_transaction);


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

        navigationView.setCheckedItem(R.id.transaction);



        // TabLayout
        tabLayout = findViewById(R.id.tablayout);
        viewPager2 = findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter4(this);
        viewPager2.setAdapter(viewPagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });

    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }


    public void no(View view) {
        Intent intent = new Intent(getApplicationContext(), Notification.class);
        startActivity(intent);
    }

    public void proo(View view) {
    }
}