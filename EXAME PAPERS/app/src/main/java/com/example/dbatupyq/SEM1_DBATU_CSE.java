package com.example.dbatupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SEM1_DBATU_CSE extends AppCompatActivity {


    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_dbatu_cse);

        button=findViewById(R.id.DBATU_CSE_2022);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SEM1_DBATU_CSE.this, DBATU_2022_PAPERS.class);
                startActivity(intent);
            }
        });


    }
}