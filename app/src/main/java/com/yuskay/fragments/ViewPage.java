package com.yuskay.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.ViewPageAdapter;

public class ViewPage extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        tabLayout=findViewById(R.id.tabId);
        viewPager=findViewById(R.id.viewPager);

        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(),"Sum");
        adapter.addFragment(new SecondFragment(),"area of circle");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



    }
}
