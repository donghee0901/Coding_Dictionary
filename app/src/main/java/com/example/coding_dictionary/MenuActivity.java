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
    static int count = 0;
    private ArrayList<InformationActivity> test = new ArrayList<InformationActivity>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = new Intent(this.getIntent());
        String Name = intent.getStringExtra("name");
        TextView nameView = (TextView) findViewById(R.id.main_name);
        nameView.setText(Name);

        insert("주제 1","설명 1");
        insert("주제 2","설명 2");
        insert("주제 3","설명 3");
        insert("주제 4","설명 4");
        insert("주제 5","설명 5");

        AdapterActivity adapter = new AdapterActivity(getApplicationContext(), R.layout.information_item, test);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
    void insert(String name, String print)
    {
        test.add(new InformationActivity(name, print));
        count++;
        return;
    }
}
