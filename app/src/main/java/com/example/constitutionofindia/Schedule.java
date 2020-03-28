package com.example.constitutionofindia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Schedule extends AppCompatActivity {

    ListView scheduleListView;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        setTitle("Schedule");

        scheduleListView = findViewById(R.id.scheduleListView);

        arrayList.add("Schedule 01");
        arrayList.add("Schedule 02");
        arrayList.add("Schedule 03");
        arrayList.add("Schedule 04");
        arrayList.add("Schedule 05");
        arrayList.add("Schedule 06");
        arrayList.add("Schedule 07");
        arrayList.add("Schedule 08");
        arrayList.add("Schedule 09");
        arrayList.add("Schedule 10");
        arrayList.add("Schedule 11");
        arrayList.add("Schedule 12");

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        scheduleListView.setAdapter(arrayAdapter);

        scheduleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Toast.makeText(Schedule.this, "Schedule 01", Toast.LENGTH_SHORT).show();
                } else if(position == 1) {
                    Toast.makeText(Schedule.this, "Schedule 02", Toast.LENGTH_SHORT).show();
                } else if(position == 2) {
                    Toast.makeText(Schedule.this, "Schedule 03", Toast.LENGTH_SHORT).show();
                } else if(position == 3) {
                    Toast.makeText(Schedule.this, "Schedule 04", Toast.LENGTH_SHORT).show();
                } else if(position == 4) {
                    Toast.makeText(Schedule.this, "Schedule 05", Toast.LENGTH_SHORT).show();
                } else if(position == 5) {
                    Toast.makeText(Schedule.this, "Schedule 06", Toast.LENGTH_SHORT).show();
                } else if(position == 6) {
                    Toast.makeText(Schedule.this, "Schedule 07", Toast.LENGTH_SHORT).show();
                } else if(position == 7) {
                    Toast.makeText(Schedule.this, "Schedule 08", Toast.LENGTH_SHORT).show();
                } else if(position == 8) {
                    Toast.makeText(Schedule.this, "Schedule 09", Toast.LENGTH_SHORT).show();
                } else if(position == 9) {
                    Toast.makeText(Schedule.this, "Schedule 10", Toast.LENGTH_SHORT).show();
                } else if(position == 10) {
                    Toast.makeText(Schedule.this, "Schedule 11", Toast.LENGTH_SHORT).show();
                } else if(position == 11) {
                    Toast.makeText(Schedule.this, "Schedule 12", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
