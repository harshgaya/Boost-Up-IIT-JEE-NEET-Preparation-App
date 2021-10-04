package com.harsh.jeephysics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserDetailsActivity extends AppCompatActivity {

    private CircleImageView main_profile_image;
    private ImageView add_profile_icon;
    private EditText nameet, statuset, cityet, stateet;
    private Button registerbtn;

    private FirebaseAuth firebaseAuth;
    private ProgressDialog loadingBar;
    private FloatingActionButton camerabtn;
    private static final int GalleryPick=1;


    private FirebaseAuth mAuth;
    private DatabaseReference RootRef;
    private String currentUserID;
    private StorageReference UserProfileImageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);


//        main_profile_image = findViewById(R.id.main_profile_image);
//        camerabtn = findViewById(R.id.camerabtn);
        nameet = findViewById(R.id.nameet);
        statuset = findViewById(R.id.statuset);
        cityet = findViewById(R.id.cityet);
        stateet = findViewById(R.id.stateet);
        registerbtn = findViewById(R.id.registerbtn);
        firebaseAuth = FirebaseAuth.getInstance();

        mAuth=FirebaseAuth.getInstance();
        currentUserID=mAuth.getCurrentUser().getUid();
        RootRef=FirebaseDatabase.getInstance().getReference();
        UserProfileImageRef= FirebaseStorage.getInstance().getReference().child("Profile Images");



