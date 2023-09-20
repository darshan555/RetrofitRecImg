package com.example.retrofit_image_get;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiset {
    @GET("photos")
    Call<List<responsemodel>> getdata();
}
