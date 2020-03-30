package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class IXB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_x_b);

        setTitle("Part IX [B]");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 243zh");
        arrayList.add("Article 243zi");
        arrayList.add("Article 243zj");
        arrayList.add("Article 243zk");
        arrayList.add("Article 243zl");
        arrayList.add("Article 243zm");
        arrayList.add("Article 243zn");
        arrayList.add("Article 243zo");
        arrayList.add("Article 243zp");
        arrayList.add("Article 243zq");
        arrayList.add("Article 243zr");
        arrayList.add("Article 243zs");
        arrayList.add("Article 243zt");
    }
}
