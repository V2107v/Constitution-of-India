package com.example.constitutionofindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Parts extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<Product> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts);

        setTitle("Parts");

        productList = new ArrayList<>();
        recyclerView = findViewById(R.id.partsRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(new Product("Part I","The Union and its Territory","Articles 1-4"));
        productList.add(new Product("Part II","Citizenship","Articles 5-11"));
        productList.add(new Product("Part III","Fundamental Rights","Articles 12-35"));
        productList.add(new Product("Part IV","Directive Principles of State Policy","Articles 36-51"));
        productList.add(new Product("Part IV [A]","Fundamental Duties","Articles 51a"));
        productList.add(new Product("Part V","The Union","Articles 52-151"));
        productList.add(new Product("Part VI","The States","Articles 152-237"));
        productList.add(new Product("Part VII","The States in Part B of First Schedule","Articles 238"));
        productList.add(new Product("Part VIII","The Union Territories","Articles 239-242"));
        productList.add(new Product("Part IX","The Panchayats","Articles 243-243q"));
        productList.add(new Product("Part IX [A]","The Municipalities","Articles 243p-243zg"));
        productList.add(new Product("Part IX [B]","The Co-Operative Societies","Articles 243zh-243zt"));
        productList.add(new Product("Part X","The Scheduled and Tribal Areas","Articles 244-244a"));
        productList.add(new Product("Part XI","Relations Between The Union and The States","Articles 245-263"));
        productList.add(new Product("Part XII","Finance, Property, Contract and Suits","Articles 264-300a"));
        productList.add(new Product("Part XIII","Trade, Commerce and Intercourse within the Territory of India","Articles 301-307"));
        productList.add(new Product("Part XIV","Services under the Union and the States","Articles 308-323"));
        productList.add(new Product("Part XIV [A]","Tribunals","Articles 323a-323b"));
        productList.add(new Product("Part XV","Elections","Articles 324-329a"));
        productList.add(new Product("Part XVI","Special Provisions relating to Certain Classes","Articles 330-342"));
        productList.add(new Product("Part XVII","Official Language","Articles 343-351"));
        productList.add(new Product("Part XVIII","Emergency Provisions","Articles 352-360"));
        productList.add(new Product("Part XIX","Miscellaneous","Articles 361-367"));
        productList.add(new Product("Part XX","Amendment of the Constitution","Articles 368"));
        productList.add(new Product("Part XXI","Temporary, Transitional and Special Provisions","Articles 369-392"));
        productList.add(new Product("Part XXII","Short Title, Commencement, Authoritative Text in Hindi and Repeals","Articles 393-395"));

        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);



    }
}
