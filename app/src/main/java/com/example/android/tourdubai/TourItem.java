package com.example.android.tourdubai;



/**
 * Created by WISEMINDS on 10/13/2018.
 */

public class TourItem {
    private int mName;
    private int mRating;
    private int mDetails;
    private int mFacilities;
    private int mImageResourceId;
    private int mImageIconResourceId;

    //public constructors to create a TourItem object
    public TourItem(int name, int details, int image, int imageIcon, boolean type) {
        mName = name;
        mDetails = details;
        mImageIconResourceId = imageIcon;
        if (type == true) {
            mImageResourceId = image;
        } else if (type == false) {
            mRating = image;
        }
    }

    public TourItem(int name, int details, int ratings, int facilities, int imageIcon) {
        mName = name;
        mDetails = details;
        mImageIconResourceId = imageIcon;
        mRating = ratings;
        mFacilities = facilities;
    }

    // These are public methods to recieve various atributes of a History
    public int getName() {
        return mName;
    }

    public int getRating() {
        return mRating;
    }

    public int getDetails() {
        return mDetails;
    }

    public int getmFacilities() {
        return mFacilities;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmImageIconResourceId() {
        return mImageIconResourceId;
    }
}



