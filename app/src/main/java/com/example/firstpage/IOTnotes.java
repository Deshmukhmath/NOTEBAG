package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IOTnotes extends AppCompatActivity {

    PDFView modiot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iotnotes);

        modiot=(PDFView) findViewById(R.id.iot);

        modiot.fromAsset("iotnotes.pdf").load();
    }
}