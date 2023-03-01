package com.example.totem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.sunmi.scan.Config;
import com.sunmi.scan.Image;
import com.sunmi.scan.ImageScanner;
import com.sunmi.scan.Symbol;
import com.sunmi.scan.SymbolSet;

public class scan extends AppCompatActivity {
    private ImageScanner scanner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        getSupportActionBar().hide();

    }
}