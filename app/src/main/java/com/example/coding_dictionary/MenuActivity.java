package com.example.coding_dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    Button hide_button1;
    Button hide_button2;
    Button hide_button3;
    Button hide_button4;
    private ArrayList<InformationActivity> test = new ArrayList<InformationActivity>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = new Intent(this.getIntent());
        String Name = intent.getStringExtra("name");
        TextView nameView = (TextView) findViewById(R.id.main_name);
        nameView.setText(Name);

        test.add(new InformationActivity("주제 1", "설명 1"));
        test.add(new InformationActivity("주제 2", "설명 2"));
        test.add(new InformationActivity("주제 3", "설명 3"));
        test.add(new InformationActivity("주제 4", "설명 4"));
        test.add(new InformationActivity("주제 5", "설명 5"));

        AdapterActivity adapter = new AdapterActivity(getApplicationContext(), R.layout.information_item, test);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        /*super.onCreate(savedInstanceState);
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
        });*/
    }
}
