package com.arul.sports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.arul.sports.Adapters.Pager;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout TabBar;

    private ViewPager ViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabBar = (TabLayout) findViewById(R.id.TabBar);
        ViewPager = (ViewPager) findViewById(R.id.ViewPager);
        TabBar.addTab(TabBar.newTab().setText("All"));
        Pager adapter = new Pager(getSupportFragmentManager(), TabBar.getTabCount());
        ViewPager.setAdapter(adapter);
    }
}