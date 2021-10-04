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

public class ChemistryStudyMaterialActivity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F1.stochiometry-jeemain.guru.pdf?alt=media&token=a37ba30a-20d6-42f4-a020-23dbb243a81e";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F2.atomic%20structure-jeemain.guru.pdf?alt=media&token=f877a820-6f46-45ba-a007-45526c375adf";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F3.chemical%20bonding-jeemain.guru.pdf?alt=media&token=32492b5f-cb7b-4c78-894a-5f7d90c4cac8";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F4.periodic%20table-jeemain.guru.pdf?alt=media&token=112ca085-f686-4f4b-bed3-a6c4b4765ce8";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F5.state%20of%20matter-jeemain.guru.pdf?alt=media&token=45f5f8b1-a9de-44fd-b7a2-74f010e8aa00";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F6.thermodynamics-jeemain.guru.pdf?alt=media&token=8b24b400-9733-4de3-932b-7d9ed5cb876e";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F7.thermochemistry-jeemain.guru.pdf?alt=media&token=32df8ebd-67d8-4a16-aec3-80dadc503612";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F8.chemical%20equilibrium-jeemain.guru.pdf?alt=media&token=68622154-347f-4c05-8443-c2f8c07af759";
    private String Url9= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F9.chemical%20kinetics-jeemain.guru.pdf?alt=media&token=15f64be9-e585-440b-8dbc-3ebe7e8b7e8f";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F10.ionic%20equilibrium-jeemain.guru.pdf?alt=media&token=f35992c1-605d-4528-9a60-fc1d2596765a";
    private String Url11="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F11.electrochemistry-jeemain.guru.pdf?alt=media&token=e4576753-d678-4326-a5a5-57079d1c3463";
    private String Url12="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F12.solution-jeemain.guru.pdf?alt=media&token=37f96a52-c7a7-413e-8253-ed4d1015e1cc";
    private String Url13="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F13.surface%20chemistry-jeemain.guru.pdf?alt=media&token=e55b8f02-a5f2-4f5b-a41d-dc913c4d8ce4";
    private String Url14="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F14.redox%20reaction-jeemain.guru.pdf?alt=media&token=c961eb07-1db3-4ebe-8df6-d2bef6403ee9";
    private String Url15="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F15.solid%20state-jeemain.guru.pdf?alt=media&token=2ce2c6cb-917a-425b-a276-aeaf6851b61b";
    private String Url16="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F16.environmental%20chemistry-jeemain.guru.pdf?alt=media&token=9c72ca50-3923-4d8d-bf57-bddbebb61dca";
    private String Url17="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F17.purification-jeemain.guru.pdf?alt=media&token=de226629-dd82-4128-ac2e-c7ea7a438937";
    private String Url18="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F18.hydrogen-jeemain.guru.pdf?alt=media&token=542a786e-3652-45ce-b9ef-fdb9bf63b4e4";
    private String Url19="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F19.mettallurgy-jeemain.guru.pdf?alt=media&token=298c4de5-93cd-4a74-80c5-c26eb349d273";
    private String Url20="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F20.s%20block-jeemain.guru.pdf?alt=media&token=b673a87c-12e8-4c98-a9bb-3d5d39796ef9";
    private String Url21="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F21.p%20block%201-jeemain.guru.pdf?alt=media&token=cbaf247d-ec18-432d-a3c5-87dab54863d3";
    private String Url22="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F22.p%20block%202-jeemain.guru.pdf?alt=media&token=49ef0c5e-f395-4c17-924b-59528e4eb74f";
    private String Url23="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F23d%20f%20block-jeemain.guru.pdf?alt=media&token=6fbcd1b0-4a1b-45d6-b94a-20f46769689e";
    private String Url24="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F24.coordination%20chemistry-jeemain.guru.pdf?alt=media&token=55cdacf5-7235-4401-885f-bcffb6f89092";
    private String Url25="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F25.polymers-jeemain.guru.pdf?alt=media&token=2d06f720-c31d-408c-bff4-6d4acc7bb261";
    private String Url26="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F26.nomenclature%20of%20organic%20compounds-jeemain.guru.pdf?alt=media&token=0686343a-f519-4535-98b9-1ee3338c2864";
    private String Url27="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F27.isomerism-jeemain.guru.pdf?alt=media&token=a5c1c5e3-31dc-4eaf-ba6a-6320e40bf559";
    private String Url28="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F28.goc%202-jeemain.guru.pdf?alt=media&token=a78713fc-0b79-429d-8ea4-a4a9d432a82d";
    private String Url29="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F29.hydrocarbon%201-jeemain.guru.pdf?alt=media&token=555a6501-cb5d-44c6-ab4b-326073fb2615";
    private String Url30="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F30.hydrocarbon%202-jeemain.guru.pdf?alt=media&token=cb74316e-f897-4e5e-8d58-8d5b8a8369e5";
    private String Url31="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F31.alcohol-jeemain.guru.pdf?alt=media&token=dea6e91c-3bc6-42b2-b4a3-fcff4d8e1dcb";
    private String Url32="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F32.aldehyde-jeemain.guru.pdf?alt=media&token=234bccbe-02ab-4059-93f6-07273086b92c";
    private String Url33="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F33.aliphatic-jeemain.guru.pdf?alt=media&token=e447cdcc-9961-4fc6-8c62-25723edbdf0b";
    private String Url34="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F34.alkyl%20halide-jeemain.guru.pdf?alt=media&token=2a1913ae-a08a-4929-b23a-6cfe0397747f";
    private String Url35="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FChemistry%2FChemistry%20Study%20Material%2F35.carboxylic%20acid-jeemain.guru.pdf?alt=media&token=a7dcb38b-5a2f-473c-a885-6a2e37db7584";

    private String ChemistryStudyMaterial1="ChemistryStudyMaterial1.pdf";
    private String ChemistryStudyMaterial2="ChemistryStudyMaterial2.pdf";
    private String ChemistryStudyMaterial3="ChemistryStudyMaterial3.pdf";
    private String ChemistryStudyMaterial4="ChemistryStudyMaterial4.pdf";
    private String ChemistryStudyMaterial5="ChemistryStudyMaterial5.pdf";
    private String ChemistryStudyMaterial6="ChemistryStudyMaterial6.pdf";
    private String ChemistryStudyMaterial7="ChemistryStudyMaterial7.pdf";
    private String ChemistryStudyMaterial8="ChemistryStudyMaterial8.pdf";
    private String ChemistryStudyMaterial9="ChemistryStudyMaterial9.pdf";
    private String ChemistryStudyMaterial10="ChemistryStudyMaterial10.pdf";
    private String ChemistryStudyMaterial11="ChemistryStudyMaterial11.pdf";
    private String ChemistryStudyMaterial12="ChemistryStudyMaterial12.pdf";
    private String ChemistryStudyMaterial13="ChemistryStudyMaterial14.pdf";
    private String ChemistryStudyMaterial14="ChemistryStudyMaterial15.pdf";
    private String ChemistryStudyMaterial15="ChemistryStudyMaterial15.pdf";
    private String ChemistryStudyMaterial16="ChemistryStudyMaterial16.pdf";
    private String ChemistryStudyMaterial17="ChemistryStudyMaterial17.pdf";
    private String ChemistryStudyMaterial18="ChemistryStudyMaterial18.pdf";
    private String ChemistryStudyMaterial19="ChemistryStudyMaterial19.pdf";
    private String ChemistryStudyMaterial20="ChemistryStudyMaterial20.pdf";
    private String ChemistryStudyMaterial21="ChemistryStudyMaterial21.pdf";
    private String ChemistryStudyMaterial22="ChemistryStudyMaterial22.pdf";
    private String ChemistryStudyMaterial23="ChemistryStudyMaterial23.pdf";
    private String ChemistryStudyMaterial24="ChemistryStudyMaterial24.pdf";
    private String ChemistryStudyMaterial25="ChemistryStudyMaterial25.pdf";
    private String ChemistryStudyMaterial26="ChemistryStudyMaterial26.pdf";
    private String ChemistryStudyMaterial27="ChemistryStudyMaterial27.pdf";
    private String ChemistryStudyMaterial28="ChemistryStudyMaterial28.pdf";
    private String ChemistryStudyMaterial29="ChemistryStudyMaterial29.pdf";
    private String ChemistryStudyMaterial30="ChemistryStudyMaterial30.pdf";
    private String ChemistryStudyMaterial31="ChemistryStudyMaterial31.pdf";
    private String ChemistryStudyMaterial32="ChemistryStudyMaterial32.pdf";
    private String ChemistryStudyMaterial33="ChemistryStudyMaterial33.pdf";
    private String ChemistryStudyMaterial34="ChemistryStudyMaterial34.pdf";
    private String ChemistryStudyMaterial35="ChemistryStudyMaterial35.pdf";








    /// textView
    private TextView txtView1,txtView2,txtView3,txtView4,txtView5,txtView6,txtView7,txtView8,txtView9,txtView10,txtView11,txtView12
            ,txtView13,txtView14,txtView15,txtView16,txtView17,txtView18,txtView19,txtView20,txtView21,txtView22,txtView23
            ,txtView24,txtView25,txtView26,txtView27,txtView28,txtView29,txtView30,txtView31,txtView32,txtView33,txtView34,txtView35;
    /// textView

    ///ProgressBar
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6,progressBar7,progressBar8
            ,progressBar9,progressBar10,progressBar11,progressBar12,progressBar13,progressBar14,progressBar15,
            progressBar16,progressBar17,progressBar18,progressBar19,progressBar20,progressBar21,progressBar22
            ,progressBar23,progressBar24,progressBar25,progressBar26,progressBar27,progressBar28,progressBar29,progressBar30,progressBar31
            ,progressBar32,progressBar33,progressBar34,progressBar35;
    ////progressBar

    ///DownloadButton
    private Button downloadBtn1,downloadBtn2,downloadBtn3,downloadBtn4,downloadBtn5,downloadBtn6,downloadBtn7,downloadBtn8,downloadBtn9
            ,downloadBtn10,downloadBtn11,downloadBtn12,downloadBtn13,downloadBtn14,downloadBtn15,downloadBtn16,downloadBtn17,
            downloadBtn18,downloadBtn19,downloadBtn20,downloadBtn21,downloadBtn22,downloadBtn23,downloadBtn24,downloadBtn25,downloadBtn26,
            downloadBtn27,downloadBtn28,downloadBtn29,downloadBtn30,downloadBtn31,downloadBtn32,downloadBtn33,downloadBtn34,
    downloadBtn35;
    /// ///DownloadButton

    ////OnlineButton
    private Button onlineBtn1,onlineBtn2,onlineBtn3,onlineBtn4,onlineBtn5,onlineBtn6,onlineBtn7,onlineBtn8,onlineBtn9,onlineBtn10
            ,onlineBtn11,onlineBtn12,onlineBtn13,onlineBtn14,onlineBtn15,onlineBtn16,onlineBtn17,onlineBtn18,onlineBtn19
            ,onlineBtn20,onlineBtn21,onlineBtn22,onlineBtn23,onlineBtn24,onlineBtn25,onlineBtn26,onlineBtn27,onlineBtn28,onlineBtn29
            ,onlineBtn30,onlineBtn31,onlineBtn32,onlineBtn33,onlineBtn34,onlineBtn35;
    ////OnlineButton


    ////offlineButton
    private Button offlineBtn1,offlineBtn2,offlineBtn3,offlineBtn4,offlineBtn5,offlineBtn6,offlineBtn7,offlineBtn8,offlineBtn9,offlineBtn10
            ,offlineBtn11,offlineBtn12,offlineBtn13,offlineBtn14,offlineBtn15,offlineBtn16,offlineBtn17,offlineBtn18,offlineBtn19
            ,offlineBtn20,offlineBtn21,offlineBtn22,offlineBtn23,offlineBtn24,offlineBtn25,offlineBtn26,offlineBtn27,offlineBtn28
            ,offlineBtn29,offlineBtn30,offlineBtn31,offlineBtn32,offlineBtn33,offlineBtn34,offlineBtn35;
    ////offlineButton



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_study_material);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chemistry Study Material");
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
        txtView25=findViewById(R.id.txtView25);
        txtView26=findViewById(R.id.txtView26);
        txtView27=findViewById(R.id.txtView27);
        txtView28=findViewById(R.id.txtView28);
        txtView29=findViewById(R.id.txtView29);
        txtView30=findViewById(R.id.txtView30);
        txtView31=findViewById(R.id.txtView31);
        txtView32=findViewById(R.id.txtView32);
        txtView33=findViewById(R.id.txtView33);
        txtView34=findViewById(R.id.txtView34);
        txtView35=findViewById(R.id.txtView35);
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
        progressBar25=findViewById(R.id.progressBar25);
        progressBar26=findViewById(R.id.progressBar26);
        progressBar27=findViewById(R.id.progressBar27);
        progressBar28=findViewById(R.id.progressBar28);
        progressBar29=findViewById(R.id.progressBar29);
        progressBar30=findViewById(R.id.progressBar30);
        progressBar31=findViewById(R.id.progressBar31);
        progressBar32=findViewById(R.id.progressBar32);
        progressBar33=findViewById(R.id.progressBar33);
        progressBar34=findViewById(R.id.progressBar34);
        progressBar35=findViewById(R.id.progressBar35);
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
        downloadBtn25=findViewById(R.id.downloadBtn25);
        downloadBtn26=findViewById(R.id.downloadBtn26);
        downloadBtn27=findViewById(R.id.downloadBtn27);
        downloadBtn28=findViewById(R.id.downloadBtn28);
        downloadBtn29=findViewById(R.id.downloadBtn29);
        downloadBtn30=findViewById(R.id.downloadBtn30);
        downloadBtn31=findViewById(R.id.downloadBtn31);
        downloadBtn32=findViewById(R.id.downloadBtn32);
        downloadBtn33=findViewById(R.id.downloadBtn33);
        downloadBtn34=findViewById(R.id.downloadBtn34);
        downloadBtn35=findViewById(R.id.downloadBtn35);
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
        onlineBtn25=findViewById(R.id.onlineBtn25);
        onlineBtn26=findViewById(R.id.onlineBtn26);
        onlineBtn27=findViewById(R.id.onlineBtn27);
        onlineBtn28=findViewById(R.id.onlineBtn28);
        onlineBtn29=findViewById(R.id.onlineBtn29);
        onlineBtn30=findViewById(R.id.onlineBtn30);
        onlineBtn31=findViewById(R.id.onlineBtn31);
        onlineBtn32=findViewById(R.id.onlineBtn32);
        onlineBtn33=findViewById(R.id.onlineBtn33);
        onlineBtn34=findViewById(R.id.onlineBtn34);
        onlineBtn35=findViewById(R.id.onlineBtn35);
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
        offlineBtn25=findViewById(R.id.offlineBtn25);
        offlineBtn26=findViewById(R.id.offlineBtn26);
        offlineBtn27=findViewById(R.id.offlineBtn27);
        offlineBtn28=findViewById(R.id.offlineBtn28);
        offlineBtn29=findViewById(R.id.offlineBtn29);
        offlineBtn30=findViewById(R.id.offlineBtn30);
        offlineBtn31=findViewById(R.id.offlineBtn31);
        offlineBtn32=findViewById(R.id.offlineBtn32);
        offlineBtn33=findViewById(R.id.offlineBtn33);
        offlineBtn34=findViewById(R.id.offlineBtn34);
        offlineBtn35=findViewById(R.id.offlineBtn35);
        ////offlineBtn

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, ChemistryStudyMaterial1, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, ChemistryStudyMaterial2, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, ChemistryStudyMaterial3, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, ChemistryStudyMaterial4, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, ChemistryStudyMaterial5, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, ChemistryStudyMaterial6, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, ChemistryStudyMaterial7, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, ChemistryStudyMaterial8, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, ChemistryStudyMaterial9, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, ChemistryStudyMaterial10, Url10, progressBar10, txtView10);
        checkFileExistence(onlineBtn11, offlineBtn11, downloadBtn11, ChemistryStudyMaterial11, Url11, progressBar11, txtView11);
        checkFileExistence(onlineBtn12, offlineBtn12, downloadBtn12, ChemistryStudyMaterial12, Url12, progressBar12, txtView12);
        checkFileExistence(onlineBtn13, offlineBtn13, downloadBtn13, ChemistryStudyMaterial13, Url13, progressBar13, txtView13);
        checkFileExistence(onlineBtn14, offlineBtn14, downloadBtn14, ChemistryStudyMaterial14, Url14, progressBar14, txtView14);
        checkFileExistence(onlineBtn15, offlineBtn15, downloadBtn15, ChemistryStudyMaterial15, Url15, progressBar15, txtView15);
        checkFileExistence(onlineBtn16, offlineBtn16, downloadBtn16, ChemistryStudyMaterial16, Url16, progressBar16, txtView16);
        checkFileExistence(onlineBtn17, offlineBtn17, downloadBtn17, ChemistryStudyMaterial17, Url17, progressBar17, txtView17);
        checkFileExistence(onlineBtn18, offlineBtn18, downloadBtn18, ChemistryStudyMaterial18, Url18, progressBar18, txtView18);
        checkFileExistence(onlineBtn19, offlineBtn19, downloadBtn19, ChemistryStudyMaterial19, Url19, progressBar19, txtView19);
        checkFileExistence(onlineBtn20, offlineBtn20, downloadBtn20, ChemistryStudyMaterial20, Url20, progressBar20, txtView20);
        checkFileExistence(onlineBtn21, offlineBtn21, downloadBtn21, ChemistryStudyMaterial21, Url21, progressBar21, txtView21);
        checkFileExistence(onlineBtn22, offlineBtn22, downloadBtn22, ChemistryStudyMaterial22, Url22, progressBar22, txtView22);
        checkFileExistence(onlineBtn23, offlineBtn23, downloadBtn23, ChemistryStudyMaterial23, Url23, progressBar23, txtView23);
        checkFileExistence(onlineBtn24, offlineBtn24, downloadBtn24, ChemistryStudyMaterial24, Url24, progressBar24, txtView24);
        checkFileExistence(onlineBtn25, offlineBtn25, downloadBtn25, ChemistryStudyMaterial25, Url25, progressBar25, txtView25);
        checkFileExistence(onlineBtn26, offlineBtn26, downloadBtn26, ChemistryStudyMaterial26, Url26, progressBar26, txtView26);
        checkFileExistence(onlineBtn27, offlineBtn27, downloadBtn27, ChemistryStudyMaterial27, Url27, progressBar27, txtView27);
        checkFileExistence(onlineBtn28, offlineBtn28, downloadBtn28, ChemistryStudyMaterial28, Url28, progressBar28, txtView28);
        checkFileExistence(onlineBtn29, offlineBtn29, downloadBtn29, ChemistryStudyMaterial29, Url29, progressBar29, txtView29);
        checkFileExistence(onlineBtn30, offlineBtn30, downloadBtn30, ChemistryStudyMaterial30, Url30, progressBar30, txtView30);
        checkFileExistence(onlineBtn31, offlineBtn31, downloadBtn31, ChemistryStudyMaterial31, Url31, progressBar31, txtView31);
        checkFileExistence(onlineBtn32, offlineBtn32, downloadBtn32, ChemistryStudyMaterial32, Url32, progressBar32, txtView32);
        checkFileExistence(onlineBtn33, offlineBtn33, downloadBtn33, ChemistryStudyMaterial33, Url33, progressBar33, txtView33);
        checkFileExistence(onlineBtn34, offlineBtn34, downloadBtn34, ChemistryStudyMaterial34, Url34, progressBar34, txtView34);
        checkFileExistence(onlineBtn35, offlineBtn35, downloadBtn35, ChemistryStudyMaterial35, Url35, progressBar35, txtView35);







        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(ChemistryStudyMaterial1, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial2, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial3, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial4, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial5, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial6, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial7, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial8, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial9, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial10, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial11, Url11, onlineBtn11, offlineBtn11, downloadBtn11, txtView11, progressBar11);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial12, Url12, onlineBtn12, offlineBtn12, downloadBtn12, txtView12, progressBar12);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial13, Url13, onlineBtn13, offlineBtn13, downloadBtn13, txtView13, progressBar13);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial14, Url14, onlineBtn14, offlineBtn14, downloadBtn14, txtView14, progressBar14);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial15, Url15, onlineBtn15, offlineBtn15, downloadBtn15, txtView15, progressBar15);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial16, Url16, onlineBtn16, offlineBtn16, downloadBtn16, txtView16, progressBar16);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial17, Url17, onlineBtn17, offlineBtn17, downloadBtn17, txtView17, progressBar17);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial18, Url18, onlineBtn18, offlineBtn18, downloadBtn18, txtView18, progressBar18);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial19, Url19, onlineBtn19, offlineBtn19, downloadBtn19, txtView19, progressBar19);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial20, Url20, onlineBtn20, offlineBtn20, downloadBtn20, txtView20, progressBar20);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial21, Url21, onlineBtn21, offlineBtn21, downloadBtn21, txtView21, progressBar21);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial22, Url22, onlineBtn22, offlineBtn22, downloadBtn22, txtView22, progressBar22);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial23, Url23, onlineBtn23, offlineBtn23, downloadBtn23, txtView23, progressBar23);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ChemistryStudyMaterial24, Url24, onlineBtn24, offlineBtn24, downloadBtn24, txtView24, progressBar24);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn25.setVisibility(View.GONE);
                    downloadBtn25.setVisibility(View.GONE);
                    initProgressBar(progressBar25);
                    downloadPdf(ChemistryStudyMaterial25, Url25, onlineBtn25, offlineBtn25, downloadBtn25, txtView25, progressBar25);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn26.setVisibility(View.GONE);
                    downloadBtn26.setVisibility(View.GONE);
                    initProgressBar(progressBar26);
                    downloadPdf(ChemistryStudyMaterial26, Url26, onlineBtn26, offlineBtn26, downloadBtn26, txtView26, progressBar26);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn27.setVisibility(View.GONE);
                    downloadBtn27.setVisibility(View.GONE);
                    initProgressBar(progressBar27);
                    downloadPdf(ChemistryStudyMaterial27, Url27, onlineBtn27, offlineBtn27, downloadBtn27, txtView27, progressBar27);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        downloadBtn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn28.setVisibility(View.GONE);
                    downloadBtn28.setVisibility(View.GONE);
                    initProgressBar(progressBar28);
                    downloadPdf(ChemistryStudyMaterial28, Url28, onlineBtn28, offlineBtn28, downloadBtn28, txtView28, progressBar28);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn29.setVisibility(View.GONE);
                    downloadBtn29.setVisibility(View.GONE);
                    initProgressBar(progressBar29);
                    downloadPdf(ChemistryStudyMaterial29, Url29, onlineBtn29, offlineBtn29, downloadBtn29, txtView29, progressBar29);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn30.setVisibility(View.GONE);
                    downloadBtn30.setVisibility(View.GONE);
                    initProgressBar(progressBar30);
                    downloadPdf(ChemistryStudyMaterial30, Url30, onlineBtn30, offlineBtn30, downloadBtn30, txtView30, progressBar30);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn31.setVisibility(View.GONE);
                    downloadBtn31.setVisibility(View.GONE);
                    initProgressBar(progressBar31);
                    downloadPdf(ChemistryStudyMaterial31, Url31, onlineBtn31, offlineBtn31, downloadBtn31, txtView31, progressBar31);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        downloadBtn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn32.setVisibility(View.GONE);
                    downloadBtn32.setVisibility(View.GONE);
                    initProgressBar(progressBar32);
                    downloadPdf(ChemistryStudyMaterial32, Url32, onlineBtn32, offlineBtn32, downloadBtn32, txtView32, progressBar32);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        downloadBtn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn33.setVisibility(View.GONE);
                    downloadBtn33.setVisibility(View.GONE);
                    initProgressBar(progressBar33);
                    downloadPdf(ChemistryStudyMaterial33, Url33, onlineBtn33, offlineBtn33, downloadBtn33, txtView33, progressBar33);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        downloadBtn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn34.setVisibility(View.GONE);
                    downloadBtn34.setVisibility(View.GONE);
                    initProgressBar(progressBar34);
                    downloadPdf(ChemistryStudyMaterial34, Url34, onlineBtn34, offlineBtn34, downloadBtn34, txtView34, progressBar34);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        downloadBtn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn35.setVisibility(View.GONE);
                    downloadBtn35.setVisibility(View.GONE);
                    initProgressBar(progressBar35);
                    downloadPdf(ChemistryStudyMaterial35, Url35, onlineBtn35, offlineBtn35, downloadBtn35, txtView35, progressBar35);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });










        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url11);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url12);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url13);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url14);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url15);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url16);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url17);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url18);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url19);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url20);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url21);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url22);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url23);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url24);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url25);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url26);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url27);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url28);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url29);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url30);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url31);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url32);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url33);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url34);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(ChemistryStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url35);
                    startActivity(intent);
                }else{
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(ChemistryStudyMaterialActivity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(ChemistryStudyMaterialActivity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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
