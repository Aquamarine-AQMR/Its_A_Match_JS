package com.example.itsamatch.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itsamatch.LoginActivity;
import com.example.itsamatch.databinding.ActivityRegisterOneBinding;

public class RegisterActivityOne extends AppCompatActivity {

    private ActivityRegisterOneBinding binding;
    Button backB;
    Button continueB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterOneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        backB = binding.r1Back;
        continueB = binding.r1Continue;

        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToLogin();
            }
        });

        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityContinue();
            }
        });


    }

    private void switchActivityToLogin() {
        Intent switchActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivityContinue() {
        Intent switchActivityIntent = new Intent(this, RegisterActivityTwo.class);
        startActivity(switchActivityIntent);
    }
}
