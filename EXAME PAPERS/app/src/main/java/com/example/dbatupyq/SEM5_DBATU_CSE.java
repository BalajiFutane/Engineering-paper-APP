package com.example.dbatupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SEM5_DBATU_CSE extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5_dbatu_cse);


        button=findViewById(R.id.DBATU_CSE_2022);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SEM5_DBATU_CSE.this,SEM5_2022_CSE_DBATU.class);
                startActivity(intent);


            }
        });








    }
}