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

public class MathStudyMaterialActivity extends AppCompatActivity {

    private String Url1= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2FTrigonometric%20ratio-compressed.pdf?alt=media&token=e55819da-c657-4404-834a-304a37fd016e";
    private String Url2= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Ftrigonomatric-equ.pdf?alt=media&token=9b75cd90-5d30-489d-9497-45274ae65590";
    private String Url3= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Finverse.pdf?alt=media&token=2e47de84-f84d-4907-8bef-bdfe4bf4aa4c";
    private String Url4= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fsolutions%20of%20triangle.pdf?alt=media&token=8a78173b-2ef3-4300-aed1-97fecd9efd5c";
    private String Url5= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2F01a-sequence-series-theory.pdf?alt=media&token=123e9ff6-6246-4266-9f82-631d25409b82";
    private String Url6= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fquadratic%20equation.pdf?alt=media&token=2efe7049-bbf4-47aa-8519-d32904ece874";
    private String Url7= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fcomplex%20number.pdf?alt=media&token=517595a9-7e98-40dd-9101-c9017ed45264";
    private String Url8= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fdeterminants.pdf?alt=media&token=608fa3d9-fa30-4d89-96b4-378cc86d33a7";
    private String Url9= "https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2FMatrices.pdf?alt=media&token=670a13bc-06b9-4a4e-be5d-1a2a7157bc45";
    private String Url10="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fpermutation-combination.pdf?alt=media&token=b5034de6-8cbe-4dab-9656-d777ac3b931f";
    private String Url11="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fbinomial.pdf?alt=media&token=4aa3fedf-0c26-4e6b-b9e2-41e8138f4883";
    private String Url12="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fprobability.pdf?alt=media&token=725ade18-b20e-40f7-83e7-d1b7405870b5";
    private String Url13="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Ffuntion.pdf?alt=media&token=f5270440-8d72-45f4-ba2c-733d525584db";
    private String Url14="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fcontinuity.pdf?alt=media&token=1af3a9cb-2282-416a-bb62-cba8c3285200";
    private String Url15="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2FDifferentiability.pdf?alt=media&token=82b134f2-a41e-4dc9-9309-df2ff4c545c3";
    private String Url16="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fmod.pdf?alt=media&token=da0919a4-ccbd-4dcd-ad4e-41447b9c7cb3";
    private String Url17="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Ftangent-_-normal.pdf?alt=media&token=8771d448-79b2-4860-8a85-3d8fc232fc7c";
    private String Url18="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fmaxima-minima.pdf?alt=media&token=09bc7b5d-7ac3-4ecc-853e-25fb16bca715";
    private String Url19="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Findefinite-integration.pdf?alt=media&token=1639a0df-e901-427b-9479-335b30d0f5e3";
    private String Url20="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fdefinite-integration.pdf?alt=media&token=00620ac2-d918-4701-be05-fc81d59300b2";
    private String Url21="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2F01-area-under-the-curve.pdf?alt=media&token=a5222f14-f392-416f-b9c1-de3c67225f18";
    private String Url22="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fdifferential-equation.pdf?alt=media&token=36bd1693-a77d-41e8-bc63-3ae3ff0d4f70";
    private String Url23="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fstraight-line.pdf?alt=media&token=523d7807-d264-4aed-9b72-5372aeadf8a2";
    private String Url24="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fcircle.pdf?alt=media&token=1afc8b82-b6ee-4219-be0f-9b8eb37bf7de";
    private String Url25="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fparabola1.pdf?alt=media&token=bb41723f-46fe-417e-93fe-4677837f2a23";
    private String Url26="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fellipse.pdf?alt=media&token=7c784e88-fd20-4de9-9e8c-55fd460a4bd3";
    private String Url27="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fhyperbola.pdf?alt=media&token=6fb77642-989a-46d2-9ae7-a2451933e522";
    private String Url28="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fvectortheory.pdf?alt=media&token=28e7b2cc-be57-4ec7-8452-a6585512b8cb";
    private String Url29="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2F3d-coordinate-geo.pdf?alt=media&token=65a0b6c6-d13d-4687-9d13-fda81e1b61ec";
    private String Url30="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fsets-1.pdf?alt=media&token=96beb1fe-a2d9-4206-8650-a8bb9da60252";
    private String Url31="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fmathematical%20reasoning.pdf?alt=media&token=f86d23cd-009f-48d9-bb3b-4f44e35abb4e";
    private String Url32="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Fstatics.pdf?alt=media&token=45dfa0ce-afea-4169-8ebf-29d0f91cb09d";
    private String Url33="https://firebasestorage.googleapis.com/v0/b/chatapp-3ff1d.appspot.com/o/PDFs%2FIITs%2FMath%2FStudy%20Material%2Frelation.pdf?alt=media&token=dee5c575-b836-4ff9-badd-3d58fada7fe2";


