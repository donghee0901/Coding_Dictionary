package com.example.coding_dictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterActivity extends BaseAdapter {
    private LayoutInflater inf;
    private ArrayList<InformationActivity> adapter;
    private int layout;

    public AdapterActivity(Context context, int layout, ArrayList adapter) {
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.adapter = adapter;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return adapter.size();
    }

    @Override
    public Object getItem(int pos) {
        return adapter.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf.inflate(layout, null);
        }

        TextView name = (TextView) convertView.findViewById(R.id.name);
        final TextView print = (TextView) convertView.findViewById(R.id.print);
        Button button = (Button) convertView.findViewById(R.id.name);

        final InformationActivity Adapter = adapter.get(pos);
        name.setText(Adapter.getName());
        print.setText(Adapter.getPrint());
        print.setVisibility(View.GONE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(print.getVisibility() == View.VISIBLE) {
                    Adapter.setisOpen(false);
                    print.setVisibility(View.GONE);
                }
                else{
                    Adapter.setisOpen(true);
                    print.setVisibility(View.VISIBLE);
                }
            }
        });

        return convertView;

    }

}
