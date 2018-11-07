package com.example.android.tourdubai.funplaces;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourdubai.R;
import com.example.android.tourdubai.TourItem;

import java.util.ArrayList;


/**
 * Created by WISEMINDS on 10/10/2018.
 */

public class FunPlacesAdapter extends  ArrayAdapter<TourItem> {

    /**
         * This is a public constructor used to create an object of the song adapter class
         * Here, we initialize the ArrayAdapter's internal storage for the context and the list.
         * the second argument is used when the ArrayAdapter is populating a single TextView.
         * Because this is a custom adapter for Three TextViews and an ImageView, the adapter is not
         * going to use this second argument, so it can be any value. Here, we used 0.
         */

        public FunPlacesAdapter(Context context, ArrayList<TourItem> FunPlacesList) {
            super(context, 0, FunPlacesList);

        }

        /**
         * Provides a view for an AdapterView (ListView, GridView, etc.)
         *
         * @param position    The AdapterView position that is requesting a view
         * @param convertView The list view to populate.
         * @param parent      The parent ViewGroup that is used for inflation.
         * @return The View for the position in the AdapterView.
         */
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView,
                            @NonNull ViewGroup parent){

            final TextView funPlacesNameView;
            final TextView funPlacesDetailsView;
            final ImageView funPlacesImageIconView;
            // If this is a new View object we're getting, then inflate the layout.
            // If not, this view already has the layout inflated from a previous call to getView,
            // and we modify the View widgets as usual.
            View listView = convertView;
            if (listView == null) {
                listView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.funplaces_list_item, parent, false);
            }
            TourItem tourItem = getItem(position);

            funPlacesNameView = (TextView) listView.findViewById(R.id.funplaces_name);
//            funPlacesDetailsView = (TextView) listView.findViewById(R.id.photo_credit);
            funPlacesImageIconView = (ImageView) listView.findViewById(R.id.funplaces_image);
            funPlacesNameView.setText(tourItem.getName());
//            funPlacesDetailsView.setText(tourItem.getDetails());
            funPlacesImageIconView.setImageResource(tourItem.getmImageIconResourceId());


            return listView;
        }


    }

