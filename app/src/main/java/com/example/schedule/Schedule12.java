package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Schedule12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule12);

        setTitle("Schedule 12");

        TextView textView = findViewById(R.id.content);

        textView.setText("TWELFTH SCHEDULE\n" +
                "(Article 243W)\n" +
                "1. Urban planning including town planning.\n" +
                "2. Regulation of land-use and construction of buildings.\n" +
                "3. Planning for economic and social development.\n" +
                "4. Roads and bridges.\n" +
                "5. Water supply for domestic, industrial and commercial purposes.\n" +
                "6. Public health, sanitation conservancy and solid waste management.\n" +
                "7. Fire services.\n" +
                "8. Urban forestry, protection of the environment and promotion of ecological aspects.\n" +
                "9. Safeguarding the interests of weaker sections of society, including the handicapped and mentally retarded.\n" +
                "10. Slum improvement and upgradation.\n" +
                "11. Urban poverty alleviation.\n" +
                "12. Provision of urban amenities and facilities such as parks, gardens, playgrounds.\n" +
                "13. Promotion of cultural, educational and aesthetic aspects.\n" +
                "14. Burials and burial grounds; cremations, cremation grounds; and electric crematoriums.\n" +
                "15. Cattle pounds; prevention of cruelty to animals.\n" +
                "16. Vital statistics including registration of births and deaths.\n" +
                "17. Public amenities including street lighting, parking lots, bus stops and public conveniences.\n" +
                "18. Regulation of slaughter houses and tanneries.");
    }
}
