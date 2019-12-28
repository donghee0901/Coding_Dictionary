package com.example.coding_dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

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
        switch (Name){
            case "Android":
                content[0][0] = "안드 1";
                content[0][1] = "안드_내용 1";
                content[1][0] = "안드 2";
                content[1][1] = "안드_내용 2";
                content[2][0] = "안드 3";
                content[2][1] = "안드_내용 3";
                content[3][0] = "안드 4";
                content[3][1] = "안드_내용 4";
                break;
            case "C언어":
                content[0][0] = "c 1";
                content[0][1] = "c_내용 1";
                content[1][0] = "c 2";
                content[1][1] = "c_내용 2";
                content[2][0] = "c 3";
                content[2][1] = "c_내용 3";
                content[3][0] = "c 4";
                content[3][1] = "c_내용 4";
                break;
            case "Python":
                content[0][0] = "파이 1";
                content[0][1] = "파이_내용 1";
                content[1][0] = "파이 2";
                content[1][1] = "파이_내용 2";
                content[2][0] = "파이 3";
                content[2][1] = "파이_내용 3";
                content[3][0] = "파이 4";
                content[3][1] = "파이_내용 4";
                break;
            case "Java":
                content[0][0] = "자바 1";
                content[0][1] = "자바_내용 1";
                content[1][0] = "자바 2";
                content[1][1] = "자바_내용 2";
                content[2][0] = "자바 3";
                content[2][1] = "자바_내용 3";
                content[3][0] = "자바 4";
                content[3][1] = "자바_내용 4";
                break;
        }


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
