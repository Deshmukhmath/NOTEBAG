package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AIMLnotes extends AppCompatActivity {

    PDFView modaiml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aimlnotes);

        modaiml=(PDFView) findViewById(R.id.aiml);

        modaiml.fromAsset("amlnotes.pdf").load();
    }
}