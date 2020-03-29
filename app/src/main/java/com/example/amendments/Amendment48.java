package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment48 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment48);

        setTitle("Amendment 48");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (FORTY-EIGHTH AMENDMENT)\n" +
                "\n" +
                "Statement of Objects and Reasons appended to the Constitution\n" +
                "(Fiftieth Amendment) Bill, 1984 which was enacted as\n" +
                "THE CONSTITUTION (Forty-eighth Amendment) Act, 1984\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "The Proclamation issued by the President under article 356 of the\n" +
                "Constitution on the 6th day of October, 1983 with respect to the State\n" +
                "of Punjab cannot be continued in force for more than one year unless\n" +
                "the special conditions mentioned in clause (5) of article 356 of the\n" +
                "Constitution are satisfied. Although the Legislative Assembly is in\n" +
                "suspended animation and a popular government can be installed, having\n" +
                "regard to the prevailing situation in the State, the continuance of\n" +
                "the Proclamation beyond 5th October, 1984 may be necessary. To\n" +
                "facilitate the adoption of a resolution by the two Houses of\n" +
                "Parliament approving the continuance in force of the Proclamation\n" +
                "beyond 5th October, 1984, it is necessary to amend article 356 of the\n" +
                "Constitution. It is therefore proposed to amend clause (5) of article\n" +
                "356 so as to make the conditions mentioned therein inapplicable for\n" +
                "the purposes of the continuance in force of the said Proclamation up\n" +
                "to a period of two years from the date of its issue.\n" +
                "\n" +
                "NEW DELHI; P. V. NARASIMHA RAO.\n" +
                "\n" +
                "The 13th August, 1984.\n" +
                "\n" +
                "THE CONSTITUTION (FORTY-EIGHTH AMENDMENT)\n" +
                "ACT, 1984\n" +
                "\n" +
                "[26th August, 1984.]\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Thirty-fifth Year of the Republic\n" +
                "of India as follows:-\n" +
                "\n" +
                "1. Short title.-This Act may be called the Constitution (Forty-eighth\n" +
                "Amendment) Act, 1984.\n" +
                "\n" +
                "2. Amendment of article 356.-In article 356 of the Constitution, in\n" +
                "clause (5), the following proviso shall be inserted at the end\n" +
                "namely:-\n" +
                "\n" +
                "`Provided that in the case of the Proclamation issued under clause (1)\n" +
                "on the 6th day of October, 1983 with respect to the State of Punjab,\n" +
                "the reference in this clause to \"any period beyond the expiration of\n" +
                "one year\" shall be construed as a reference to \"any period beyond the\n" +
                "expiration of two years\".'.");
    }
}
