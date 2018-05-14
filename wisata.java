package com.android.kelompok.heritageyogya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wisata extends AppCompatActivity {

    private Button btnyogya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

    }

    public void setBtnyogya (View view) {
        Intent intent = new Intent(wisata.this, KeratonYogyakarta.class);
        startActivity(intent);
    }

}

