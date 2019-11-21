package com.example.coding_dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button android_button;
    private Button c_lang_button;
    private Button python_button;
    private Button java_button;
    private Button test_button;
    private View.OnClickListener android_listener;
    private View.OnClickListener c_lang_listener;
    private View.OnClickListener python_listener;
    private View.OnClickListener java_listener;
    private View.OnClickListener test_listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android_button = (Button) findViewById(R.id.android);
        c_lang_button = (Button) findViewById(R.id.c_lang);
        python_button = (Button) findViewById(R.id.python);
        java_button = (Button) findViewById(R.id.java);
        test_button = (Button) findViewById(R.id.aabc);


        android_listener = new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("name","Android");
                startActivity(intent);
            }
        };
        c_lang_listener = new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("name","C언어");
                startActivity(intent);
            }
        };
        python_listener = new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("name","Python");
                startActivity(intent);
            }
        };
        java_listener = new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("name","Java");
                startActivity(intent);
            }
        };
        test_listener = new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("name","뭐하지");
                startActivity(intent);
            }
        };

        android_button.setOnClickListener(android_listener);
        c_lang_button.setOnClickListener(c_lang_listener);
        python_button.setOnClickListener(python_listener);
        java_button.setOnClickListener(java_listener);
        test_button.setOnClickListener(test_listener);

    }
}
