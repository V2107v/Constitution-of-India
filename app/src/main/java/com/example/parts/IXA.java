package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class IXA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_x2);

        setTitle("Part IX [A]");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 243p");
        arrayList.add("Article 243q");
        arrayList.add("Article 243r");
        arrayList.add("Article 243s");
        arrayList.add("Article 243t");
        arrayList.add("Article 243u");
        arrayList.add("Article 243v");
        arrayList.add("Article 243w");
        arrayList.add("Article 243x");
        arrayList.add("Article 243y");
        arrayList.add("Article 243z");
        arrayList.add("Article 243za");
        arrayList.add("Article 243zb");
        arrayList.add("Article 243zc");
        arrayList.add("Article 243zd");
        arrayList.add("Article 243ze");
        arrayList.add("Article 243zf");
        arrayList.add("Article 243zg");

    }
}
