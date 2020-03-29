package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment12);

        setTitle("Amendment 12");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (TWELFTH AMENDMENT) ACT, 1962\n" +
                "\n" +
                "Statement of Objects and Reasons appended to the Constitution\n" +
                "(Twelfth Amendment) Bill, 1962 which was enacted as the\n" +
                "Constitution (Twelfth Amendment) Act, 1962\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "On the acquisition of the territories of Goa, Daman and Diu with\n" +
                "effect from the 20th December, 1961, these territories have, by virtue\n" +
                "of sub-clause (c) of clause (3) of article 1 of the Constitution, been\n" +
                "comprised within the territory of India from that date and they are\n" +
                "being administered as a Union territory by the President through an\n" +
                "Administrator in accordance with article 239 of the Constitution. It\n" +
                "is, however, considered desirable that Goa, Daman and Diu should be\n" +
                "specifically included as a Union territory in the First Schedule to\n" +
                "the Constitution. It is also considered that clause (1) of article\n" +
                "240 should be suitably amended to confer power on the President to\n" +
                "make regulations for the peace, progress and good government of Goa,\n" +
                "Daman and Diu, as has been done in the case of Dadra and Nagar Haveli.\n" +
                "\n" +
                "The Constitution (Twelfth Amendment) Bill, 1962 seeks to make the\n" +
                "above mentioned provisions.\n" +
                "\n" +
                "JAWAHARLAL NEHRU.\n" +
                "\n" +
                "THE CONSTITUTION (TWELFTH AMENDMENT) ACT, 1962\n" +
                "\n" +
                "[27th March, 1962.]\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Thirteenth Year of the Republic of\n" +
                "India as follows:-\n" +
                "\n" +
                "1. Short title and commencement.-(1) This Act may be called the\n" +
                "Constitution (Twelfth Amendment) Act, 1962.\n" +
                "\n" +
                "(2) It shall be deemed to have come into force on the 20th day of\n" +
                "December 1961.\n" +
                "\n" +
                "2. Amendment of the First Schedule to the Constitution.-In the First\n" +
                "Schedule to the Constitution, under the heading \"THE UNION\n" +
                "TERRITORIES\", after entry 7, the following entry shall be inserted,\n" +
                "namely:-\n" +
                "\n" +
                "8. Goa, Daman The territories which immediately before\n" +
                "and Diu the twentieth day of December, 1961\n" +
                "were comprised in Goa, Daman and Diu.\".\n" +
                "\n" +
                "3. Amendment of article 240.-In article 240 of the Constitution, in\n" +
                "clause (1), after entry (c), the following entry shall be inserted,\n" +
                "namely:-\n" +
                "\n" +
                "\"(d) Goa, Daman and Diu.\".");
    }
}
