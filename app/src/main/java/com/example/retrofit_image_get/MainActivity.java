package com.example.retrofit_image_get;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recview = (RecyclerView) findViewById(R.id.imageRV);
        recview.setLayoutManager(new LinearLayoutManager(this));
        processData();
    }

    private void processData() {
        Call<List<responsemodel>> call = apicontroller
                .getInstance()
                .getapi()
                .getdata();

        call.enqueue(new Callback<List<responsemodel>>() {
            @Override
            public void onResponse(@NonNull Call<List<responsemodel>> call, @NonNull Response<List<responsemodel>> response) {
                List<responsemodel> data = response.body();
                myadapter adapter = new myadapter(data);
                recview.setAdapter(adapter);
            }

            @Override
            public void onFailure(@NonNull Call<List<responsemodel>> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}