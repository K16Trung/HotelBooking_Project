package com.fpt.hotelbooking.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.fpt.hotelbooking.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.up).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RegisterActivity.class)));
        findViewById(R.id.in).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LoginActivity.class)));
    }
}