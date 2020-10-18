package com.example.miwok_workshop;

public class MiwokModel {

    private int mImageResourceId = No_Image_Id;
    private static final int No_Image_Id = 0;
    private String mDefaulttranslation;
    private String mMiwoktranslation;

    public MiwokModel(String mMiwoktranslation, String mDefaulttranslation, int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
        this.mDefaulttranslation = mDefaulttranslation;
        this.mMiwoktranslation = mMiwoktranslation;
    }

    public MiwokModel(String mMiwoktranslation, String mDefaulttranslation) {
        this.mDefaulttranslation = mDefaulttranslation;
        this.mMiwoktranslation = mMiwoktranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public String getmDefaulttranslation() {
        return mDefaulttranslation;
    }

    public void setmDefaulttranslation(String mDefaulttranslation) {
        this.mDefaulttranslation = mDefaulttranslation;
    }

    public String getmMiwoktranslation() {
        return mMiwoktranslation;
    }

    public void setmMiwoktranslation(String mMiwoktranslation) {
        this.mMiwoktranslation = mMiwoktranslation;
    }

    public boolean hasImage(){
        return mImageResourceId!=No_Image_Id;
    }

}
