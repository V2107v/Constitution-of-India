package com.example.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.constitutionofindia.R;

import java.util.ArrayList;

public class III extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_i_i);

        setTitle("Part III");

        ListView listView = findViewById(R.id.partsListView);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        arrayList.add("Article 012");
        arrayList.add("Article 013");
        arrayList.add("Article 014");
        arrayList.add("Article 015");
        arrayList.add("Article 016");
        arrayList.add("Article 017");
        arrayList.add("Article 018");
        arrayList.add("Article 019");
        arrayList.add("Article 020");
        arrayList.add("Article 021");
        arrayList.add("Article 021a");
        arrayList.add("Article 022");
        arrayList.add("Article 023");
        arrayList.add("Article 024");
        arrayList.add("Article 025");
        arrayList.add("Article 026");
        arrayList.add("Article 027");
        arrayList.add("Article 028");
        arrayList.add("Article 029");
        arrayList.add("Article 030");
        arrayList.add("Article 031");
        arrayList.add("Article 031a");
        arrayList.add("Article 031b");
        arrayList.add("Article 031c");
        arrayList.add("Article 031d");
        arrayList.add("Article 032");
        arrayList.add("Article 032a");
        arrayList.add("Article 033");
        arrayList.add("Article 034");
        arrayList.add("Article 035");

    }
}
