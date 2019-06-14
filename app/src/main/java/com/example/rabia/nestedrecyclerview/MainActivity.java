package com.example.rabia.nestedrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.RecyclerView);
        ArrayList<String> title=new ArrayList<>();
        title.add("Ammara Rasheed");
        title.add("Maham");
        title.add("Sara");
        title.add("Areeb");
        title.add("Muneef");
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        Parentadapter parentadapter=new Parentadapter(title,MainActivity.this);
        recyclerView.setAdapter(parentadapter);
    }
}
