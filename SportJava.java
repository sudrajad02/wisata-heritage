package com.android.kelompok.heritageyogya;

/**
 * Created by ROHIMAH on 14/05/2018.
 */
import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;

public class SportJava {
    private String sportName;
    private int sportImage;
    static final String NAME_KEY = "Sport Name";
    static final String IMAGE_KEY = "Sport Image";

    public SportJava(String sportName, int sportImage){
        this.sportName=sportName;
        this.sportImage=sportImage;
    }

    public String getSportName(){
        return sportName;
    }

    public int getSportImage(){
        return sportImage;
    }

    static Intent startr(Context context, String sportName, @DrawableRes int sportImageId){
        Intent detailIntent = new Intent(context, GalleryDetail.class);
        detailIntent.putExtra(NAME_KEY, sportName);
        detailIntent.putExtra(IMAGE_KEY, sportImageId);
        return detailIntent;

    }
}
