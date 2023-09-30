package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class UIDnotes extends AppCompatActivity {

    PDFView moduid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uidnotes);

        moduid=(PDFView) findViewById(R.id.uid);

        moduid.fromAsset("uinotes.pdf").load();
    }
}