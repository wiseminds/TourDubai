package com.example.android.tourdubai.restaurant;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourdubai.R;
import com.example.android.tourdubai.TourItem;

import java.util.ArrayList;

import static com.example.android.tourdubai.R.drawable.soul;
import static com.example.android.tourdubai.R.string.little_miss_india_details;

/**
 * Created by WISEMINDS on 10/10/2018.
 */

public class RestaurantFragment extends Fragment {

    RestaurantList restaurantList = new RestaurantList();
    ArrayList<TourItem> restaurantArrayList;

    private static final String ARG_COLUMN_COUNT = "column-count";

    private int mColumnCount = 1;
    public RestaurantFragment(){

    }
    public static RestaurantFragment newInstance(int columnCount) {

        RestaurantFragment fragment = new RestaurantFragment();
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
        restaurantArrayList = restaurantList.getRestaurantList();


        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));

            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new RestaurantAdapter(restaurantArrayList));
        }
        return view;
    }

    /**
     * This is an inner class that holds list of Restaurant instances using a constructor from tour item
     */

    public static class RestaurantList {
        private final static ArrayList<TourItem> mrestaurantArrayList = new ArrayList<TourItem>();

        public RestaurantList() {

        }

        public ArrayList<TourItem> getRestaurantList() {

            mrestaurantArrayList.add(new TourItem(R.string.al_maeda,R.string.al_maeda_edetails,R.string.rating_1,
                    R.string.al_maeda_edish,R.drawable.al_maedea));
            mrestaurantArrayList.add(new TourItem(R.string.the_gallery,R.string.the_gallery_details,R.string.rating_2,
                    R.string.the_gallery_dish, R.drawable.the_gallery));
            mrestaurantArrayList.add(new TourItem(R.string.fish_hut_seafood_restaurant,R.string.fish_hut_seafood_restaurant_details,R.string.rating_5,
                    R.string.fish_hut_seafood_restaurant_dish,R.drawable.fish_hut_sea_food));
            mrestaurantArrayList.add(new TourItem(R.string.azure_beach,R.string.azure_beach_details,R.string.rating_6,
                    R.string.azure_beach_dish, R.drawable.azure_beach));
            mrestaurantArrayList.add(new TourItem(R.string.cara,R.string.cara_details,R.string.rating_9,
                    R.string.cara_dish,R.drawable.cara));
            mrestaurantArrayList.add(new TourItem(R.string.little_miss_india, little_miss_india_details,R.string.rating_10,
                    R.string.little_miss_india_dish, R.drawable.little_miss_india));
            mrestaurantArrayList.add(new TourItem(R.string.al_dawaar,R.string.al_dawaar_details,R.string.rating_11,
                    R.string.al_dawaar_dish,R.drawable.al_dawaar));
            mrestaurantArrayList.add(new TourItem(R.string.amaseena,R.string.amaseena_details,R.string.rating_13,
                    R.string.amaseena_dish, R.drawable.amaseena));
            mrestaurantArrayList.add(new TourItem(R.string.al_sarab_rooftop_lounge,R.string.al_sarab_rooftop_lounge_details,R.string.rating_14,
                    R.string.al_sarab_rooftop_lounge_dish,R.drawable.al_sarab_roof_top_longue));
            mrestaurantArrayList.add(new TourItem(R.string.barefoot_lounge,R.string.barefoot_lounge_details,R.string.rating_15,
                    R.string.barefoot_lounge_dish, R.drawable.barefoot));
            mrestaurantArrayList.add(new TourItem(R.string.al_grissino,R.string.al_grissino_details,R.string.rating_16,
                    R.string.al_grissino_dish,R.drawable.al_grissino));
            mrestaurantArrayList.add(new TourItem(R.string.the_kitchen,R.string.the_kitchen_details,R.string.rating_17,
                    R.string.the_kitchen_dish, R.drawable.the_kitchen));
            mrestaurantArrayList.add(new TourItem(R.string.le_patio,R.string.le_patio_details,R.string.rating_18,
                    R.string.le_patio_dish,R.drawable.le_piato));
            mrestaurantArrayList.add(new TourItem(R.string.miyako,R.string.miyako_details,R.string.rating_19,
                    R.string.miyako_dish, R.drawable.miyako));
            mrestaurantArrayList.add(new TourItem(R.string.quattro_passi,R.string.quattro_passi_details,R.string.rating_20,
                    R.string.quattro_passi_dish,R.drawable.quatrro_passi));
            mrestaurantArrayList.add(new TourItem(R.string.olea,R.string.olea_details,R.string.rating_21,
                    R.string.olea_dish, R.drawable.olea));
            mrestaurantArrayList.add(new TourItem(R.string.somersets,R.string.somersets_details,R.string.rating_22,
                    R.string.somersets_dish,R.drawable.somerest));
            mrestaurantArrayList.add(new TourItem(R.string.cuisinero_uno,R.string.cuisinero_uno_details,R.string.rating_26,
                    R.string.cuisinero_uno_dish, R.drawable.cuisinero_uno));
            mrestaurantArrayList.add(new TourItem(R.string.seafood_market,R.string.seafood_market_details,R.string.rating_27,
                    R.string.seafood_market_dish,R.drawable.seafood_market));
            mrestaurantArrayList.add(new TourItem(R.string.soul_restaurant_bar,R.string.soul_restaurant_bar_details,R.string.rating_28,
                    R.string.soul_restaurant_bar_dish, soul));
            mrestaurantArrayList.add(new TourItem(R.string.wavebreaker,R.string.wavebreaker_details,R.string.rating_29,
                    R.string.wavebreaker_dish,R.drawable.wavebreaker));
            mrestaurantArrayList.add(new TourItem(R.string.trader_vics_hilton_dubai,R.string.trader_vics_hilton_dubai_details,R.string.rating_31,
                    R.string.trader_vics_hilton_dubai_dish, R.drawable.trader_vics));
            mrestaurantArrayList.add(new TourItem(R.string.v_lounge,R.string.v_lounge_details,R.string.rating_32,
                    R.string.v_lounge_dish,R.drawable.v_longue));
            mrestaurantArrayList.add(new TourItem(R.string.the_talk_restaurant,R.string.the_talk_restaurant_details,R.string.rating_33,
                    R.string.the_talk_restaurant_dish, R.drawable.the_talk));
            mrestaurantArrayList.add(new TourItem(R.string.armani_ristorante,R.string.armani_ristorante_details,R.string.rating_34,
                    R.string.armani_ristorante_dish, R.drawable.armarni_ristorante));
            mrestaurantArrayList.add(new TourItem(R.string.ostro,R.string.ostro_details,R.string.rating_35,
                    R.string.ostro_dish,R.drawable.ostro));
            mrestaurantArrayList.add(new TourItem(R.string.solo_dubai,R.string.solo_dubai_details,R.string.rating_36,
                    R.string.solo_dubai_dish, R.drawable.solo_dubai));
            mrestaurantArrayList.add(new TourItem(R.string.yalumba,R.string.yalumba_details,R.string.rating_37,
                    R.string.yalumba_dish,R.drawable.yalumba));
            mrestaurantArrayList.add(new TourItem(R.string.celebrities,R.string.celebrities_details,R.string.rating_33,
                    R.string.celebrities_dish, R.drawable.celebrities));
            return mrestaurantArrayList;
        }

    }
}
