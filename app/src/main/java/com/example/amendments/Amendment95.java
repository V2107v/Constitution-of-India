package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment95 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment95);

        setTitle("Amendment 95");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (NINETY-FIFTH AMENDMENT) ACT,2009 [18th January, 20I0.] An Act further to amend the Constitution of India. BE it enacted by Parliament in the Fifty-sixth Year of the Republic of India as follows:-\n" +
                "l.\n" +
                "(1) This Act may be called the Constitution (Ninety-fifth Amendment) Act, 2009.\n" +
                "(2) It shall come into force on the 25th day of January, 2010.\n" +
                "\n" +
                "2. In article 334 of the Constitution, for the words \"sixty years\", the words \"seventy years\" shall be substituted.\n" +
                "VK.BHASIN, Secy. to the Govt. of India.");
    }
}
