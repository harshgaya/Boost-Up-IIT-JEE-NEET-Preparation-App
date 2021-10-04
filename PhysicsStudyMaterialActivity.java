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


public class PhysicsStudyMaterialActivity extends AppCompatActivity {

    private String Url1="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FVectors%20%26%20Calculuss.pdf?alt=media&token=ef7ab83f-7855-4809-9ec2-cb20f94a70c8";
    private String Url2="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2Funit%20and%20dimension.pdf?alt=media&token=50f8106c-db18-47f2-ba5e-c9bac4effd5e";
    private String Url3="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FKinematics.pdf?alt=media&token=950e25c3-dff4-4bb2-bb89-a9d35da6dc18";
    private String Url4="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FNewton%20Law%20of%20Motion.pdf?alt=media&token=17e4dca0-194f-4a03-898d-31a6309e9c66";
    private String Url5="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2Fwork%20Energy%20%26%20Power.pdf?alt=media&token=ef68239e-4ad2-4e78-8a51-bbdf9cebc463";
    private String Url6="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2Fimpulse%20and%20momentum.pdf?alt=media&token=50c4fed9-99e8-44fd-9138-8f3a4adb6683";
    private String Url7="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FRotational%20Motion.pdf?alt=media&token=4ef9bdad-076a-437e-bfdb-d7f6d8cdfce4";
    private String Url8="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FGravitation.pdf?alt=media&token=58f505d3-042a-4f65-87f8-c8e3c711636b";
    private String Url9="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FWave%20theory-%20Sound%20effect-%20Doppler%20effects.pdf?alt=media&token=baca9923-7518-4cfd-b34c-d07b288491db";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FElasticity.pdf?alt=media&token=63d1c839-87d5-45d5-9374-ec0cad6f796d";
    private String Url11="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2Fthermodynamics.pdf?alt=media&token=283a8896-8e28-4586-8249-c3d197eadd82";
    private String Url12="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FElectrostatics.pdf?alt=media&token=696c5f34-05ef-45e2-b2e0-c35c99bdf8c6";
    private String Url13="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2Fcapacitnace.pdf?alt=media&token=8c28cc33-690e-48b8-ac0d-72bde3587689";
    private String Url14="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FCurrent%20Electricity.pdf?alt=media&token=dfaae3cb-0902-4f69-9ffa-d0a5cf0b123f";
    private String Url15="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FMagnetism.pdf?alt=media&token=c2963826-0f7e-46cf-9edd-5eb05a2756d5";
    private String Url16="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FMagnetic%20Effect%20of%20Current.pdf?alt=media&token=5cb341a4-00b4-4955-ba07-8364d4a8424c";
    private String Url17="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FElectromagnetic%20Induction.pdf?alt=media&token=8c9a7c94-51a5-42c3-8953-56ca6dde043c";
    private String Url18="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FAlternating%20Current-Copy.pdf?alt=media&token=e2dde667-04da-4fc7-bacf-17c047f4d871";
    private String Url19="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FModern%20Physics.pdf?alt=media&token=ed4e28e5-5544-4f8b-b3a3-d6f2dedc9410";
    private String Url20="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FSemiconductors-Electronics.pdf?alt=media&token=f3dae4d9-c1c1-46b0-aa33-e32ae2e712e5";
    private String Url21="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FLogic%20Gates.pdf?alt=media&token=28727561-7863-4dde-b017-8d9a83814250";
    private String Url22="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FRay%20Optics%20Part1.pdf?alt=media&token=dd2523db-f43f-46ad-b729-09bc1ddeb742";
    private String Url23="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FRay%20Optics%20Part2.pdf?alt=media&token=c2e0f262-ca83-403e-8278-c01bd5c837c4";
    private String Url24="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FInterference%20of%20Light.pdf?alt=media&token=529141a2-6016-4775-9752-68762c6aa3a9";
    private String Url25="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FDiffraction%20of%20Light.pdf?alt=media&token=74cba118-683e-4526-aabe-563324cb3807";
    private String Url26="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2Felectromagnetic%20waves.pdf?alt=media&token=3bf04bb3-fae3-4388-ac82-00c7bec4b0aa";
    private String Url27="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FPhysics%2FPhysics%20Study%20Material%2FCommunication%20System.pdf?alt=media&token=b94b3f82-e05e-4c66-9969-df35c7bc6532";

