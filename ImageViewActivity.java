package com.harsh.jeephysics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView image;
    private String imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        image = findViewById(R.id.image);

        Intent intent = getIntent();
        imageUrl = intent.getStringExtra("url_of_image");


        Picasso.get().load(imageUrl).placeholder(R.drawable.ic_image_black).into(image);
    }
}
