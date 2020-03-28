package com.example.constitutionofindia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.initialListView);


        arrayList.add("Preamble");
        arrayList.add("Parts");
        arrayList.add("Schedule");
        arrayList.add("Amendments");

        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "Preamble", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Preamble.class);
                    startActivity(intent);
                } else if(position == 1) {
                    Toast.makeText(MainActivity.this, "Parts", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(MainActivity.this, "Schedule", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Schedule.class);
                    startActivity(intent);
                } else if(position == 3) {
                    Toast.makeText(MainActivity.this, "Amendments", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Amendments.class);
                    startActivity(intent);
                }
            }
        });
    }
}