    private String MathStudyMaterial11="MathStudyMaterial11.pdf";
    private String MathStudyMaterial12="MathStudyMaterial12.pdf";
    private String MathStudyMaterial13="MathStudyMaterial13.pdf";
    private String MathStudyMaterial14="MathStudyMaterial14.pdf";
    private String MathStudyMaterial15="MathStudyMaterial15.pdf";
    private String MathStudyMaterial16="MathStudyMaterial16.pdf";
    private String MathStudyMaterial17="MathStudyMaterial17.pdf";
    private String MathStudyMaterial18="MathStudyMaterial18.pdf";
    private String MathStudyMaterial19="MathStudyMaterial19.pdf";
    private String MathStudyMaterial110="MathStudyMaterial110.pdf";
    private String MathStudyMaterial111="MathStudyMaterial111.pdf";
    private String MathStudyMaterial112="MathStudyMaterial112.pdf";
    private String MathStudyMaterial113="MathStudyMaterial114.pdf";
    private String MathStudyMaterial114="MathStudyMaterial115.pdf";
    private String MathStudyMaterial115="MathStudyMaterial115.pdf";
    private String MathStudyMaterial116="MathStudyMaterial116.pdf";
    private String MathStudyMaterial117="MathStudyMaterial117.pdf";
    private String MathStudyMaterial118="MathStudyMaterial118.pdf";
    private String MathStudyMaterial119="MathStudyMaterial119.pdf";
    private String MathStudyMaterial120="MathStudyMaterial120.pdf";
    private String MathStudyMaterial121="MathStudyMaterial121.pdf";
    private String MathStudyMaterial122="MathStudyMaterial122.pdf";
    private String MathStudyMaterial123="MathStudyMaterial123.pdf";
    private String MathStudyMaterial124="MathStudyMaterial124.pdf";
    private String MathStudyMaterial125="MathStudyMaterial125.pdf";
    private String MathStudyMaterial126="MathStudyMaterial126.pdf";
    private String MathStudyMaterial127="MathStudyMaterial127.pdf";
    private String MathStudyMaterial128="MathStudyMaterial128.pdf";
    private String MathStudyMaterial129="MathStudyMaterial129.pdf";
    private String MathStudyMaterial130="MathStudyMaterial130.pdf";
    private String MathStudyMaterial131="MathStudyMaterial131.pdf";
    private String MathStudyMaterial132="MathStudyMaterial132.pdf";
    private String MathStudyMaterial133="MathStudyMaterial133.pdf";

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
        setContentView(R.layout.activity_math_study_material);

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
        txtView28=findViewById(R.id.txtView28);
        txtView29=findViewById(R.id.txtView29);
        txtView30=findViewById(R.id.txtView30);
        txtView31=findViewById(R.id.txtView31);
        txtView32=findViewById(R.id.txtView32);
        txtView33=findViewById(R.id.txtView33);

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

