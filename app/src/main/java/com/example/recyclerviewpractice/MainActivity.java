package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String car_name_arr[], car_des_arr[];
//    int images[] = {R.drawable.ferrari,R.drawable.ducati,R.drawable.audi,
//            R.drawable.minicooper,R.drawable.lexus,R.drawable.toyoto,R.drawable.tesla,R.drawable.hyundai};

    RecyclerView recyclerView;
    ArrayList<String> Imgurl;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Imgurl = new ArrayList<>();
        Imgurl.add("https://images.pexels.com/photos/8463778/pexels-photo-8463778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        Imgurl.add("https://cdn-0.motorcycle-logos.com/wp-content/uploads/2016/10/Ducati-Logo.png");
        Imgurl.add("https://www.carlogos.org/logo/Audi-logo-2009-640x334.jpg");
        Imgurl.add("https://cdn.pixabay.com/photo/2016/08/15/18/18/bmw-1596080_960_720.png");
        Imgurl.add("https://car-brand-names.com/wp-content/uploads/2016/01/Mini-logo-720x540.jpg");
        Imgurl.add("https://www.carlogos.org/logo/Lexus-logo-1988-640x266.jpg");
        Imgurl.add("https://www.carlogos.org/car-logos/toyota-logo-2019-3700x1200-show.png");
        Imgurl.add("https://www.carlogos.org/car-logos/tesla-logo-2200x2800-show.png");
        Imgurl.add("https://www.carlogos.org/logo/Hyundai-logo-silver-640x401.jpg");
        imageView = findViewById(R.id.imageView);

        car_name_arr = getResources().getStringArray(R.array.car_names);
        car_des_arr = getResources().getStringArray(R.array.description);
        recyclerView = findViewById(R.id.RecyclerView);





        MyAdapter myAdapter = new MyAdapter(this,car_name_arr,car_des_arr,Imgurl);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}