package com.example.constitutionofindia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.amendments.*;

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
                } else if(position == 50) {
                    Intent intent = new Intent(getApplicationContext(), Amendment51.class);
                    startActivity(intent);
                } else if(position == 51) {
                    Intent intent = new Intent(getApplicationContext(), Amendment52.class);
                    startActivity(intent);
                } else if(position == 52) {
                    Intent intent = new Intent(getApplicationContext(), Amendment53.class);
                    startActivity(intent);
                } else if(position == 53) {
                    Intent intent = new Intent(getApplicationContext(), Amendment54.class);
                    startActivity(intent);
                } else if(position == 54) {
                    Intent intent = new Intent(getApplicationContext(), Amendment55.class);
                    startActivity(intent);
                } else if(position == 55) {
                    Intent intent = new Intent(getApplicationContext(), Amendment56.class);
                    startActivity(intent);
                } else if(position == 56) {
                    Intent intent = new Intent(getApplicationContext(), Amendment57.class);
                    startActivity(intent);
                } else if(position == 57) {
                    Intent intent = new Intent(getApplicationContext(), Amendment58.class);
                    startActivity(intent);
                } else if(position == 58) {
                    Intent intent = new Intent(getApplicationContext(), Amendment59.class);
                    startActivity(intent);
                } else if(position == 59) {
                    Intent intent = new Intent(getApplicationContext(), Amendment60.class);
                    startActivity(intent);
                } else if(position == 60) {
                    Intent intent = new Intent(getApplicationContext(), Amendment61.class);
                    startActivity(intent);
                } else if(position == 61) {
                    Intent intent = new Intent(getApplicationContext(), Amendment62.class);
                    startActivity(intent);
                } else if(position == 62) {
                    Intent intent = new Intent(getApplicationContext(), Amendment63.class);
                    startActivity(intent);
                } else if(position == 63) {
                    Intent intent = new Intent(getApplicationContext(), Amendment64.class);
                    startActivity(intent);
                } else if(position == 64) {
                    Intent intent = new Intent(getApplicationContext(), Amendment65.class);
                    startActivity(intent);
                } else if(position == 65) {
                    Intent intent = new Intent(getApplicationContext(), Amendment66.class);
                    startActivity(intent);
                }else if(position == 66) {
                    Intent intent = new Intent(getApplicationContext(), Amendment67.class);
                    startActivity(intent);
                }else if(position == 67) {
                    Intent intent = new Intent(getApplicationContext(), Amendment68.class);
                    startActivity(intent);
                } else if(position == 68) {
                    Intent intent = new Intent(getApplicationContext(), Amendment69.class);
                    startActivity(intent);
                } else if(position == 69) {
                    Intent intent = new Intent(getApplicationContext(), Amendment70.class);
                    startActivity(intent);
                }else if(position == 70) {
                    Intent intent = new Intent(getApplicationContext(), Amendment71.class);
                    startActivity(intent);
                } else if(position == 71) {
                    Intent intent = new Intent(getApplicationContext(), Amendment72.class);
                    startActivity(intent);
                } else if(position == 72) {
                    Intent intent = new Intent(getApplicationContext(), Amendment73.class);
                    startActivity(intent);
                } else if(position == 73) {
                    Intent intent = new Intent(getApplicationContext(), Amendment74.class);
                    startActivity(intent);
                } else if(position == 74) {
                    Intent intent = new Intent(getApplicationContext(), Amendment75.class);
                    startActivity(intent);
                } else if(position == 75) {
                    Intent intent = new Intent(getApplicationContext(), Amendment76.class);
                    startActivity(intent);
                } else if(position == 76) {
                    Intent intent = new Intent(getApplicationContext(), Amendment77.class);
                    startActivity(intent);
                } else if(position == 77) {
                    Intent intent = new Intent(getApplicationContext(), Amendment78.class);
                    startActivity(intent);
                } else if(position == 78) {
                    Intent intent = new Intent(getApplicationContext(), Amendment79.class);
                    startActivity(intent);
                } else if(position == 79) {
                    Intent intent = new Intent(getApplicationContext(), Amendment80.class);
                    startActivity(intent);
                } else if(position == 80) {
                    Intent intent = new Intent(getApplicationContext(), Amendment81.class);
                    startActivity(intent);
                } else if(position == 81) {
                    Intent intent = new Intent(getApplicationContext(), Amendment82.class);
                    startActivity(intent);
                } else if(position == 82) {
                    Intent intent = new Intent(getApplicationContext(), Amendment83.class);
                    startActivity(intent);
                } else if(position == 83) {
                    Intent intent = new Intent(getApplicationContext(), Amendment84.class);
                    startActivity(intent);
                }else if(position == 84) {
                    Intent intent = new Intent(getApplicationContext(), Amendment85.class);
                    startActivity(intent);
                } else if(position == 85) {
                    Intent intent = new Intent(getApplicationContext(), Amendment86.class);
                    startActivity(intent);
                } else if(position == 86) {
                    Intent intent = new Intent(getApplicationContext(), Amendment87.class);
                    startActivity(intent);
                }  else if(position == 87) {
                    Intent intent = new Intent(getApplicationContext(), Amendment88.class);
                    startActivity(intent);
                } else if(position == 88) {
                    Intent intent = new Intent(getApplicationContext(), Amendment89.class);
                    startActivity(intent);
                } else if(position == 89) {
                    Intent intent = new Intent(getApplicationContext(), Amendment90.class);
                    startActivity(intent);
                } else if(position == 90) {
                    Intent intent = new Intent(getApplicationContext(), Amendment91.class);
                    startActivity(intent);
                } else if(position == 91) {
                    Intent intent = new Intent(getApplicationContext(), Amendment92.class);
                    startActivity(intent);
                } else if(position == 92) {
                    Intent intent = new Intent(getApplicationContext(), Amendment93.class);
                    startActivity(intent);
                } else if(position == 93) {
                    Intent intent = new Intent(getApplicationContext(), Amendment94.class);
                    startActivity(intent);
                } else if(position == 94) {
                    Intent intent = new Intent(getApplicationContext(), Amendment95.class);
                    startActivity(intent);
                } else if(position == 95) {
                    Intent intent = new Intent(getApplicationContext(), Amendment96.class);
                    startActivity(intent);
                } else if(position == 96) {
                    Intent intent = new Intent(getApplicationContext(), Amendment97.class);
                    startActivity(intent);
                } else if(position == 97) {
                    Intent intent = new Intent(getApplicationContext(), Amendment98.class);
                    startActivity(intent);
                } else if(position == 98) {
                    Intent intent = new Intent(getApplicationContext(), Amendment99.class);
                    startActivity(intent);
                } else if(position == 99) {
                    Intent intent = new Intent(getApplicationContext(), Amendment100.class);
                    startActivity(intent);
                }
            }
        });


    }
}
