package com.example.itsamatch.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itsamatch.databinding.ActivityRegisterTwoBinding;

public class RegisterActivityTwo extends AppCompatActivity {

    private ActivityRegisterTwoBinding binding;
    Button backB;
    Button continueB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterTwoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        backB = binding.r2back;
        continueB = binding.r2continue;

        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToPrevious();
            }
        });

        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToNext();
            }
        });

    }

    private void switchActivityToPrevious() {
        Intent switchActivityIntent = new Intent(this, RegisterActivityOne.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivityToNext() {
        Intent switchActivityIntent = new Intent(this, RegisterActivityThree.class);
        startActivity(switchActivityIntent);
    }
}
