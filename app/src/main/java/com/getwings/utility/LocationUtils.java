package com.getwings.utility;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Map;

/**
 * Created by ankit.verma on 2/24/2017.
 */

public class LocationUtils {

    public static final float GREEN = BitmapDescriptorFactory.HUE_GREEN;
    public static final float RED = BitmapDescriptorFactory.HUE_RED;
    public static final long INTERVAL_ONE_MINITE = 30000L;

    public static Marker locateAndMarkPlace(GoogleMap googleMap, LatLng place, String title, float hueColor) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(place);
        markerOptions.title(title);
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(hueColor));
        Marker marker = googleMap.addMarker(markerOptions);

        //Move the camera to new position
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(place));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(12));

        return marker;

    }
}
