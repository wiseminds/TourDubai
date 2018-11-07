package com.example.android.tourdubai;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.tourdubai.besthotels.HotelFragment;
import com.example.android.tourdubai.funplaces.FunPlacesFragment;
import com.example.android.tourdubai.historicalsites.HistoryFragment;
import com.example.android.tourdubai.restaurant.RestaurantFragment;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private static int NUM_ITEMS = 4;   //number of pages.
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return FunPlacesFragment.newInstance();
            case 1: // Fragment # 0 - This will show SecondFragment different title
                return HistoryFragment.newInstance();
            case 2: // Fragment # 1 - This will show ThirdFragment
                return HotelFragment.newInstance(1);
            case 3:
                return RestaurantFragment.newInstance(1);
        }
        return null;
    }
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
