package com.harsh.jeephysics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        firebaseAuth = FirebaseAuth.getInstance();

        SystemClock.sleep(1000);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        if (currentUser == null) {
            Intent loginIntent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(loginIntent);
            finish();
        } else {

            Intent intent=new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
            finish();

//            FirebaseFirestore.getInstance().collection("USERS").document(currentUser.getUid()).update("Last seen", FieldValue.serverTimestamp())
//                    .addOnCompleteListener(new OnCompleteListener<Void>() {
//                        @Override
//                        public void onComplete(@NonNull Task<Void> task) {
//                            if (task.isSuccessful()) {
//                                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
//                                startActivity(mainIntent);
//                                finish();
//                            } else {
//                                String error = task.getException().getMessage();
//                                Toast.makeText(SplashActivity.this, error, Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });

        }
    }


}
