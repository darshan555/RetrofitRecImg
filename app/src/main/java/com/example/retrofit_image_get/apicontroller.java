package com.example.retrofit_image_get;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apicontroller {
    private static final String url = "https://api.slingacademy.com/v1/sample-data/";
    private static apicontroller clientobject;

    private static Retrofit retrofit;

    apicontroller(){
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized apicontroller getInstance(){
        if(clientobject == null)
            clientobject = new apicontroller();
            return clientobject;
    }
    apiset getapi(){
        return retrofit.create(apiset.class);
    }
}
