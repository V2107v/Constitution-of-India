package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class XXI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_x_i);

        setTitle("Part XXI");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 369");
        arrayList.add("Article 370");
        arrayList.add("Article 371");
        arrayList.add("Article 371a");
        arrayList.add("Article 371b");
        arrayList.add("Article 371c");
        arrayList.add("Article 371d");
        arrayList.add("Article 371e");
        arrayList.add("Article 371f");
        arrayList.add("Article 371g");
        arrayList.add("Article 371h");
        arrayList.add("Article 371i");
        arrayList.add("Article 371j");
        arrayList.add("Article 372");
        arrayList.add("Article 372a");
        arrayList.add("Article 373");
        arrayList.add("Article 374");
        arrayList.add("Article 375");
        arrayList.add("Article 376");
        arrayList.add("Article 377");
        arrayList.add("Article 378");
        arrayList.add("Article 378a");
        arrayList.add("Article 379 to 391");
        arrayList.add("Article 392");
    }
}
