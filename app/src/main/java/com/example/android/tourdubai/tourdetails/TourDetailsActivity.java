package com.example.android.tourdubai.tourdetails;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.tourdubai.R;


public class TourDetailsActivity extends AppCompatActivity {
    private ViewPager viewPager;
    DetailsViewPager adapter;
    TourDetailsFragment tourDetailsFragment = new TourDetailsFragment();
    DetailsViewPager detailsViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_details);
        tourDetailsFragment.getPosition();
        viewPager = (ViewPager) findViewById(R.id.pager2);
        detailsViewPager = new DetailsViewPager(getSupportFragmentManager());
        adapter = new DetailsViewPager(getSupportFragmentManager());
        detailsViewPager.setPosition(tourDetailsFragment.getPosition());

        detailsViewPager.getItem(detailsViewPager.getCurrentPosition());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (viewPager.getCurrentItem() > position) {
                    detailsViewPager.setCurrentPosition(-1);
                    viewPager.setCurrentItem(position, true);
                } else if (viewPager.getCurrentItem() < position) {
                    detailsViewPager.setCurrentPosition(-1);
                    viewPager.setCurrentItem(position, true);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if (state >= 1) {
                    detailsViewPager.setCount(tourDetailsFragment.getListSize());
                    if (state == 2) {
                        detailsViewPager.setCurrentPosition(1);
                        onPageSelected(detailsViewPager.getCurrentPosition());
                        detailsViewPager.getItem(detailsViewPager.getCurrentPosition());
                    }
                }

                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        detailsViewPager.setCount(1);
        adapter.notifyDataSetChanged();
        adapter.finishUpdate(viewPager);

    }


}