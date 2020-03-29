package com.example.constitutionofindia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Preamble extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preamble);

        setTitle("Preamble");

        TextView textView = findViewById(R.id.content);

        textView.setText("WE, THE PEOPLE OF INDIA, having solemnly resolved to constitute India into a SOVEREIGN SOCIALIST SECULAR DEMOCRATIC REPUBLIC and to secure to all its citizens:\n" +
                "JUSTICE, social, economic and political;\n" +
                "LIBERTY of thought, expression, belief, faith and worship;\n" +
                "EQUALITY of status and of opportunity;\n" +
                "and to promote among them all\n" +
                "FRATERNITY assuring the dignity of the individual and the unity and integrity of the Nation;\n" +
                "\n" +
                "In Our Constituent Assembly this twenty-sixth day of November, 1949, do Hereby Adopt, Enact And Give To Ourselves This Constitution.");
    }
}
