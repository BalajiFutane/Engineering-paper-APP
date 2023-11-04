package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TY_Year_Cse_Dbatu extends AppCompatActivity {

    Button sem5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty_year_cse_dbatu);

        sem5=findViewById(R.id.Semister_5);


        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TY_Year_Cse_Dbatu.this,Sem_5_CSE_Dbatu.class);
                startActivity(intent);
            }
        });
    }
}