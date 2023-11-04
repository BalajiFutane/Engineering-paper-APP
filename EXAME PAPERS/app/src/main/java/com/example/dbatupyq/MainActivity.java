package com.example.dbatupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    public Button login, reg;
    private EditText email, password;
    ProgressDialog progressDialog;
   private FirebaseAuth auth;
//    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        login = findViewById(R.id.button);
        reg = findViewById(R.id.create_ac);
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.button);
        auth= FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_email = email.getText().toString();
                String text_password = password.getText().toString();

                if (TextUtils.isEmpty(text_email) || TextUtils.isEmpty(text_password)) {

                    Toast.makeText(MainActivity.this, "Empty filed", Toast.LENGTH_SHORT).show();


                } else if (text_password.length() < 6) {

                    Toast.makeText(MainActivity.this, "password is too short", Toast.LENGTH_SHORT).show();

                } else {

                    loginUser(text_email, text_password);

                }


            }
        });


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, create_account.class);
                startActivity(intent);
                finish();

            }
        });



    }

    private void loginUser(String email, String password) {

        auth.signInWithEmailAndPassword(email, password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {

            @Override


            public void onSuccess(AuthResult authResult) {

                Toast.makeText(MainActivity.this, "Login sucessful", Toast.LENGTH_SHORT).show();
                progressDialog.setMessage("wait while registering ");
                progressDialog.setTitle("Registration");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}