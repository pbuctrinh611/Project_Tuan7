package com.example.project_tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    ListView lv;
    ImageView back;
    ListViewBaseAdapter row_listview;
    ArrayList<ListViewBean> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView back =(ImageView) findViewById(R.id.back);
        lv = (ListView) findViewById(R.id.listview);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.khoa,"Võ Trịnh Anh Khoa","Old Trafford Stadium",R.drawable.camera));
        arr_bean.add(new ListViewBean(R.drawable.aguero,"Sergio Agüero","Termina tu carrera en el rojo kun te amamos volve pronto esta es tu casa",R.drawable.camera));
        arr_bean.add(new ListViewBean(R.drawable.linh,"Trúc Linh","Hello linh xinh",R.drawable.camera));
        arr_bean.add(new ListViewBean(R.drawable.tri,"Nguyễn Văn Trí","Ê mén",R.drawable.camera));
        arr_bean.add(new ListViewBean(R.drawable.dhien,"Diệu Hiền","3k",R.drawable.camera));
        arr_bean.add(new ListViewBean(R.drawable.sillva,"David Silva","good lucky our king of assist but don't forget us as Manchester City bye bye!",R.drawable.camera));
        row_listview=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(row_listview);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(list.this,profile.class);
                startActivity(intent);
            }
        });
    }
}