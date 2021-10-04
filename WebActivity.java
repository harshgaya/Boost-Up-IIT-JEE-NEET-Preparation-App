package com.harsh.jeephysics;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class WebActivity extends AppCompatActivity {
    private WebView web;
    private ProgressBar progressBar, progressBar2;
    private String pdf_url;
    private PDFView pdfView;

    private TextView txtView2;

    private InterstitialAd interstitialAd;
    private DownloadTask downloadTask ;
    ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        pdfView=findViewById(R.id.pdfView);

        pdfView = findViewById(R.id.pdfView);

        progressBar2 = findViewById(R.id.progressBar2);
        txtView2 = findViewById(R.id.txtView2);

        progressBar2.setVisibility(View.VISIBLE);
        progressBar2.setIndeterminate(true);

//        web=findViewById(R.id.web);
//        progressBar=findViewById(R.id.progressBar);
//        AudienceNetworkAds.initialize(this);

        ///258335248938080_258338595604412

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



        Intent intent = getIntent();

        pdf_url = intent.getStringExtra("url");
        mProgressDialog = new ProgressDialog(WebActivity.this);
        mProgressDialog.setMessage("Loading...");
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mProgressDialog.setCancelable(false);

        downloadTask = new DownloadTask(WebActivity.this);
        downloadTask.execute(pdf_url);

        //webView.loadUrl(url);
//        web.setWebViewClient(new WebViewClient());
//        web.getSettings().setJavaScriptEnabled(true);
//        web.getSettings().setDisplayZoomControls(true);
//        web.getSettings().setBuiltInZoomControls(true);
//        web.getSettings().setPluginState(WebSettings.PluginState.ON);
//        web.getSettings().setAllowFileAccessFromFileURLs(true);
//        web.getSettings().setAllowUniversalAccessFromFileURLs(true);
////        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
////        CustomTabsIntent customTabsIntent = builder.build();
////        customTabsIntent.launchUrl(this, Uri.parse(url));
//
//        getPdf(pdf_url);
//
//        onPageFinished(web,pdf_url);



        //web.loadUrl("https://docs.google.com/gview?embedded=true&url="+ url);

//        String url="";
//        try {
//            url=URLEncoder.encode(pdf_url,"UTF-8");
//            web.loadUrl("https://docs.google.com/gview?embedded=true&url="+url);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }




//        web.setWebChromeClient(new WebChromeClient() {
//            public void onProgressChanged(WebView view, int progress) {
//                progressBar.setProgress(progress);
//                if (progress == 100) {
//                    progressBar.setVisibility(View.GONE);
//
//                } else  {
//                    progressBar.setVisibility(View.VISIBLE);
//
//                }
//            }
//
//
//
//        });
//        web.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//                view.loadUrl(request.getUrl().toString());
//                return false;
//
//
//
//            }
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//                web.loadUrl("javascript:(function() { " +
//                        "document.querySelector('[role=\"toolbar\"]').remove();})()");
//            }
//
//
//
//
//
//            @Override
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                super.onReceivedError(view, errorCode, description, failingUrl);
//
//                view.loadUrl("about:blank");
//                web.loadData("Connect To Internet  ","dwh","sgdyc");
//
//            }
//
//
//        });



    }
//    private class Callback extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(
//                WebView view, String url) {
//            return (false);
//        }
//    }
//    @Override
//    public void onBackPressed() {
//        if (web.canGoBack()) {
//            web.goBack();
//        } else {
//            super.onBackPressed();
//        }
//    }
//    private void getPdf(final String url) {
//
//        pdfView.setVisibility(View.VISIBLE);
//        final InputStream[] input = new InputStream[1];
//
//        new AsyncTask<Void, Void, Void>() {
//            @SuppressLint({"WrongThread", "StaticFieldLeak"})
//            @Override
//            protected Void doInBackground(Void... voids) {
//                try {
//                    input[0] = new URL(url).openStream();
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                return null;
//            }
//            @Override
//            protected void onPostExecute(Void aVoid ) {
//                super.onPostExecute(aVoid);
//                progressBar.setVisibility(View.VISIBLE);
//
//                pdfView.fromStream(input[0])
//                        .enableAntialiasing(true).spacing(0).pageFitPolicy(FitPolicy.WIDTH).pageSnap(true).pageFling(true).nightMode(false)
//                        .scrollHandle(new DefaultScrollHandle(WebActivity.this))
//
//                        .load();
//                progressBar.setVisibility(View.GONE);
//
//
//            }
//
//
//        }.execute();
//    }
//    public void onPageFinished(WebView view, String url) {
//        if (view.getTitle().equals(""))
//            view.reload();
//    }
private class DownloadTask extends AsyncTask<String, Integer, String> {

    private Context context;
    private PowerManager.WakeLock mWakeLock;
    final InputStream[] input = new InputStream[1];
    OutputStream output = null;
    HttpURLConnection connection = null;
    String URL=pdf_url;

    @Override
    protected void onCancelled() {
        cancel(true);
        super.onCancelled();

    }

    public DownloadTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... sUrl) {
        try {

            input[0] = new URL(URL).openStream();

            try {
                java.net.URL u = new URL(URL);
                URLConnection conn = u.openConnection();
                final int contentLength = conn.getContentLength();
                InputStream input = new BufferedInputStream(u.openStream());


                byte data[] = new byte[1024];
                int fileLength = conn.getContentLength();


                long total = 0;
                int count;


                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress(Integer.valueOf("" + (int) ((total * 100) / fileLength)));
                }

                input.close();

            } catch (final Exception e) {
                e.printStackTrace();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;


    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // take CPU lock to prevent CPU from going off if the user
        // presses the power button during download
        PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        mWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK,
                getClass().getName());
        mWakeLock.acquire();
        //mProgressDialog.show();

        pdfView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {
        super.onProgressUpdate(progress);
        // if we get here, length is known, now set indeterminate to false
//            mProgressDialog.setIndeterminate(false);
//            mProgressDialog.setMax(100);
//            mProgressDialog.setProgress(progress[0]);
        progressBar2.setIndeterminate(false);
        progressBar2.setMax(100);
        progressBar2.setProgress(progress[0]);
        txtView2.setText(String.valueOf(progress[0]) + "% completed");
    }

    @Override
    protected void onPostExecute(String result) {
        mWakeLock.release();
        //mProgressDialog.dismiss();
        if (result != null)
            Toast.makeText(context,"error: "+result, Toast.LENGTH_LONG).show();
        else
            Toast.makeText(context,"Opening PDF Please Wait..", Toast.LENGTH_SHORT).show();

        pdfView.fromStream(input[0])
                .enableAntialiasing(true).spacing(0).pageFitPolicy(FitPolicy.WIDTH).pageSnap(true).pageFling(true).nightMode(false)
                .scrollHandle(new DefaultScrollHandle(WebActivity.this))

                .load();
        progressBar2.setVisibility(View.INVISIBLE);
        txtView2.setVisibility(View.INVISIBLE);
    }
}

    @Override
    public void onBackPressed() {
        downloadTask.cancel(true);

        super.onBackPressed();
    }
}
