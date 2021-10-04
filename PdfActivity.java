package com.harsh.jeephysics;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import java.io.File;

public class PdfActivity extends AppCompatActivity {
    private PDFView pdfView;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);


        pdfView = findViewById(R.id.pdfView);
        Intent intent=getIntent();
        String website=intent.getStringExtra("links");

        ///258335248938080_258338595604412

        AudienceNetworkAds.initialize(this);

        interstitialAd = new InterstitialAd(this, "258335248938080_258338595604412");
        // Set listeners for the Interstitial Ad
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                //Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                //Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                //Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                // Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                //Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                //Log.d(TAG, "Interstitial ad impression logged!");
            }
        });

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd.loadAd();



        openPdf(website);
    }

    private void openPdf(String fileNamed){
        try{
            File file=getFileStreamPath(fileNamed);
            Log.e("file","file: "+file.getAbsolutePath());
            //seekBar.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);
            pdfView.fromFile(file).enableSwipe(true).swipeHorizontal(false).onError(new OnErrorListener() {
                @Override
                public void onError(Throwable t) {
                    Log.e("file","file"+t.toString());
                }
            }).enableAntialiasing(true).spacing(0).pageFitPolicy(FitPolicy.WIDTH).pageSnap(true).pageFling(true).nightMode(false)
                    .scrollHandle(new DefaultScrollHandle(this)).load();
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(PdfActivity.this, "error", Toast.LENGTH_SHORT).show();
        }
    }

}
