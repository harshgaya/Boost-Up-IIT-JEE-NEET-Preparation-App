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

public class PhysicsPreviousYearSolutionActivity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F1.pdf?alt=media&token=b9f60085-60fc-4045-9662-00074c3c0bbf";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F2.pdf?alt=media&token=b4c91001-ab15-48b6-ad4f-1554a20e04c0";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F3.pdf?alt=media&token=24f74fa8-9608-44d5-8621-0682ee504abe";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F4.pdf?alt=media&token=e6ca1805-73d8-4ea3-8986-e9111f019684";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F5.pdf?alt=media&token=44b628bd-20ec-4072-a56b-61fb15d3a992";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F6.pdf?alt=media&token=713c6cf7-fbef-4c18-a810-811b90befc7f";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F7.pdf?alt=media&token=6e675b9b-2a68-481b-9696-80e99f23adf2";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F8.pdf?alt=media&token=a3cf3f8f-b60c-4587-96e9-6de9d8d4f453";
    private String Url9= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F9.pdf?alt=media&token=bdf9b178-6d9e-4da1-8b4a-bd5438793713";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F10.pdf?alt=media&token=dd36afcd-e387-45de-80f2-12f51a0d166a";
    private String Url11="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F11.pdf?alt=media&token=cbcd80a0-672a-4a42-803a-d2abaed4782a";
    private String Url12="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F12.pdf?alt=media&token=02d3ed0d-03cd-4300-b1e8-7deb4d99327c";
    private String Url13="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F13.pdf?alt=media&token=c0cbbe31-d804-4aff-91a6-c59e95d65841";
    private String Url14="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F14.pdf?alt=media&token=f4d60e1e-d3fd-4654-acd5-3edb08b951b5";
    private String Url15="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F15.pdf?alt=media&token=61b6cf38-fc0f-4f57-99b0-974ba1617203";
    private String Url16="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F16.pdf?alt=media&token=8eea8eff-54c8-4e22-a8cc-f2044f5e8456";
    private String Url17="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Previous%20Year%20Solution%2F17.pdf?alt=media&token=4c761e12-8fdc-491e-844a-1003b3dbf67c";
    
    
    private String PhysicsPreviousYearSolution1="PhysicsPreviousYearSolution1.pdf";
    private String PhysicsPreviousYearSolution2="PhysicsPreviousYearSolution2.pdf";
    private String PhysicsPreviousYearSolution3="PhysicsPreviousYearSolution3.pdf";
    private String PhysicsPreviousYearSolution4="PhysicsPreviousYearSolution4.pdf";
    private String PhysicsPreviousYearSolution5="PhysicsPreviousYearSolution5.pdf";
    private String PhysicsPreviousYearSolution6="PhysicsPreviousYearSolution6.pdf";
    private String PhysicsPreviousYearSolution7="PhysicsPreviousYearSolution7.pdf";
    private String PhysicsPreviousYearSolution8="PhysicsPreviousYearSolution8.pdf";
    private String PhysicsPreviousYearSolution9="PhysicsPreviousYearSolution9.pdf";
    private String PhysicsPreviousYearSolution10="PhysicsPreviousYearSolution10.pdf";
    private String PhysicsPreviousYearSolution11="PhysicsPreviousYearSolution11.pdf";
    private String PhysicsPreviousYearSolution12="PhysicsPreviousYearSolution12.pdf";
    private String PhysicsPreviousYearSolution13="PhysicsPreviousYearSolution13.pdf";
    private String PhysicsPreviousYearSolution14="PhysicsPreviousYearSolution14.pdf";
    private String PhysicsPreviousYearSolution15="PhysicsPreviousYearSolution15.pdf";
    private String PhysicsPreviousYearSolution16="PhysicsPreviousYearSolution16.pdf";
    private String PhysicsPreviousYearSolution17="PhysicsPreviousYearSolution17.pdf";


    /// textView
    private TextView txtView1,txtView2,txtView3,txtView4,txtView5,txtView6,txtView7,txtView8,txtView9,txtView10,txtView11,txtView12
            ,txtView13,txtView14,txtView15,txtView16,txtView17,txtView18,txtView19,txtView20,txtView21,txtView22,txtView23,txtView24;
    /// textView

    ///ProgressBar
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6,progressBar7,progressBar8
            ,progressBar9,progressBar10,progressBar11,progressBar12,progressBar13,progressBar14,progressBar15,
            progressBar16,progressBar17,progressBar18,progressBar19,progressBar20,progressBar21,progressBar22,progressBar23,progressBar24
            ;
    ////progressBar

    ///DownloadButton
    private Button downloadBtn1,downloadBtn2,downloadBtn3,downloadBtn4,downloadBtn5,downloadBtn6,downloadBtn7,downloadBtn8,downloadBtn9
            ,downloadBtn10,downloadBtn11,downloadBtn12,downloadBtn13,downloadBtn14,downloadBtn15,downloadBtn16,downloadBtn17,
            downloadBtn18,downloadBtn19,downloadBtn20,downloadBtn21,downloadBtn22,downloadBtn23,downloadBtn24;
    /// ///DownloadButton

    ////OnlineButton
    private Button onlineBtn1,onlineBtn2,onlineBtn3,onlineBtn4,onlineBtn5,onlineBtn6,onlineBtn7,onlineBtn8,onlineBtn9,onlineBtn10
            ,onlineBtn11,onlineBtn12,onlineBtn13,onlineBtn14,onlineBtn15,onlineBtn16,onlineBtn17,onlineBtn18,onlineBtn19
            ,onlineBtn20,onlineBtn21,onlineBtn22,onlineBtn23,onlineBtn24;
    ////OnlineButton


    ////offlineButton
    private Button offlineBtn1,offlineBtn2,offlineBtn3,offlineBtn4,offlineBtn5,offlineBtn6,offlineBtn7,offlineBtn8,offlineBtn9,offlineBtn10
            ,offlineBtn11,offlineBtn12,offlineBtn13,offlineBtn14,offlineBtn15,offlineBtn16,offlineBtn17,offlineBtn18,offlineBtn19
            ,offlineBtn20,offlineBtn21,offlineBtn22,offlineBtn23,offlineBtn24;
    ////offlineButton


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_previous_year_solution);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Previous Year Solution Physics Chapterwise Papers");
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
        txtView12=findViewById(R.id.txtView12);
        txtView13=findViewById(R.id.txtView13);
        txtView14=findViewById(R.id.txtView14);
        txtView15=findViewById(R.id.txtView15);
        txtView16=findViewById(R.id.txtView16);
        txtView17=findViewById(R.id.txtView17);


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
        progressBar12=findViewById(R.id.progressBar12);
        progressBar13=findViewById(R.id.progressBar13);
        progressBar14=findViewById(R.id.progressBar14);
        progressBar15=findViewById(R.id.progressBar15);
        progressBar16=findViewById(R.id.progressBar16);
        progressBar17=findViewById(R.id.progressBar17);

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
        downloadBtn12=findViewById(R.id.downloadBtn12);
        downloadBtn13=findViewById(R.id.downloadBtn13);
        downloadBtn14=findViewById(R.id.downloadBtn14);
        downloadBtn15=findViewById(R.id.downloadBtn15);
        downloadBtn16=findViewById(R.id.downloadBtn16);
        downloadBtn17=findViewById(R.id.downloadBtn17);

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
        onlineBtn12=findViewById(R.id.onlineBtn12);
        onlineBtn13=findViewById(R.id.onlineBtn13);
        onlineBtn14=findViewById(R.id.onlineBtn14);
        onlineBtn15=findViewById(R.id.onlineBtn15);
        onlineBtn16=findViewById(R.id.onlineBtn16);
        onlineBtn17=findViewById(R.id.onlineBtn17);

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
        offlineBtn12=findViewById(R.id.offlineBtn12);
        offlineBtn13=findViewById(R.id.offlineBtn13);
        offlineBtn14=findViewById(R.id.offlineBtn14);
        offlineBtn15=findViewById(R.id.offlineBtn15);
        offlineBtn16=findViewById(R.id.offlineBtn16);
        offlineBtn17=findViewById(R.id.offlineBtn17);

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, PhysicsPreviousYearSolution1, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, PhysicsPreviousYearSolution2, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, PhysicsPreviousYearSolution3, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, PhysicsPreviousYearSolution4, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, PhysicsPreviousYearSolution5, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, PhysicsPreviousYearSolution6, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, PhysicsPreviousYearSolution7, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, PhysicsPreviousYearSolution8, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, PhysicsPreviousYearSolution9, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, PhysicsPreviousYearSolution10, Url10, progressBar10, txtView10);
        checkFileExistence(onlineBtn11, offlineBtn11, downloadBtn11, PhysicsPreviousYearSolution11, Url11, progressBar11, txtView11);
        checkFileExistence(onlineBtn12, offlineBtn12, downloadBtn12, PhysicsPreviousYearSolution12, Url12, progressBar12, txtView12);
        checkFileExistence(onlineBtn13, offlineBtn13, downloadBtn13, PhysicsPreviousYearSolution13, Url13, progressBar13, txtView13);
        checkFileExistence(onlineBtn14, offlineBtn14, downloadBtn14, PhysicsPreviousYearSolution14, Url14, progressBar14, txtView14);
        checkFileExistence(onlineBtn15, offlineBtn15, downloadBtn15, PhysicsPreviousYearSolution15, Url15, progressBar15, txtView15);
        checkFileExistence(onlineBtn16, offlineBtn16, downloadBtn16, PhysicsPreviousYearSolution16, Url16, progressBar16, txtView16);
        checkFileExistence(onlineBtn17, offlineBtn17, downloadBtn17, PhysicsPreviousYearSolution17, Url17, progressBar17, txtView17);


        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(PhysicsPreviousYearSolution1, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution2, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution3, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution4, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution5, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution6, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution7, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution8, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution9, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution10, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PhysicsPreviousYearSolution11, Url11, onlineBtn11, offlineBtn11, downloadBtn11, txtView11, progressBar11);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn12.setVisibility(View.GONE);
                    downloadBtn12.setVisibility(View.GONE);
                    initProgressBar(progressBar12);
                    downloadPdf(PhysicsPreviousYearSolution12, Url12, onlineBtn12, offlineBtn12, downloadBtn12, txtView12, progressBar12);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn13.setVisibility(View.GONE);
                    downloadBtn13.setVisibility(View.GONE);
                    initProgressBar(progressBar13);
                    downloadPdf(PhysicsPreviousYearSolution13, Url13, onlineBtn13, offlineBtn13, downloadBtn13, txtView13, progressBar13);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn14.setVisibility(View.GONE);
                    downloadBtn14.setVisibility(View.GONE);
                    initProgressBar(progressBar14);
                    downloadPdf(PhysicsPreviousYearSolution14, Url14, onlineBtn14, offlineBtn14, downloadBtn14, txtView14, progressBar14);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn15.setVisibility(View.GONE);
                    downloadBtn15.setVisibility(View.GONE);
                    initProgressBar(progressBar15);
                    downloadPdf(PhysicsPreviousYearSolution15, Url15, onlineBtn15, offlineBtn15, downloadBtn15, txtView15, progressBar15);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn16.setVisibility(View.GONE);
                    downloadBtn16.setVisibility(View.GONE);
                    initProgressBar(progressBar16);
                    downloadPdf(PhysicsPreviousYearSolution16, Url16, onlineBtn16, offlineBtn16, downloadBtn16, txtView16, progressBar16);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn17.setVisibility(View.GONE);
                    downloadBtn17.setVisibility(View.GONE);
                    initProgressBar(progressBar17);
                    downloadPdf(PhysicsPreviousYearSolution17, Url17, onlineBtn17, offlineBtn17, downloadBtn17, txtView17, progressBar17);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url11);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url12);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url13);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url14);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url15);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url16);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, WebActivity.class);
                    intent.putExtra("url", Url17);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(PhysicsPreviousYearSolutionActivity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(PhysicsPreviousYearSolutionActivity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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
