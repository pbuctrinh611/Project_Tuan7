package com.example.project_tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    TextView tvcancelOfsignup,tvsigninOfsignup;
    Button btsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView tvsigninOfsignup=(TextView) findViewById(R.id.tv_signinOfsignup);
        TextView tvcancelOfsignup=(TextView) findViewById(R.id.tv_cancelOfsignup);
        Button btsignup=(Button) findViewById(R.id.bt_signup);
        tvcancelOfsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signup.this,MainActivity.class);
                startActivity(intent);
            }
        });
        tvsigninOfsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signup.this,signin.class);
                startActivity(intent);
            }
        });
        btsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signup.this,profile.class);
                startActivity(intent);
            }
        });

    }
}