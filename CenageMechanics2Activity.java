package com.harsh.jeephysics.IIT;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.harsh.jeephysics.PdfActivity;
import com.harsh.jeephysics.R;
import com.harsh.jeephysics.WebActivity;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class CenageMechanics2Activity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Mechanic%202%2Fcontents.pdf?alt=media&token=b3d9751c-2e27-4ee8-bf14-a830ffd3244c";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Mechanic%202%2F1.CEnter%20of%20mass%20linear%20momemtum%2Ccollison.pdf?alt=media&token=1207c98c-51e0-4929-8f1d-fb35ca8a1d9c";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Mechanic%202%2F2.Rigid%20body%20dynamics.pdf?alt=media&token=47505586-95eb-4d21-8be6-a698f79f2e82";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Mechanic%202%2F3.Fluid%20mechanics.pdf?alt=media&token=6a350eeb-7e7e-45ef-8e05-60419c633289";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Mechanic%202%2F4.Properties%20of%20solid%20and%20fluids.pdf?alt=media&token=51288268-c235-4b29-aafb-4b32e86fb943";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Mechanic%202%2F5.Gravitation.pdf?alt=media&token=2652feeb-f402-4b4d-9652-7fb2230e0450";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Mechanic%202%2F6.Miscellaneous%20assignments.pdf?alt=media&token=8d5956f6-007e-4f37-8137-298bbe4fd354";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Mechanic%202%2FSolutions%20to%20concept%20application%20exrecies.pdf?alt=media&token=13f05a39-88d3-4ccf-9174-d8c099f89639";


    private String CenageMechanic2Content="CenageMechanic2Content.pdf";
    private String CenageMechanic2Chapter1="CenageMechanic2Chapter1.pdf";
    private String CenageMechanic2Chapter2="CenageMechanic2Chapter2.pdf";
    private String CenageMechanic2Chapter3="CenageMechanic2Chapter3.pdf";
    private String CenageMechanic2Chapter4="CenageMechanic2Chapter4.pdf";
    private String CenageMechanic2Chapter5="CenageMechanic2Chapter5.pdf";
    private String CenageMechanic2Chapter6="CenageMechanic2Chapter6.pdf";
    private String CenageMechanic2Chapter7="CenageMechanic2Chapter7.pdf";


    /// textView
    private TextView txtView1,txtView2,txtView3,txtView4,txtView5,txtView6,txtView7,txtView8;
    /// textView

    ///ProgressBar
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6,progressBar7,progressBar8
            ;
    ////progressBar

    ///DownloadButton
    private Button downloadBtn1,downloadBtn2,downloadBtn3,downloadBtn4,downloadBtn5,downloadBtn6,downloadBtn7,downloadBtn8;
    /// ///DownloadButton

    ////OnlineButton
    private Button onlineBtn1,onlineBtn2,onlineBtn3,onlineBtn4,onlineBtn5,onlineBtn6,onlineBtn7,onlineBtn8;
    ////OnlineButton


    ////offlineButton
    private Button offlineBtn1,offlineBtn2,offlineBtn3,offlineBtn4,offlineBtn5,offlineBtn6,offlineBtn7,offlineBtn8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cenage_mechanics2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Cenage Mechanics Part 2 ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ///TextView
        txtView1=findViewById(R.id.txtView1);
        txtView2=findViewById(R.id.txtView2);
        txtView3=findViewById(R.id.txtView3);
        txtView4=findViewById(R.id.txtView4);
        txtView5=findViewById(R.id.txtView5);
        txtView6=findViewById(R.id.txtView6);
        txtView7=findViewById(R.id.txtView7);
        txtView8=findViewById(R.id.txtView8);


        ///progressBar
        progressBar1=findViewById(R.id.progressBar1);
        progressBar2=findViewById(R.id.progressBar2);
        progressBar3=findViewById(R.id.progressBar3);
        progressBar4=findViewById(R.id.progressBar4);
        progressBar5=findViewById(R.id.progressBar5);
        progressBar6=findViewById(R.id.progressBar6);
        progressBar7=findViewById(R.id.progressBar7);
        progressBar8=findViewById(R.id.progressBar8);


        ///downloadBtn
        downloadBtn1=findViewById(R.id.downloadBtn1);
        downloadBtn2=findViewById(R.id.downloadBtn2);
        downloadBtn3=findViewById(R.id.downloadBtn3);
        downloadBtn4=findViewById(R.id.downloadBtn4);
        downloadBtn5=findViewById(R.id.downloadBtn5);
        downloadBtn6=findViewById(R.id.downloadBtn6);
        downloadBtn7=findViewById(R.id.downloadBtn7);
        downloadBtn8=findViewById(R.id.downloadBtn8);

        ///onlineBtn
        onlineBtn1=findViewById(R.id.onlineBtn1);
        onlineBtn2=findViewById(R.id.onlineBtn2);
        onlineBtn3=findViewById(R.id.onlineBtn3);
        onlineBtn4=findViewById(R.id.onlineBtn4);
        onlineBtn5=findViewById(R.id.onlineBtn5);
        onlineBtn6=findViewById(R.id.onlineBtn6);
        onlineBtn7=findViewById(R.id.onlineBtn7);
        onlineBtn8=findViewById(R.id.onlineBtn8);


        ///offlineBtn
        offlineBtn1=findViewById(R.id.offlineBtn1);
        offlineBtn2=findViewById(R.id.offlineBtn2);
        offlineBtn3=findViewById(R.id.offlineBtn3);
        offlineBtn4=findViewById(R.id.offlineBtn4);
        offlineBtn5=findViewById(R.id.offlineBtn5);
        offlineBtn6=findViewById(R.id.offlineBtn6);
        offlineBtn7=findViewById(R.id.offlineBtn7);
        offlineBtn8=findViewById(R.id.offlineBtn8);

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, CenageMechanic2Content, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, CenageMechanic2Chapter1, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, CenageMechanic2Chapter2, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, CenageMechanic2Chapter3, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, CenageMechanic2Chapter4, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, CenageMechanic2Chapter5, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, CenageMechanic2Chapter6, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, CenageMechanic2Chapter7, Url8, progressBar8, txtView8);

        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(CenageMechanic2Content, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn2.setVisibility(View.GONE);
                    downloadBtn2.setVisibility(View.GONE);
                    initProgressBar(progressBar2);
                    downloadPdf(CenageMechanic2Chapter1, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn3.setVisibility(View.GONE);
                    downloadBtn3.setVisibility(View.GONE);
                    initProgressBar(progressBar3);
                    downloadPdf(CenageMechanic2Chapter2, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn4.setVisibility(View.GONE);
                    downloadBtn4.setVisibility(View.GONE);
                    initProgressBar(progressBar4);
                    downloadPdf(CenageMechanic2Chapter3, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn5.setVisibility(View.GONE);
                    downloadBtn5.setVisibility(View.GONE);
                    initProgressBar(progressBar5);
                    downloadPdf(CenageMechanic2Chapter4, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn6.setVisibility(View.GONE);
                    downloadBtn6.setVisibility(View.GONE);
                    initProgressBar(progressBar6);
                    downloadPdf(CenageMechanic2Chapter5, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn7.setVisibility(View.GONE);
                    downloadBtn7.setVisibility(View.GONE);
                    initProgressBar(progressBar7);
                    downloadPdf(CenageMechanic2Chapter6, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn8.setVisibility(View.GONE);
                    downloadBtn8.setVisibility(View.GONE);
                    initProgressBar(progressBar8);
                    downloadPdf(CenageMechanic2Chapter7, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });


        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageMechanics2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageMechanics2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageMechanics2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageMechanics2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageMechanics2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageMechanics2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageMechanics2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageMechanics2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageMechanics2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

    private void checkFileExistence(Button onlineBtn, Button offlineBTn, Button downloadBtn, String PDF_NAME, String URL, ProgressBar progressBar, TextView txt) {
        try {
            File file = getFileStreamPath(PDF_NAME);

            if (file.exists()) {
                onlineBtn.setVisibility(View.GONE);
                offlineBTn.setVisibility(View.VISIBLE);
                downloadBtn.setVisibility(View.GONE);
                initProgressBar(progressBar);
                downloadPdf(PDF_NAME, URL, onlineBtn, offlineBTn, downloadBtn, txt, progressBar);
            } else {
//
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initProgressBar(final ProgressBar progressBar) {

        progressBar.setVisibility(View.VISIBLE);
        progressBar.setIndeterminate(true);

    }

    private void downloadPdf(final String fileName, final String URL, final Button online, final Button offline, final Button download, final TextView txt, final ProgressBar progress) {
        new AsyncTask<Void, Integer, Boolean>() {

            @Override
            protected Boolean doInBackground(Void... voids) {
                return downloadPdf();
            }


            private Boolean downloadPdf() {
                try {
                    File file = getFileStreamPath(fileName);


                    if (file.exists())
                        return true;

                    try {
                        FileOutputStream fileOutputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
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
                            //publishProgress(""+ (int )((total*100)/fileLength));
                            publishProgress(Integer.valueOf("" + (int) ((total * 100) / fileLength)));
                            fileOutputStream.write(data, 0, count);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        input.close();
                        return true;
                    } catch (final Exception e) {
                        e.printStackTrace();
                        return false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                super.onProgressUpdate(values);
                progress.setIndeterminate(false);
                progress.setMax(100);
                progress.setProgress(values[0]);
                txt.setText(String.valueOf(values[0]) + "% completed");


            }

            @Override
            protected void onPostExecute(Boolean aBoolean) {
                super.onPostExecute(aBoolean);
                if (aBoolean) {
                    download.setVisibility(View.GONE);
                    online.setVisibility(View.GONE);
                    txt.setVisibility(View.GONE);
                    progress.setVisibility(View.INVISIBLE);

                    offline.setVisibility(View.VISIBLE);

                    offline.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(CenageMechanics2Activity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(CenageMechanics2Activity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
                    File file = getFileStreamPath(fileName);
                    file.delete();
                    online.setVisibility(View.VISIBLE);
                    download.setVisibility(View.VISIBLE);
                    progress.setVisibility(View.INVISIBLE);
                    txt.setVisibility(View.INVISIBLE);

                }
            }
        }.execute();

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
