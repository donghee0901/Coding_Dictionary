package com.example.coding_dictionary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class adapter_test2Acivity extends AppCompatActivity {
    private ArrayList<adapter_testActivity> test = new ArrayList<adapter_testActivity>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_test);;

        test.add(new adapter_testActivity("주제 1", "설명 1"));
        test.add(new adapter_testActivity("주제 2", "설명 2"));
        test.add(new adapter_testActivity("주제 3", "설명 3"));
        test.add(new adapter_testActivity("주제 4", "설명 4"));
        test.add(new adapter_testActivity("주제 5", "설명 5"));

        adapter_test3Activity adapter = new adapter_test3Activity(getApplicationContext(), R.layout.adapter_test, test);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
