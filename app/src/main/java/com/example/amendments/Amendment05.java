package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment05);

        setTitle("Amendment 05");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (FIFTH AMENDMENT) ACT, 1955\n" +
                "[24th December, 1955.]\n" +
                "\n" +
                "\n" +
                "An Act further to amend the Constitution of India.\n" +
                "\n" +
                "BE it enacted by Parliament in the Sixth Year of the Republic of India as follows:---\n" +
                "\n" +
                "1. Short title.-This Act may be called the Constitution (Fifth Amendment) Act, 1955.\n" +
                "\n" +
                "2. Amendment of article 3.-In article 3 of the Constitution, for the proviso, the following proviso shall be substituted, namely:-\n" +
                "\n" +
                "\"Provided that no Bill for the purpose shall be introduced in either House of Parliament except on the recommendation of the President and unless, where the proposal contained in the Bill affects the area, boundaries or name of any of the States specified in Part A or Part B of the First Schedule, the Bill has been referred by the President to the Legislature of that State for expressing its views thereon within such period as may be specified in the reference or within such further period as the President may allow and the period so specified or allowed has expired.\".");
    }
}
