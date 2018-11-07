package com.example.android.tourdubai.besthotels;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourdubai.R;
import com.example.android.tourdubai.TourItem;

import java.util.ArrayList;

import static com.example.android.tourdubai.R.string.burj_al_arab_jumeirah_facilities;
import static com.example.android.tourdubai.R.string.four_seasons_resort_dubai;
import static com.example.android.tourdubai.R.string.grosvenor_house_hotel_and_apartments;
import static com.example.android.tourdubai.R.string.rating_1;
import static com.example.android.tourdubai.R.string.rating_12;
import static com.example.android.tourdubai.R.string.rating_13;
import static com.example.android.tourdubai.R.string.rating_14;
import static com.example.android.tourdubai.R.string.rating_2;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * Use the {@link  HotelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class HotelFragment extends Fragment {

    HotelList hotelList = new HotelList();
    ArrayList<TourItem> hotelArrayList;

    private static final String ARG_COLUMN_COUNT = "column-count";
    private int mColumnCount = 1;

    public HotelFragment(){
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param columnCount decides how many columns to use for the @recyclerView.
     *
     * @return A new instance of fragment HotelFragment.
     */
    public static HotelFragment newInstance(int columnCount) {

        HotelFragment fragment = new HotelFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                              Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        hotelArrayList = hotelList.getHotelList();


        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));

            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new HotelAdapter(hotelArrayList));
        }
        return view;
    }


    /**
     * This is an inner class that holds list of Hotel instances using a constructor from tour item
     */

    public static class HotelList {
      private   final static ArrayList<TourItem> mHotelArrayList = new ArrayList<TourItem>();

    public HotelList(){

            }

        public ArrayList<TourItem> getHotelList(){

            mHotelArrayList.add(new TourItem(R.string.the_palm_dubai,R.string.the_palm_dubai_details, rating_1,
               R.string.the_palm_dubai_facilities, R.drawable.palm_dubai));
            mHotelArrayList.add(new TourItem(R.string.raffles_dubai,R.string.raffles_dubai_details, rating_2,
                    R.string.raffles_dubai_facilities, R.drawable.raffles_dubai));
            mHotelArrayList.add(new TourItem(grosvenor_house_hotel_and_apartments,R.string.grosvenor_house_hotel_and_apartments_details,R.string.rating_3,
                    R.string.grosvenor_house_hotel_and_apartments_facilities, R.drawable.grosvernor_house_hotel));
            mHotelArrayList.add(new TourItem(R.string.bulgari_resort,R.string.bulgari_resort_details,R.string.rating_4,
                    R.string.bulgari_resort_facilities, R.drawable.bulgari_resort));
            mHotelArrayList.add(new TourItem(R.string.jumeirah_emirates_towers,R.string.jumeirah_emirates_towers_details,R.string.rating_5,
                    R.string.jumeirah_emirates_towers_facilities, R.drawable.jumeriah_emiretes_tower));
            mHotelArrayList.add(new TourItem(R.string.park_hyatt_dubai,R.string.park_hyatt_dubai_details,R.string.rating_6,
                    R.string.park_hyatt_dubai_facilities, R.drawable.park_hyatt));
            mHotelArrayList.add(new TourItem(four_seasons_resort_dubai,R.string.four_seasons_resort_dubai_details,R.string.rating_7,
                    R.string.four_seasons_resort_dubai_facilities, R.drawable.four_seasons_resort));
            mHotelArrayList.add(new TourItem(R.string.jumeirah_al_qasr,R.string.jumeirah_al_qasr_details,R.string.rating_8,
                   R.string.jumeirah_al_qasr_facilities, R.drawable.jumeriah_al_qasr));
            mHotelArrayList.add(new TourItem(R.string.renaissance_downtown_hotel,R.string.renaissance_downtown_hotel_details,R.string.rating_9,
                    R.string.renaissance_downtown_hotel_facilities, R.drawable.renaissance_downtown_hotel));
            mHotelArrayList.add(new TourItem(R.string.jumeirah_dar_al_masyaf,R.string.jumeirah_dar_al_masyaf_details,R.string.rating_10,
                    R.string.jumeirah_dar_al_masyaf_facilities, R.drawable.jumeriah_dar_al_mayasaf));
            mHotelArrayList.add(new TourItem(R.string.burj_al_arab_jumeirah,R.string.burj_al_arab_jumeirah_details,R.string.rating_11,
                    burj_al_arab_jumeirah_facilities, R.drawable.burj_al_arab_jumeriah));
            mHotelArrayList.add(new TourItem(R.string.al_bandar_rotana,R.string.al_bandar_rotana_details, rating_12,
                    R.string.al_bandar_rotana_facilities, R.drawable.raffles_dubai));
            mHotelArrayList.add(new TourItem(R.string.zabeel_house_mini,R.string.zabeel_house_mini_details, rating_14,
                    R.string.zabeel_house_mini_facilities, R.drawable.zabeel_house));
            mHotelArrayList.add(new TourItem(R.string.address_dubai_marina,R.string.address_dubai_marina_details, rating_13,
                    R.string.address_dubai_marina_facilities, R.drawable.address_dubai_marina));
            mHotelArrayList.add(new TourItem(R.string.jumeirah_mina_asalam,R.string.jumeirah_mina_asalam_details,R.string.rating_15,
                    R.string.jumeirah_mina_asalam_facilities, R.drawable.jumeriah_mina_asalam));
            mHotelArrayList.add(new TourItem(R.string.armani_hotel_dubai,R.string.armani_hotel_dubai_details,R.string.rating_16,
                    R.string.armani_hotel_dubai_facilities, R.drawable.armani_hotel));
            mHotelArrayList.add(new TourItem(R.string.rove_city_centre,R.string.rove_city_centre_details,R.string.rating_17,
                    R.string.rove_city_centre_facilities, R.drawable.rove_city_centre));
            mHotelArrayList.add(new TourItem(R.string.rove_dubai_marina,R.string.rove_dubai_marina_details,R.string.rating_18,
                    R.string.rove_dubai_marina_facilities, R.drawable.rove_dubai_marina));
            mHotelArrayList.add(new TourItem(R.string.waldorf_astoria_dubai_palm_jumeirah,R.string.waldorf_astoria_dubai_palm_jumeirah_details,R.string.rating_19,
                    R.string.waldorf_astoria_dubai_palm_jumeirah_facilities, R.drawable.waldorf_asteria));
            mHotelArrayList.add(new TourItem(R.string.rove_healthcare_city,R.string.rove_healthcare_city_details,R.string.rating_20,
                    R.string.rove_healthcare_city_facilities, R.drawable.rove_healthcare_city));
            mHotelArrayList.add(new TourItem(R.string.the_oberoi_dubai,R.string.the_oberoi_dubai_details,R.string.rating_21,
                    R.string.the_oberoi_dubai_facilities, R.drawable.the_oberoi));
            mHotelArrayList.add(new TourItem(R.string.taj_dubai,R.string.taj_dubai_details,R.string.rating_22,
                    R.string.taj_dubai_facilities, R.drawable.tag_dubai));
            mHotelArrayList.add(new TourItem(R.string.aloft_city_centre_deira,R.string.aloft_city_centre_deira_details,R.string.rating_23,
                    R.string.aloft_city_centre_deira_facilities, R.drawable.aloft_city_centre_deria));
            mHotelArrayList.add(new TourItem(R.string.rove_downtown,R.string.rove_downtown_details,R.string.rating_24,
                    R.string.rove_downtown_facilities, R.drawable.rove_downtown));
            mHotelArrayList.add(new TourItem(R.string.rove_trade_centre,R.string.rove_trade_centre_details,R.string.rating_25,
                    R.string.rove_trade_centre_facilities, R.drawable.rove_trade_centre));
            mHotelArrayList.add(new TourItem(R.string.palazzo_versace_dubai,R.string.palazzo_versace_dubai_details,R.string.rating_26,
                    R.string.palazzo_versace_dubai_facilities, R.drawable.palazo_versace));
            mHotelArrayList.add(new TourItem(R.string.residence_spa_dubai,R.string.residence_spa_dubai_details,R.string.rating_27,
                    R.string.residence_spa_dubai_facilities, R.drawable.residence_and_spa));
            mHotelArrayList.add(new TourItem(R.string.park_regis_boutique_hotel,R.string.park_regis_boutique_hotel_details,R.string.rating_28,
                    R.string.park_regis_boutique_hotel_facilities, R.drawable.park_legis));
            mHotelArrayList.add(new TourItem(R.string.roda_links_al_nasr,R.string.roda_links_al_nasr_details,R.string.rating_29,
                    R.string.roda_links_al_nasr_facilities, R.drawable.roda_links));
            mHotelArrayList.add(new TourItem(R.string.le_royal_meridien_beach_resort_spa,R.string.le_royal_meridien_beach_resort_spa_details,R.string.rating_30,
                    R.string.le_royal_meridien_beach_resort_spa_facilities, R.drawable.le_royal_meredian_beach));
            return mHotelArrayList;
        }




    }
}

