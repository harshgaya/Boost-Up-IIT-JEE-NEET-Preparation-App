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

public class HcvSolutionVolume2Activity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F23.HEAT%2BAND%2BTEMPERATURE_2.pdf?alt=media&token=332eb085-2e21-49c8-abb7-9c735b6c888f";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F24.KINETIC%2BTHEORY%2BOF%2BGASES_2.pdf?alt=media&token=97b88f20-d00e-4a83-aea9-32a1b0f85946";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F25.CALORIMETRY_2.pdf?alt=media&token=0fa327f6-58a5-42fa-9133-e04f2135345a";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F26.LAWS%2BOF%2BTHERMODYNAMICS%2B(1).pdf?alt=media&token=0041e6dc-fa26-42fb-aa4b-bcdb257f3702";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F27.SPECIFIC%2BHEAT%2BCAPACITIES%2BOF%2BGASES(2)%2B(1).pdf?alt=media&token=0b8c6966-9f97-495e-b02f-4707f71c2c9d";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F28.HEAT%2BTRANSFER.pdf?alt=media&token=ffd20499-7e28-40ec-95ee-02b6f81d81a6";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F29.ELECTRIC%2BFIELD%2BAND%2BPOTENTIAL%2B(1).pdf?alt=media&token=4d1d7b83-2462-4784-8205-bd01bb18a044";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F30.GAUSS'S%2BLAW.pdf?alt=media&token=f1de3b5f-3b9e-4d15-ace5-69c5c94a4cde";
    private String Url9= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F31.CAPACITOR.pdf?alt=media&token=b2df2487-937d-471a-9923-c43f342db847";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F32.Electric%2Bcurrent%2Bin%2Bconductors%2B(1).pdf?alt=media&token=a608d23a-37aa-4260-86e3-ae0311c77194";
    private String Url11="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F33.ELECTRIC%2BCURRENT.pdf?alt=media&token=86b7a9cd-7505-4b10-8eff-da25241384a7";
    private String Url12="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F34.MAGNETIC%2BFIELD.pdf?alt=media&token=7937651e-f395-48df-a702-82a81e02c20d";
    private String Url13="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F35.%2BMAGNETIC%2BFIELD%2BDUE%2BTO%2BCURRENT.pdf?alt=media&token=1ff49690-6517-4e3a-9aa5-299892182253";
    private String Url14="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F36.PERMANENT%2BMAGNETS.pdf?alt=media&token=d6d8493a-feb7-4a0a-a75b-606138b860ba";
    private String Url15="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F37.MAGNETIC%2BPROPERTIES%2BOF%2BMATTER.pdf?alt=media&token=2606a4cf-42be-453a-b381-28bd9390bbc2";
    private String Url16="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F38.Electromagnetic%2Binduction.pdf?alt=media&token=e3e3a508-1f13-4c03-a2c0-2222554377bc";
    private String Url17="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F39.Alternating%2Bcurrent.pdf?alt=media&token=9484206a-bd63-4440-b972-5a8faff12c05";
    private String Url18="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F40.Electromagnetic%2Bwaves_2.pdf?alt=media&token=cb202de7-12e0-4955-80e7-3e291c2034bf";
    private String Url19="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F41.electric%2Bcurrent%2Bthrough%2Bgases_2.pdf?alt=media&token=3946c2db-73b1-4c06-8595-50f7ecbf3acf";
    private String Url20="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F42.photo%2Belectric%2Beffect_2.pdf?alt=media&token=5c2c3f0d-571b-424b-8fc6-91a65f5c3bce";
    private String Url21="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2F43.Bohr's%2Btheory%2Band%2Bphysics%2Bof%2Batom%2B(1).pdf?alt=media&token=c06105fa-b5cd-48e1-8582-b05924b674e5";
    private String Url22="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FHCV%20Solution%20Volm%202%2FVol-2-Chapter-22-%E2%80%93-X-Rays.pdf?alt=media&token=e6fbd5de-56b7-48e3-901a-76f3360a2e92";

    private String HCVVolume2Chapter1="HCVVolume2Chapter1.pdf";
    private String HCVVolume2Chapter2="HCVVolume2Chapter2.pdf";
    private String HCVVolume2Chapter3="HCVVolume2Chapter3.pdf";
    private String HCVVolume2Chapter4="HCVVolume2Chapter4.pdf";
    private String HCVVolume2Chapter5="HCVVolume2Chapter5.pdf";
    private String HCVVolume2Chapter6="HCVVolume2Chapter6.pdf";
    private String HCVVolume2Chapter7="HCVVolume2Chapter7.pdf";
    private String HCVVolume2Chapter8="HCVVolume2Chapter8.pdf";
    private String HCVVolume2Chapter9="HCVVolume2Chapter9.pdf";
    private String HCVVolume2Chapter10="HCVVolume2Chapter10.pdf";
    private String HCVVolume2Chapter11="HCVVolume2Chapter11.pdf";
    private String HCVVolume2Chapter12="HCVVolume2Chapter12.pdf";
    private String HCVVolume2Chapter13="HCVVolume2Chapter13.pdf";
    private String HCVVolume2Chapter14="HCVVolume2Chapter14.pdf";
    private String HCVVolume2Chapter15="HCVVolume2Chapter15.pdf";
    private String HCVVolume2Chapter16="HCVVolume2Chapter16.pdf";
    private String HCVVolume2Chapter17="HCVVolume2Chapter17.pdf";
    private String HCVVolume2Chapter18="HCVVolume2Chapter18.pdf";
    private String HCVVolume2Chapter19="HCVVolume2Chapter19.pdf";
    private String HCVVolume2Chapter20="HCVVolume2Chapter20.pdf";
    private String HCVVolume2Chapter21="HCVVolume2Chapter21.pdf";
    private String HCVVolume2Chapter22="HCVVolume2Chapter22.pdf";








    /// textView
    private TextView txtView1,txtView2,txtView3,txtView4,txtView5,txtView6,txtView7,txtView8,txtView9,txtView10,txtView11,txtView12
            ,txtView13,txtView14,txtView15,txtView16,txtView17,txtView18,txtView19,txtView20,txtView21,txtView22;
    /// textView

    ///ProgressBar
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6,progressBar7,progressBar8
            ,progressBar9,progressBar10,progressBar11,progressBar12,progressBar13,progressBar14,progressBar15,
            progressBar16,progressBar17,progressBar18,progressBar19,progressBar20,progressBar21,progressBar22
            ;
    ////progressBar

    ///DownloadButton
    private Button downloadBtn1,downloadBtn2,downloadBtn3,downloadBtn4,downloadBtn5,downloadBtn6,downloadBtn7,downloadBtn8,downloadBtn9
            ,downloadBtn10,downloadBtn11,downloadBtn12,downloadBtn13,downloadBtn14,downloadBtn15,downloadBtn16,downloadBtn17,
            downloadBtn18,downloadBtn19,downloadBtn20,downloadBtn21,downloadBtn22;
    /// ///DownloadButton

    ////OnlineButton
    private Button onlineBtn1,onlineBtn2,onlineBtn3,onlineBtn4,onlineBtn5,onlineBtn6,onlineBtn7,onlineBtn8,onlineBtn9,onlineBtn10
            ,onlineBtn11,onlineBtn12,onlineBtn13,onlineBtn14,onlineBtn15,onlineBtn16,onlineBtn17,onlineBtn18,onlineBtn19
            ,onlineBtn20,onlineBtn21,onlineBtn22;
    ////OnlineButton


    ////offlineButton
    private Button offlineBtn1,offlineBtn2,offlineBtn3,offlineBtn4,offlineBtn5,offlineBtn6,offlineBtn7,offlineBtn8,offlineBtn9,offlineBtn10
            ,offlineBtn11,offlineBtn12,offlineBtn13,offlineBtn14,offlineBtn15,offlineBtn16,offlineBtn17,offlineBtn18,offlineBtn19
            ,offlineBtn20,offlineBtn21,offlineBtn22;
    ////offlineButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hcv_solution_volume2);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("HC Verma Volume 2 Solution ");
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
        txtView18=findViewById(R.id.txtView18);
        txtView19=findViewById(R.id.txtView19);
        txtView20=findViewById(R.id.txtView20);
        txtView21=findViewById(R.id.txtView21);
        txtView22=findViewById(R.id.txtView22);
        ///TextView


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
        progressBar18=findViewById(R.id.progressBar18);
        progressBar19=findViewById(R.id.progressBar19);
        progressBar20=findViewById(R.id.progressBar20);
        progressBar21=findViewById(R.id.progressBar21);
        progressBar22=findViewById(R.id.progressBar22);
        //progressBar

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
        downloadBtn18=findViewById(R.id.downloadBtn18);
        downloadBtn19=findViewById(R.id.downloadBtn19);
        downloadBtn20=findViewById(R.id.downloadBtn20);
        downloadBtn21=findViewById(R.id.downloadBtn21);
        downloadBtn22=findViewById(R.id.downloadBtn22);

        ///downloadBtn


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
        onlineBtn18=findViewById(R.id.onlineBtn18);
        onlineBtn19=findViewById(R.id.onlineBtn19);
        onlineBtn20=findViewById(R.id.onlineBtn20);
        onlineBtn21=findViewById(R.id.onlineBtn21);
        onlineBtn22=findViewById(R.id.onlineBtn22);
        ///onlineBtn


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
        offlineBtn18=findViewById(R.id.offlineBtn18);
        offlineBtn19=findViewById(R.id.offlineBtn19);
        offlineBtn20=findViewById(R.id.offlineBtn20);
        offlineBtn21=findViewById(R.id.offlineBtn21);
        offlineBtn22=findViewById(R.id.offlineBtn22);
        ////offlineBtn

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, HCVVolume2Chapter1, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, HCVVolume2Chapter2, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, HCVVolume2Chapter3, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, HCVVolume2Chapter4, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, HCVVolume2Chapter5, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, HCVVolume2Chapter6, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, HCVVolume2Chapter7, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, HCVVolume2Chapter8, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, HCVVolume2Chapter9, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, HCVVolume2Chapter10, Url10, progressBar10, txtView10);
        checkFileExistence(onlineBtn11, offlineBtn11, downloadBtn11, HCVVolume2Chapter11, Url11, progressBar11, txtView11);
        checkFileExistence(onlineBtn12, offlineBtn12, downloadBtn12, HCVVolume2Chapter12, Url12, progressBar12, txtView12);
        checkFileExistence(onlineBtn13, offlineBtn13, downloadBtn13, HCVVolume2Chapter13, Url13, progressBar13, txtView13);
        checkFileExistence(onlineBtn14, offlineBtn14, downloadBtn14, HCVVolume2Chapter14, Url14, progressBar14, txtView14);
        checkFileExistence(onlineBtn15, offlineBtn15, downloadBtn15, HCVVolume2Chapter15, Url15, progressBar15, txtView15);
        checkFileExistence(onlineBtn16, offlineBtn16, downloadBtn16, HCVVolume2Chapter16, Url16, progressBar16, txtView16);
        checkFileExistence(onlineBtn17, offlineBtn17, downloadBtn17, HCVVolume2Chapter17, Url17, progressBar17, txtView17);
        checkFileExistence(onlineBtn18, offlineBtn18, downloadBtn18, HCVVolume2Chapter18, Url18, progressBar18, txtView18);
        checkFileExistence(onlineBtn19, offlineBtn19, downloadBtn19, HCVVolume2Chapter19, Url19, progressBar19, txtView19);
        checkFileExistence(onlineBtn20, offlineBtn20, downloadBtn20, HCVVolume2Chapter20, Url20, progressBar20, txtView20);
        checkFileExistence(onlineBtn21, offlineBtn21, downloadBtn21, HCVVolume2Chapter21, Url21, progressBar21, txtView21);
        checkFileExistence(onlineBtn22, offlineBtn22, downloadBtn22, HCVVolume2Chapter22, Url22, progressBar22, txtView22);



        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(HCVVolume2Chapter1, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter2, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter3, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter4, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter5, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter6, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter7, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter8, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter9, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter10, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter11, Url11, onlineBtn11, offlineBtn11, downloadBtn11, txtView11, progressBar11);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter12, Url12, onlineBtn12, offlineBtn12, downloadBtn12, txtView12, progressBar12);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter13, Url13, onlineBtn13, offlineBtn13, downloadBtn13, txtView13, progressBar13);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter14, Url14, onlineBtn14, offlineBtn14, downloadBtn14, txtView14, progressBar14);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter15, Url15, onlineBtn15, offlineBtn15, downloadBtn15, txtView15, progressBar15);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter16, Url16, onlineBtn16, offlineBtn16, downloadBtn16, txtView16, progressBar16);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(HCVVolume2Chapter17, Url17, onlineBtn17, offlineBtn17, downloadBtn17, txtView17, progressBar17);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn18.setVisibility(View.GONE);
                    downloadBtn18.setVisibility(View.GONE);
                    initProgressBar(progressBar18);
                    downloadPdf(HCVVolume2Chapter18, Url18, onlineBtn18, offlineBtn18, downloadBtn18, txtView18, progressBar18);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn19.setVisibility(View.GONE);
                    downloadBtn19.setVisibility(View.GONE);
                    initProgressBar(progressBar19);
                    downloadPdf(HCVVolume2Chapter19, Url19, onlineBtn19, offlineBtn19, downloadBtn19, txtView19, progressBar19);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn20.setVisibility(View.GONE);
                    downloadBtn20.setVisibility(View.GONE);
                    initProgressBar(progressBar20);
                    downloadPdf(HCVVolume2Chapter20, Url20, onlineBtn20, offlineBtn20, downloadBtn20, txtView20, progressBar20);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn21.setVisibility(View.GONE);
                    downloadBtn21.setVisibility(View.GONE);
                    initProgressBar(progressBar21);
                    downloadPdf(HCVVolume2Chapter21, Url21, onlineBtn21, offlineBtn21, downloadBtn21, txtView21, progressBar21);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn22.setVisibility(View.GONE);
                    downloadBtn22.setVisibility(View.GONE);
                    initProgressBar(progressBar22);
                    downloadPdf(HCVVolume2Chapter22, Url22, onlineBtn22, offlineBtn22, downloadBtn22, txtView22, progressBar22);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });



        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url11);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url12);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url13);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url14);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url15);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url16);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url17);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url18);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url19);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url20);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url21);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(HcvSolutionVolume2Activity.this, WebActivity.class);
                    intent.putExtra("url", Url22);
                    startActivity(intent);
                }else{
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(HcvSolutionVolume2Activity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(HcvSolutionVolume2Activity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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
