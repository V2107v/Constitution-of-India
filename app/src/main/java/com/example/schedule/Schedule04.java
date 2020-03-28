package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Schedule04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule04);

        setTitle("Schedule 04");

        TextView textView = findViewById(R.id.content);

        textView.setText("FOURTH SCHEDULE\n" +
                "[Articles 4(1) and 80(2)]\n" +
                "Allocation of seats in the Council of States\n" +
                "To each State or Union territory specified in the first column of the following table, there shall be allotted the number of seats specified in the second column thereof opposite to that State or that Union territory, as the case may be:\n" +
                "1. Andhra Pradesh - 11\n" +
                "2. Telangana - 7\n" +
                "3. Assam- 7\n" +
                "4. Bihar- 16\n" +
                "5. Jharkhand - 6\n" +
                "6. Goa - 1\n" +
                "7. Gujarat - 11\n" +
                "8. Haryana - 5\n" +
                "9. Kerala - 9\n" +
                "10. Madhya Pradesh - 11\n" +
                "11. Chhattisgarh - 5\n" +
                "12. Tamil Nadu - 18\n" +
                "13. Maharashtra - 19\n" +
                "14. Karnataka - 12\n" +
                "15. Odisha - 10\n" +
                "16. Punjab - 7\n" +
                "17. Rajasthan - 10\n" +
                "18. Uttar Pradesh - 31\n" +
                "19. Uttarakhand - 3\n" +
                "20. West Bengal - 16\n" +
                "21. Jammu and Kashmir - 4\n" +
                "22. Nagaland - 1\n" +
                "23. Himachal Pradesh - 3\n" +
                "24. Manipur - 1\n" +
                "25. Tripura - 1\n" +
                "26. Meghalaya - 1\n" +
                "27. Sikkim - 1\n" +
                "28. Mizoram - 1\n" +
                "29. Arunachal Pradesh - 1\n" +
                "30. Delhi - 3\n" +
                "31. Puducherry - 1\n" +
                "TOTAL -- 233");
    }
}
