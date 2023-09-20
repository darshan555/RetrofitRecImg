package com.example.retrofit_image_get;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {
    List<responsemodel> data;

    public myadapter(List<responsemodel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.tv.setText(data.get(position).getTitle());
        Glide.with(holder.tv.getContext()).load(data.get(position).getUrl()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tv;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageIV);
            tv = itemView.findViewById(R.id.titleTV);
        }
    }
}
