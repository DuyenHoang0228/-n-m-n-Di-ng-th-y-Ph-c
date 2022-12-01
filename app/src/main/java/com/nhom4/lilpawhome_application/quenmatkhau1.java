package com.nhom4.lilpawhome_application;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.nhom4.lilpawhome_application.databinding.ActivityQuenmatkhau1Binding;

public class quenmatkhau1 extends AppCompatActivity {

    ActivityQuenmatkhau1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuenmatkhau1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addEvent();
    }

    private void addEvent() {
        binding.imvQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.btnTieptheo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OTPVetification_Dialog_Qmk otpVetification_dialog_qmk= new OTPVetification_Dialog_Qmk(quenmatkhau1.this,binding.edtNhapemailhoacsdt.getText().toString());
                otpVetification_dialog_qmk.setCancelable(false);
                otpVetification_dialog_qmk.show();
                    }
                });
    }
}