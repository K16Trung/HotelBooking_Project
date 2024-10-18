package com.fpt.hotelbooking.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.fpt.hotelbooking.R;

public class LoginActivity extends AppCompatActivity {
    String email, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
}
