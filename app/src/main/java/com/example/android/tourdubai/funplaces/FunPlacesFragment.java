package com.example.android.tourdubai.funplaces;

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

public class FunPlacesFragment extends Fragment {

    TourDetailsFragment tourDetailsFragment = new TourDetailsFragment();
    ArrayList<TourItem> funPlacesArrayList;
         private static int clickedPosition;
    public FunPlacesFragment(){
        }

    public static FunPlacesFragment newInstance() {
        FunPlacesFragment fragment = new FunPlacesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle savedInstanceState) {
        ListView listView = (ListView) inflater.inflate(R.layout.fragment_funplaces, container, false);
        funPlacesArrayList = FunPlacesList.getFunPlacesList();
        final Context context = listView.getContext();
        FunPlacesAdapter adapter = new FunPlacesAdapter(context, funPlacesArrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                clickedPosition=position;
                tourDetailsFragment.setDetailsFragment(funPlacesArrayList, clickedPosition);
                Intent intent = new Intent(context, TourDetailsActivity.class);
                startActivity(intent);
            }
        });

        return listView;

    }


    /**
     * This is an inner class that holds list of funplaces instances using a constructor from tour item
     */

    public static class FunPlacesList {
      private   final static ArrayList<TourItem> mFunArrayList = new ArrayList<TourItem>();

    public FunPlacesList(){

            }

        public static ArrayList<TourItem> getFunPlacesList(){

            mFunArrayList.add(new TourItem(R.string.dubai_mall,R.string.dubai_mall_details,
                    R.drawable.dubai_mall, R.drawable.dubai_mall_icon,true));
            mFunArrayList.add(new TourItem(R.string.dubai_creek,R.string.dubai_creek_details,
                    R.drawable.dubai_creek, R.drawable.dubai_creek_icon,true));
            mFunArrayList.add(new TourItem(R.string.jumeirah_mosque,R.string.jumeirah_mosque_details,
                    R.drawable.jumeriah_mosque, R.drawable.jumeriah_mosque_icon,true));
            mFunArrayList.add(new TourItem(R.string.deira,R.string.deira_details,
                    R.drawable.deria, R.drawable.deria_icon,true));
            mFunArrayList.add(new TourItem(R.string.heritage_and_diving_village,R.string.heritage_and_diving_village_details,
                    R.drawable.heritage_diving_village, R.drawable.heritage_diving_village_icon,true));
            mFunArrayList.add(new TourItem(R.string.dubai_aquarium,R.string.dubai_aquarium_details,
                    R.drawable.dubai_aquarium, R.drawable.dubai_aquarium_icon,true));
            mFunArrayList.add(new TourItem(R.string.jumeirah_beach,R.string.jumeirah_beach_details,
                    R.drawable.jumeriah_beach, R.drawable.jumeriah_beach_icon,true));
            mFunArrayList.add(new TourItem(R.string.mall_of_the_emirates,R.string.mall_of_the_emirates_details,
                    R.drawable.mall_of_emirates, R.drawable.mall_of_emirates_icon,true));
            mFunArrayList.add(new TourItem(R.string.img_worlds_of_adventure,R.string.img_worlds_of_adventure_details,
                    R.drawable.img_worlds_of_adventure, R.drawable.img_worlds_of_adventure_icon,true));
            mFunArrayList.add(new TourItem(R.string.dubai_opera,R.string.dubai_opera_details,
                    R.drawable.dubai_opera, R.drawable.dubai_opera_icon,true));
            mFunArrayList.add(new TourItem(R.string.kite_beach,R.string.kite_beach_details,
                    R.drawable.kite_beach, R.drawable.kite_beach_icon,true));
            mFunArrayList.add(new TourItem(R.string.dubai_parks_and_resorts,R.string.dubai_parks_and_resorts_details,
                    R.drawable.bollywood_parks, R.drawable.bastakia_old_dubai_icon,true));
            mFunArrayList.add(new TourItem(R.string.aquaventure_waterpark,R.string.aquaventure_waterpark_details,
                    R.drawable.aquaventure_water_park, R.drawable.aquaventure_water_park_icon,true));
            mFunArrayList.add(new TourItem(R.string.tips_and_tours,R.string.tips_and_tours_details,
                    R.drawable.img_worlds_of_adventure, R.drawable.dubai_aquarium_icon,true));
            mFunArrayList.add(new TourItem(R.string.where_to_stay,R.string.where_to_stay_details,
                    R.drawable.jumeriah_beach, R.drawable.jumeriah_beach_icon,true));

            return mFunArrayList;
        }



    }
}

