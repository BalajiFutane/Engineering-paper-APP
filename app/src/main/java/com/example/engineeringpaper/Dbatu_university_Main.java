package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dbatu_university_Main extends AppCompatActivity {

    Button Cse_Dbatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbatu_university_main);



        Cse_Dbatu=findViewById(R.id.Branch_Cse);


        Cse_Dbatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dbatu_university_Main.this,Dbatu_CSE_Years.class);
                startActivity(intent);
            }
        });
    }
}