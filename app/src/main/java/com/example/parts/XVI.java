package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class XVI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_v_i);

        setTitle("Part XVI");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 330");
        arrayList.add("Article 331");
        arrayList.add("Article 332");
        arrayList.add("Article 333");
        arrayList.add("Article 334");
        arrayList.add("Article 335");
        arrayList.add("Article 336");
        arrayList.add("Article 337");
        arrayList.add("Article 338");
        arrayList.add("Article 338a");
        arrayList.add("Article 339");
        arrayList.add("Article 340");
        arrayList.add("Article 341");
        arrayList.add("Article 342");

    }
}
