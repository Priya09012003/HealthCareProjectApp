package com.example.healthcareprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    EditText username,password;
    Button btnlogin;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        username=findViewById(R.id.RegEnterUserName);
        btnlogin=findViewById(R.id.RegisterBtn);
        password=findViewById(R.id.RegEnterPassword);
        textView=findViewById(R.id.AlreadyHaveAccount);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* if(username.length()==0 ||password.length()==0){
                    Toast.makeText(loginActivity.this, "please enter all details", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(loginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                }*/
                startActivity(new Intent(loginActivity.this,Home.class));
            }

        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this, RegistrationActivity.class));
            }
        });
    }
}