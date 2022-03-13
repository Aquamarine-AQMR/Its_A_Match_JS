package com.example.itsamatch.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itsamatch.databinding.ActivityRegisterThreeBinding;

public class RegisterActivityThree extends AppCompatActivity {

    private ActivityRegisterThreeBinding binding;
    Button backB;
    Button confirmB;
    TextView nameDisplay;
    TextView phoneDisplay;
    TextView emailDisplay;
    TextView usernameDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterThreeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        backB = binding.r3back;
        confirmB = binding.r3confirm;
        nameDisplay = binding.r3NameDisplay;
        phoneDisplay = binding.r3PhoneNumberDisplay;
        emailDisplay = binding.r3EmailDisplay;
        usernameDisplay = binding.r3UsernameDisplay;

        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToPrevious();
            }
        });

        confirmB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToNext();
            }
        });


    }

    private void switchActivityToPrevious() {
        Intent switchActivityIntent = new Intent(this, RegisterActivityTwo.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivityToNext() {
        Intent switchActivityIntent = new Intent(this, RegisterActivityFour.class);
        startActivity(switchActivityIntent);
    }
}
