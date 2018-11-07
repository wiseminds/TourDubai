package com.example.android.tourdubai.historicalsites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourdubai.R;
import com.example.android.tourdubai.TourItem;
import com.example.android.tourdubai.tourdetails.TourDetailsActivity;
import com.example.android.tourdubai.tourdetails.TourDetailsFragment;

import java.util.ArrayList;

/**
 * Created by WISEMINDS on 10/10/2018.
 */

public class HistoryFragment extends Fragment {

    TourDetailsFragment tourDetailsFragment = new TourDetailsFragment();
    ArrayList<TourItem> historyArrayList;
     private static int clickedPosition;
    public HistoryFragment(){

    }
    public static HistoryFragment newInstance() {

        HistoryFragment fragment = new HistoryFragment();
        Bundle args = new Bundle();
          fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("History", "OnPause clickedposition "+clickedPosition );

    }



    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                              Bundle savedInstanceState) {
        ListView listView = (ListView) inflater.inflate(R.layout.fragment_history, container, false);
        Log.v("History", "OncreateView");
        historyArrayList = HistoryList.getHistoryList();
        final Context context = listView.getContext();
        HistoryAdapter adapter = new HistoryAdapter(context, historyArrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            clickedPosition=position;
                tourDetailsFragment.setDetailsFragment(historyArrayList, clickedPosition);
                Intent intent = new Intent(context, TourDetailsActivity.class);
                startActivity(intent);
            }
        });
      return listView;
    }

    /**
     * This is an inner class that holds list of History instances using a constructor from tour item
     */

    public static class HistoryList {
      private   final static ArrayList<TourItem> mHistoryArrayList = new ArrayList<TourItem>();

    public HistoryList(){
            }

        public static ArrayList<TourItem> getHistoryList(){

            mHistoryArrayList.add(new TourItem(R.string.burj_khalifa,R.string.burj_khalifa_details,
                    R.drawable.burj_khalifa, R.drawable.burj_khalifa_icon,true));
            mHistoryArrayList.add(new TourItem(R.string.dubai_museum,R.string.dubai_museum_details,
                    R.drawable.dubai_museum, R.drawable.dubai_museum_icon,true));
            mHistoryArrayList.add(new TourItem(R.string.bastakia_Old_dubai,R.string.bastakia_Old_dubai_details,
                    R.drawable.bastakia_old_dubai, R.drawable.bastakia_old_dubai_icon,true));
            mHistoryArrayList.add(new TourItem(R.string.sheikh_saeed_al_maktoum_house,R.string.sheikh_saeed_al_maktoum_house_details,
                    R.drawable.sheikh_saeed_house, R.drawable.sheikh_saeed_house_icon,true));
            mHistoryArrayList.add(new TourItem(R.string.burj_al_arab,R.string.burj_al_arab_details,
                    R.drawable.burj_arab, R.drawable.burj_arab_icon,true));
            mHistoryArrayList.add(new TourItem(R.string.alserkal_art_district,R.string.alserkal_art_district_details,
                    R.drawable.alserkal_art_district, R.drawable.alserkal_art_district_icon,true));
            mHistoryArrayList.add(new TourItem(R.string.sheikh_zayed_road,R.string.sheikh_zayed_road_details,
                    R.drawable.sheik_zayed_road, R.drawable.sheik_zayed_road_icon,true));
            mHistoryArrayList.add(new TourItem(R.string.jumeirah_mosque,R.string.jumeirah_mosque_details,
                    R.drawable.jumeriah_mosque, R.drawable.jumeriah_mosque_icon,true));

            return mHistoryArrayList;
        }
    }
}

