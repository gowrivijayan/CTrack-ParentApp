package com.example.admin.ctrack_parentapp;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
public class Display extends FragmentActivity implements OnMapReadyCallback {

    private static final String TAG = Display.class.getSimpleName();
    private HashMap<String,Marker> markerHashMap = new HashMap<>();
    private GoogleMap mMap;
    private String num;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent intent = getIntent();
        num = intent.getStringExtra("Number");
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMaxZoomPreference(16);
        MapUpdates();
        private void MapUpdates(){

            DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Childrens");
            ref.child(num).addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    setMarker(dataSnapshot);
                }
                @Override
                public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    setMarker(dataSnapshot);
                }

                @Override
                public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                    Log.d("Error :","Failed to read value",databaseError.toException());
                }
            });

        }

        private void setMarker(DataSnapshot dataSnapshot){

            String key = dataSnapshot.getKey();
            Log.i("data:",key);
            Log.i("data:",dataSnapshot.getValue().toString());
            if(key.equals("Current")){

                HashMap<String, Object> value = (HashMap<String, Object>)dataSnapshot.getValue();
            });

        }

        private void setMarker(DataSnapshot dataSnapshot){

            String key = dataSnapshot.getKey();
            Log.i("data:",key);
            Log.i("data:",dataSnapshot.getValue().toString());
            if(key.equals("Current")){

                HashMap<String, Object> value = (HashMap<String, Object>)dataSnapshot.getValue();
            }

            mMap.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(),300));


        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Display.this,Home.class);
        startActivity(intent);
        finish();
    }

            }
