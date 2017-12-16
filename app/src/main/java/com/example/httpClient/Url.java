package com.example.httpClient;

import com.loopj.android.http.RequestParams;

/**
 * Created by ｗｉｎｇ on 2017/12/16.
 */

public class Url {
    private String url;
    private RequestParams params;

    public Url(String url) {
        this.url = url;
        this.params = new RequestParams();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void put(String key, String val) {
        params.put(key, val);
    }

    public RequestParams getParams() {
        return params;
    }
}
