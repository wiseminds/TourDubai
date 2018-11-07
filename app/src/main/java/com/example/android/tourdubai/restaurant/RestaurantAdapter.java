package com.example.android.tourdubai.restaurant;

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

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    public List<TourItem> mRestaurantList;

    /**
     * This is a public constructor used to create an object of the  adapter class
     * Here, we initialize the ArrayAdapter's internal storage for the context and the list.
     * the second argument is used when the ArrayAdapter is populating a single TextView.
     * Because this is a custom adapter for Three TextViews and an ImageView, the adapter is not
     * going to use this second argument, so it can be any value. Here, we used 0.
     */

    public RestaurantAdapter(List<TourItem> RestaurantList) {
        mRestaurantList = RestaurantList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        holder.mItem = mRestaurantList.get(position);
        holder.restaurantNameView.setText(mRestaurantList.get(position).getName());
        holder.restaurantRatingsView.setText(mRestaurantList.get(position).getRating());
        holder.restaurantRatingsView.append(" of 9,591 restaurants in Dubai.");
        holder.restaurantDetailsView.setText(mRestaurantList.get(position).getDetails());
        holder.restaurantDishView.setText(mRestaurantList.get(position).getmFacilities());
        holder.restaurantImageView.setImageResource(mRestaurantList.get(position).getmImageIconResourceId());

    }

    @Override
    public int getItemCount() {
        return mRestaurantList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        //        public final TextView mIdView;
//        public final TextView mContentView;
        public TourItem mItem;
        public final TextView restaurantNameView;

        public final TextView restaurantRatingsView;
        public final TextView restaurantDetailsView;
        public final TextView restaurantDishView;
        public final ImageView restaurantImageView;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            restaurantNameView = (TextView) view.findViewById(R.id.restaurant_name);
            restaurantDetailsView = (TextView) view.findViewById(R.id.restaurant_details);
            restaurantRatingsView = (TextView) view.findViewById(R.id.restaurant_ratings);
            restaurantDishView = (TextView) view.findViewById(R.id.restaurant_dish);
            restaurantImageView = (ImageView) view.findViewById(R.id.restaurant_image);

        }

    }
}