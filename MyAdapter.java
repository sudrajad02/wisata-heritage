package com.android.kelompok.heritageyogya;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ROHIMAH on 14/05/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<SportJava> mSportsData;
    private GradientDrawable mGradientDrawable;

    static class MyViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        public TextView mtitle;
        public ImageView mimage;
        private Context mContext;
        private SportJava mCurrentSport;
        private GradientDrawable mGradientDrawable;

        MyViewHolder(Context context, View itemView, GradientDrawable gradientDrawable) {
            super(itemView);
            mtitle = (TextView) itemView.findViewById(R.id.ivTitle);
            mimage = (ImageView) itemView.findViewById(R.id.ivImage);

            mContext = context;
            mGradientDrawable = gradientDrawable;

            itemView.setOnClickListener(this);
        }

        void bindTo(SportJava currentSport){
            mtitle.setText(currentSport.getSportName());
            mCurrentSport = currentSport;

            Glide.with(mContext).load(currentSport.getSportImage())
                    .placeholder(mGradientDrawable).into(mimage);
        }

        @Override
        public void onClick(View v) {
            Intent detailIntent = SportJava.startr(mContext, mCurrentSport.getSportName(),
                    mCurrentSport.getSportImage());
            mContext.startActivity(detailIntent);
        }
    }

    public MyAdapter(Context mContext, ArrayList<SportJava> sportData){
        this.mContext = mContext;
        this.mSportsData = sportData;

        //Prepare gray placeholder
        mGradientDrawable = new GradientDrawable();
        mGradientDrawable.setColor(Color.GRAY);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /*View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item_row, parent, false);
        return new MyViewHolder(itemView);*/

        return new MyViewHolder(mContext, LayoutInflater.from(mContext).
                inflate(R.layout.mylistview, parent, false), mGradientDrawable);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        SportJava currentSport = mSportsData.get(position);
        holder.bindTo(currentSport);
    }

    @Override
    public int getItemCount() {
        return mSportsData.size();
    }
}
