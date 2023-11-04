package com.example.dbatupyq;

import androidx.annotation.NonNull;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class create_account extends AppCompatActivity {


    public Button register;
    private EditText email,password;
    ProgressDialog progressDialog;
    private FirebaseAuth auth;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        register=findViewById(R.id.reg);
        email=findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextTextPassword);

        auth= FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_email=email.getText().toString();
                String text_password=password.getText().toString();


                if (TextUtils.isEmpty(text_email) || TextUtils.isEmpty(text_password)){

                    Toast.makeText(create_account.this, "Empty Credentials", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();


                }

                else if(text_password.length()<6){

                    Toast.makeText(create_account.this, "password is too short", Toast.LENGTH_SHORT).show();

                }else {

                    RegisterUser(text_email,text_password);

                }

            }
        });

    }
    private void   RegisterUser(String email, String password) {

        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(create_account.this ,new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){

                    Toast.makeText(create_account.this, "Registration is sucessful", Toast.LENGTH_SHORT).show();
                    progressDialog.setMessage("plz wait WHile registering ");
                    progressDialog.setTitle("Registration");
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.show();
                    Intent intent=new Intent(create_account.this,HomeActivity.class);
                    startActivity(intent);
                    finish();

                }else {

                    Toast.makeText(create_account.this, "REgistration falied", Toast.LENGTH_SHORT).show();
                }

            }
        });



}
}