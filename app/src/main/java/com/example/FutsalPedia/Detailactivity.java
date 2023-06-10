package com.example.FutsalPedia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Detailactivity extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNamalapangan, tvDeskripsi;
    private String yNamalapangan, yDeskripsi, yFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFoto = findViewById(R.id.iv_foto);

        tvNamalapangan = findViewById(R.id.tv_namalapangan);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);

        Intent ambil = getIntent();
        yFoto = ambil.getStringExtra("xFoto");
        yNamalapangan = ambil.getStringExtra("xNamalapangan");
        yDeskripsi = ambil.getStringExtra("xDeskripsi");

        tvNamalapangan.setText(yNamalapangan);
        tvDeskripsi.setText(yDeskripsi);

        Glide
                .with(Detailactivity.this)
                .load(yFoto);



    }



}
