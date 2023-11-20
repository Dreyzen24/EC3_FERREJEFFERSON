package com.example.app_ec3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.app_ec3.databinding.ActivityMain2Binding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private Ejer4Adapter ejer4Adapter = new Ejer4Adapter();
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvMascotas.setLayoutManager (
                new LinearLayoutManager(getApplicationContext())
        );
        binding.rvMascotas.setAdapter(ejer4Adapter);
        ejer4Adapter.setData(getData());
    }

    private ArrayList<Ejer4> getData(){

            ArrayList<Ejer4> list = new ArrayList<>();

            list.add(new Ejer4(list.size() + 1, R.drawable.image1, "Angel cake", "Dirección 1", "Android 1.0"));
            list.add(new Ejer4(list.size() + 1, R.drawable.image2, "Angel cake", "Dirección 2", "Android 1.0"));
            list.add(new Ejer4(list.size() + 1, R.drawable.image3, "Angel cake", "Dirección 3", "Android 1.0"));
            list.add(new Ejer4(list.size() + 1, R.drawable.image4, "Angel cake", "Dirección 4", "Android 1.0"));
            list.add(new Ejer4(list.size() + 1, R.drawable.image5, "Angel cake", "Dirección 5", "Android 1.0"));
            list.add(new Ejer4(list.size() + 1, R.drawable.image6, "Angel cake", "Dirección 6", "Android 1.0"));
            list.add(new Ejer4(list.size() + 1, R.drawable.image7, "Angel cake", "Dirección 7", "Android 1.0"));

            return list;


    }


}