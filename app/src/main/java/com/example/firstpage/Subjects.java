package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Subjects extends AppCompatActivity {

    Button sscno,cgvno,wtno,smsno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        sscno=findViewById(R.id.button8ssc);
        cgvno=findViewById(R.id.button7);
        wtno=findViewById(R.id.button6);
        smsno=findViewById(R.id.button5);
        sscno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Subjects.this, sscnotes.class);
                startActivity(intent);

            }
        });

        cgvno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Subjects.this, cgvnotes.class);
                startActivity(i2);

            }
        });

        wtno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Subjects.this, wtnotes.class);
                startActivity(i3);

            }
        });

        smsno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Subjects.this, smsnotes.class);
                startActivity(i4);

            }
        });


    }
}