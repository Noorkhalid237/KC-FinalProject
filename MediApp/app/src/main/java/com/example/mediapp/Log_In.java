package com.example.mediapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Log_In extends AppCompatActivity implements View.OnClickListener {

    private Button newaacc;

    private EditText edEemail, edPpass;
    private Button login;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        newaacc = (Button) findViewById(R.id.newacc);
        newaacc.setOnClickListener(this);

        login = (Button) findViewById(R.id.logL);
        login.setOnClickListener(this);

        edEemail = (EditText) findViewById(R.id.emailLog);
        edPpass = (EditText) findViewById(R.id.passLog);

        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.newacc:
                startActivity(new Intent(this, MainActivity2.class));
                break;
            case R.id.logL:
                userLogin();
                break;
        }

    }

    private void userLogin() {
        String email = edEemail.getText().toString().trim();
        String password = edPpass.getText().toString().trim();

        if (email.isEmpty()){
            edEemail.setError("Email is required!");
            edEemail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            edEemail.setError("Please enter a valid email!");
            edEemail.requestFocus();
            return;
        }

        if (password.isEmpty()){
            edPpass.setError("Password is required!");
            edPpass.requestFocus();
            return;
        }

        if (password.length() < 6){
            edPpass.setError("Min password length should be 6 characters!");
            edPpass.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){
                    startActivity(new Intent(Log_In.this, MainActivity3.class));
                }else {
                    Toast.makeText(Log_In.this, "Faild to log in! Please check your informations", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}