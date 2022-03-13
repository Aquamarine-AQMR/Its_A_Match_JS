package com.example.itsamatch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itsamatch.databinding.ActivityLoginBinding;
import com.example.itsamatch.ui.register.RegisterActivityOne;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    Button loginB;
    Button resetPassB;
    Button registerB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loginB = binding.loginButton;
        resetPassB = binding.forgotPasswordButton;
        registerB = binding.registerButton;

        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });

        resetPassB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToResetPass();
            }
        });

        registerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToRegister();
            }
        });
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivityToResetPass() {
        Intent switchActivityIntent = new Intent(this, PasswordResetActivity.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivityToRegister() {
        Intent switchActivityIntent = new Intent(this, RegisterActivityOne.class);
        startActivity(switchActivityIntent);
    }
}
