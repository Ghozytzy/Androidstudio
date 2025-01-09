package com.example.myapplication4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Forgetpassword extends AppCompatActivity {

    private EditText editTextEmail;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        // Initialize UI elements
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        // Set a click listener for the submit button
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmail.getText().toString().trim();

                if (!email.isEmpty()) {
                    // Show notification
                    Toast.makeText(Forgetpassword.this, "Dikirim ke email Anda", Toast.LENGTH_SHORT).show();
                } else {
                    // Show error if email is empty
                    Toast.makeText(Forgetpassword.this, "Silakan masukkan email terlebih dahulu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
