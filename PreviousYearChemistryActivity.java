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

public class PreviousYearChemistryActivity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru3.pdf?alt=media&token=cc91eb9e-1985-4525-9f9f-bd951cc20853";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru4.pdf?alt=media&token=237e73a1-2206-4adb-93c4-9d3f808e826d";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru5.pdf?alt=media&token=ca09d1f4-c9ad-4254-b312-9ff1dbf754d4";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru6.pdf?alt=media&token=8a7ed86a-caa9-48b7-8a3e-faf6d89582ba";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru7.pdf?alt=media&token=0a328035-0aa9-41cd-878c-17453e147eaf";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru8.pdf?alt=media&token=9d1cc0f7-4cd9-4c2b-8fbc-a32367b12b05";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru9.pdf?alt=media&token=8659f578-0eee-4d7e-b11f-2617d8d3b9c7";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru10.pdf?alt=media&token=df8f3831-efa2-4978-87de-34f7a06d6c68";
    private String Url9= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru11.pdf?alt=media&token=e36ad592-ca06-4364-82ff-b86d74c6f550";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru12.pdf?alt=media&token=f1d1917f-a49f-42be-a37e-4cb04ff423ba";
    private String Url11="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru13.pdf?alt=media&token=7c18a1fd-621f-4715-9541-c9c4842bd2a6";
    private String Url12="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru14.pdf?alt=media&token=9f696c29-1c25-478f-ac10-5fd4867bb98f";
    private String Url13="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru15.pdf?alt=media&token=9d67dc37-5cb6-4353-8a4a-e3321124bb18";
    private String Url14="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru16.pdf?alt=media&token=640cac58-7fe7-4863-91dd-7ecb8fa47a84";
    private String Url15="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru17.pdf?alt=media&token=a81fa5a7-0544-4dcf-a7e9-509ef55b5989";
    private String Url16="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru18.pdf?alt=media&token=27754e9f-c9e3-489a-ba3f-50df44b143e3";
    private String Url17="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru19.pdf?alt=media&token=4f91c51a-a10a-44b8-a437-5b7c822ebbf5";
    private String Url18="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru20.pdf?alt=media&token=dfae0bb2-a864-4b5a-9c8e-e3793119083d";
    private String Url19="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru21.pdf?alt=media&token=5f4add92-e78f-4f28-9c1f-cdd62633c019";
    private String Url20="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru22.pdf?alt=media&token=4ff05925-e272-442d-84cb-94ac8f235f34";
    private String Url21="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru23.pdf?alt=media&token=96f3d249-617a-41fe-8027-9b6fa243f66f";
    private String Url22="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru24.pdf?alt=media&token=8d3c55ea-5150-4c72-9528-a6cd1412f985";
    private String Url23="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru25.pdf?alt=media&token=23873cba-81d7-48d8-9d8e-4d0a9ec86ecf";
    private String Url24="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistryBooks%2FPrevious%20Year%20Chemistry%2FChemistry-40-Years-IIT-JEE-Advanced-16-yrs-JEE-Main-Topic-wise-Chapterwise-Solved-Papers-jeemain.guru26.pdf?alt=media&token=6c5b5065-2d5c-4cc7-88d6-07fcf9a9461f";

    private String PreviousYearChemistry1="PreviousYearChemistry1.pdf";
    private String PreviousYearChemistry2="PreviousYearChemistry2.pdf";
    private String PreviousYearChemistry3="PreviousYearChemistry3.pdf";
    private String PreviousYearChemistry4="PreviousYearChemistry4.pdf";
    private String PreviousYearChemistry5="PreviousYearChemistry5.pdf";
    private String PreviousYearChemistry6="PreviousYearChemistry6.pdf";
    private String PreviousYearChemistry7="PreviousYearChemistry7.pdf";
    private String PreviousYearChemistry8="PreviousYearChemistry8.pdf";
    private String PreviousYearChemistry9="PreviousYearChemistry9.pdf";
    private String PreviousYearChemistry10="PreviousYearChemistry10.pdf";
    private String PreviousYearChemistry11="PreviousYearChemistry11.pdf";
    private String PreviousYearChemistry12="PreviousYearChemistry12.pdf";
    private String PreviousYearChemistry13="PreviousYearChemistry13.pdf";
    private String PreviousYearChemistry14="PreviousYearChemistry14.pdf";
    private String PreviousYearChemistry15="PreviousYearChemistry15.pdf";
    private String PreviousYearChemistry16="PreviousYearChemistry16.pdf";
    private String PreviousYearChemistry17="PreviousYearChemistry17.pdf";
    private String PreviousYearChemistry18="PreviousYearChemistry18.pdf";
    private String PreviousYearChemistry19="PreviousYearChemistry19.pdf";
    private String PreviousYearChemistry20="PreviousYearChemistry20.pdf";
    private String PreviousYearChemistry21="PreviousYearChemistry21.pdf";
    private String PreviousYearChemistry22="PreviousYearChemistry22.pdf";
    private String PreviousYearChemistry23="PreviousYearChemistry22.pdf";
    private String PreviousYearChemistry24="PreviousYearChemistry22.pdf";








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
        setContentView(R.layout.activity_previous_year_chemistry);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Previous Year Chemistry Chapterwise Papers");
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
        txtView23=findViewById(R.id.txtView23);
        txtView24=findViewById(R.id.txtView24);
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
        progressBar23=findViewById(R.id.progressBar23);
        progressBar24=findViewById(R.id.progressBar24);
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
        downloadBtn23=findViewById(R.id.downloadBtn23);
        downloadBtn24=findViewById(R.id.downloadBtn24);

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
        onlineBtn23=findViewById(R.id.onlineBtn23);
        onlineBtn24=findViewById(R.id.onlineBtn24);
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
        offlineBtn23=findViewById(R.id.offlineBtn23);
        offlineBtn24=findViewById(R.id.offlineBtn24);
        ////offlineBtn

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, PreviousYearChemistry1, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, PreviousYearChemistry2, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, PreviousYearChemistry3, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, PreviousYearChemistry4, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, PreviousYearChemistry5, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, PreviousYearChemistry6, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, PreviousYearChemistry7, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, PreviousYearChemistry8, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, PreviousYearChemistry9, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, PreviousYearChemistry10, Url10, progressBar10, txtView10);
        checkFileExistence(onlineBtn11, offlineBtn11, downloadBtn11, PreviousYearChemistry11, Url11, progressBar11, txtView11);
        checkFileExistence(onlineBtn12, offlineBtn12, downloadBtn12, PreviousYearChemistry12, Url12, progressBar12, txtView12);
        checkFileExistence(onlineBtn13, offlineBtn13, downloadBtn13, PreviousYearChemistry13, Url13, progressBar13, txtView13);
        checkFileExistence(onlineBtn14, offlineBtn14, downloadBtn14, PreviousYearChemistry14, Url14, progressBar14, txtView14);
        checkFileExistence(onlineBtn15, offlineBtn15, downloadBtn15, PreviousYearChemistry15, Url15, progressBar15, txtView15);
        checkFileExistence(onlineBtn16, offlineBtn16, downloadBtn16, PreviousYearChemistry16, Url16, progressBar16, txtView16);
        checkFileExistence(onlineBtn17, offlineBtn17, downloadBtn17, PreviousYearChemistry17, Url17, progressBar17, txtView17);
        checkFileExistence(onlineBtn18, offlineBtn18, downloadBtn18, PreviousYearChemistry18, Url18, progressBar18, txtView18);
        checkFileExistence(onlineBtn19, offlineBtn19, downloadBtn19, PreviousYearChemistry19, Url19, progressBar19, txtView19);
        checkFileExistence(onlineBtn20, offlineBtn20, downloadBtn20, PreviousYearChemistry20, Url20, progressBar20, txtView20);
        checkFileExistence(onlineBtn21, offlineBtn21, downloadBtn21, PreviousYearChemistry21, Url21, progressBar21, txtView21);
        checkFileExistence(onlineBtn22, offlineBtn22, downloadBtn22, PreviousYearChemistry22, Url22, progressBar22, txtView22);
        checkFileExistence(onlineBtn23, offlineBtn23, downloadBtn23, PreviousYearChemistry23, Url23, progressBar23, txtView23);
        checkFileExistence(onlineBtn24, offlineBtn24, downloadBtn24, PreviousYearChemistry24, Url24, progressBar24, txtView24);



        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(PreviousYearChemistry1, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry2, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry3, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry4, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry5, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry6, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry7, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry8, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry9, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry10, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry11, Url11, onlineBtn11, offlineBtn11, downloadBtn11, txtView11, progressBar11);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry12, Url12, onlineBtn12, offlineBtn12, downloadBtn12, txtView12, progressBar12);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry13, Url13, onlineBtn13, offlineBtn13, downloadBtn13, txtView13, progressBar13);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry14, Url14, onlineBtn14, offlineBtn14, downloadBtn14, txtView14, progressBar14);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry15, Url15, onlineBtn15, offlineBtn15, downloadBtn15, txtView15, progressBar15);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry16, Url16, onlineBtn16, offlineBtn16, downloadBtn16, txtView16, progressBar16);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry17, Url17, onlineBtn17, offlineBtn17, downloadBtn17, txtView17, progressBar17);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry18, Url18, onlineBtn18, offlineBtn18, downloadBtn18, txtView18, progressBar18);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry19, Url19, onlineBtn19, offlineBtn19, downloadBtn19, txtView19, progressBar19);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry20, Url20, onlineBtn20, offlineBtn20, downloadBtn20, txtView20, progressBar20);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry21, Url21, onlineBtn21, offlineBtn21, downloadBtn21, txtView21, progressBar21);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(PreviousYearChemistry22, Url22, onlineBtn22, offlineBtn22, downloadBtn22, txtView22, progressBar22);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn23.setVisibility(View.GONE);
                    downloadBtn23.setVisibility(View.GONE);
                    initProgressBar(progressBar23);
                    downloadPdf(PreviousYearChemistry23, Url23, onlineBtn23, offlineBtn23, downloadBtn23, txtView23, progressBar23);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn24.setVisibility(View.GONE);
                    downloadBtn24.setVisibility(View.GONE);
                    initProgressBar(progressBar24);
                    downloadPdf(PreviousYearChemistry24, Url24, onlineBtn24, offlineBtn24, downloadBtn24, txtView24, progressBar24);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });



        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url11);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url12);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url13);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url14);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url15);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url16);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url17);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url18);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url19);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url20);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url21);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url22);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url23);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PreviousYearChemistryActivity.this, WebActivity.class);
                    intent.putExtra("url", Url24);
                    startActivity(intent);
                }else{
                    Toast.makeText(PreviousYearChemistryActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(PreviousYearChemistryActivity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(PreviousYearChemistryActivity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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