    private String VectorAndCalculas="VectorAndCalculas.pdf";
    private String UnitandDimension="UnitandDimension.pdf";
    private String Kinematics="Kinematics.pdf";
    private String NewtonLawofMotion="NewtonLawofMotion.pdf";
    private String WorkEnergy="WorkEnergy.pdf";
    private String ImpulseandMomentum="ImpulseandMomentum.pdf";
    private String RotationalMechanics="RotationalMechanics.pdf";
    private String Gravitation="Gravitation.pdf";
    private String SHM="SHM.pdf";
    private String Elasticity="Elasticity.pdf";
    private String Thermodynamics="Thermodynamics.pdf";
    private String Electrostatics="Electrostatics.pdf";
    private String Capacitor="Capacitor.pdf";
    private String Current="Current.pdf";
    private String Magnetism="Magnetism.pdf";
    private String MagneticEffect="MagneticEffect.pdf";
    private String EMI="EMI.pdf";
    private String AC="AC.pdf";
    private String ModernPhysics="ModernPhysics.pdf";
    private String Semiconductor="Semiconductor.pdf";
    private String LogicGates="LogicGates.pdf";
    private String RayOptics1="RayOptics1.pdf";
    private String RayOptics2="RayOptics2.pdf";
    private String InterferenceofLight="InterferenceofLight.pdf";
    private String DiffractionofLight="DiffractionofLight.pdf";
    private String ElectromagneticWave="ElectromagneticWave.pdf";
    private String CommunicationSystem="CommunicationSystem.pdf";








    /// textView
    private TextView txtView1,txtView2,txtView3,txtView4,txtView5,txtView6,txtView7,txtView8,txtView9,txtView10,txtView11,txtView12
                     ,txtView13,txtView14,txtView15,txtView16,txtView17,txtView18,txtView19,txtView20,txtView21,txtView22,txtView23
                     ,txtView24,txtView25,txtView26,txtView27;
    /// textView

    ///ProgressBar
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6,progressBar7,progressBar8
                        ,progressBar9,progressBar10,progressBar11,progressBar12,progressBar13,progressBar14,progressBar15,
                        progressBar16,progressBar17,progressBar18,progressBar19,progressBar20,progressBar21,progressBar22
                        ,progressBar23,progressBar24,progressBar25,progressBar26,progressBar27;
    ////progressBar

    ///DownloadButton
    private Button downloadBtn1,downloadBtn2,downloadBtn3,downloadBtn4,downloadBtn5,downloadBtn6,downloadBtn7,downloadBtn8,downloadBtn9
                   ,downloadBtn10,downloadBtn11,downloadBtn12,downloadBtn13,downloadBtn14,downloadBtn15,downloadBtn16,downloadBtn17,
            downloadBtn18,downloadBtn19,downloadBtn20,downloadBtn21,downloadBtn22,downloadBtn23,downloadBtn24,downloadBtn25,downloadBtn26,
            downloadBtn27;
    /// ///DownloadButton

    ////OnlineButton
    private Button onlineBtn1,onlineBtn2,onlineBtn3,onlineBtn4,onlineBtn5,onlineBtn6,onlineBtn7,onlineBtn8,onlineBtn9,onlineBtn10
                   ,onlineBtn11,onlineBtn12,onlineBtn13,onlineBtn14,onlineBtn15,onlineBtn16,onlineBtn17,onlineBtn18,onlineBtn19
                   ,onlineBtn20,onlineBtn21,onlineBtn22,onlineBtn23,onlineBtn24,onlineBtn25,onlineBtn26,onlineBtn27;
    ////OnlineButton


