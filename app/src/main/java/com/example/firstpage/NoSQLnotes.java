package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class NoSQLnotes extends AppCompatActivity {

    PDFView modnosql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_sqlnotes);

        modnosql=(PDFView) findViewById(R.id.nosql);

        modnosql.fromAsset("nosqlnotes.pdf").load();
    }
}