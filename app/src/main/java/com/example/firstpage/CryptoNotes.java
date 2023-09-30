package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CryptoNotes extends AppCompatActivity {

    PDFView modcry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_notes);

        modcry=(PDFView) findViewById(R.id.cry);

        modcry.fromAsset("wtnotes.pdf").load();
    }
}