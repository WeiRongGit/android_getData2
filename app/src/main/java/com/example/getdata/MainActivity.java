package com.example.getdata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.example.dataImp.Phone;
import com.example.httpClient.Url;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //实例化适配器
        DataAdapter dataAdapter = new DataAdapter(MainActivity.this, R.layout.data);
        //实例化 listview
        ListView listView = findViewById(R.id.list_view);


        Url url = new Url("Material");
        url.put("materialName", "手机");

        //把适配器 listview 传入线程处理
        new DataTask(new Phone(dataAdapter, listView)).execute(url);

    }
}