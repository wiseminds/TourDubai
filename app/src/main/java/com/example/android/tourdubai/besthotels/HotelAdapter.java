package com.example.android.tourdubai.besthotels;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourdubai.R;
import com.example.android.tourdubai.TourItem;

import java.util.List;

/**
 * Created by WISEMINDS on 10/10/2018.
 */

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {
    public List<TourItem> mHotelList;

    /**
     * This is a public constructor used to create an object of the song adapter class
     * Here, we initialize the ArrayAdapter's internal storage for the context and the list.
     * the second argument is used when the ArrayAdapter is populating a single TextView.
     * Because this is a custom adapter for Three TextViews and an ImageView, the adapter is not
     * going to use this second argument, so it can be any value. Here, we used 0.
     */

    public HotelAdapter(List<TourItem> historyList) {
        mHotelList = historyList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hotel_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        holder.mItem = mHotelList.get(position);
        holder.hotelNameView.setText(mHotelList.get(position).getName());
        holder.hotelRatingsView.setText(mHotelList.get(position).getRating());
        holder.hotelRatingsView.append(" of 427 hotels in Dubai");
        holder.hotelDetailsView.setText(mHotelList.get(position).getDetails());
        holder.hotelFacilitiessView.setText(mHotelList.get(position).getmFacilities());
        holder.hotelImageView.setImageResource(mHotelList.get(position).getmImageIconResourceId());

    }

    @Override
    public int getItemCount() {
        return mHotelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public TourItem mItem;
        public final TextView hotelNameView;
        public final TextView hotelDetailsView;
        public final TextView  hotelRatingsView;
        public final TextView  hotelFacilitiessView;
        public final ImageView hotelImageView;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            hotelNameView = (TextView) view.findViewById(R.id.hotel_name);
            hotelDetailsView = (TextView) view.findViewById(R.id.hotel_details);
            hotelRatingsView = (TextView) view.findViewById(R.id.hotel_ratings);
            hotelImageView = (ImageView) view.findViewById(R.id.hotel_image);
            hotelFacilitiessView = (TextView) view.findViewById(R.id.hotel_facilities);
        }

    }
}