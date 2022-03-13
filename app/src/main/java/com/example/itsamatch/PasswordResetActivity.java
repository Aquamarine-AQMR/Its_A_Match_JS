package com.example.itsamatch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itsamatch.databinding.ActivityPasswordresetBinding;

public class PasswordResetActivity extends AppCompatActivity {

    private ActivityPasswordresetBinding binding;
    Button backB;
    Button sendResetEmailB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPasswordresetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        backB = binding.RPBack;
        sendResetEmailB = binding.RPSendEmail;


        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });

        sendResetEmailB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(switchActivityIntent);
    }
}
