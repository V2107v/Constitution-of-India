package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class VI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_i);

        setTitle("Part VI");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Chapter 1");
        arrayList.add("Chapter 2");
        arrayList.add("Chapter 3");
        arrayList.add("Chapter 4");
        arrayList.add("Chapter 5");
        arrayList.add("Chapter 6");
    }
}
