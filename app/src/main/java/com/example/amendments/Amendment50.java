package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment50);

        setTitle("Amendment 50");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (FIFTIETH AMENDMENT) ACT, 1984\n" +
                "\n" +
                "Statement of Objects and Reasons appended to the Constitution (Fifty-second Amendment) Bill, 1984 (Bill No. 80 of 1984) which was enacted as THE CONSTITUTION (Fiftieth Amemdment) Act, 1984\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "By article 33 of the Constitution, Parliament is empowered to enact laws determining to what extent any of the rights conferred by Part III of the Constitution shall, in their application to the members of the Armed Forces or the Forces charged with the maintenance of public order, be restricted or abrogated so as to ensure the proper discharge of their duties and the maintenance of discipline among them.\n" +
                "\n" +
                "2. It is proposed to amend article 33 so as to bring within its ambit-\n" +
                "\n" +
                "(i) the members of the Forces charged with the protection of property belonging to, or in the charge or possession of, the State; or\n" +
                "\n" +
                "(ii) persons employed in any bureau or other organization established by the State for purposes of intelligence or counter intelligence; or\n" +
                "\n" +
                "(iii) persons employed in, or in connection with, the telecommunication systems set up for the purposes of any Force, bureau or organisation.\n" +
                "\n" +
                "Experience has revealed that the need for ensuring proper discharge of their duties and the maintenance of discipline among them is of paramount importance in the national interest.\n" +
                "\n" +
                "3. The Bill seeks to achieve the above object.\n" +
                "\n" +
                "NEW DELHI; P. V. NARASHIMHA RAO.\n" +
                "The 18th August, 1984\n" +
                "\n" +
                "THE CONSTITUTION (FIFTIETH AMENDMENT) ACT, 1984\n" +
                "\n" +
                "[11th September, 1984.]\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Thirty-fifth Year of the Republic of India as follows:-\n" +
                "\n" +
                "1. Short title.-This Act may be called the Constitution (Fiftieth Amendment) Act, 1984.\n" +
                "\n" +
                "2. Substitution of article 33.-For article 33 of the Constitution, the following article shall be substituted, namely:-\n" +
                "\n" +
                "\"33. Power of Parliament to modify the rights conferred by this Part in their application to Forces, etc.-Parliament may, by law, determine to what extent any of the rights conferred by this Part shall, in their application to,-\n" +
                "\n" +
                "(a) the members of the Armed Forces; or\n" +
                "\n" +
                "(b) the members of the Forces charged with the maintenance of public order; or\n" +
                "\n" +
                "(c) persons employed in any bureau or other organisation established by the State for purposes of intelligence or counter intelligence; or\n" +
                "\n" +
                "(d) persons employed in, or in connection with, the telecommunication systems set up for the purposes of any Force, bureau or organisation referred to in clauses (a) to (c),\n" +
                "\n" +
                "be restricted or abrogated so as to ensure the proper discharge of their duties and the maintenance of discipline among them.\".");
    }
}
