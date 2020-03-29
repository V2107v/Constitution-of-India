package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment02);

        setTitle("Amendment 02");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (SECOND AMENDMENT) ACT, 1952\n" +
                "\n" +
                "Statement of Objects and Reasons appended to THE CONSTITUTION (Second Amendment) Bill, 1952 which was enacted as the the Constitution (Second Amendment) Act, 1952\n" +
                "\n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "\n" +
                "Article 81(1)(a) prescribes an absolute limit of 500 elected members in the House of the People. Article 81(1)(b) provides that the States shall be divided, grouped or formed into territorial constituencies and the number of members to be allotted to each such constituency shall be so determined as to ensure that there shall be not less than one member for every 750,000 of the population and not more than one member for every 500,000 of the population.\n" +
                "\n" +
                "The present delimitation of Parliamentary and Assembly constituencies is based on the estimates of population which have been given legal validity by an order of the President under article 387 of the Constitution. Article 81(3) of the Constitution, however, requires that upon the completion of each census, the representation of the several territorial constituencies in the House of the People and the Legislative Assemblies of each State shall be re-adjusted by such authority, in such manner and with effect from such date as Parliament may by law determine. A Bill providing for the matters referred to in that article is being introduced in Parliament. Provision has been made in that Bill for the setting up of a Delimitation Commission for the purpose of effecting re-adjustment of the representation in the House of the People and in the State Legislative Assemblies on the basis of the population as ascertained at the census of 1951.\n" +
                "\n" +
                "There is a considerable difference between the population of the several States as estimated in the President's order and in the population as ascertained at the census of 1951. At present, seats have been allotted in the House of the People to Part A and Part B States on the basis of one member for every 7.2 lakhs of the estimated population giving a total of 470 members to these States. The census figures are higher in all cases, and in view of the overall limit of 500 members prescribed in article 81(1) (a), it is not possible to increase appreciably the total number of seats allotted to these States. It is accordingly necessary to reduce the representation from one member for every 7.2 lakhs of population to one member for every 7.5 lakhs of population as per 1951 census. As pointed out above, this figure 7.5 lakhs is the maximum permissible under article 81(1)(b) as it now stands; but even so, if the average population of a Parliamentary constituency in any State is to be 750,000 it is obvious that the population of a certain number of constituencies will exceed that figure. It is necessary, therefore, that article 81(1)(b) should be amended relaxing the limits prescribed in that article so as to avoid a constitutional irregularity in delimiting the constitutencies for the purpose of re-adjustment of representation in the House of the People as required under article 81(3) of the Constitution. This Bill accordingly seeks to amend article 81(1)(b) of the Constitution so as to replace the figures mentioned in that article by the figures 850,000 and 650,000 respectively.\n" +
                "\n" +
                "NEW DELHI; C.C. BISWAS.\n" +
                "\n" +
                "The 19th May, 1952.\n" +
                "\n" +
                "THE CONSTITUTION (SECOND AMENDMENT) ACT, 1952\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "[1st May, 1953.]\n" +
                "\n" +
                "BE it enacted by Parliament as follows:-\n" +
                "\n" +
                "1. Short title.-This Act may be called the Constitution (Second Amendment) Act, 1952.\n" +
                "\n" +
                "2. Amendment of article 81.-In sub-clause (b) of clause (1) of article 81 of the Constitution, the words and figures \"not less than one member for every 750,000 of the population and\" shall be omitted.");
    }
}
