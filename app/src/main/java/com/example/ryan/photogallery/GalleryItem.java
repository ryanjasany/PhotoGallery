package com.example.ryan.photogallery;

import android.net.Uri;

/**
 * Created by Ryan on 11/28/2017.
 */

public class GalleryItem {

    public String getCaption() {
        return mCaption;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String Owner) {
        this.mOwner = Owner;
    }

    public String mOwner;

    public Uri getPhotoPageUri(){

        return Uri.parse("https://www.flickr.com/photos/").buildUpon().appendPath(mOwner).appendPath(mId).build();

    }


    public void setCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    private String mCaption;
    private String mId;
    private String mUrl;

    @Override
    public String toString(){
        return mCaption;

    }

}
