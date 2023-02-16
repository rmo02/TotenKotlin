package com.example.totem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CPF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpf);

        getSupportActionBar().hide();
    }
}