package com.example.getdata;

import android.os.AsyncTask;

import com.example.dataImp.DataUtil;
import com.example.httpClient.Url;
import com.example.httpClient.httpClientUtil;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;

import cz.msebera.android.httpclient.Header;

/**
 * Created by ｗｉｎｇ on 2017/12/15.
 */

public class DataTask extends AsyncTask<Url, Integer, JSONArray> {

    private JSONArray jsonArray = null;
    private DataUtil dataUtil;

    public DataTask(DataUtil dataUtil) {
        super();
        this.dataUtil = dataUtil;
    }


    @Override
    protected JSONArray doInBackground(Url... urls) {

        Url url = urls[0];

        httpClientUtil.get(url.getUrl(), url.getParams(), new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                //复制到 jsonArray 让 initObj（） 转化为对象
                jsonArray = response;
                System.out.println(response.toString());
            }
        });

        return jsonArray;
    }

    @Override
    protected void onPostExecute(JSONArray jsonArray) {
        dataUtil.changeUI(jsonArray);
    }

}
