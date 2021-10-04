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

public class CenagePhysicalCheBookActivity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2FContents.pdf?alt=media&token=8336546d-eaf1-4424-9a34-666550f0cc74";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F1.Mole%20Concept.pdf?alt=media&token=b6153223-4d2a-47aa-960c-c29779225253";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F2.Redox%20Reaction.pdf?alt=media&token=6fc57471-ffe1-4390-83c3-ce61f71fc062";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F3.Stoichiometry.pdf?alt=media&token=a315f203-a994-478e-9e15-4d7a7d835671";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F4.Atomic%20Structure.pdf?alt=media&token=45220055-aa66-4426-a8fb-440222f6f315";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F5.States%20of%20Matter.pdf?alt=media&token=2d63a658-bfe3-48b9-8db5-83a8573f955c";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F6.Thermodynamics.pdf?alt=media&token=76ee7d95-4647-4fa0-b39c-d46ebe40f556";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F7.Chemical%20Equlibriurm.pdf?alt=media&token=c48c7585-6ad2-45f9-a7d3-ca27d3140b70";
    private String Url9= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F8.IOnic%20Equilibrium.pdf?alt=media&token=7d6e7c79-2914-48c0-9b4f-dc8e7760a8dc";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F9.Appendic.pdf?alt=media&token=65f5b41a-f10b-4dfc-abe1-4e8ade16695e";
    private String Url11="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FCenage%20Physical%20Chemistry%2F10.Appendix%20B.pdf?alt=media&token=ddb4ac97-7ba6-492a-a4ca-1dd6c95525b9";

    private String CenagePhysicalCheBookContent="CenagePhysicalCheBookContent.pdf";
    private String CenagePhysicalCheBookChapter1="CenagePhysicalCheBookChapter1.pdf";
    private String CenagePhysicalCheBookChapter2="CenagePhysicalCheBookChapter2.pdf";
    private String CenagePhysicalCheBookChapter3="CenagePhysicalCheBookChapter3.pdf";
    private String CenagePhysicalCheBookChapter4="CenagePhysicalCheBookChapter4.pdf";
    private String CenagePhysicalCheBookChapter5="CenagePhysicalCheBookChapter5.pdf";
    private String CenagePhysicalCheBookChapter6="CenagePhysicalCheBookChapter6.pdf";
    private String CenagePhysicalCheBookChapter7="CenagePhysicalCheBookChapter7.pdf";
    private String CenagePhysicalCheBookChapter8="CenagePhysicalCheBookChapter8.pdf";
    private String CenagePhysicalCheBookChapter9="CenagePhysicalCheBookChapter9.pdf";
    private String CenagePhysicalCheBookChapter10="CenagePhysicalCheBookChapter10.pdf";

    /// textView
    private TextView txtView1,txtView2,txtView3,txtView4,txtView5,txtView6,txtView7,txtView8,txtView9,txtView10,txtView11,txtView12
            ,txtView13,txtView14,txtView15,txtView16;
    /// textView

    ///ProgressBar
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6,progressBar7,progressBar8
            ,progressBar9,progressBar10,progressBar11,progressBar12,progressBar13,progressBar14,progressBar15,
            progressBar16;
    ////progressBar

    ///DownloadButton
    private Button downloadBtn1,downloadBtn2,downloadBtn3,downloadBtn4,downloadBtn5,downloadBtn6,downloadBtn7,downloadBtn8,downloadBtn9
            ,downloadBtn10,downloadBtn11,downloadBtn12,downloadBtn13,downloadBtn14,downloadBtn15,downloadBtn16;
    /// ///DownloadButton

    ////OnlineButton
    private Button onlineBtn1,onlineBtn2,onlineBtn3,onlineBtn4,onlineBtn5,onlineBtn6,onlineBtn7,onlineBtn8,onlineBtn9,onlineBtn10
            ,onlineBtn11,onlineBtn12,onlineBtn13,onlineBtn14,onlineBtn15,onlineBtn16;
    ////OnlineButton


    ////offlineButton
    private Button offlineBtn1,offlineBtn2,offlineBtn3,offlineBtn4,offlineBtn5,offlineBtn6,offlineBtn7,offlineBtn8,offlineBtn9,offlineBtn10
            ,offlineBtn11,offlineBtn12,offlineBtn13,offlineBtn14,offlineBtn15,offlineBtn16;
    ////offlineButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cenage_physical_che_book);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Cenage Physical Chemistry");
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
        txtView11=findViewById(R.id.txtView11);

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
        progressBar11=findViewById(R.id.progressBar11);

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
        downloadBtn11=findViewById(R.id.downloadBtn11);

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
        onlineBtn11=findViewById(R.id.onlineBtn11);

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
        offlineBtn11=findViewById(R.id.offlineBtn11);

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, CenagePhysicalCheBookContent, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, CenagePhysicalCheBookChapter1, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, CenagePhysicalCheBookChapter2, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, CenagePhysicalCheBookChapter3, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, CenagePhysicalCheBookChapter4, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, CenagePhysicalCheBookChapter5, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, CenagePhysicalCheBookChapter6, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, CenagePhysicalCheBookChapter7, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, CenagePhysicalCheBookChapter8, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, CenagePhysicalCheBookChapter9, Url10, progressBar10, txtView10);
        checkFileExistence(onlineBtn11, offlineBtn11, downloadBtn11, CenagePhysicalCheBookChapter10, Url11, progressBar11, txtView11);


        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(CenagePhysicalCheBookContent, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenagePhysicalCheBookChapter1, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenagePhysicalCheBookChapter2, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenagePhysicalCheBookChapter3, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenagePhysicalCheBookChapter4, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenagePhysicalCheBookChapter5, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenagePhysicalCheBookChapter6, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenagePhysicalCheBookChapter7, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CenagePhysicalCheBookChapter8, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn10.setVisibility(View.GONE);
                    downloadBtn10.setVisibility(View.GONE);
                    initProgressBar(progressBar10);
                    downloadPdf(CenagePhysicalCheBookChapter9, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn11.setVisibility(View.GONE);
                    downloadBtn11.setVisibility(View.GONE);
                    initProgressBar(progressBar11);
                    downloadPdf(CenagePhysicalCheBookChapter10, Url11, onlineBtn11, offlineBtn11, downloadBtn11, txtView11, progressBar11);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(CenagePhysicalCheBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url11);
                    startActivity(intent);
                }else{
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(CenagePhysicalCheBookActivity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(CenagePhysicalCheBookActivity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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