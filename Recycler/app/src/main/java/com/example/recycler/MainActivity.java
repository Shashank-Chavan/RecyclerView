package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter viewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<GIT> gitList = new ArrayList<>();
        gitList.add(new GIT("Rushikesh","150","20"));
        gitList.add(new GIT("Shashank","200","2500"));
        gitList.add(new GIT("Mahesh","50","50"));
        gitList.add(new GIT("Divesh","69","650"));
        gitList.add(new GIT("Kunal","35","1220"));
        gitList.add(new GIT("Chetan","78","220"));
        gitList.add(new GIT("Nisha","21","280"));
        gitList.add(new GIT("HItu","20","820"));
        gitList.add(new GIT("Vishal","67","658"));
        gitList.add(new GIT("Raj","150","84"));
        gitList.add(new GIT("Shashank","200","659"));
        gitList.add(new GIT("Mahesh","50","215"));
        gitList.add(new GIT("Divesh","69","1152"));
        gitList.add(new GIT("Kunal","35","325"));
        gitList.add(new GIT("Chetan","78","97"));
        gitList.add(new GIT("Nisha","21","22"));
        gitList.add(new GIT("HItu","20","20"));
        gitList.add(new GIT("Vishal","67","32"));
        gitList.add(new GIT("Raj","150","20"));
        gitList.add(new GIT("Kunal","35","325"));
        gitList.add(new GIT("Chetan","78","97"));
        gitList.add(new GIT("Nisha","21","22"));
       recyclerView = findViewById(R.id.recyclerview);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       viewAdapter = new RecyclerAdapter(gitList);
       recyclerView.setAdapter(viewAdapter);
       DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
}