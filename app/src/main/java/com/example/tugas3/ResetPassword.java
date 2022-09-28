package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResetPassword extends AppCompatActivity {

    private TextView tvJudul, tvSubJudul, tvResetPassword, tvNewPasword, tvConfirmPassword;
    private EditText etEnterCode, etEnterNewPassword, etConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        tvJudul = findViewById(R.id.judul);
        tvSubJudul = findViewById(R.id.subJudul);
        tvResetPassword = findViewById(R.id.reset_password);
        etEnterCode = findViewById(R.id.enter_code);
        tvNewPasword = findViewById(R.id.new_password);
        etEnterNewPassword = findViewById(R.id.enter_new_password);
        tvConfirmPassword = findViewById(R.id.confirm_password);
        etConfirmPassword = findViewById(R.id.enter_cofirm_password);
    }
}