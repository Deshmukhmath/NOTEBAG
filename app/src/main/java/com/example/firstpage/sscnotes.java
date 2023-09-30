package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sscnotes extends AppCompatActivity {

    PDFView modssc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sscnotes);

        modssc=(PDFView) findViewById(R.id.notessc);

        modssc.fromAsset("Module-1.pdf").load();



    }
}