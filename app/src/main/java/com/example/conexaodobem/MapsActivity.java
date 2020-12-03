package com.example.conexaodobem;


import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, ActivityCompat.OnRequestPermissionsResultCallback {

    public GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        LatLng Itapetininga = new LatLng(-23, -48);
        final CameraPosition position= new CameraPosition.Builder().target(Itapetininga).bearing(45).tilt(90).zoom(17).build();
        CameraUpdate update= CameraUpdateFactory.newCameraPosition(position);
        mMap.animateCamera(update);
        final MarkerOptions markerOptions= new MarkerOptions();
        markerOptions.position(Itapetininga).title("Praça 3 Poderes,Itapetininga-SP");
        mMap.addMarker(markerOptions);

            
        }




    }

