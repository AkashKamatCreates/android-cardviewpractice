package com.example.cardviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<modelclass> mylist;

    RecyclerView recyclerView;

    adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview1);
        mylist = new ArrayList<>();
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));
        mylist.add(new modelclass("cat image", R.drawable.cat));




        adapter=new adapter(this, mylist);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}