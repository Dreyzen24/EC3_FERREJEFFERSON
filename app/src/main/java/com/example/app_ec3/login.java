package com.example.app_ec3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app_ec3.databinding.ActivityMainBinding;

public class login extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}