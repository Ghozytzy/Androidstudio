package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private EditText etUsername, etEmail, etPhone, etPassword, etConfirmPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inisialisasi komponen
        etUsername = findViewById(R.id.et_username);
        etEmail = findViewById(R.id.et_email);
        etPhone = findViewById(R.id.et_phone);
        etPassword = findViewById(R.id.et_password);
        etConfirmPassword = findViewById(R.id.et_confirm_password);
        btnRegister = findViewById(R.id.btn_register);

        // Set klik listener pada tombol register
        btnRegister.setOnClickListener(v -> {
            String username = etUsername.getText().toString();
            String email = etEmail.getText().toString();
            String phone = etPhone.getText().toString();
            String password = etPassword.getText().toString();
            String confirmPassword = etConfirmPassword.getText().toString();

            // Validasi input
            if (TextUtils.isEmpty(username)) {
                Toast.makeText(Register.this, "Username tidak boleh kosong", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(Register.this, "Email tidak boleh kosong", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(phone)) {
                Toast.makeText(Register.this, "Nomor telepon tidak boleh kosong", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!phone.matches("^\\d{10,13}$")) {
                Toast.makeText(Register.this, "Nomor telepon harus 10-13 digit angka", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(password)) {
                Toast.makeText(Register.this, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                return;
            }

            if (password.length() < 8) {
                Toast.makeText(Register.this, "Password harus minimal 8 karakter", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(confirmPassword)) {
                Toast.makeText(Register.this, "Konfirmasi password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                return;
            }


            if (!password.equals(confirmPassword)) {
                Toast.makeText(Register.this, "Password dan Konfirmasi Password tidak cocok", Toast.LENGTH_SHORT).show();
                return;
            }

            // Jika validasi berhasil
            Intent login = new Intent(Register.this, MainActivity.class);
            startActivity(login);
            Toast.makeText(Register.this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();

            // Anda bisa menambahkan logika lain, seperti menyimpan data ke database
        });
    }
}
