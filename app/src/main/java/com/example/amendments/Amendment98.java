package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment98 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment98);

        setTitle("Amendment 98");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (NINETY-EIGHTH AMENDMENT) ACT, 2012 [1st January, 2013] An Act further to amend the Constitution of India. BE it enacted by Parliament in the Sixty-third. Year of the Republic of India as follows:\n" +
                "1. (1) This Act may be called the Constitution (Ninety-eighth Amendment) Act, 2012.,\n" +
                "(2) It shall come into force on such date as the Central Government may, by notification in the Official Gazette, appoint.\n" +
                "2. After article 371-1 of the Constitution, the following article shall be inserted, namely:\n" +
                "\"371J. (1) The President may, by order made with respect to the State of Karnataka, provide for any special responsibility of the Governor for\n" +
                "(a) establishment of a separate development board for Hyderabad-Karnataka region with the provision that a report on the working of the board will be placed each year before the State Legislative Assembly;\n" +
                "(b) equitable allocation of funds for developmental expenditure over the said region, subject to the requirements of the State as a whole; and\n" +
                "(c) equitable opportunities and facilities for the people belonging to the said region, in matters of public employment, education and vocational training, subject to the requirements of the State as a whole.\n" +
                "(2) An order made under sub-clause (c) of clause (1) may provide for \n" +
                "(a) reservation of a proportion of seats in educational and vocational training institutions in the Hyderabad-Karnataka region for students who belong to that region by birth or by domicile; and\n" +
                "(b) identification of posts or classes of posts under the State Government and in any body or organisation under the control of the State Government in the Hyderabad-Karnataka region and reservation of a proportion of such posts for persons who belong to that region by birth or by domicile and for appointment thereto by direct recruitment or by promotion or in any other manner as may be specified in the order.\".\n" +
                "P.K. MALHOTRA, Secretary to the Govt. of India.");
    }
}
