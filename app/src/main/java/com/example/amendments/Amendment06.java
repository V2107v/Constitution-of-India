package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment06);

        setTitle("Amendment 06");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (SIXTH AMENDMENT) ACT, 1956\n" +
                "\n" +
                "                                        [11th September, 1956.]\n" +
                "\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE  it  enacted by Parliament in the Seventh Year of the  Republic  of\n" +
                "India as follows:-\n" +
                "\n" +
                "1.   Short  title.-This   Act  may be called  the  Constitution  (Sixth\n" +
                "Amendment) Act, 1956.\n" +
                "\n" +
                "2.   Amendment of the Seventh Schedule.-In the Seventh Schedule to the\n" +
                "Constitution,-\n" +
                "\n" +
                "(a)  in  the Union List, after entry 92, the following entry shall  be\n" +
                "inserted, namely:-\n" +
                "\n" +
                "\"92A.   Taxes on the sale or purchase of goods other than  newspapers,\n" +
                "where  such sale or purchase takes place in the course of inter-State\n" +
                "trade or commerce.\";  and\n" +
                "\n" +
                "(b)  in  the  State List, for entry 54, the following entry  shall  be\n" +
                "substituted, namely:-\n" +
                "\n" +
                "\"54.   Taxes  on the sale or purchase of goods other than  newspapers,\n" +
                "subject to the provisions of entry 92A of List I.\".\n" +
                "\n" +
                "3.  Amendment of article 269.-In article 269 of the Constitution,-\n" +
                "\n" +
                "(a)  in  clause  (1), after sub-clause (f), the  following  sub-clause\n" +
                "shall be inserted, namely:-\n" +
                "\n" +
                "\"(g)  taxes  on the sale or purchase of goods other  than  newspapers,\n" +
                "where  such sale or purchase takes place in the course of inter-State\n" +
                "trade or commerce.\";  and\n" +
                "\n" +
                "(b)  after  clause  (2),   the  following  clause  shall  be  inserted,\n" +
                "namely:-\n" +
                "\n" +
                "\"(3) Parliament may by law formulate principles for determining when a\n" +
                "sale  or  purchase of goods takes place in the course  of  inter-State\n" +
                "trade or commerce.\".\n" +
                "\n" +
                "4.  Amendment of article 286.-In article 286 of the Constitution,-\n" +
                "\n" +
                "(a) in clause (1), the Explanation shall be omitted;  and\n" +
                "\n" +
                "(b)  for  clauses  (2)   and  (3),   the  following  clauses  shall  be\n" +
                "substituted, namely:-\n" +
                "\n" +
                "\"(2) Parliament may by law formulate principles for determining when a\n" +
                "sale  or purchase of goods takes place in any of the ways mentioned in\n" +
                "clause (1).\n" +
                "\n" +
                "(3)  Any  law of a State shall, in so far as it imposes or  authorises\n" +
                "the  imposition of, a tax on the sale or purchase of goods declared by\n" +
                "Parliament  by law to be of special importance in inter-State trade or\n" +
                "commerce,  be subject to such restrictions and conditions in regard to\n" +
                "the system of levy, rates and other incidents of the tax as Parliament\n" +
                "may by law specify.\".");
    }
}
