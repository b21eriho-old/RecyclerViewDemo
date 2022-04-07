package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> mountains = Arrays.asList("Kinnekulle", "Billingen", "Mount. Big", "Big-ass Hill", "Skovde mountain");

        RW = findViewById(R.id.recy_view);

    }
}