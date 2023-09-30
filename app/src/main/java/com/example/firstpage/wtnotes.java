package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class wtnotes extends AppCompatActivity {

    PDFView modwt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtnotes);

        modwt=(PDFView) findViewById(R.id.wt);

        modwt.fromAsset("wtnotes.pdf").load();


    }
}