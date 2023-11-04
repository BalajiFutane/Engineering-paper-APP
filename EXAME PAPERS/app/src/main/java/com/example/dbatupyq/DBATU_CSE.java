package com.example.dbatupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DBATU_CSE extends AppCompatActivity {


    Button button,button1 ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbatu_cse);
          button= findViewById(R.id.button100);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DBATU_CSE.this,SEM1_DBATU_CSE.class);
                startActivity(intent);

            }
        });

        button1= findViewById(R.id.DBATU_CSE);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DBATU_CSE.this,SEM5_DBATU_CSE.class);
                startActivity(intent);

            }
        });

    }
}