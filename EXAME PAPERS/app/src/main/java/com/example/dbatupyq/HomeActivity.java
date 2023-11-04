package com.example.dbatupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {


    public Button button,logout;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        button=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DBATU.class);
                startActivity(intent);
                finish();

            }
        });
        logout=findViewById(R.id.button);
        progressDialog=new ProgressDialog(this);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(HomeActivity.this, "Log out", Toast.LENGTH_SHORT).show();
                progressDialog.setMessage("Logout");
                progressDialog.setTitle("Logout");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();
                Intent intent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });





    }
}