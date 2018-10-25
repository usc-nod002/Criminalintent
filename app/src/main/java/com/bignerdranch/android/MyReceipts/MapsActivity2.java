//package com.bignerdranch.android.MyReceipts;
//
//import android.os.Bundle;
//import android.support.v4.app.FragmentActivity;
//
//public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {
//
//    private GoogleMap mMap;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_maps2);
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
//
//
//    }
//
//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//
//        //add a marker in sydney and move the camera
//        LatLng sysdney = new LatLng(34 151);
//        mMap.addMarker(new MarkerOptions().position(sysdney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sysdney));
//    }
//}
