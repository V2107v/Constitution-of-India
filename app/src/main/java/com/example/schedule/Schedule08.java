package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Schedule08 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule08);

        setTitle("Schedule 08");

        TextView textView = findViewById(R.id.content);

        textView.setText("EIGHTH SCHEDULE\n" +
                "[Articles 344(1) and 351]\n" +
                "Languages\n" +
                "1. Assamese.\n" +
                "2. Bengali.\n" +
                "3. Bodo.\n" +
                "4. Dogri.\n" +
                "5. Gujarati.\n" +
                "6. Hindi.\n" +
                "7. Kannada.\n" +
                "8. Kashmiri.\n" +
                "9. Konkani.\n" +
                "10. Maithili.\n" +
                "11. Malayalam.\n" +
                "12. Manipuri.\n" +
                "13. Marathi.\n" +
                "14. Nepali.\n" +
                "15. Odia\n" +
                "16. Punjabi.\n" +
                "17. Sanskrit.\n" +
                "18. Santhali.\n" +
                "19. Sindhi.\n" +
                "20. Tamil.\n" +
                "21. Telugu.\n" +
                "22. Urdu");
    }
}
