package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class XIX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_i_x);

        setTitle("Part XIX");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 361");
        arrayList.add("Article 361a");
        arrayList.add("Article 361b");
        arrayList.add("Article 362");
        arrayList.add("Article 363");
        arrayList.add("Article 363a");
        arrayList.add("Article 364");
        arrayList.add("Article 365");
        arrayList.add("Article 366");
        arrayList.add("Article 367");
    }
}
