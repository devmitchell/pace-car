package com.pacecar;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class PositionListener implements LocationListener {
  
  private static PositionListener listener;
  
  public static PositionListener getListener() {
    if (listener == null) {
      listener = new PositionListener();
    }
    
    return listener;
  }

  public void onLocationChanged(Location location) {
    // TODO Auto-generated method stub
  }

  public void onProviderDisabled(String provider) {
    // TODO Auto-generated method stub
  }

  public void onProviderEnabled(String provider) {
    // TODO Auto-generated method stub
  }

  public void onStatusChanged(String provider, int status, Bundle extras) {
    // TODO Auto-generated method stub
  }
  
  private PositionListener() {}

}
