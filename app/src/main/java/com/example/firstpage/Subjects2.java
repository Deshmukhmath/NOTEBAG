package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Subjects2 extends AppCompatActivity {

    Button aimlno,bdano,uidno,crypsno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects2);

        aimlno=findViewById(R.id.button8);
        bdano=findViewById(R.id.button9);
        uidno=findViewById(R.id.button10);
        crypsno=findViewById(R.id.button11);

        aimlno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Subjects2.this, AIMLnotes.class);
                startActivity(intent);

            }
        });

        bdano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Subjects2.this, BDAnotes.class);
                startActivity(i2);

            }
        });

        uidno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Subjects2.this, UIDnotes.class);
                startActivity(i3);

            }
        });

        crypsno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Subjects2.this, CryptoNotes.class);
                startActivity(i4);

            }
        });
    }
}