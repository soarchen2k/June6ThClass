package com.qizhou.june6thclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.qizhou.june6thclass.entities.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Data> sources = new ArrayList<>();
        sources.add(new Data("Name1", "Description1", R.drawable.test));
        sources.add(new Data("Name2", "Description2", R.drawable.test));
        sources.add(new Data("Name1", "Description1", R.drawable.test));
        sources.add(new Data("Name2", "Description2", R.drawable.test));
        sources.add(new Data("Name1", "Description1", R.drawable.test));
        sources.add(new Data("Name2", "Description2", R.drawable.test));
        sources.add(new Data("Name1", "Description1", R.drawable.test));
        sources.add(new Data("Name2", "Description2", R.drawable.test));
        sources.add(new Data("Name1", "Description1", R.drawable.test));
        sources.add(new Data("Name2", "Description2", R.drawable.test));
        sources.add(new Data("Name1", "Description1", R.drawable.test));
        sources.add(new Data("Name2", "Description2", R.drawable.test));
        sources.add(new Data("Name1", "Description1", R.drawable.test));
        sources.add(new Data("Name2", "Description2", R.drawable.test));

        RecAdapter adapter = new RecAdapter(sources);
        RecyclerView horizon = findViewById(R.id.horizontal_recycler);
        horizon.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        horizon.setLayoutManager(layoutManager);

        RecyclerView vertical = findViewById(R.id.vertical_recycler);
        vertical.setAdapter(adapter);
        RecyclerView.LayoutManager verManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        RecyclerView.LayoutManager verManager = new GridLayoutManager(this, 2);
        vertical.setLayoutManager(verManager);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.menu_end) {
                    Toast.makeText(getApplicationContext(), "END!!!", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.menu_question) {
                    Toast.makeText(getApplicationContext(), "Question!!!", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

    }
}