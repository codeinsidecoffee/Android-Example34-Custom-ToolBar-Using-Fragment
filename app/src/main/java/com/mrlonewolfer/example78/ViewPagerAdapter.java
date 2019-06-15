package com.mrlonewolfer.example78;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> fragmentTitleList;
    ArrayList<Fragment> fragments;

    public ViewPagerAdapter(FragmentManager supportFragmentManager, ArrayList<Fragment> fragments, ArrayList<String> fragmentTitleList) {
        super(supportFragmentManager);
        this.fragmentTitleList=fragmentTitleList;
        this.fragments=fragments;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
