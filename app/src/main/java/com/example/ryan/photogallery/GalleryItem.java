package com.example.ryan.photogallery;

/**
 * Created by Ryan on 11/28/2017.
 */

public class GalleryItem {

    public String getmCaption() {
        return mCaption;
    }

    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
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
