package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class IX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_x);

        setTitle("Part IX");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 243");
        arrayList.add("Article 243a");
        arrayList.add("Article 243b");
        arrayList.add("Article 243c");
        arrayList.add("Article 243d");
        arrayList.add("Article 243e");
        arrayList.add("Article 243f");
        arrayList.add("Article 243g");
        arrayList.add("Article 243h");
        arrayList.add("Article 243i");
        arrayList.add("Article 243j");
        arrayList.add("Article 243k");
        arrayList.add("Article 243l");
        arrayList.add("Article 243m");
        arrayList.add("Article 243n");
        arrayList.add("Article 243o");



    }
}
