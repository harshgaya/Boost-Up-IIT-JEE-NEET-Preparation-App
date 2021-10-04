package com.harsh.jeephysics;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;

public class FacebookAudience extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);
    }
}