//        camerabtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent galleryIntent=new Intent();
//                galleryIntent.setAction(Intent.ACTION_PICK);
//                galleryIntent.setType("image/*");
//                startActivityForResult(galleryIntent,GalleryPick);
//
//
//
//            }
//        });

        loadingBar = new ProgressDialog(this);


        nameet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        statuset.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        cityet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        stateet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });




        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nameet.getText().toString();
                String status=statuset.getText().toString();
                String city=cityet.getText().toString();
                String state=stateet.getText().toString();

                loadingBar.setTitle("Registering");
                loadingBar.setMessage("Please wait ,while we are registering..");
                loadingBar.setCanceledOnTouchOutside(false);
                loadingBar.show();

                AddtoPhysiscsGroup(name,status,city,state);
                AddtoChemistryGroup(name,status,city,state);
                AddtoMathGroup(name,status,city,state);
                AddtoBioGroup(name,status,city,state);
                setUserToUser(name,status);

            }
        });





    }

    private void AddtoPhysiscsGroup(String name, String status, String city, String state) {

        String token = FirebaseInstanceId.getInstance().getToken();
        HashMap<String, Object> hashMapp = new HashMap<>();

        hashMapp.put("name", "" + name);
        hashMapp.put("status", "" + status);
        hashMapp.put("city", "" + city);
        hashMapp.put("state", "" + state);
        hashMapp.put("role", "" + "participant");
        hashMapp.put("uid", "" + firebaseAuth.getUid());
        hashMapp.put("token", "" + token);
        DatabaseReference refff = FirebaseDatabase.getInstance().getReference("Groups");
        refff.child("Physics").child("Participants").child(firebaseAuth.getUid())
                .setValue(hashMapp)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        loadingBar.dismiss();
                        Intent intent=new Intent(UserDetailsActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                        //Toast.makeText(GroupChatActivity.this, "Success ..", Toast.LENGTH_SHORT).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(UserDetailsActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                loadingBar.dismiss();
            }
        });
    }
    private void AddtoChemistryGroup(String name, String status, String city, String state) {

        String token = FirebaseInstanceId.getInstance().getToken();
        HashMap<String, Object> hashMapp = new HashMap<>();

        hashMapp.put("name", "" + name);
        hashMapp.put("status", "" + status);
        hashMapp.put("city", "" + city);
        hashMapp.put("state", "" + state);
        hashMapp.put("role", "" + "participant");
        hashMapp.put("uid", "" + firebaseAuth.getUid());
        hashMapp.put("token", "" + token);
        DatabaseReference refff = FirebaseDatabase.getInstance().getReference("Groups");
        refff.child("Chemistry").child("Participants").child(firebaseAuth.getUid())
                .setValue(hashMapp)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        loadingBar.dismiss();
                        Intent intent=new Intent(UserDetailsActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                        //Toast.makeText(GroupChatActivity.this, "Success ..", Toast.LENGTH_SHORT).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(UserDetailsActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                loadingBar.dismiss();
            }
        });
    }
    private void AddtoMathGroup(String name, String status, String city, String state) {

        String token = FirebaseInstanceId.getInstance().getToken();
        HashMap<String, Object> hashMapp = new HashMap<>();

        hashMapp.put("name", "" + name);
        hashMapp.put("status", "" + status);
        hashMapp.put("city", "" + city);
        hashMapp.put("state", "" + state);
        hashMapp.put("role", "" + "participant");
        hashMapp.put("uid", "" + firebaseAuth.getUid());
        hashMapp.put("token", "" + token);
        DatabaseReference refff = FirebaseDatabase.getInstance().getReference("Groups");
        refff.child("Math").child("Participants").child(firebaseAuth.getUid())
                .setValue(hashMapp)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        loadingBar.dismiss();
                        Intent intent=new Intent(UserDetailsActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                        //Toast.makeText(GroupChatActivity.this, "Success ..", Toast.LENGTH_SHORT).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(UserDetailsActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                loadingBar.dismiss();
            }
        });
    }

    private void AddtoBioGroup(String name, String status, String city, String state) {

        String token = FirebaseInstanceId.getInstance().getToken();
        HashMap<String, Object> hashMapp = new HashMap<>();

        hashMapp.put("name", "" + name);
        hashMapp.put("status", "" + status);
        hashMapp.put("city", "" + city);
        hashMapp.put("state", "" + state);
        hashMapp.put("role", "" + "participant");
        hashMapp.put("uid", "" + firebaseAuth.getUid());
        hashMapp.put("token", "" + token);
        DatabaseReference refff = FirebaseDatabase.getInstance().getReference("Groups");
        refff.child("Biology").child("Participants").child(firebaseAuth.getUid())
                .setValue(hashMapp)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        loadingBar.dismiss();
                        Intent intent=new Intent(UserDetailsActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                        //Toast.makeText(GroupChatActivity.this, "Success ..", Toast.LENGTH_SHORT).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(UserDetailsActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                loadingBar.dismiss();
            }
        });
    }

    private void setUserToUser(String name,String status){

        HashMap<String,Object> profileMap=new HashMap<>();
        profileMap.put("uid",firebaseAuth.getUid());
        profileMap.put("name",name);
        profileMap.put("status",status);

        DatabaseReference refff = FirebaseDatabase.getInstance().getReference("Users");
        refff.child(firebaseAuth.getUid()).setValue(profileMap).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {

            }
        });

    }

    private void checkInputs() {
        if (!TextUtils.isEmpty(nameet.getText())) {
            if (!TextUtils.isEmpty(statuset.getText())) {
                if (!TextUtils.isEmpty(cityet.getText())) {
                    if (!TextUtils.isEmpty(stateet.getText())) {
                        registerbtn.setEnabled(true);
                        registerbtn.setTextColor(Color.rgb(255, 255, 255));
                    } else {
                        registerbtn.setEnabled(false);
                        registerbtn.setTextColor(Color.rgb( 255, 255, 255));
                    }
                } else {
                    registerbtn.setEnabled(false);
                    registerbtn.setTextColor(Color.rgb( 255, 255, 255));
                }
            } else {
                registerbtn.setEnabled(false);
                registerbtn.setTextColor(Color.rgb( 255, 255, 255));
            }
        } else {
            registerbtn.setEnabled(false);
            registerbtn.setTextColor(Color.rgb( 255, 255, 255));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==GalleryPick && resultCode==RESULT_OK && data!=null){
            Uri ImageUri=data.getData();
            CropImage.activity()
                    .setGuidelines(CropImageView.Guidelines.ON)
                    .setAspectRatio(1,1)
                    .start(this);
        }

        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if(resultCode==RESULT_OK){

                loadingBar.setTitle("Set profile Image");
                loadingBar.setMessage("Please wait, your profile image is updating...");
                loadingBar.setCanceledOnTouchOutside(false);
                loadingBar.show();
                final Uri resultUri=result.getUri();
                final StorageReference filePath=UserProfileImageRef.child(currentUserID + ".jpg");

                filePath.putFile(resultUri)
                        .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                            @Override
                            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                final Task<Uri> firebaseUri = taskSnapshot.getStorage().getDownloadUrl();
                                firebaseUri.addOnSuccessListener(new OnSuccessListener<Uri>() {
                                    @Override
                                    public void onSuccess(Uri uri) {
                                        final String downloadUrl = uri.toString();

                                        Picasso.get().load(downloadUrl).into(main_profile_image);
                                        // complete the rest of your code

                                        RootRef.child("UsersImages").child(currentUserID).child("image")
                                                .setValue(downloadUrl)
                                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful()){
                                                            Toast.makeText(UserDetailsActivity.this, "Image saved in database successfully ..", Toast.LENGTH_SHORT).show();
                                                            loadingBar.dismiss();
                                                        }else{
                                                            String message=task.getException().toString();
                                                            Toast.makeText(UserDetailsActivity.this, "Error : "+message, Toast.LENGTH_SHORT).show();
                                                            loadingBar.dismiss();
                                                        }
                                                    }
                                                });

                                    }
                                });
                                loadingBar.dismiss();

                            }
                        });

            }
        }

    }
}
