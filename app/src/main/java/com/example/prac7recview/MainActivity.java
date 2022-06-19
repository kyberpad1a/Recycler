package com.example.prac7recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<Model> movies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = findViewById(R.id.recycleView);

        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,movies);
        recyclerView.setAdapter(adapter);
    }
    private void setData()
    {
        double a = Math.random()*10;
        double b = Math.random()*10;
        if (a>5)
        {
            movies.add(new Model(R.drawable.gg,"ачивка1"));
        }
        else {
            movies.add(new Model(R.drawable.ggchb,"ачивка1"));
        }
        if (b>5)
        {
            movies.add(new Model(R.drawable.gg,"ачивка2"));
        }
        else {
            movies.add(new Model(R.drawable.ggchb,"ачивка2"));
        }

        //movies.add(new Model(R.drawable.gg,"Купить собаку"));


    }

}