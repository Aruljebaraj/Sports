package com.arul.sports.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.arul.sports.Fragments.HomeFragment;

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;


    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment Home = new HomeFragment();
                return Home;
//                case 1:
//                HomeFragment Homes = new HomeFragment();
//                return Homes;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}