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
        String[][] content = new String[100][100];
        content[0][0] = "안드 1";
        content[1][0] = "안드 2";
        content[2][0] = "안드 3";
        content[3][0] = "안드 4";
        for (int i = 0; i < content.length; i++) {
            insert(content[i][0], content[i][1]);
        }

        AdapterActivity adapter = new AdapterActivity(getApplicationContext(), R.layout.information_item, test);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

    void insert(String name, String print) {
        test.add(new InformationActivity(name, print));
        count++;
        return;
    }
}
