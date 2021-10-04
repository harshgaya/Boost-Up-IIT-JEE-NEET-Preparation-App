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
import com.harsh.jeephysics.IIT.CenageInorganicCheBookActivity;
import com.harsh.jeephysics.IIT.CenageOrganicBookActivity;
import com.harsh.jeephysics.IIT.CenagePhysicalCheBookActivity;
import com.harsh.jeephysics.IIT.MsChauhanBookActivity;
import com.harsh.jeephysics.IIT.NcertClass11ChemistryBookActivity;
import com.harsh.jeephysics.IIT.NcertClass11ChemistryBookSolutionActivity;
import com.harsh.jeephysics.IIT.NcertClass12ChemistryBookActivity;
import com.harsh.jeephysics.IIT.NcertClass12ChemistryBookSolutionActivity;
import com.harsh.jeephysics.IIT.PreviousYearChemistryActivity;
import com.harsh.jeephysics.IIT.PreviousYearChemistrySolvedActivity;
import com.harsh.jeephysics.IIT.RcMukherjeeBookActivity;
import com.harsh.jeephysics.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChemistryBookFragment extends Fragment {
    Button NCERTClass11Chemistry,NCERTClass11ChemistrySolution,NCERTClasss12ChemistryBookBtn,NCERTClasss12ChemistryBookSolutionBtn
            ,MsChauhanBookBtn,RcMukherjeeBookBtn,PreviousYearBtn,PreviousYearSolutionBtn,CenagePhysicalBtn,cenageInorganicBtn,CenageOrganicBtn;

    private final String TAG = Context.class.getSimpleName();
    private NativeAd nativeAd;
    private NativeAdLayout nativeAdLayout;
    private LinearLayout adView;

    private View view;

    public ChemistryBookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_chemistry_book, container, false);
        NCERTClass11Chemistry=view.findViewById(R.id.NCERTClass11Chemistry);
        NCERTClass11ChemistrySolution=view.findViewById(R.id.NCERTClass11ChemistrySolution);
        NCERTClasss12ChemistryBookBtn=view.findViewById(R.id.NCERTClasss12ChemistryBookBtn);
        NCERTClasss12ChemistryBookSolutionBtn=view.findViewById(R.id.NCERTClasss12ChemistryBookSolutionBtn);
        MsChauhanBookBtn=view.findViewById(R.id.MsChauhanBookBtn);
        RcMukherjeeBookBtn=view.findViewById(R.id.RcMukherjeeBookBtn);
        PreviousYearBtn=view.findViewById(R.id.PreviousYearBtn);
        PreviousYearSolutionBtn=view.findViewById(R.id.PreviousYearSolutionBtn);
        CenagePhysicalBtn=view.findViewById(R.id.CenagePhysicalBtn);
        cenageInorganicBtn=view.findViewById(R.id.cenageInorganicBtn);
        CenageOrganicBtn=view.findViewById(R.id.CenageOrganicBtn);

        NCERTClass11Chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), NcertClass11ChemistryBookActivity.class);
                startActivity(intent);
            }
        });
        NCERTClass11ChemistrySolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), NcertClass11ChemistryBookSolutionActivity.class);
                startActivity(intent);
            }
        });
        NCERTClasss12ChemistryBookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), NcertClass12ChemistryBookActivity.class);
                startActivity(intent);
            }
        });
        NCERTClasss12ChemistryBookSolutionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), NcertClass12ChemistryBookSolutionActivity.class);
                startActivity(intent);
            }
        });
        MsChauhanBookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MsChauhanBookActivity.class);
                startActivity(intent);
            }
        });
        RcMukherjeeBookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), RcMukherjeeBookActivity.class);
                startActivity(intent);
            }
        });
        CenagePhysicalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), CenagePhysicalCheBookActivity.class);
                startActivity(intent);
            }
        });
        cenageInorganicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), CenageInorganicCheBookActivity.class);
                startActivity(intent);
            }
        });
        CenageOrganicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), CenageOrganicBookActivity.class);
                startActivity(intent);
            }
        });
        PreviousYearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), PreviousYearChemistryActivity.class);
                startActivity(intent);
            }
        });
        PreviousYearSolutionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), PreviousYearChemistrySolvedActivity.class);
                startActivity(intent);
            }
        });

        loadNativeAd();


        return view;
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
