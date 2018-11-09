package com.example.admin.ctrack_parentapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private EditText regemail,regpass,regconpass;
    private String email,pass,conpass;
    private FirebaseAuth mAuth;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit;
        mAuth = FirebaseAuth.getInstance();

        //progressBar = findViewById(R.id.progressBar2);
        regemail = findViewById(R.id.regemail);
        regpass = findViewById(R.id.regpass);
        regconpass = findViewById(R.id.regconpass);
        submit = findViewById(R.id.submitbtn);

        sharedPreferences = getSharedPreferences("UserLoginDetails",MODE_PRIVATE);

        editor = sharedPreferences.edit();

        submit.setOnClickListener(new View.OnClickListener() {
    }

    // for testing puyrposses
}
