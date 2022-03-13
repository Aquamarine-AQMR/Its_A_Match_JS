package com.example.itsamatch.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itsamatch.LoginActivity;
import com.example.itsamatch.R;
import com.example.itsamatch.databinding.ActivityRegisterFourBinding;

public class RegisterActivityFour extends AppCompatActivity {

    private ActivityRegisterFourBinding binding;
    Button backB;
    Button nextB;
    WebView termsDisplay;
    String htmlAsString;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterFourBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        backB = binding.r4back;
        nextB = binding.r4next;
        nextB.setEnabled(false);

        termsDisplay = binding.r4TermsDisplay;
        htmlAsString = getString(R.string.termsAndConditions);
        checkBox = binding.r4checkBox;

        termsDisplay.loadDataWithBaseURL(null, htmlAsString, "text/html", "utf-8", null);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    nextB.setEnabled(true);
                } else {
                    nextB.setEnabled(false);
                }
            }
        });


        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToLogin();
            }
        });

        nextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivityToNext();
            }
        });

    }

    private void switchActivityToLogin() {
        Intent switchActivityIntent = new Intent(this, RegisterActivityOne.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivityToNext() {
        Intent switchActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(switchActivityIntent);
    }
}
