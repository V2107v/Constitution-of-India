package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment18);

        setTitle("Amendment 18");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (EIGHTEENTH AMENDMENT) ACT, 1966\n" +
                "\n" +
                "Statement of Objects and Reasons appended to the Constitution\n" +
                "(Twentieth Amendment) Bill, 1966 which was enacted as the\n" +
                "Constitution (Eighteenth Amendment) Act, 1966\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "Article 3 of the Constitution provides for the formation of new States\n" +
                "and alteration of areas, boundaries, or names of existing States.\n" +
                "Before the Constitution (Seventh Amendment) Act, 1956, was enacted,\n" +
                "the expression \"States\" occurring in that article meant Part A States,\n" +
                "Part B States and also Part C States. By the Seventh Amendment of the\n" +
                "Constitution in 1956, the concept of \"Union territories\" was\n" +
                "introduced in our Constitution but article 3 was not amended to\n" +
                "include in terms \"Union territories\". It is considered proper to\n" +
                "amend this article to make it clear that \"State\" in clauses (a) to (e)\n" +
                "of that article (but not in the proviso) includes \"Union territories\".\n" +
                "It is also considered proper to make it clear that power under clause\n" +
                "(a) of article 3 includes power to form a new State or Union territory\n" +
                "by uniting a part of a State or Union territory to another State or\n" +
                "Union territory.\n" +
                "\n" +
                "The Bill seeks to achieve the above objects.\n" +
                "\n" +
                "NEW DELHI; G. L. NANDA.\n" +
                "\n" +
                "The 16th May, 1966.\n" +
                "\n" +
                "THE CONSTITUTION (EIGHTEENTH AMENDMENT) ACT, 1966\n" +
                "\n" +
                "[27th August, 1966.]\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Seventeenth Year of the Republic of\n" +
                "India as follows:-\n" +
                "\n" +
                "1. Short title.-This Act may be called the Constitution (Eighteenth\n" +
                "Amendment) Act, 1966.\n" +
                "\n" +
                "2. Amendment of article 3.-In article 3 of the Constitution, the\n" +
                "following Explanations shall be inserted at the end, namely:-\n" +
                "\n" +
                "`Explanation I.-In this article in clauses (a) to (e), \"State\"\n" +
                "includes a Union territory, but in the proviso, \"State\" does not\n" +
                "include a Union territory.\n" +
                "\n" +
                "Explanation II.-The power conferred on Parliament by clause (a)\n" +
                "includes the power to form a new State or Union territory by uniting a\n" +
                "part of any State or Union territory to any other State or Union\n" +
                "territory.'.");
    }
}
