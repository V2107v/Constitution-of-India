package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment96 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment96);

        setTitle("Amendment 96");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (NINETY-SIXTH AMENDMENT) ACT, 2011 [23rd September, 2011.] An Act further to amend the Constitution of India.BE it enacted by Parliament in the Fifty-sixth Year of the Republic of India as follows:-\n" +
                "1. This Act may be called the Constitution (Ninety-sixth Amendment) Act, 2011.\n" +
                "2. In the Eighth Schedule to the Constitution, in entry 15, for the word \"Oriya\", the word \"Odia\" shall be substituted.\n" +
                "V.K.BHASIN, Secy. to the Govt. of India.");
    }
}
