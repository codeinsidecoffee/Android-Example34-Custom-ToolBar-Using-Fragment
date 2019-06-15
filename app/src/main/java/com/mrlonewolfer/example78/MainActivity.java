package com.mrlonewolfer.example78;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   ViewPager viewPager;
   TabLayout tabLayout;
    ArrayList<Fragment> fragments;
   ArrayList<String> fragmentTitleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabMode);

        fragments=new ArrayList<>();
        fragments.add(new OneFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());

        fragmentTitleList=new ArrayList<>();
        fragmentTitleList.add(getString(R.string.one_fragment));
        fragmentTitleList.add(getString(R.string.second_fragment));
        fragmentTitleList.add(getString(R.string.third_fragment));

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager(),fragments,fragmentTitleList);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
