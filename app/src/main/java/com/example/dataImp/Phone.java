package com.example.dataImp;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.getdata.Data;
import com.example.getdata.DataAdapter;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by ｗｉｎｇ on 2017/12/16.
 */

public class Phone implements DataUtil {

    private ArrayAdapter arrayAdapter;
    private ListView listView;

    public Phone(ArrayAdapter arrayAdapter, ListView listView) {
        this.arrayAdapter = arrayAdapter;
        this.listView = listView;
    }


    @Override
    public void changeUI(JSONArray jsonArray) {
        try {

            ArrayList phoneList = Data.toArr(jsonArray);

            arrayAdapter.addAll(phoneList);
            listView.setAdapter(arrayAdapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
