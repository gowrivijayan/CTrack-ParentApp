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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_list_adaptor);
    }
}
