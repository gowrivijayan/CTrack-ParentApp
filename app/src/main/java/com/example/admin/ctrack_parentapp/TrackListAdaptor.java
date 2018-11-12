package com.example.devoprakesh.trackmychild;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TrackListAdaptor extends RecyclerView.Adapter<TrackListAdaptor.ViewHolder> {

    Context context;
    List<UserData> childrens;

    public TrackListAdaptor(Context context, List<UserData> childrens) {
        this.context = context;
        this.childrens = childrens;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        Log.i("Count",""+childrens.size());
        if(childrens.isEmpty()){

            view = inflater.inflate(R.layout.nothingtodiplay,parent,false);
        }else {
            view = inflater.inflate(R.layout.listlayoutview,parent,false);
        }
        
