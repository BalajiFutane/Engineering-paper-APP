package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dbatu_CSE_Years extends AppCompatActivity {

    Button Third_year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbatu_cse_years);

        Third_year=findViewById(R.id.TY_CSE);
        Third_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dbatu_CSE_Years.this,TY_Year_Cse_Dbatu.class);
            startActivity(intent);
            }
        });
    }
}