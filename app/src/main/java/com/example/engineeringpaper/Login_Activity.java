package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

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

public class Login_Activity extends AppCompatActivity {

    Button Login,Createaccount;
    private EditText email, password;
    ProgressDialog progressDialog;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login=findViewById(R.id.Log_in);
        Createaccount=findViewById(R.id.Create_New_Account);

        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);

        auth= FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_email = email.getText().toString();
                String text_password = password.getText().toString();

                if (TextUtils.isEmpty(text_email) || TextUtils.isEmpty(text_password)) {

                    Toast.makeText(Login_Activity.this, "Empty filed", Toast.LENGTH_SHORT).show();


                } else if (text_password.length() < 6) {

                    Toast.makeText(Login_Activity.this, "password is too short", Toast.LENGTH_SHORT).show();

                } else {

                    loginUser(text_email, text_password);

                }


            }
        });


        Createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this, Create_New_Account_Activity.class);
                startActivity(intent);
                finish();

            }
        });

    }

    private void loginUser(String email, String password) {

        auth.signInWithEmailAndPassword(email, password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {

            @Override


            public void onSuccess(AuthResult authResult) {

                Toast.makeText(Login_Activity.this, "Login sucessful", Toast.LENGTH_SHORT).show();
                progressDialog.setMessage("wait while registering ");
                progressDialog.setTitle("Registration");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();
                Intent intent = new Intent(Login_Activity.this, MainActivity_All_university_Names.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
