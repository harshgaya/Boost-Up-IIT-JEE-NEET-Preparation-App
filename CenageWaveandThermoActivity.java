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

public class CenageWaveandThermoActivity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2FContents.pdf?alt=media&token=2a0905b1-757b-4026-a384-3644742af10d";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2F1.Thermal%20properties%20of%20matter.pdf?alt=media&token=dcdd82bd-d629-4d23-a5c8-778a3e638355";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2F2.Kinetic%20theory%20of%20gases%20and%20first%20law.pdf?alt=media&token=e4f3ad1c-04cd-4510-8c2c-54421558c1d4";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2F3.Archives%20on%20chapter%201%20and%202.pdf?alt=media&token=49a1d55b-08bb-4048-a3a0-9d438a3124ab";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2F4.Linear%20and%20angular%20shm.pdf?alt=media&token=a44bcb1a-7140-4daa-8e76-643fed07c6b0";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2F5.Travelling%20waves.pdf?alt=media&token=718c6797-d7ff-4950-b83d-733434b1d9ff";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2F6.Sound%20waves%20and%20doppler%20effect.pdf?alt=media&token=49563fcc-ee7b-4d76-a847-b65e22086f5f";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2F7.Superposition%20and%20standing%20waves.pdf?alt=media&token=0e21b3c5-ebf3-4470-9583-5fdbc6877fdb";
    private String Url9= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2F8.Archives%20on%20chapter%204-7.pdf?alt=media&token=6ba241d2-344d-4862-a985-ec58618239df";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FCenage%20Wave%20and%20Thermodynamics%2FSolution%20to%20concept%20application%20exercise.pdf?alt=media&token=86cfebeb-abab-44c9-8582-ceeb9ac4cee2";


    private String CenageWaveandThermoContent="CenageWaveandThermoContent.pdf";
    private String CenageWaveandThermoChapter1="CenageWaveandThermoChapter1.pdf";
    private String CenageWaveandThermoChapter2="CenageWaveandThermoChapter2.pdf";
    private String CenageWaveandThermoChapter3="CenageWaveandThermoChapter3.pdf";
    private String CenageWaveandThermoChapter4="CenageWaveandThermoChapter4.pdf";
    private String CenageWaveandThermoChapter5="CenageWaveandThermoChapter5.pdf";
    private String CenageWaveandThermoChapter6="CenageWaveandThermoChapter6.pdf";
    private String CenageWaveandThermoChapter7="CenageWaveandThermoChapter6.pdf";
    private String CenageWaveandThermoChapter8="CenageWaveandThermoChapter6.pdf";
    private String CenageWaveandThermoChapter9="CenageWaveandThermoChapter6.pdf";
    private String CenageWaveandThermoChapter10="CenageWaveandThermoChapter6.pdf";


    /// textView
    private TextView txtView1,txtView2,txtView3,txtView4,txtView5,txtView6,txtView7,txtView8,txtView9,txtView10;
    /// textView

    ///ProgressBar
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6,progressBar7,progressBar8,progressBar9,progressBar10
            ;
    ////progressBar

    ///DownloadButton
    private Button downloadBtn1,downloadBtn2,downloadBtn3,downloadBtn4,downloadBtn5,downloadBtn6,downloadBtn7,downloadBtn8,downloadBtn9,downloadBtn10;
    /// ///DownloadButton

    ////OnlineButton
    private Button onlineBtn1,onlineBtn2,onlineBtn3,onlineBtn4,onlineBtn5,onlineBtn6,onlineBtn7,onlineBtn8,onlineBtn9,onlineBtn10;
    ////OnlineButton


    ////offlineButton
    private Button offlineBtn1,offlineBtn2,offlineBtn3,offlineBtn4,offlineBtn5,offlineBtn6,offlineBtn7,offlineBtn8,offlineBtn9,offlineBtn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cenage_waveand_thermo);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Cenage Waves and Thermodynamics ");
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
        txtView9=findViewById(R.id.txtView9);
        txtView10=findViewById(R.id.txtView10);


        ///progressBar
        progressBar1=findViewById(R.id.progressBar1);
        progressBar2=findViewById(R.id.progressBar2);
        progressBar3=findViewById(R.id.progressBar3);
        progressBar4=findViewById(R.id.progressBar4);
        progressBar5=findViewById(R.id.progressBar5);
        progressBar6=findViewById(R.id.progressBar6);
        progressBar7=findViewById(R.id.progressBar7);
        progressBar8=findViewById(R.id.progressBar8);
        progressBar9=findViewById(R.id.progressBar9);
        progressBar10=findViewById(R.id.progressBar10);


        ///downloadBtn
        downloadBtn1=findViewById(R.id.downloadBtn1);
        downloadBtn2=findViewById(R.id.downloadBtn2);
        downloadBtn3=findViewById(R.id.downloadBtn3);
        downloadBtn4=findViewById(R.id.downloadBtn4);
        downloadBtn5=findViewById(R.id.downloadBtn5);
        downloadBtn6=findViewById(R.id.downloadBtn6);
        downloadBtn7=findViewById(R.id.downloadBtn7);
        downloadBtn8=findViewById(R.id.downloadBtn8);
        downloadBtn9=findViewById(R.id.downloadBtn9);
        downloadBtn10=findViewById(R.id.downloadBtn10);

        ///onlineBtn
        onlineBtn1=findViewById(R.id.onlineBtn1);
        onlineBtn2=findViewById(R.id.onlineBtn2);
        onlineBtn3=findViewById(R.id.onlineBtn3);
        onlineBtn4=findViewById(R.id.onlineBtn4);
        onlineBtn5=findViewById(R.id.onlineBtn5);
        onlineBtn6=findViewById(R.id.onlineBtn6);
        onlineBtn7=findViewById(R.id.onlineBtn7);
        onlineBtn8=findViewById(R.id.onlineBtn8);
        onlineBtn9=findViewById(R.id.onlineBtn9);
        onlineBtn10=findViewById(R.id.onlineBtn10);


        ///offlineBtn
        offlineBtn1=findViewById(R.id.offlineBtn1);
        offlineBtn2=findViewById(R.id.offlineBtn2);
        offlineBtn3=findViewById(R.id.offlineBtn3);
        offlineBtn4=findViewById(R.id.offlineBtn4);
        offlineBtn5=findViewById(R.id.offlineBtn5);
        offlineBtn6=findViewById(R.id.offlineBtn6);
        offlineBtn7=findViewById(R.id.offlineBtn7);
        offlineBtn8=findViewById(R.id.offlineBtn8);
        offlineBtn9=findViewById(R.id.offlineBtn9);
        offlineBtn10=findViewById(R.id.offlineBtn10);

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, CenageWaveandThermoContent, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, CenageWaveandThermoChapter1, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, CenageWaveandThermoChapter2, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, CenageWaveandThermoChapter3, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, CenageWaveandThermoChapter4, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, CenageWaveandThermoChapter5, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, CenageWaveandThermoChapter6, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, CenageWaveandThermoChapter7, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, CenageWaveandThermoChapter8, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, CenageWaveandThermoChapter9, Url10, progressBar10, txtView10);


        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(CenageWaveandThermoContent, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenageWaveandThermoChapter1, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenageWaveandThermoChapter2, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenageWaveandThermoChapter3, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenageWaveandThermoChapter4, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenageWaveandThermoChapter5, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenageWaveandThermoChapter6, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenageWaveandThermoChapter7, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn9.setVisibility(View.GONE);
                    downloadBtn9.setVisibility(View.GONE);
                    initProgressBar(progressBar9);
                    downloadPdf(CenageWaveandThermoChapter8, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn10.setVisibility(View.GONE);
                    downloadBtn10.setVisibility(View.GONE);
                    initProgressBar(progressBar9);
                    downloadPdf(CenageWaveandThermoChapter9, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });


        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenageWaveandThermoActivity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenageWaveandThermoActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(CenageWaveandThermoActivity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(CenageWaveandThermoActivity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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
