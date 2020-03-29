package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment71 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment71);

        setTitle("Amendment 71");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (SEVENTY-FIRST AMENDMENT) ACT, 1992\n" +
                "\n" +
                "Statement of Objects and Reasons appended to the Constitution\n" +
                "(Seventy-eighth Amendment) Bill, 1992 which was enacted as\n" +
                "THE CONSTITUTION (Seventy-first Amendment) Act, 1992\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "There have been demands for inclusion of certain languages in the\n" +
                "Eighth Schedule to the Constitution. It is proposed to include\n" +
                "Konkani, Manipuri and Nepali languages in the Eighth Schedule to the\n" +
                "Constitution. The Bill seeks to give effect to this decision.\n" +
                "\n" +
                "2. The Napali language is also known in some areas as `Gorkha Bhasa'.\n" +
                "In the Census operations, other nomenclatures such as `Gorkhali',\n" +
                "`Gorkdhi', `Gurkhiya', `Khaskura' or `Naipali' have also been used.\n" +
                "\n" +
                "NEW DELHI; S. B. CHAVAN.\n" +
                "\n" +
                "The 20th August, 1992.\n" +
                "\n" +
                "THE CONSTITUTION (SEVENTY-FIRST AMENDMENT)\n" +
                "ACT, 1992\n" +
                "\n" +
                "[31st August, 1992.]\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Forty-third Year of the Republic of\n" +
                "India as follows:-\n" +
                "\n" +
                "1. Short title.-This Act may be called the Constitution\n" +
                "(Seventy-first Amendment) Act, 1992.\n" +
                "\n" +
                "2. Amendment of Eighth Schedule.-In the Eighth Schedule to the\n" +
                "Constitution,-\n" +
                "\n" +
                "(a) existing entry 7 shall be re-numbered as entry 8, and before entry\n" +
                "8 as so re-numbered, the entry \"7. Konkani.\" shall be inserted;\n" +
                "\n" +
                "(b) existing entry 8 shall be re-numbered as entry 10, and before\n" +
                "entry 10 as so re-numbered, the entry \"9. Manipuri.\" shall be\n" +
                "inserted;\n" +
                "\n" +
                "(c) existing entries 9 to 15 shall be re-numbered as entries 12 to 18\n" +
                "respectively, and before entry 12 as so re-numbered, the entry \"11.\n" +
                "Nepali.\" shall be inserted.");
    }
}
