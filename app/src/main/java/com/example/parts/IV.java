package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class IV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_v);

        setTitle("Part IV");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 036");
        arrayList.add("Article 037");
        arrayList.add("Article 038");
        arrayList.add("Article 039");
        arrayList.add("Article 039a");
        arrayList.add("Article 040");
        arrayList.add("Article 041");
        arrayList.add("Article 042");
        arrayList.add("Article 043");
        arrayList.add("Article 043a");
        arrayList.add("Article 043b");
        arrayList.add("Article 044");
        arrayList.add("Article 045");
        arrayList.add("Article 046");
        arrayList.add("Article 047");
        arrayList.add("Article 048");
        arrayList.add("Article 048a");
        arrayList.add("Article 049");
        arrayList.add("Article 050");
        arrayList.add("Article 051");
    }
}
