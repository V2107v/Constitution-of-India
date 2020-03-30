package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class XVIII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_v_i_i_i);

        setTitle("Part XVIII");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 352");
        arrayList.add("Article 353");
        arrayList.add("Article 354");
        arrayList.add("Article 355");
        arrayList.add("Article 356");
        arrayList.add("Article 357");
        arrayList.add("Article 358");
        arrayList.add("Article 359");
        arrayList.add("Article 359a");
        arrayList.add("Article 360");

    }
}
