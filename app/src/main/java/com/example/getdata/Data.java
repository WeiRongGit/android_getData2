package com.example.getdata;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by ｗｉｎｇ on 2017/12/15.
 */

public class Data {

    private String materialIDField;
    private String materialNameField;

    public String getMaterialNameField() {
        return materialNameField;
    }

    public void setMaterialNameField(String materialNameField) {
        this.materialNameField = materialNameField;
    }

    public String getMaterialIDField() {
        return materialIDField;
    }

    public void setMaterialIDField(String materialIDField) {
        this.materialIDField = materialIDField;
    }


    public static ArrayList toArr(JSONArray jsonArray) throws JSONException {


        ArrayList<Data> phoneList = new ArrayList<Data>();

        JSONObject jsonObject = null;

        Data d = null;
        for (int index = 0; index < jsonArray.length(); index++) {

            d = new Data();

            jsonObject = jsonArray.getJSONObject(index);
            d.setMaterialIDField(jsonObject.getString("materialIDField"));
            d.setMaterialNameField(jsonObject.getString("materialNameField"));

            phoneList.add(d);
        }

        return phoneList;
    }

}
