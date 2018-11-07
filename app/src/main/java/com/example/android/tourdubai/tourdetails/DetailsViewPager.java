package com.example.android.tourdubai.tourdetails;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Created by WISEMINDS on 10/15/2018.
 */

public class DetailsViewPager extends FragmentStatePagerAdapter {

    TourDetailsFragment tourDetailsFragment = new TourDetailsFragment();
     private static int currentPosition;
    private static int count = 1;
    private static int position;

    public DetailsViewPager(FragmentManager fm) {
        super(fm);
    }

    public void setPosition(int position) {
        currentPosition = position;
    }

    public void setCount(int size) {

        count = size;
    }

    public void setCurrentPosition(int position) {
        Log.v("Pager", currentPosition + " setCurrentPosition " + tourDetailsFragment.getListSize());

        if (currentPosition < tourDetailsFragment.getListSize() - 1 && currentPosition >= 0) {
            if (currentPosition == 0 && position < 0) {
                currentPosition += 1;
            }
            if (position > 0) {
                ++currentPosition;
            } else if (position < 0) {
                currentPosition -= 1;
            }
        }
    }
    public int getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public Fragment getItem(int position) {
        this.position = position;
        Log.v("Pager", "getItem " + position + currentPosition);
        if (count == 1) {
            return TourDetailsFragment.newInstance(currentPosition);
        } else
            return TourDetailsFragment.newInstance(position);
    }
    @Override
    public int getCount() {
        Log.v("Pager", "getCount " + count);
        return count;
    }
}
