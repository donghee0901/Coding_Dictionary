package com.example.coding_dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<adapter_testActivity> test = new ArrayList<adapter_testActivity>();

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
        setContentView(R.layout.adapter_test);

        test.add(new adapter_testActivity("주제 1", "설명 1"));
        test.add(new adapter_testActivity("주제 2", "설명 2"));
        test.add(new adapter_testActivity("주제 3", "설명 3"));
        test.add(new adapter_testActivity("주제 4", "설명 4"));
        test.add(new adapter_testActivity("주제 5", "설명 5"));

        adapter_test3Activity adapter = new adapter_test3Activity(getApplicationContext(), R.layout.adapter_test, test);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        /*
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameView1 = (TextView) findViewById(R.id.name1);
        nameView1.setText("안드로이드 (Andriod)");
        TextView nameView2 = (TextView) findViewById(R.id.name2);
        nameView2.setText("C언어");
        TextView nameView3 = (TextView) findViewById(R.id.name3);
        nameView3.setText("파이썬 (Python)");
        TextView nameView4 = (TextView) findViewById(R.id.name4);
        nameView4.setText("자바 (Java)");
        TextView nameView5 = (TextView) findViewById(R.id.name5);
        nameView5.setText("뭐하지");

        android_button = (Button) findViewById(R.id.name1);
        c_lang_button = (Button) findViewById(R.id.name2);
        python_button = (Button) findViewById(R.id.name3);
        java_button = (Button) findViewById(R.id.name4);
        test_button = (Button) findViewById(R.id.name5);


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
*/
    }
}
