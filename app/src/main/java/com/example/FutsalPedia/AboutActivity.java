package com.example.FutsalPedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.FutsalPedia.databinding.ActivityMainBinding;

public class AboutActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("About");
    }
}