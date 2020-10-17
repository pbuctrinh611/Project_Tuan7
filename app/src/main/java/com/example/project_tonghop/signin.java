package com.example.project_tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class signin extends AppCompatActivity {
    TextView tvcancelOfsignin,tvsignupOfsignin;
    Button btsignin;
    ImageView twitter,facebook,instagram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ImageView twitter =(ImageView) findViewById(R.id.img_twitter);
        ImageView facebook =(ImageView) findViewById(R.id.img_facebook);
        ImageView instagram =(ImageView) findViewById(R.id.img_instagram);
        TextView tvsignupOfsignin=(TextView) findViewById(R.id.tv_signupOfsignin);
        TextView tvcancelOfsignin=(TextView) findViewById(R.id.tv_cancelOfsignin);
        Button btsignin=(Button) findViewById(R.id.bt_signin);
        tvcancelOfsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signin.this,MainActivity.class);
                startActivity(intent);
            }
        });
        tvsignupOfsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signin.this,signup.class);
                startActivity(intent);
            }
        });
        btsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signin.this,profile.class);
                startActivity(intent);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signin.this,profile.class);
                startActivity(intent);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signin.this,profile.class);
                startActivity(intent);
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signin.this,profile.class);
                startActivity(intent);
            }
        });
    }
}