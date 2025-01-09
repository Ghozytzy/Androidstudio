package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin, buttonBuat, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonBuat = findViewById(R.id.buttonBuat);
        buttonReset = findViewById(R.id.buttonReset);


        // Set a click listener for the login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve entered username and password
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Implement authentication logic here
                if (username.equals("Admin@admin.com") && password.equals("123")) {
                    // Successful login
                    Intent login = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(login);
                    Toast.makeText(MainActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                } else {
                    // Failed login
                    Toast.makeText(MainActivity.this, "Maaf ada yang salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set a click listener for the register button
        buttonBuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to another activity (Register)
                Intent register = new Intent(MainActivity.this, Register.class);
                startActivity(register);
            }
    });
        // Set a click listener for the reset button
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to another activity (Forgetpassword)
                Intent forget = new Intent(MainActivity.this, Forgetpassword.class);
                startActivity(forget);
            }
        });
    }
}
