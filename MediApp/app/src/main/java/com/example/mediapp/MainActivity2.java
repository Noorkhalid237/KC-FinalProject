package com.example.mediapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    private Button goNext;
    Button create;

    private TextView signIn;
    private EditText edName, edEmail, edPass;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        goNext = (Button) findViewById(R.id.log);
        goNext.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();

        signIn = (TextView) findViewById(R.id.signIn);
        signIn.setOnClickListener(this);

        create = (Button) findViewById(R.id.create);
        create.setOnClickListener(this);

        edName = (EditText) findViewById(R.id.username);
        edEmail = (EditText) findViewById(R.id.email);
        edPass = (EditText) findViewById(R.id.password);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.signIn:
                startActivity(new Intent(this,home_frag.class));
                break;
            case R.id.create:
                create();
                break;
            case R.id.log:
                startActivity(new Intent(this, Log_In.class));
                break;
        }

    }

    private void create() {
        String name = edName.getText().toString().trim();
        String email = edEmail.getText().toString().trim();
        String pass = edPass.getText().toString().trim();

        if (name.isEmpty()){
            edName.setError("Username is required!");
            edName.requestFocus();
            return;
        }

        if (email.isEmpty()){
            edEmail.setError("Email is required!");
            edEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            edEmail.setError("Please provide valid email!");
            edEmail.requestFocus();
            return;
        }

        if (pass.isEmpty()){
            edPass.setError("Password is required!");
            edPass.requestFocus();
            return;
        }

        if (pass.length() < 6){
            edPass.setError("Min password length should be 6 characters!");
            edPass.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){
                            User user = new User(name,email);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {

                                            if (task.isSuccessful()){
                                                Toast.makeText(MainActivity2.this, "User has signed in successfully!", Toast.LENGTH_LONG).show();
                                                create.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent n = new Intent(MainActivity2.this, MainActivity3.class);
                                                        startActivity(n);
                                                    }
                                                });
                                            }else {
                                                Toast.makeText(MainActivity2.this, "Failed to sign in! Try again!", Toast.LENGTH_LONG).show();
                                            }
                                        }
                                    });
                        }else {
                            Toast.makeText(MainActivity2.this, "Failed to sign in! Try again!", Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }


}