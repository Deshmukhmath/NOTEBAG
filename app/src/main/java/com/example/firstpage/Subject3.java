package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Subject3 extends AppCompatActivity {

    Button iotno,sanno,nosqlno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject3);

        iotno=findViewById(R.id.button12);
        sanno=findViewById(R.id.button14);
        nosqlno=findViewById(R.id.button13);

        iotno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Subject3.this, IOTnotes.class);
                startActivity(intent);

            }
        });

        sanno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Subject3.this, SANnotes.class);
                startActivity(i2);

            }
        });

        nosqlno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Subject3.this, SANnotes.class);
                startActivity(i3);

            }
        });
    }
}