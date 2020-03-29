package com.example.amendments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Amendment79 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendment79);

        setTitle("Amendment 79");

        TextView textView = findViewById(R.id.content);

        textView.setText("THE CONSTITUTION (SEVENTY-NINTH AMENDMENT) ACT, 2000\n" +
                "Statement of Objects and Reasons appended to the Constitution (Eighty-Fourth Amendment) Bill, 1999 which was enacted as the Constitution (Seventy-ninth Amendment) Act, 2000. \n" +
                "STATEMENT OF OBJECTS AND REASONS\n" +
                "Article 334 of the Constitution lays down that the provisions of the Constitution relating to the reservation of seats for the Scheduled Castes and the Scheduled Tribes and the representation of Anglo-Indian community by nomination in the Lok Sabha and in the Legislative Assemblies of the States shall cease to have effect on the expiration of a period of fifty years from the commencement of the Constitution. Although the Scheduled Castes and the Scheduled Tribes have made considerable progress in the last fifty years, the reasons which weighed with the Constituent Assembly in making provisions with regard to the aforesaid reservation of seats and nomination of members, have not ceased to exist. It is, therefore, proposed to continue the reservation for the Scheduled Castes and the Scheduled Tribes and the representation of the Anglo-Indians by nomination for a further period of ten years.\n" +
                "The Bill seeks to achieve the above object.\n" +
                "NEW DELHI ; RAM JETHMALANI. The 21st October, 1999.\n" +
                "THE CONSTITUTION (SEVENTY-NINTH AMENDMENT) ACT, 1999 [21st January, 2000] An act further to amend the Constitution of India. BE it enacted by Parliament in the Fiftieth Year of the Republic of India as follows:-\n" +
                "Short title and Commencement :\n" +
                "(1) This Act may be called the Constitution (Seventy-Ninth Amendment) Act, 1999.\n" +
                "(2) It shall come into force on the 25th day of January, 2000.\n" +
                "2. Amendment of article 334: In article 334 of the Constitution, for the words \"fifty years\", the words \"sixty years\" shall be substituted.");
    }
}
