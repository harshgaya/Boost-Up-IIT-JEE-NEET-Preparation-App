package com.harsh.jeephysics.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdIconView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.harsh.jeephysics.IIT.CenageAlgebraActivity;
import com.harsh.jeephysics.IIT.CenageCalculasActivity;
import com.harsh.jeephysics.IIT.CenageCoordinateGeometryActivity;
import com.harsh.jeephysics.IIT.CenageTrigonometryActivity;
import com.harsh.jeephysics.IIT.CenageVectorAnd3DActivity;
import com.harsh.jeephysics.IIT.MathPreviousYearActivity;
import com.harsh.jeephysics.IIT.MathPreviousYearSolutionActivity;
import com.harsh.jeephysics.IIT.NcertClass11MathSolutionActivity;
import com.harsh.jeephysics.IIT.NcertClass12MathActivity;
import com.harsh.jeephysics.IIT.NcertClass12MathSolutionActivity;
import com.harsh.jeephysics.IIT.NcertMathActivity;
import com.harsh.jeephysics.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MathBooksFragment extends Fragment {
    Button NCERTClass11Math,NCERTClass11MathSolution,NCERTClasss12MathBookBtn,NCERTClasss12MathBookSolutionBtn
            ,TrigoBtn,algebraBtn,coordinateGeometryBtn,CalculasBtn,vectorand3DBtn,PreviousYearBtn,
            PreviousYearSolutionBtn;

    private final String TAG = Context.class.getSimpleName();
    private NativeAd nativeAd;
    private NativeAdLayout nativeAdLayout;
    private LinearLayout adView;

    private View view;

    public MathBooksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_math_books, container, false);
        NCERTClass11Math=view.findViewById(R.id.NCERTClass11Math);
        NCERTClass11MathSolution=view.findViewById(R.id.NCERTClass11MathSolution);
        NCERTClasss12MathBookBtn=view.findViewById(R.id.NCERTClasss12MathBookBtn);
        NCERTClasss12MathBookSolutionBtn=view.findViewById(R.id.NCERTClasss12MathBookSolutionBtn);
        TrigoBtn=view.findViewById(R.id.TrigoBtn);
        algebraBtn=view.findViewById(R.id.algebraBtn);
        coordinateGeometryBtn=view.findViewById(R.id.coordinateGeometryBtn);
        CalculasBtn=view.findViewById(R.id.CalculasBtn);
        vectorand3DBtn=view.findViewById(R.id.vectorand3DBtn);
        PreviousYearBtn=view.findViewById(R.id.PreviousYearBtn);
        PreviousYearSolutionBtn=view.findViewById(R.id.PreviousYearSolutionBtn);

        NCERTClass11Math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), NcertMathActivity.class);
                startActivity(intent);
            }
        });
        NCERTClass11MathSolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), NcertClass11MathSolutionActivity.class);
                startActivity(intent);
            }
        });
        NCERTClasss12MathBookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), NcertClass12MathActivity.class);
                startActivity(intent);
            }
        });
        NCERTClasss12MathBookSolutionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), NcertClass12MathSolutionActivity.class);
                startActivity(intent);
            }
        });
        TrigoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), CenageTrigonometryActivity.class);
                startActivity(intent);
            }
        });
        algebraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), CenageAlgebraActivity.class);
                startActivity(intent);
            }
        });

        coordinateGeometryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), CenageCoordinateGeometryActivity.class);
                startActivity(intent);
            }
        });
        CalculasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), CenageCalculasActivity.class);
                startActivity(intent);
            }
        });
        vectorand3DBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), CenageVectorAnd3DActivity.class);
                startActivity(intent);
            }
        });
        PreviousYearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MathPreviousYearActivity.class);
                startActivity(intent);
            }
        });

        PreviousYearSolutionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MathPreviousYearSolutionActivity.class);
                startActivity(intent);
            }
        });

        loadNativeAd();

        return  view;
    }
    private void loadNativeAd() {

        nativeAd = new NativeAd(getContext(), getString(R.string.native_ad_unit_id));

        nativeAd.setAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                // Native ad finished downloading all assets
                Log.e(TAG, "Native ad finished downloading all assets.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Native ad failed to load
                Log.e(TAG, "Native ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Native ad is loaded and ready to be displayed
                Log.d(TAG, "Native ad is loaded and ready to be displayed!");

                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                // Inflate Native Ad into Container
                inflateAd(nativeAd);

            }

            @Override
            public void onAdClicked(Ad ad) {
                // Native ad clicked
                Log.d(TAG, "Native ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Native ad impression
                Log.d(TAG, "Native ad impression logged!");
            }
        });

        // Request an ad
        nativeAd.loadAd(NativeAd.MediaCacheFlag.ALL);
        //showNativeAdWithDelay();
    }
    private void inflateAd(NativeAd nativeAd) {

        if (getActivity()!=null) {

            nativeAd.unregisterView();

            // Add the Ad view into the ad container.
            nativeAdLayout = view.findViewById(R.id.native_ad_container);


            nativeAdLayout = view.findViewById(R.id.native_ad_container);
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // Inflate the Ad view.  The layout referenced should be the one you created in the last step.
            adView = (LinearLayout) inflater.inflate(R.layout.native_ad_layout, nativeAdLayout, false);
            nativeAdLayout.addView(adView);


            // Add the AdOptionsView
            LinearLayout adChoicesContainer = view.findViewById(R.id.ad_choices_container);
            AdOptionsView adOptionsView = new AdOptionsView(getContext(), nativeAd, nativeAdLayout);
            adChoicesContainer.removeAllViews();
            adChoicesContainer.addView(adOptionsView, 0);

            // Create native UI using the ad metadata.
            AdIconView nativeAdIcon = adView.findViewById(R.id.native_ad_icon);
            TextView nativeAdTitle = adView.findViewById(R.id.native_ad_title);
            MediaView nativeAdMedia = adView.findViewById(R.id.native_ad_media);
            TextView nativeAdSocialContext = adView.findViewById(R.id.native_ad_social_context);
            TextView nativeAdBody = adView.findViewById(R.id.native_ad_body);
            TextView sponsoredLabel = adView.findViewById(R.id.native_ad_sponsored_label);
            Button nativeAdCallToAction = adView.findViewById(R.id.native_ad_call_to_action);

            // Set the Text.
            nativeAdTitle.setText(nativeAd.getAdvertiserName());
            nativeAdBody.setText(nativeAd.getAdBodyText());
            nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
            nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
            nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
            sponsoredLabel.setText(nativeAd.getSponsoredTranslation());

            // Create a list of clickable views
            List<View> clickableViews = new ArrayList<>();
            clickableViews.add(nativeAdTitle);
            clickableViews.add(nativeAdCallToAction);

            // Register the Title and CTA button to listen for clicks.
            nativeAd.registerViewForInteraction(
                    adView,
                    nativeAdMedia,
                    nativeAdIcon,
                    clickableViews);
        }
    }
    private void showNativeAdWithDelay() {
        /**
         * Here is an example for displaying the ad with delay;
         * Please do not copy the Handler into your project
         */
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // Check if nativeAd has been loaded successfully
                if(nativeAd == null || !nativeAd.isAdLoaded()) {
                    return;
                }
                // Check if ad is already expired or invalidated, and do not show ad if that is the case. You will not get paid to show an invalidated ad.
                if(nativeAd.isAdInvalidated()) {
                    return;
                }
                inflateAd(nativeAd); // Inflate Native Ad into Container same as previous code example
            }
        }, 1000 * 60 * 1); // Show the ad after 15 minutes
    }

}
