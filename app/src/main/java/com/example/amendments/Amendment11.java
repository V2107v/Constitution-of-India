package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment11);

        setTitle("Amendment 11");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (ELEVENTH AMENDMENT) ACT, 1961\n" +
                "\n" +
                "Statement of Objects and Reasons appended to the Constitution\n" +
                "(Eleventh Amendment) Bill, 1961 which was enacted as\n" +
                "the Constitution (Eleventh Amendment) Act, 1961\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "Under article 66(1) of the Constitution, the Vice-President has to be\n" +
                "elected by members of both Houses of Parliament assembled at a joint\n" +
                "meeting. The requirement that members of the two Houses should\n" +
                "assemble at a joint sitting for the election of the Vice-President\n" +
                "seems to be totally unnecessary and may also cause practical\n" +
                "difficulties. It is, therefore, proposed to amend this article to\n" +
                "provide that the Vice-President will be elected by members of an\n" +
                "electoral college consisting of members of both Houses of Parliament.\n" +
                "Under article 54 of the Constitution, the President is elected by an\n" +
                "electoral college consisting of the elected members of both Houses of\n" +
                "Parliament and of the Legislative Assemblies of the States. Every\n" +
                "effort is made to complete such elections before the date of the\n" +
                "Presidential election. It is, however, possible that the elections to\n" +
                "the two Houses of Parliament may not be completed before the President\n" +
                "or the Vice-President is elected. It is, therefore, proposed to amend\n" +
                "article 71 of the Constitution so as to make it clear that the\n" +
                "election of the President or the Vice-President cannot be challenged\n" +
                "on the ground of any vacancy for any reason in the appropriate\n" +
                "electoral college.\n" +
                "\n" +
                "2. The Bill seeks to achieve these objects. The notes on clauses\n" +
                "appended to the Bill explain the provisions thereof.\n" +
                "\n" +
                "NEW DELHI; A .K. SEN.\n" +
                "\n" +
                "The 24th November, 1961.\n" +
                "\n" +
                "THE CONSTITUTION (ELEVENTH AMENDMENT) ACT, 1961\n" +
                "\n" +
                "[19th December,1961.]\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Twelfth Year of the Republic of India as\n" +
                "follows:-\n" +
                "\n" +
                "1. Short title.-This Act may be called the Constitution (Eleventh\n" +
                "Amendment) Act, 1961.\n" +
                "\n" +
                "(2) Amendment of article 66.-In article 66 of the Constitution, in\n" +
                "clause (1), for the words \"members of both Houses of Parliament\n" +
                "assembled at a joint meeting\", the words \"members of an electoral\n" +
                "college consisting of the members of both Houses of Parliament\" shall\n" +
                "be substituted.\n" +
                "\n" +
                "3. Amendment of article 71.-In article 71 of the Constitution, after\n" +
                "clause (3), the following clause shall be inserted, namely:-\n" +
                "\n" +
                "\"(4) The election of a person as President or Vice-President shall not\n" +
                "be called in question on the ground of the existence of any vacancy\n" +
                "for whatever reason among the members of the electoral college\n" +
                "electing him.\".");
    }
}
