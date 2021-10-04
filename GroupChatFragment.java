package com.harsh.jeephysics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.iid.FirebaseInstanceId;


import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class GroupChatFragment extends Fragment {



    private RecyclerView groupsRv;
    private FirebaseAuth firebaseAuth;
    private ArrayList<ModelGroupChatList> groupChatLists;
    private AdapterGroupChatList adapterGroupChatList;
    private FirebaseAuth mAuth;
    private DatabaseReference RootRef;
    private String currentUserID;
    String mUID;

    public GroupChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_group_chat, container, false);


        groupsRv=view.findViewById(R.id.groupsRv);
        firebaseAuth= FirebaseAuth.getInstance();
        mAuth = FirebaseAuth.getInstance();

        RootRef = FirebaseDatabase.getInstance().getReference();

        loadGroupChatList();



        return view;
    }

    private void loadGroupChatList() {
        groupChatLists=new ArrayList<>();


        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("Groups");
        reference.keepSynced(true);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                groupChatLists.clear();
                for (DataSnapshot ds:dataSnapshot.getChildren()){
                    if (ds.child("Participants").child(firebaseAuth.getUid()).exists()){
                        ModelGroupChatList model=ds.getValue(ModelGroupChatList.class);
                        groupChatLists.add(model);
                    }
                }
                adapterGroupChatList=new AdapterGroupChatList(getActivity(),groupChatLists);
                groupsRv.setAdapter(adapterGroupChatList);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    private void searchGroupChatList(final String query) {
        groupChatLists=new ArrayList<>();

        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("Groups");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                groupChatLists.size();
                for (DataSnapshot ds:dataSnapshot.getChildren()){
                    if (ds.child("Participants").child(firebaseAuth.getUid()).exists()){
                        if (ds.child("groupTitle").toString().toLowerCase().contains(query.toLowerCase())){
                            ModelGroupChatList model=ds.getValue(ModelGroupChatList.class);
                            groupChatLists.add(model);
                        }

                    }
                }
                adapterGroupChatList=new AdapterGroupChatList(getActivity(),groupChatLists);
                groupsRv.setAdapter(adapterGroupChatList);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }




}
