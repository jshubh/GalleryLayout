package com.example.imagegallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Objects;

public class fullScreen extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
       imageView= (ImageView) findViewById(R.id.image_view);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getSupportActionBar().setTitle("Full Screen Image");
        Intent i=getIntent();
        int position=i.getExtras().getInt("id");
        ImageAdapter imageAdapter=new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.imageArray[position]);
    }
}