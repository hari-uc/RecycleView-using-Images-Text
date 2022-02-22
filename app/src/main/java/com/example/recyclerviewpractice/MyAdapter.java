package com.example.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[];
    ArrayList<String> imgurl;
    Context context;



    public MyAdapter(Context ct, String[] car_name_arr, String[] car_des_arr, ArrayList<String> img_url){
        data1 = car_name_arr;
        data2 = car_des_arr;
        context = ct;
        imgurl = img_url;

    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text1;
        TextView text2;
        ImageView myimage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.car_name);
            text2 = itemView.findViewById(R.id.car_des);
            myimage = itemView.findViewById(R.id.imageView);
        }

        public  ImageView getImage(){
            return this.myimage;
        }



    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_template,parent,false);
//        view.setLayoutParams(new RecyclerView.LayoutParams(720,720));


        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.myimage.layout(0,0,0,0);


        Glide.with(context)
                .load(imgurl.get(position))
                .fitCenter()



                .diskCacheStrategy(DiskCacheStrategy.ALL)


                .error(R.drawable.not_found)
                .override(600,500)

                .into(holder.getImage());



    }


    @Override
    public int getItemCount() {
        return data1.length;
    }




}
