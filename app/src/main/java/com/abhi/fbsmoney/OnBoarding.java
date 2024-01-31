package com.abhi.fbsmoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.abhi.fbsmoney.login.Login1;
import com.abhi.fbsmoney.signup.Signup1;

public class OnBoarding extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dotsLayouts;

    SliderAdapter sliderAdapter;
    TextView[] dots;

    Button login, signup;

    Animation animation;

    int currentPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // edited here
        getWindow().setStatusBarColor(Color.parseColor("#ffffff"));

        setContentView(R.layout.activity_on_boarding);

        viewPager = findViewById(R.id.slider);
        dotsLayouts = findViewById(R.id.dots);

        login = findViewById(R.id.login_button);
        signup = findViewById(R.id.signup_button);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(getApplicationContext(), Login1.class);
                    startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Signup1.class);
                startActivity(intent);
            }
        });

        sliderAdapter = new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);

        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);
    }

    public void skip (View view) {
        startActivity(new Intent(getApplicationContext(), Home.class));
        finish();

    }

    public void next (View view) {

        viewPager.setCurrentItem(currentPosition +1);

    }

    private void addDots(int position) {
        dots = new TextView[3];
        dotsLayouts.removeAllViews();

        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);

            dotsLayouts.addView(dots[i]);
        }

        if (dots.length > 0) {
            dots[position].setTextColor(getResources().getColor(R.color.blue));
        }

    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            addDots(position);
            currentPosition = position;

            if (position == 0) {

                login.setVisibility(View.INVISIBLE);
                signup.setVisibility(View.INVISIBLE);
            } else if (position == 1) {

                login.setVisibility(View.INVISIBLE);
                signup.setVisibility(View.INVISIBLE);

            } else {

                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_anim);
                login.setAnimation(animation);
                signup.setAnimation(animation);

                login.setVisibility(View.VISIBLE);
                signup.setVisibility(View.VISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}