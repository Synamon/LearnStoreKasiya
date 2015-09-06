package com.learnstore.learnstore.myapplication.quadraticchapter;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.learnstore.learnstore.myapplication.Factors_Tutorial_Questions;
import com.learnstore.learnstore.myapplication.R;

public class MainActivity extends AppCompatActivity {

    static ViewPager myViewPAger;
    FragPageAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPAger = (ViewPager) findViewById(R.id.view_pager);
        adapter = new FragPageAdapter(getSupportFragmentManager());


        myViewPAger.setAdapter(adapter);
        myViewPAger.setPageTransformer(true, new VPagerTransformer());

        myViewPAger.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == myViewPAger.getAdapter().getCount() - 1) {
                    Intent reg = new Intent(MainActivity.this,Factors_Tutorial_Questions.class);
                    startActivity(reg);

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}
