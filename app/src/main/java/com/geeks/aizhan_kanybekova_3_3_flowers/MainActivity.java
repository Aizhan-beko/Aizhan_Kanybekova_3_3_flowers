package com.geeks.aizhan_kanybekova_3_3_flowers;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import Flowers.Flowers;

public class MainActivity extends AppCompatActivity {

    private RecyclerView flowersRecyclerView;
    private FlowersAdapter flowersAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Flowers> flowers = new ArrayList<>();
        flowers.add(new Flowers("Lotus", R.drawable.lotus));
        flowers.add(new Flowers("Rose",R.drawable.rose));
        flowers.add(new Flowers("Lavender",R.drawable.lavender));
        flowers.add(new Flowers("Comomile",R.drawable.comomile));
        flowers.add(new Flowers("Orchid", R.drawable.orchid));
        flowers.add(new Flowers("Lily", R.drawable.lily));
        flowers.add(new Flowers("Iris", R.drawable.iris));
        flowers.add(new Flowers("Poppy", R.drawable.poppy));
        flowers.add(new Flowers("Jasmine", R.drawable.jasmine));
        flowers.add(new Flowers("Fikus", R.drawable.fikus));


        flowersRecyclerView = findViewById(R.id.flowersRecyclerView);
        flowersAdapter = new FlowersAdapter(flowers);
        flowersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        flowersRecyclerView.setAdapter(flowersAdapter);
    }
}