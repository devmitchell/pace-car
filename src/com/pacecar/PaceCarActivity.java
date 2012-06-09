package com.pacecar;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;

public class PaceCarActivity extends Activity {
  
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    LocationManager manager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
    PositionListener listener = PositionListener.getListener();
    manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, listener);
  }
  
}