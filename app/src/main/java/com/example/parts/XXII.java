package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class XXII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_x_i_i);

        setTitle("Part XXII");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 393");
        arrayList.add("Article 394");
        arrayList.add("Article 394a");
        arrayList.add("Article 395");
    }
}
