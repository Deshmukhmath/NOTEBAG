package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BDAnotes extends AppCompatActivity {

    PDFView modbda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdanotes);

        modbda=(PDFView) findViewById(R.id.bda);

        modbda.fromAsset("bdanotes.pdf").load();
    }
}