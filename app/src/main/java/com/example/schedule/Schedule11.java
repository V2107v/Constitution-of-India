package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Schedule11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule11);

        setTitle("Schedule 11");

        TextView textView = findViewById(R.id.content);

        textView.setText("ELEVENTH SCHEDULE\n" +
                "(Article 243G)\n" +
                "1. Agriculture, including agricultural extension.\n" +
                "2. Land improvement, implementation of land reforms, land consolidation and soil conservation. \n" +
                "3. Minor irrigation, water management and watershed development.\n" +
                "4. Animal husbandry, dairying and poultry.\n" +
                "5. Fisheries.\n" +
                "6. Social forestry and farm forestry.\n" +
                "7. Minor forest produce.\n" +
                "8. Small scale industries, including food processing industries.\n" +
                "9. Khadi, village and cottage industries.\n" +
                "10. Rural housing.\n" +
                "11. Drinking water.\n" +
                "12. Fuel and fodder.\n" +
                "13. Roads, culverts, bridges, ferries, waterways and other means of communication. \n" +
                "14. Rural electrification, including distribution of electricity.\n" +
                "15. Non-conventional energy sources.\n" +
                "16. Poverty alleviation programme.\n" +
                "17. Education, including primary and secondary schools.\n" +
                "18. Technical training and vocational education.\n" +
                "19. Adult and non-formal education.\n" +
                "20. Libraries.\n" +
                "21. Cultural activities.\n" +
                "22. Markets and fairs.\n" +
                "23. Health and sanitation, including hospitals, primary health centres and dispensaries.\n" +
                "24. Family welfare.\n" +
                "25. Women and child development.\n" +
                "26. Social welfare, including welfare of the handicapped and mentally retarded.\n" +
                "27. Welfare of the weaker sections, and in particular, of the Scheduled Castes and the Scheduled Tribes.\n" +
                "28. Public distribution system.\n" +
                "29. Maintenance of community assets.");
    }
}
