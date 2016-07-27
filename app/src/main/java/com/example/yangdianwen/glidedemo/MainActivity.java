package com.example.yangdianwen.glidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView targetImageView = (ImageView)findViewById(R.id.iv);
        String internetUrl = "http://i.imgur.com/idojSYm.png";
        Glide.with(this).load(internetUrl).into(targetImageView);
    }
}
