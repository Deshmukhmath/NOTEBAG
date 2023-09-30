package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SANnotes extends AppCompatActivity {

    PDFView modsan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sannotes);

        modsan=(PDFView) findViewById(R.id.san);

        modsan.fromAsset("storagenotes.pdf").load();
    }
}