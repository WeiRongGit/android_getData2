package com.example.getdata;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.dataImp.Phone;
import com.example.httpClient.Url;
import com.example.servicetest.MyService;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button startSer = (Button) findViewById(R.id.start_service);
//        Button stopService = (Button) findViewById(R.id.Stop_service);

//        startSer.setOnClickListener(this);
//        stopService.setOnClickListener(this);




       //实例化适配器
        DataAdapter dataAdapter = new DataAdapter(MainActivity.this, R.layout.data);
        //实例化 listview
        ListView listView = findViewById(R.id.list_view);



        Url url = new Url("Material");
        url.put("materialName", "手机");

        //把适配器 listview 传入线程处理
        new DataTask(new Phone(dataAdapter, listView)).execute(url);
    }
/*
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_service:
                Intent startIntent = new Intent(this, MyService.class);
                startService(startIntent);
                break;
            case R.id.Stop_service:
                Intent stoptIntent = new Intent(this, MyService.class);
                stopService(stoptIntent);
                break;
            default:
                break;
        }
    }*/

}