package com.harsh.jeephysics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class AboutUsActivity extends AppCompatActivity {

    ImageView harshImg,sintusirImg,aryansirImg,santoshsirImg,akshayImg,swetaImg,charchitImg;

    private FirebaseAuth mAuth;
    private DatabaseReference RootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        harshImg=findViewById(R.id.harshImg);
        sintusirImg=findViewById(R.id.sintusirImg);
        aryansirImg=findViewById(R.id.aryansirImg);
        santoshsirImg=findViewById(R.id.santoshsirImg);
        akshayImg=findViewById(R.id.akshayImg);
        swetaImg=findViewById(R.id.swetaImg);
        charchitImg=findViewById(R.id.charchitImg);

        mAuth=FirebaseAuth.getInstance();
        RootRef= FirebaseDatabase.getInstance().getReference();

        RootRef.child("TeamImages").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (dataSnapshot.exists()){

                    String harshImage=dataSnapshot.child("harsh").getValue().toString();
                    String sintusirImage=dataSnapshot.child("sintusir").getValue().toString();
                    String aryanSirImage=dataSnapshot.child("aryansir").getValue().toString();
                    String santoshSirImage=dataSnapshot.child("santoshsir").getValue().toString();
                    String akshayImage=dataSnapshot.child("akshay").getValue().toString();
                    String swetaImage=dataSnapshot.child("sweta").getValue().toString();
                    String charchitImage=dataSnapshot.child("charchit").getValue().toString();


                    Picasso.get().load(harshImage).into(harshImg);
                    Picasso.get().load(sintusirImage).into(sintusirImg);
                    Picasso.get().load(aryanSirImage).into(aryansirImg);
                    Picasso.get().load(santoshSirImage).into(santoshsirImg);
                    Picasso.get().load(akshayImage).into(akshayImg);
                    Picasso.get().load(swetaImage).into(swetaImg);
                    Picasso.get().load(charchitImage).into(charchitImg);

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}