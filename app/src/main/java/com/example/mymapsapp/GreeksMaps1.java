package com.example.mymapsapp;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.mymapsapp.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GreeksMaps1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;

            // Add a marker in Sydney and move the camera
            LatLng greeksRestaurant1 = new LatLng(43.7305922,-79.3021954);
            LatLng sydney = new LatLng(-34, 151);
            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            mMap.addMarker(new MarkerOptions().position(greeksRestaurant1).title("Il Fresco Restaurant Restaurant"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(greeksRestaurant1, 15));
        }
}