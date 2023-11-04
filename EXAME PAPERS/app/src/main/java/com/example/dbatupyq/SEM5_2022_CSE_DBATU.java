package com.example.dbatupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class SEM5_2022_CSE_DBATU extends AppCompatActivity {


    Button button ,dbms,nm,SE,B_communication;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem52022_cse_dbatu);
        button=findViewById(R.id.TOC_2022);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SEM5_2022_CSE_DBATU.this,TOC_2022_PAPER.class);
          startActivity(intent);

            }
        });

        dbms=findViewById(R.id.db);
        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SEM5_2022_CSE_DBATU.this,DatabaseTY.class);
                startActivity(intent);

            }
        });
        nm=findViewById(R.id.nmTy);
        nm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SEM5_2022_CSE_DBATU.this,nm_TY.class);
                startActivity(intent);

            }
        });
        SE=findViewById(R.id.se);
        SE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SEM5_2022_CSE_DBATU.this,SE_Ty.class);
                startActivity(intent);

            }
        });
        B_communication=findViewById(R.id.b_comm);
        B_communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SEM5_2022_CSE_DBATU.this,B_communication.class);
                startActivity(intent);

            }
        });

    }
}