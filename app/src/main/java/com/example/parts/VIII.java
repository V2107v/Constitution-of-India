package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class VIII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_i_i_i);

        setTitle("Part VIII");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 239");
        arrayList.add("Article 239a");
        arrayList.add("Article 239aa");
        arrayList.add("Article 239ab");
        arrayList.add("Article 239b");
        arrayList.add("Article 240");
        arrayList.add("Article 241");
        arrayList.add("Article 242");
    }
}
