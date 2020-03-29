package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment94 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment94);

        setTitle("Amendment 94");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (NINETY-FOURTH AMENDMENT) ACT, 2005. [12th June, 2006.] An Act further to amend the Constitution of India. BE it enacted by Parliament in the Fifty-sixth Year of the Republic of India as follows:-\n" +
                "1. This Act may be called the Constitution (Ninety-fourth Amendment) Act, 2006\n" +
                "2. In article 164 of the Constitution, in clause (1), in the proviso, for the word \"Bihar\", the words \"Chattisgarh, Jharkhand\" shall be substituted.\n" +
                "K N CHATURVEDI, Secy. to the Govt. of India.");
    }
}
