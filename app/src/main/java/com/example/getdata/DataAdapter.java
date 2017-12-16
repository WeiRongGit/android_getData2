package com.example.getdata;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by ｗｉｎｇ on 2017/12/15.
 */

public class DataAdapter extends ArrayAdapter {
    private int resourceId;


    public DataAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        resourceId = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Data d = (Data) getItem(position);

        /* 为子项动态加载布局 */
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);

        //获取控件
        TextView dataId = (TextView) view.findViewById(R.id.materialIDField);
        TextView dataName = (TextView) view.findViewById(R.id.materialNameField);

        //对控件设置文本
        dataId.setText(d.getMaterialIDField());
        dataName.setText(d.getMaterialNameField());

        return view;
    }

}
