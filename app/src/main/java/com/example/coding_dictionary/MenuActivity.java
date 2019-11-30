package com.example.coding_dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    Button hide_button1;
    Button hide_button2;
    Button hide_button3;
    Button hide_button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = new Intent(this.getIntent());
        String Name = intent.getStringExtra("name");

        final TextView textView1 = (TextView) findViewById(R.id.hide1);
        final TextView textView2 = (TextView) findViewById(R.id.hide2);
        final TextView textView3 = (TextView) findViewById(R.id.hide3);
        final TextView textView4 = (TextView) findViewById(R.id.hide4);

        TextView nameView = (TextView) findViewById(R.id.main_name);
        nameView.setText(Name);

        findViewById(R.id.hide1).setVisibility(View.GONE);
        findViewById(R.id.hide2).setVisibility(View.GONE);
        findViewById(R.id.hide3).setVisibility(View.GONE);
        findViewById(R.id.hide4).setVisibility(View.GONE);

        hide_button1 = (Button) findViewById(R.id.a1);
        hide_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getVisibility() == View.VISIBLE) {
                    textView1.setVisibility(View.GONE);
                }
                else{
                    textView1.setVisibility(View.VISIBLE);
                }

            }
        });

        hide_button2 = (Button) findViewById(R.id.a2);
        hide_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView2.getVisibility() == View.VISIBLE) {
                    textView2.setVisibility(View.GONE);
                }
                else{
                    textView2.setVisibility(View.VISIBLE);
                }

            }
        });

        hide_button3 = (Button) findViewById(R.id.a3);
        hide_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView3.getVisibility() == View.VISIBLE) {
                    textView3.setVisibility(View.GONE);
                }
                else{
                    textView3.setVisibility(View.VISIBLE);
                }

            }
        });

        hide_button4 = (Button) findViewById(R.id.a4);
        hide_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView4.getVisibility() == View.VISIBLE) {
                    textView4.setVisibility(View.GONE);
                }
                else{
                    textView4.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}
