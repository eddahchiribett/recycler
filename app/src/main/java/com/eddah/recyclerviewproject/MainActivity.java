package com.eddah.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private RecyclerView recyclerView;
     private RecyclerView.Adapter adapter;
     private List<ListItem> ListItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListItems = new ArrayList<>();
        for (int i =0;i<=10; i++){
            ListItem listItem = new ListItem(
                    "heading" + (i+1),
                    "Lorem ipsum dummy"
            );
            ListItems.add(listItem);
        }
        adapter = new MyAdapter(ListItems, this);
        recyclerView.setAdapter(adapter);


    }
}
