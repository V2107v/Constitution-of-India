package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment19);

        setTitle("Amendment 19");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (NINETEENTH AMENDMENT) ACT, 1966\n" +
                "\n" +
                "Statement of Objects and Reasons appended to the Constitution\n" +
                "(Twenty-first Amendment) Bill, 1966 which was enacted as the\n" +
                "Constitution (Nineteenth Amendment) Act, 1966\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "One of the important recommendations made by the Election Commission\n" +
                "in its Report on the Third General Elections in India in 1962, and\n" +
                "accepted by the Government relates to the abolition of election\n" +
                "tribunals and trial of election petitions by High Courts.\n" +
                "\n" +
                "If the proposal for a legislation to amend the Representation of the\n" +
                "People Act, 1951, containing, inter alia, provisions for the trial of\n" +
                "election petitions by High Courts instead of the election tribunals,\n" +
                "as at present, is accepted by Parliament, it would be necessary to\n" +
                "make a minor amendment in clause (1) of article 324 of the\n" +
                "Constitution for the purpose of deleting therefrom the words\n" +
                "\",including the appointment of election tribunals for the decision of\n" +
                "doubts and disputes arising out of or in connection with elections to\n" +
                "Parliament and to the Legislatures of States\".\n" +
                "\n" +
                "The Bill is intended to give effect to the aforesaid object.\n" +
                "\n" +
                "NEW DELHI; G. S. PATHAK.\n" +
                "\n" +
                "The 16th August, 1966.\n" +
                "\n" +
                "THE CONSTITUTION (NINETEENTH AMENDMENT) ACT, 1966\n" +
                "\n" +
                "[11th December, 1966.]\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Seventeenth Year of the Republic of\n" +
                "India as follows:-\n" +
                "\n" +
                "1. Short title.- This Act may be called the Constitution (Nineteenth\n" +
                "Amendment) Act, 1966.\n" +
                "\n" +
                "2. Amendment of article 324.-In article 324 of the Constitution, in\n" +
                "clause (1), the words, \"including the appointment of election\n" +
                "tribunals for the decision of doubts and disputes arising out of or in\n" +
                "connection with elections to Parliament and to the Legislatures of\n" +
                "States\" shall be omitted.");
    }
}
