package com.example.android.tourdubai.tourdetails;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourdubai.R;
import com.example.android.tourdubai.TourItem;

import java.util.ArrayList;


public class TourDetailsFragment extends Fragment {
    TextView detailsTextView;
    TextView photoCredit;
    ImageView detailsImage;
    TextView viewPagerTitle;
    public static ArrayList<TourItem> mHistoryList;
    private static int currentPosition;
    private static int toolBarTextId;
    private static int imageId;
    private static int detailsTextId;


    public TourDetailsFragment() {
    }

    public static TourDetailsFragment newInstance(int position) {
        Log.v("Fragment ", "new instance " + position);
        TourDetailsFragment fragment = new TourDetailsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        currentPosition = position;
        toolBarTextId = mHistoryList.get(position).getName();
        detailsTextId = mHistoryList.get(position).getDetails();
        imageId = mHistoryList.get(position).getmImageResourceId();
        return fragment;
    }

    public static int getListSize() {
        return mHistoryList.size();
    }

    public void setDetailsFragment(ArrayList<TourItem> HistoryList, int position) {
        this.mHistoryList = HistoryList;
        this.currentPosition = position;
    }

    public int getPosition() {
        return currentPosition;
    }

    public ArrayList<TourItem> getList() {
        return mHistoryList;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tour_details, container, false);
        viewPagerTitle = (TextView) view.findViewById(R.id.viewPagerLabel);
        detailsTextView = (TextView) view.findViewById(R.id.tour_details_text);
        photoCredit = (TextView) view.findViewById(R.id.photo_credit);
        detailsImage = (ImageView) view.findViewById(R.id.tour_details_image);
        detailsTextView.setText(detailsTextId);
        detailsImage.setImageResource(imageId);
        viewPagerTitle.setText(toolBarTextId);
        return view;
    }
}
