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

public class RcMukherjeeBookActivity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo3.pdf?alt=media&token=0e03772f-e2be-4982-a460-4a472c4a0bca";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo4.pdf?alt=media&token=717c5660-f58b-47ff-a10a-eb9a286c62d0";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo5.pdf?alt=media&token=b3e3dbc1-9afb-4914-aaef-8757891777dc";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo6.pdf?alt=media&token=c9d8143e-ec68-4010-90d4-64b76f07460b";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo7.pdf?alt=media&token=f70342ed-7264-4c30-86f0-5f0ad98ae144";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo8.pdf?alt=media&token=17e81911-dae2-4cd8-ade0-d7930e6393fb";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo9.pdf?alt=media&token=de8c4415-1cf7-4e80-b4e8-a1c18b4fd433";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo10.pdf?alt=media&token=fbfd9222-2a0f-4b73-b2e8-ec6b484a8e5f";
    private String Url9="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo11.pdf?alt=media&token=add401a8-33d3-4ba9-ae62-366b79ae7a96";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo12.pdf?alt=media&token=b297edf8-f0a3-443b-9938-7378e023f863";
    private String Url11="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo13.pdf?alt=media&token=4cf04e23-5953-40ec-b657-1459d98db89c";
    private String Url12="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo14.pdf?alt=media&token=1c61978e-8529-403a-b35b-f3b4339735a6";
    private String Url13="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo15.pdf?alt=media&token=bf9ef2d6-ff36-4530-a6be-7b3bc8a87e1f";
    private String Url14="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo16.pdf?alt=media&token=2232e234-3129-4443-aefd-8b053bece14a";
    private String Url15="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo17.pdf?alt=media&token=e001a69a-e357-43eb-8eea-7deef5eb60cf";
    private String Url16="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo18.pdf?alt=media&token=3c2211b7-3ef7-4c06-b825-b8578575186e";
    private String Url17="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo19.pdf?alt=media&token=a8934bc7-9cc5-44a1-bc66-22b3b28c6246";
    private String Url18="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo20.pdf?alt=media&token=6d0fc639-3993-403f-9ed0-0c6624ec8541";
    private String Url19="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo21.pdf?alt=media&token=32aa1614-0063-40ce-889c-9f75dd12ed33";
    private String Url20="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo22.pdf?alt=media&token=8b3867e1-9745-4594-a698-27cf4e179cc9";
    private String Url21="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo23.pdf?alt=media&token=4dab6e72-33fe-4af6-b34f-fd4b46afef51";
    private String Url22="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FRc%20mukherjee%2FFull%20page%20photo24.pdf?alt=media&token=b717e124-c92f-4ac0-97cb-80cb62f3be46";

    private String RcMukherjeeChapter1="RcMukherjeeChapter1.pdf";
    private String RcMukherjeeChapter2="RcMukherjeeChapter2.pdf";
    private String RcMukherjeeChapter3="RcMukherjeeChapter3.pdf";
    private String RcMukherjeeChapter4="RcMukherjeeChapter4.pdf";
    private String RcMukherjeeChapter5="RcMukherjeeChapter5.pdf";
    private String RcMukherjeeChapter6="RcMukherjeeChapter6.pdf";
    private String RcMukherjeeChapter7="RcMukherjeeChapter7.pdf";
    private String RcMukherjeeChapter8="RcMukherjeeChapter8.pdf";
    private String RcMukherjeeChapter9="RcMukherjeeChapter9.pdf";
    private String RcMukherjeeChapter10="RcMukherjeeChapter10.pdf";
    private String RcMukherjeeChapter11="RcMukherjeeChapter11.pdf";
    private String RcMukherjeeChapter12="RcMukherjeeChapter12.pdf";
    private String RcMukherjeeChapter13="RcMukherjeeChapter13.pdf";
    private String RcMukherjeeChapter14="RcMukherjeeChapter14.pdf";
    private String RcMukherjeeChapter15="RcMukherjeeChapter15.pdf";
    private String RcMukherjeeChapter16="RcMukherjeeChapter16.pdf";
    private String RcMukherjeeChapter17="RcMukherjeeChapter17.pdf";
    private String RcMukherjeeChapter18="RcMukherjeeChapter18.pdf";
    private String RcMukherjeeChapter19="RcMukherjeeChapter19.pdf";
    private String RcMukherjeeChapter20="RcMukherjeeChapter20.pdf";
    private String RcMukherjeeChapter21="RcMukherjeeChapter21.pdf";
    private String RcMukherjeeChapter22="RcMukherjeeChapter22.pdf";








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
        setContentView(R.layout.activity_rc_mukherjee_book);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("RC Mukherjee Physical Chemistry");
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

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, RcMukherjeeChapter1, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, RcMukherjeeChapter2, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, RcMukherjeeChapter3, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, RcMukherjeeChapter4, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, RcMukherjeeChapter5, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, RcMukherjeeChapter6, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, RcMukherjeeChapter7, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, RcMukherjeeChapter8, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, RcMukherjeeChapter9, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, RcMukherjeeChapter10, Url10, progressBar10, txtView10);
        checkFileExistence(onlineBtn11, offlineBtn11, downloadBtn11, RcMukherjeeChapter11, Url11, progressBar11, txtView11);
        checkFileExistence(onlineBtn12, offlineBtn12, downloadBtn12, RcMukherjeeChapter12, Url12, progressBar12, txtView12);
        checkFileExistence(onlineBtn13, offlineBtn13, downloadBtn13, RcMukherjeeChapter13, Url13, progressBar13, txtView13);
        checkFileExistence(onlineBtn14, offlineBtn14, downloadBtn14, RcMukherjeeChapter14, Url14, progressBar14, txtView14);
        checkFileExistence(onlineBtn15, offlineBtn15, downloadBtn15, RcMukherjeeChapter15, Url15, progressBar15, txtView15);
        checkFileExistence(onlineBtn16, offlineBtn16, downloadBtn16, RcMukherjeeChapter16, Url16, progressBar16, txtView16);
        checkFileExistence(onlineBtn17, offlineBtn17, downloadBtn17, RcMukherjeeChapter17, Url17, progressBar17, txtView17);
        checkFileExistence(onlineBtn18, offlineBtn18, downloadBtn18, RcMukherjeeChapter18, Url18, progressBar18, txtView18);
        checkFileExistence(onlineBtn19, offlineBtn19, downloadBtn19, RcMukherjeeChapter19, Url19, progressBar19, txtView19);
        checkFileExistence(onlineBtn20, offlineBtn20, downloadBtn20, RcMukherjeeChapter20, Url20, progressBar20, txtView20);
        checkFileExistence(onlineBtn21, offlineBtn21, downloadBtn21, RcMukherjeeChapter21, Url21, progressBar21, txtView21);
        checkFileExistence(onlineBtn22, offlineBtn22, downloadBtn22, RcMukherjeeChapter22, Url22, progressBar22, txtView22);



        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(RcMukherjeeChapter1, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter2, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter3, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter4, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter5, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter6, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter7, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter8, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter9, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter10, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter11, Url11, onlineBtn11, offlineBtn11, downloadBtn11, txtView11, progressBar11);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter12, Url12, onlineBtn12, offlineBtn12, downloadBtn12, txtView12, progressBar12);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter13, Url13, onlineBtn13, offlineBtn13, downloadBtn13, txtView13, progressBar13);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter14, Url14, onlineBtn14, offlineBtn14, downloadBtn14, txtView14, progressBar14);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter15, Url15, onlineBtn15, offlineBtn15, downloadBtn15, txtView15, progressBar15);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter16, Url16, onlineBtn16, offlineBtn16, downloadBtn16, txtView16, progressBar16);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter17, Url17, onlineBtn17, offlineBtn17, downloadBtn17, txtView17, progressBar17);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter18, Url18, onlineBtn18, offlineBtn18, downloadBtn18, txtView18, progressBar18);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter19, Url19, onlineBtn19, offlineBtn19, downloadBtn19, txtView19, progressBar19);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter20, Url20, onlineBtn20, offlineBtn20, downloadBtn20, txtView20, progressBar20);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter21, Url21, onlineBtn21, offlineBtn21, downloadBtn21, txtView21, progressBar21);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RcMukherjeeChapter22, Url22, onlineBtn22, offlineBtn22, downloadBtn22, txtView22, progressBar22);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });



        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url11);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url12);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url13);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url14);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url15);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url16);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url17);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url18);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url19);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url20);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url21);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(RcMukherjeeBookActivity.this, WebActivity.class);
                    intent.putExtra("url", Url22);
                    startActivity(intent);
                }else{
                    Toast.makeText(RcMukherjeeBookActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(RcMukherjeeBookActivity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(RcMukherjeeBookActivity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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
