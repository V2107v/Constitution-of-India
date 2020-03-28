package com.example.constitutionofindia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Amendments extends AppCompatActivity {

    ListView amendmentsListView;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendments);

        setTitle("Amendments");

        amendmentsListView = findViewById(R.id.amendmentsListView);

        arrayList.add("First Amendment");
        arrayList.add("Second Amendment");
        arrayList.add("Third Amendment");
        arrayList.add("Fourth Amendment");
        arrayList.add("Fifth Amendment");
        arrayList.add("Sixth Amendment");
        arrayList.add("Seventh Amendment");
        arrayList.add("Eighth Amendment");
        arrayList.add("Ninth Amendment");
        arrayList.add("Tenth Amendment");
        arrayList.add("Eleventh Amendment");
        arrayList.add("Twelfth Amendment");
        arrayList.add("Thirteenth Amendment");
        arrayList.add("Fourteenth Amendment");
        arrayList.add("Fifteenth Amendment");
        arrayList.add("Sixteenth Amendment");
        arrayList.add("Seventeenth Amendment");
        arrayList.add("Eighteenth Amendment");
        arrayList.add("Nineteenth Amendment");
        arrayList.add("Twentieth Amendment");
        arrayList.add("Twenty First Amendment");
        arrayList.add("Twenty Second Amendment");
        arrayList.add("Twenty Third Amendment");
        arrayList.add("Twenty Fourth Amendment");
        arrayList.add("Twenty Fifth Amendment");
        arrayList.add("Twenty Sixth Amendment");
        arrayList.add("Twenty Seventh Amendment");
        arrayList.add("Twenty Eighth Amendment");
        arrayList.add("Twenty Ninth Amendment");
        arrayList.add("Thirtieth Amendment");
        arrayList.add("Thirty First Amendment");
        arrayList.add("Thirty Second Amendment");
        arrayList.add("Thirty Third Amendment");
        arrayList.add("Thirty Fourth Amendment");
        arrayList.add("Thirty Fifth Amendment");
        arrayList.add("Thirty Sixth Amendment");
        arrayList.add("Thirty Seventh Amendment");
        arrayList.add("Thirty Eighth Amendment");
        arrayList.add("Thirty Ninth Amendment");
        arrayList.add("Fortieth Amendment");
        arrayList.add("Forty First Amendment");
        arrayList.add("Forty Second Amendment");
        arrayList.add("Forty Third Amendment");
        arrayList.add("Forty Fourth Amendment");
        arrayList.add("Forty Fifth Amendment");
        arrayList.add("Forty Sixth Amendment");
        arrayList.add("Forty Seventh Amendment");
        arrayList.add("Forty Eighth Amendment");
        arrayList.add("Forty Ninth Amendment");
        arrayList.add("Fiftieth Amendment");
        arrayList.add("Fifty First Amendment");
        arrayList.add("Fifty Second Amendment");
        arrayList.add("Fifty Third Amendment");
        arrayList.add("Fifty Fourth Amendment");
        arrayList.add("Fifty Fifth Amendment");
        arrayList.add("Fifty Sixth Amendment");
        arrayList.add("Fifty Seventh Amendment");
        arrayList.add("Fifty Eighth Amendment");
        arrayList.add("Fifty Ninth Amendment");
        arrayList.add("Sixtieth Amendment");
        arrayList.add("Sixty First Amendment");
        arrayList.add("Sixty Second Amendment");
        arrayList.add("Sixty Third Amendment");
        arrayList.add("Sixty Fourth Amendment");
        arrayList.add("Sixty Fifth Amendment");
        arrayList.add("Sixty Sixth Amendment");
        arrayList.add("Sixty Seventh Amendment");
        arrayList.add("Sixty Eighth Amendment");
        arrayList.add("Sixty Ninth Amendment");
        arrayList.add("Seventieth Amendment");
        arrayList.add("Seventy First Amendment");
        arrayList.add("Seventy Second Amendment");
        arrayList.add("Seventy Third Amendment");
        arrayList.add("Seventy Fourth Amendment");
        arrayList.add("Seventy Fifth Amendment");
        arrayList.add("Seventy Sixth Amendment");
        arrayList.add("Seventy Seventh Amendment");
        arrayList.add("Seventy Eighth Amendment");
        arrayList.add("Seventy Ninth Amendment");
        arrayList.add("Eightieth Amendment");
        arrayList.add("Eighty First Amendment");
        arrayList.add("Eighty Second Amendment");
        arrayList.add("Eighty Third Amendment");
        arrayList.add("Eighty Fourth Amendment");
        arrayList.add("Eighty Fifth Amendment");
        arrayList.add("Eighty Sixth Amendment");
        arrayList.add("Eighty Seventh Amendment");
        arrayList.add("Eighty Eighth Amendment");
        arrayList.add("Eighty Ninth Amendment");
        arrayList.add("Ninetieth Amendment");
        arrayList.add("Ninety First Amendment");
        arrayList.add("Ninety Second Amendment");
        arrayList.add("Ninety Third Amendment");
        arrayList.add("Ninety Fourth Amendment");
        arrayList.add("Ninety Fifth Amendment");
        arrayList.add("Ninety Sixth Amendment");
        arrayList.add("Ninety Seventh Amendment");
        arrayList.add("Ninety Eighth Amendment");
        arrayList.add("Ninety Ninth Amendment");
        arrayList.add("One Hundredth Amendment");

        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        amendmentsListView.setAdapter(arrayAdapter);

        amendmentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Amendments.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });

















    }
}
