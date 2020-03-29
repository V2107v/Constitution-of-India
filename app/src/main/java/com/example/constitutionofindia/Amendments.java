package com.example.constitutionofindia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.amendments.Amendment01;
import com.example.amendments.Amendment02;
import com.example.amendments.Amendment03;
import com.example.amendments.Amendment04;
import com.example.amendments.Amendment05;
import com.example.amendments.Amendment06;
import com.example.amendments.Amendment07;
import com.example.amendments.Amendment08;
import com.example.amendments.Amendment09;
import com.example.amendments.Amendment10;
import com.example.amendments.Amendment11;
import com.example.amendments.Amendment12;
import com.example.amendments.Amendment13;
import com.example.amendments.Amendment14;
import com.example.amendments.Amendment15;
import com.example.amendments.Amendment16;
import com.example.amendments.Amendment17;
import com.example.amendments.Amendment18;
import com.example.amendments.Amendment19;
import com.example.amendments.Amendment20;
import com.example.amendments.Amendment21;
import com.example.amendments.Amendment22;
import com.example.amendments.Amendment23;
import com.example.amendments.Amendment24;
import com.example.amendments.Amendment25;
import com.example.amendments.Amendment26;
import com.example.amendments.Amendment27;
import com.example.amendments.Amendment28;
import com.example.amendments.Amendment29;
import com.example.amendments.Amendment30;
import com.example.amendments.Amendment31;
import com.example.amendments.Amendment32;
import com.example.amendments.Amendment33;
import com.example.amendments.Amendment34;
import com.example.amendments.Amendment35;
import com.example.amendments.Amendment36;
import com.example.amendments.Amendment37;
import com.example.amendments.Amendment38;
import com.example.amendments.Amendment39;
import com.example.amendments.Amendment40;
import com.example.amendments.Amendment41;
import com.example.amendments.Amendment42;
import com.example.amendments.Amendment43;
import com.example.amendments.Amendment44;
import com.example.amendments.Amendment45;
import com.example.amendments.Amendment46;
import com.example.amendments.Amendment47;
import com.example.amendments.Amendment48;
import com.example.amendments.Amendment49;
import com.example.amendments.Amendment50;

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
        arrayList.add("One Hundred One Amendment");

        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        amendmentsListView.setAdapter(arrayAdapter);

        amendmentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Amendments.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
                if(position == 0) {
                    Intent intent = new Intent(getApplicationContext(),Amendment01.class);
                    startActivity(intent);
                } else if(position == 1) {
                    Intent intent = new Intent(getApplicationContext(), Amendment02.class);
                    startActivity(intent);
                } else if(position == 2) {
                    Intent intent = new Intent(getApplicationContext(), Amendment03.class);
                    startActivity(intent);
                } else if(position == 3) {
                    Intent intent = new Intent(getApplicationContext(), Amendment04.class);
                    startActivity(intent);
                } else if(position == 4) {
                    Intent intent = new Intent(getApplicationContext(), Amendment05.class);
                    startActivity(intent);
                } else if(position == 5) {
                    Intent intent = new Intent(getApplicationContext(), Amendment06.class);
                    startActivity(intent);
                } else if(position == 6) {
                    Intent intent = new Intent(getApplicationContext(), Amendment07.class);
                    startActivity(intent);
                } else if(position == 7) {
                    Intent intent = new Intent(getApplicationContext(), Amendment08.class);
                    startActivity(intent);
                } else if(position == 8) {
                    Intent intent = new Intent(getApplicationContext(), Amendment09.class);
                    startActivity(intent);
                } else if(position == 9) {
                    Intent intent = new Intent(getApplicationContext(), Amendment10.class);
                    startActivity(intent);
                } else if(position == 10) {
                    Intent intent = new Intent(getApplicationContext(), Amendment11.class);
                    startActivity(intent);
                } else if(position == 11) {
                    Intent intent = new Intent(getApplicationContext(), Amendment12.class);
                    startActivity(intent);
                } else if(position ==12) {
                    Intent intent = new Intent(getApplicationContext(), Amendment13.class);
                    startActivity(intent);
                } else if(position == 13) {
                    Intent intent = new Intent(getApplicationContext(), Amendment14.class);
                    startActivity(intent);
                } else if(position == 14) {
                    Intent intent = new Intent(getApplicationContext(), Amendment15.class);
                    startActivity(intent);
                } else if(position == 15) {
                    Intent intent = new Intent(getApplicationContext(), Amendment16.class);
                    startActivity(intent);
                } else if(position == 16) {
                    Intent intent = new Intent(getApplicationContext(), Amendment17.class);
                    startActivity(intent);
                } else if(position == 17) {
                    Intent intent = new Intent(getApplicationContext(), Amendment18.class);
                    startActivity(intent);
                } else if(position == 18) {
                    Intent intent = new Intent(getApplicationContext(), Amendment19.class);
                    startActivity(intent);
                } else if(position == 19) {
                    Intent intent = new Intent(getApplicationContext(), Amendment20.class);
                    startActivity(intent);
                } else if(position == 20) {
                    Intent intent = new Intent(getApplicationContext(), Amendment21.class);
                    startActivity(intent);
                } else if(position == 21) {
                    Intent intent = new Intent(getApplicationContext(), Amendment22.class);
                    startActivity(intent);
                } else if(position == 22) {
                    Intent intent = new Intent(getApplicationContext(), Amendment23.class);
                    startActivity(intent);
                } else if(position == 23) {
                    Intent intent = new Intent(getApplicationContext(), Amendment24.class);
                    startActivity(intent);
                } else if(position == 24) {
                    Intent intent = new Intent(getApplicationContext(), Amendment25.class);
                    startActivity(intent);
                } else if(position == 25) {
                    Intent intent = new Intent(getApplicationContext(), Amendment26.class);
                    startActivity(intent);
                } else if(position == 26) {
                    Intent intent = new Intent(getApplicationContext(), Amendment27.class);
                    startActivity(intent);
                } else if(position == 27) {
                    Intent intent = new Intent(getApplicationContext(), Amendment28.class);
                    startActivity(intent);
                } else if(position == 28) {
                    Intent intent = new Intent(getApplicationContext(), Amendment29.class);
                    startActivity(intent);
                } else if(position == 29) {
                    Intent intent = new Intent(getApplicationContext(), Amendment30.class);
                    startActivity(intent);
                } else if(position == 30) {
                    Intent intent = new Intent(getApplicationContext(), Amendment31.class);
                    startActivity(intent);
                } else if(position == 31) {
                    Intent intent = new Intent(getApplicationContext(), Amendment32.class);
                    startActivity(intent);
                } else if(position == 32) {
                    Intent intent = new Intent(getApplicationContext(), Amendment33.class);
                    startActivity(intent);
                } else if(position == 33) {
                    Intent intent = new Intent(getApplicationContext(), Amendment34.class);
                    startActivity(intent);
                } else if(position == 34) {
                    Intent intent = new Intent(getApplicationContext(), Amendment35.class);
                    startActivity(intent);
                } else if(position == 35) {
                    Intent intent = new Intent(getApplicationContext(), Amendment36.class);
                    startActivity(intent);
                } else if(position == 36) {
                    Intent intent = new Intent(getApplicationContext(), Amendment37.class);
                    startActivity(intent);
                } else if(position == 37) {
                    Intent intent = new Intent(getApplicationContext(), Amendment38.class);
                    startActivity(intent);
                } else if(position == 38) {
                    Intent intent = new Intent(getApplicationContext(), Amendment39.class);
                    startActivity(intent);
                } else if(position == 39) {
                    Intent intent = new Intent(getApplicationContext(), Amendment40.class);
                    startActivity(intent);
                }  else if(position == 40) {
                    Intent intent = new Intent(getApplicationContext(), Amendment41.class);
                    startActivity(intent);
                } else if(position == 41) {
                    Intent intent = new Intent(getApplicationContext(), Amendment42.class);
                    startActivity(intent);
                } else if(position == 42) {
                    Intent intent = new Intent(getApplicationContext(), Amendment43.class);
                    startActivity(intent);
                } else if(position == 43) {
                    Intent intent = new Intent(getApplicationContext(), Amendment44.class);
                    startActivity(intent);
                } else if(position == 44) {
                    Intent intent = new Intent(getApplicationContext(), Amendment45.class);
                    startActivity(intent);
                } else if(position == 45) {
                    Intent intent = new Intent(getApplicationContext(), Amendment46.class);
                    startActivity(intent);
                } else if(position == 46) {
                    Intent intent = new Intent(getApplicationContext(), Amendment47.class);
                    startActivity(intent);
                } else if(position == 47) {
                    Intent intent = new Intent(getApplicationContext(), Amendment48.class);
                    startActivity(intent);
                } else if(position == 48) {
                    Intent intent = new Intent(getApplicationContext(), Amendment49.class);
                    startActivity(intent);
                } else if(position == 49) {
                    Intent intent = new Intent(getApplicationContext(), Amendment50.class);
                    startActivity(intent);
                }
            }
        });


    }
}
