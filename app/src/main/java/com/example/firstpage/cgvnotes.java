package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cgvnotes extends AppCompatActivity {

    PDFView modcgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgvnotes);

        modcgv=(PDFView) findViewById(R.id.cgv);

        modcgv.fromAsset("cgvnotes.pdf").load();
    }
}