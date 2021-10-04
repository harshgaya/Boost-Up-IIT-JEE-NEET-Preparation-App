package com.harsh.jeephysics.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.harsh.jeephysics.R;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {

    ImageView harshImg,sintusirImg,aryansirImg,santoshsirImg,akshayImg,swetaImg,charchitImg;

    private FirebaseAuth mAuth;
    private DatabaseReference RootRef;

    public AboutUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_about_us, container, false);

        harshImg=view.findViewById(R.id.harshImg);
        sintusirImg=view.findViewById(R.id.sintusirImg);
        aryansirImg=view.findViewById(R.id.aryansirImg);
        santoshsirImg=view.findViewById(R.id.santoshsirImg);
        akshayImg=view.findViewById(R.id.akshayImg);
        swetaImg=view.findViewById(R.id.swetaImg);
        charchitImg=view.findViewById(R.id.charchitImg);

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

        return view;
    }
}
