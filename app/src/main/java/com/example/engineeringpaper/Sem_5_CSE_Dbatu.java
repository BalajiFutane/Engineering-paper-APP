package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem_5_CSE_Dbatu extends AppCompatActivity {

    Button toc,nm,se,bc,dbms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5_cse_dbatu);

        toc=findViewById(R.id.TOC_2022);
        nm=findViewById(R.id.NM_TY);
        se=findViewById(R.id.SE_TY);
        bc=findViewById(R.id.BC_TY);
        dbms=findViewById(R.id.DBMS_TY);




        toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sem_5_CSE_Dbatu.this,TOC_CSE_DBATU.class);
                startActivity(intent);
            }
        });




        nm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sem_5_CSE_Dbatu.this,NM_CSE_DBATU.class);
                startActivity(intent);
            }
        });


        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sem_5_CSE_Dbatu.this,SE_CSE_DBATU.class);
                startActivity(intent);
            }
        });


        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sem_5_CSE_Dbatu.this,BC_CSE_DBATU.class);
                startActivity(intent);
            }
        });


        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sem_5_CSE_Dbatu.this,DB_CSE_DBATU.class);
                startActivity(intent);
            }
        });


    }
}