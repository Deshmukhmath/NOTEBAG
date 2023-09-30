package com.example.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {

    Button sub,sub2,sub3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        sub=findViewById(R.id.button2);
        sub2=findViewById(R.id.button4);
        sub3=findViewById(R.id.button3);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(page2.this, Subjects.class);
                startActivity(intent);

            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(page2.this, Subjects2.class);
                startActivity(i2);

            }
        });

        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(page2.this, Subject3.class);
                startActivity(i3);

            }
        });
    }
}
