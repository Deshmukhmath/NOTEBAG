package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class smsnotes extends AppCompatActivity {

    PDFView modsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsnotes);

        modsms=(PDFView) findViewById(R.id.sms);

        modsms.fromAsset("wtnotes.pdf").load();


    }
}