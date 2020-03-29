package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment21);

        setTitle("Amendment 21");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (TWENTY-FIRST AMENDMENT) ACT, 1967\n" +
                "\n" +
                "Statement of Objects and Reasons appended to the Constitution\n" +
                "(Twenty-second Amendment) Bill, 1966 (Bill No. XXIV of 1966) which\n" +
                "was enacted as THE CONSTITUTION (Twenty-first Amendment) Act, 1967\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "There have been persistent demands from the Sindhi-speaking people for\n" +
                "the inclusion of the Sindhi language in the Eighth Schedule to the\n" +
                "Constitution. Although at present Sindhi is not a regional language\n" +
                "in a well-defined area, it used to be the language of a province of\n" +
                "the undivided India and, but for partition, would have continued to be\n" +
                "so. The Commissioner for Linguistic Minorities has also recommended\n" +
                "the inclusion of Sindhi in the Eighth Schedule to the Constitution.\n" +
                "On 4th November, 1966, it was announced that Government had decided to\n" +
                "include the Sindhi language in the Eighth Schedule to the\n" +
                "Constitution. The Bill seeks to give effect to this decision.\n" +
                "\n" +
                "NEW DELHI; Y. B. CHAVAN.\n" +
                "\n" +
                "The 15th November, 1966.\n" +
                "\n" +
                "THE CONSTITUTION (TWENTY-FIRST AMENDMENT) ACT, 1967\n" +
                "\n" +
                "[10th April, 1967.]\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Eighteenth Year of the Republic of\n" +
                "India as follows:-\n" +
                "\n" +
                "1. Short title.- This Act may be called the Constitution\n" +
                "(Twenty-first Amendment) Act, 1967.\n" +
                "\n" +
                "2. Amendment of Eighth Schedule.-In the Eighth Schedule to\n" +
                "the Constitution,-\n" +
                "\n" +
                "(a) entries 12 to 14 shall be re-numbered as entries 13 to 15 respec-\n" +
                "tively, and\n" +
                "\n" +
                "(b) before entry \"13\" as so re-numbered, the entry \"12. Sindhi.\"\n" +
                "shall be inserted.");
    }
}