        checkFileExistence(onlineBtn1, offlineBtn1, downloadBtn1, MathStudyMaterial11, Url1, progressBar1, txtView1);
        checkFileExistence(onlineBtn2, offlineBtn2, downloadBtn2, MathStudyMaterial12, Url2, progressBar2, txtView2);
        checkFileExistence(onlineBtn3, offlineBtn3, downloadBtn3, MathStudyMaterial13, Url3, progressBar3, txtView3);
        checkFileExistence(onlineBtn4, offlineBtn4, downloadBtn4, MathStudyMaterial14, Url4, progressBar4, txtView4);
        checkFileExistence(onlineBtn5, offlineBtn5, downloadBtn5, MathStudyMaterial15, Url5, progressBar5, txtView5);
        checkFileExistence(onlineBtn6, offlineBtn6, downloadBtn6, MathStudyMaterial16, Url6, progressBar6, txtView6);
        checkFileExistence(onlineBtn7, offlineBtn7, downloadBtn7, MathStudyMaterial17, Url7, progressBar7, txtView7);
        checkFileExistence(onlineBtn8, offlineBtn8, downloadBtn8, MathStudyMaterial18, Url8, progressBar8, txtView8);
        checkFileExistence(onlineBtn9, offlineBtn9, downloadBtn9, MathStudyMaterial19, Url9, progressBar9, txtView9);
        checkFileExistence(onlineBtn10, offlineBtn10, downloadBtn10, MathStudyMaterial110, Url10, progressBar10, txtView10);
        checkFileExistence(onlineBtn11, offlineBtn11, downloadBtn11, MathStudyMaterial111, Url11, progressBar11, txtView11);
        checkFileExistence(onlineBtn12, offlineBtn12, downloadBtn12, MathStudyMaterial112, Url12, progressBar12, txtView12);
        checkFileExistence(onlineBtn13, offlineBtn13, downloadBtn13, MathStudyMaterial113, Url13, progressBar13, txtView13);
        checkFileExistence(onlineBtn14, offlineBtn14, downloadBtn14, MathStudyMaterial114, Url14, progressBar14, txtView14);
        checkFileExistence(onlineBtn15, offlineBtn15, downloadBtn15, MathStudyMaterial115, Url15, progressBar15, txtView15);
        checkFileExistence(onlineBtn16, offlineBtn16, downloadBtn16, MathStudyMaterial116, Url16, progressBar16, txtView16);
        checkFileExistence(onlineBtn17, offlineBtn17, downloadBtn17, MathStudyMaterial117, Url17, progressBar17, txtView17);
        checkFileExistence(onlineBtn18, offlineBtn18, downloadBtn18, MathStudyMaterial118, Url18, progressBar18, txtView18);
        checkFileExistence(onlineBtn19, offlineBtn19, downloadBtn19, MathStudyMaterial119, Url19, progressBar19, txtView19);
        checkFileExistence(onlineBtn20, offlineBtn20, downloadBtn20, MathStudyMaterial120, Url20, progressBar20, txtView20);
        checkFileExistence(onlineBtn21, offlineBtn21, downloadBtn21, MathStudyMaterial121, Url21, progressBar21, txtView21);
        checkFileExistence(onlineBtn22, offlineBtn22, downloadBtn22, MathStudyMaterial122, Url22, progressBar22, txtView22);
        checkFileExistence(onlineBtn23, offlineBtn23, downloadBtn23, MathStudyMaterial123, Url23, progressBar23, txtView23);
        checkFileExistence(onlineBtn24, offlineBtn24, downloadBtn24, MathStudyMaterial124, Url24, progressBar24, txtView24);
        checkFileExistence(onlineBtn25, offlineBtn25, downloadBtn25, MathStudyMaterial125, Url25, progressBar25, txtView25);
        checkFileExistence(onlineBtn26, offlineBtn26, downloadBtn26, MathStudyMaterial126, Url26, progressBar26, txtView26);
        checkFileExistence(onlineBtn27, offlineBtn27, downloadBtn27, MathStudyMaterial127, Url27, progressBar27, txtView27);
        checkFileExistence(onlineBtn28, offlineBtn28, downloadBtn28, MathStudyMaterial128, Url28, progressBar28, txtView28);
        checkFileExistence(onlineBtn29, offlineBtn29, downloadBtn29, MathStudyMaterial129, Url29, progressBar29, txtView29);
        checkFileExistence(onlineBtn30, offlineBtn30, downloadBtn30, MathStudyMaterial130, Url30, progressBar30, txtView30);
        checkFileExistence(onlineBtn31, offlineBtn31, downloadBtn31, MathStudyMaterial131, Url31, progressBar31, txtView31);
        checkFileExistence(onlineBtn32, offlineBtn32, downloadBtn32, MathStudyMaterial132, Url32, progressBar32, txtView32);
        checkFileExistence(onlineBtn33, offlineBtn33, downloadBtn33, MathStudyMaterial133, Url33, progressBar33, txtView33);


        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {

                    onlineBtn1.setVisibility(View.GONE);
                    downloadBtn1.setVisibility(View.GONE);
                    initProgressBar(progressBar1);
                    downloadPdf(MathStudyMaterial11, Url1, onlineBtn1, offlineBtn1, downloadBtn1, txtView1, progressBar1);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial12, Url2, onlineBtn2, offlineBtn2, downloadBtn2, txtView2, progressBar2);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial13, Url3, onlineBtn3, offlineBtn3, downloadBtn3, txtView3, progressBar3);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial14, Url4, onlineBtn4, offlineBtn4, downloadBtn4, txtView4, progressBar4);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial15, Url5, onlineBtn5, offlineBtn5, downloadBtn5, txtView5, progressBar5);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial16, Url6, onlineBtn6, offlineBtn6, downloadBtn6, txtView6, progressBar6);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial17, Url7, onlineBtn7, offlineBtn7, downloadBtn7, txtView7, progressBar7);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial18, Url8, onlineBtn8, offlineBtn8, downloadBtn8, txtView8, progressBar8);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial19, Url9, onlineBtn9, offlineBtn9, downloadBtn9, txtView9, progressBar9);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial110, Url10, onlineBtn10, offlineBtn10, downloadBtn10, txtView10, progressBar10);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial111, Url11, onlineBtn11, offlineBtn11, downloadBtn11, txtView11, progressBar11);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial112, Url12, onlineBtn12, offlineBtn12, downloadBtn12, txtView12, progressBar12);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial113, Url13, onlineBtn13, offlineBtn13, downloadBtn13, txtView13, progressBar13);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial114, Url14, onlineBtn14, offlineBtn14, downloadBtn14, txtView14, progressBar14);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial115, Url15, onlineBtn15, offlineBtn15, downloadBtn15, txtView15, progressBar15);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial116, Url16, onlineBtn16, offlineBtn16, downloadBtn16, txtView16, progressBar16);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial117, Url17, onlineBtn17, offlineBtn17, downloadBtn17, txtView17, progressBar17);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial118, Url18, onlineBtn18, offlineBtn18, downloadBtn18, txtView18, progressBar18);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial119, Url19, onlineBtn19, offlineBtn19, downloadBtn19, txtView19, progressBar19);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial120, Url20, onlineBtn20, offlineBtn20, downloadBtn20, txtView20, progressBar20);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial121, Url21, onlineBtn21, offlineBtn21, downloadBtn21, txtView21, progressBar21);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial122, Url22, onlineBtn22, offlineBtn22, downloadBtn22, txtView22, progressBar22);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial123, Url23, onlineBtn23, offlineBtn23, downloadBtn23, txtView23, progressBar23);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial124, Url24, onlineBtn24, offlineBtn24, downloadBtn24, txtView24, progressBar24);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial125, Url25, onlineBtn25, offlineBtn25, downloadBtn25, txtView25, progressBar25);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial126, Url26, onlineBtn26, offlineBtn26, downloadBtn26, txtView26, progressBar26);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial127, Url27, onlineBtn27, offlineBtn27, downloadBtn27, txtView27, progressBar27);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial128, Url28, onlineBtn28, offlineBtn28, downloadBtn28, txtView28, progressBar28);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial129, Url29, onlineBtn29, offlineBtn29, downloadBtn29, txtView29, progressBar29);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial130, Url30, onlineBtn30, offlineBtn30, downloadBtn30, txtView30, progressBar30);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial131, Url31, onlineBtn31, offlineBtn31, downloadBtn31, txtView31, progressBar31);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial132, Url32, onlineBtn32, offlineBtn32, downloadBtn32, txtView32, progressBar32);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                    downloadPdf(MathStudyMaterial133, Url33, onlineBtn33, offlineBtn33, downloadBtn33, txtView33, progressBar33);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        onlineBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url1);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url2);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url3);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url4);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url5);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url6);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url7);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url8);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url9);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url10);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url11);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url12);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url13);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url14);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url15);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url16);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url17);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url18);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url19);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url20);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url21);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url22);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url23);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url24);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url25);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url26);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url27);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url28);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url29);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url30);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url31);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url32);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
                }


            }
        });
        onlineBtn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()) {
                    Intent intent = new Intent(MathStudyMaterialActivity.this, WebActivity.class);
                    intent.putExtra("url", Url33);
                    startActivity(intent);
                }else{
                    Toast.makeText(MathStudyMaterialActivity.this, "Connect to internet !", Toast.LENGTH_SHORT).show();
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
                            Intent intent = new Intent(MathStudyMaterialActivity.this, PdfActivity.class);
                            intent.putExtra("links", fileName);
                            startActivity(intent);
                        }
                    });


                } else {
                    Toast.makeText(MathStudyMaterialActivity.this, "Unable to download this pdf", Toast.LENGTH_SHORT).show();
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
