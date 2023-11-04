package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity_All_university_Names extends AppCompatActivity {


    Button Dbatu_Main;
    ProgressDialog progressDialog;
    Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_all_university_names);

        Dbatu_Main=findViewById(R.id.Dbatu_unversity_main);


        Dbatu_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_All_university_Names.this,Dbatu_university_Main.class);
                startActivity(intent);
            }
        });
        logout=findViewById(R.id.Log_out);
        progressDialog=new ProgressDialog(this);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(MainActivity_All_university_Names.this, "Log out", Toast.LENGTH_SHORT).show();
                progressDialog.setMessage("Logout");
                progressDialog.setTitle("Logout");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();
                Intent intent=new Intent(MainActivity_All_university_Names.this,Login_Activity.class);
                startActivity(intent);

            }
        });


    }
}