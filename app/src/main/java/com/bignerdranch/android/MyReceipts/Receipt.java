package com.bignerdranch.android.MyReceipts;

import java.util.Date;
import java.util.UUID;

public class Receipt {

    private UUID mId;
    private String mTitle;
    private String mShop;
    private String mComment;
    private Date mDate;
    private String mSuspect;

    public Receipt() {
        this(UUID.randomUUID());

    }
    public Receipt(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId; }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    public String getShop() { return mShop; }
    public void setShop(String shop) {
        mShop = shop;
    }

    public String getComment() {
        return mComment;
    }
    public void setComment(String comment) { mComment = comment;}

    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }

    public String getSuspect() {
        return mSuspect;
    }
    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }
}