    ////offlineButton
    private Button offlineBtn1,offlineBtn2,offlineBtn3,offlineBtn4,offlineBtn5,offlineBtn6,offlineBtn7,offlineBtn8,offlineBtn9,offlineBtn10
                    ,offlineBtn11,offlineBtn12,offlineBtn13,offlineBtn14,offlineBtn15,offlineBtn16,offlineBtn17,offlineBtn18,offlineBtn19
                    ,offlineBtn20,offlineBtn21,offlineBtn22,offlineBtn23,offlineBtn24,offlineBtn25,offlineBtn26,offlineBtn27;
    ////offlineButton



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_study_material);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Physics Study Material");
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
        ////offlineBtn

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, VectorAndCalculas, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, UnitandDimension, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, Kinematics, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, NewtonLawofMotion, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, WorkEnergy, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, ImpulseandMomentum, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, RotationalMechanics, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, Gravitation, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, SHM, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, Elasticity, Url10, progressBar10, txtView10);
        checkFileExistence(onlineBtn11, offlineBtn11, downloadBtn11, Thermodynamics, Url11, progressBar11, txtView11);
        checkFileExistence(onlineBtn12, offlineBtn12, downloadBtn12, Electrostatics, Url12, progressBar12, txtView12);
        checkFileExistence(onlineBtn13, offlineBtn13, downloadBtn13, Capacitor, Url13, progressBar13, txtView13);
        checkFileExistence(onlineBtn14, offlineBtn14, downloadBtn14, Current, Url14, progressBar14, txtView14);
        checkFileExistence(onlineBtn15, offlineBtn15, downloadBtn15, Magnetism, Url15, progressBar15, txtView15);
        checkFileExistence(onlineBtn16, offlineBtn16, downloadBtn16, MagneticEffect, Url16, progressBar16, txtView16);
        checkFileExistence(onlineBtn17, offlineBtn17, downloadBtn17, EMI, Url17, progressBar17, txtView17);
        checkFileExistence(onlineBtn18, offlineBtn18, downloadBtn18, AC, Url18, progressBar18, txtView18);
        checkFileExistence(onlineBtn19, offlineBtn19, downloadBtn19, ModernPhysics, Url19, progressBar19, txtView19);
        checkFileExistence(onlineBtn20, offlineBtn20, downloadBtn20, Semiconductor, Url20, progressBar20, txtView20);
        checkFileExistence(onlineBtn21, offlineBtn21, downloadBtn21, LogicGates, Url21, progressBar21, txtView21);
        checkFileExistence(onlineBtn22, offlineBtn22, downloadBtn22, RayOptics1, Url22, progressBar22, txtView22);
        checkFileExistence(onlineBtn23, offlineBtn23, downloadBtn23, RayOptics2, Url23, progressBar23, txtView23);
        checkFileExistence(onlineBtn24, offlineBtn24, downloadBtn24, InterferenceofLight, Url24, progressBar24, txtView24);
        checkFileExistence(onlineBtn25, offlineBtn25, downloadBtn25, DiffractionofLight, Url25, progressBar25, txtView25);
        checkFileExistence(onlineBtn26, offlineBtn26, downloadBtn26, ElectromagneticWave, Url26, progressBar26, txtView26);
        checkFileExistence(onlineBtn27, offlineBtn27, downloadBtn27, CommunicationSystem, Url27, progressBar27, txtView27);


        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(VectorAndCalculas, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(UnitandDimension, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Kinematics, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(NewtonLawofMotion, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(WorkEnergy, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ImpulseandMomentum, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RotationalMechanics, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Gravitation, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(SHM, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Elasticity, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Thermodynamics, Url11, onlineBtn11, offlineBtn11, downloadBtn11, txtView11, progressBar11);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Electrostatics, Url12, onlineBtn12, offlineBtn12, downloadBtn12, txtView12, progressBar12);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Capacitor, Url13, onlineBtn13, offlineBtn13, downloadBtn13, txtView13, progressBar13);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Current, Url14, onlineBtn14, offlineBtn14, downloadBtn14, txtView14, progressBar14);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Magnetism, Url15, onlineBtn15, offlineBtn15, downloadBtn15, txtView15, progressBar15);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MagneticEffect, Url16, onlineBtn16, offlineBtn16, downloadBtn16, txtView16, progressBar16);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(EMI, Url17, onlineBtn17, offlineBtn17, downloadBtn17, txtView17, progressBar17);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(AC, Url18, onlineBtn18, offlineBtn18, downloadBtn18, txtView18, progressBar18);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ModernPhysics, Url19, onlineBtn19, offlineBtn19, downloadBtn19, txtView19, progressBar19);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(Semiconductor, Url20, onlineBtn20, offlineBtn20, downloadBtn20, txtView20, progressBar20);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(LogicGates, Url21, onlineBtn21, offlineBtn21, downloadBtn21, txtView21, progressBar21);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RayOptics1, Url22, onlineBtn22, offlineBtn22, downloadBtn22, txtView22, progressBar22);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(RayOptics2, Url23, onlineBtn23, offlineBtn23, downloadBtn23, txtView23, progressBar23);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(InterferenceofLight, Url24, onlineBtn24, offlineBtn24, downloadBtn24, txtView24, progressBar24);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(DiffractionofLight, Url25, onlineBtn25, offlineBtn25, downloadBtn25, txtView25, progressBar25);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(ElectromagneticWave, Url26, onlineBtn26, offlineBtn26, downloadBtn26, txtView26, progressBar26);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(CommunicationSystem, Url27, onlineBtn27, offlineBtn27, downloadBtn27, txtView27, progressBar27);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });


        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url11);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url12);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url13);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url14);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url15);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url16);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url17);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url18);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url19);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url20);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url21);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url22);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url23);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url24);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url25);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url26);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(PhysicsStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url27);
                    startActivity(intent);
                }else{
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(PhysicsStudyMaterialActivity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(PhysicsStudyMaterialActivity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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
