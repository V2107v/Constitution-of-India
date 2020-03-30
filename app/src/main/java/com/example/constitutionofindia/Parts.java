package com.example.constitutionofindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


import com.example.parts.*;


import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class Parts extends AppCompatActivity implements ProductAdapter.itemClickListener {

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

        productList.add(new Product("Part I","The Union and its Territory","1-4"));
        productList.add(new Product("Part II","Citizenship","5-11"));
        productList.add(new Product("Part III","Fundamental Rights","12-35"));
        productList.add(new Product("Part IV","Directive Principles of State Policy","36-51"));
        productList.add(new Product("Part IV [A]","Fundamental Duties","51a"));
        productList.add(new Product("Part V","The Union","52-151"));
        productList.add(new Product("Part VI","The States","152-237"));
        productList.add(new Product("Part VII","The States in Part B of First Schedule","238"));
        productList.add(new Product("Part VIII","The Union Territories","239-242"));
        productList.add(new Product("Part IX","The Panchayats","243-243q"));
        productList.add(new Product("Part IX [A]","The Municipalities","243p-243zg"));
        productList.add(new Product("Part IX [B]","The Co-Operative Societies","243zh-243zt"));
        productList.add(new Product("Part X","The Scheduled and Tribal Areas","244-244a"));
        productList.add(new Product("Part XI","Relations Between The Union and The States","245-263"));
        productList.add(new Product("Part XII","Finance, Property, Contract and Suits","264-300a"));
        productList.add(new Product("Part XIII","Trade, Commerce and Intercourse within the Territory of India","301-307"));
        productList.add(new Product("Part XIV","Services under the Union and the States","308-323"));
        productList.add(new Product("Part XIV [A]","Tribunals","323a-323b"));
        productList.add(new Product("Part XV","Elections","324-329a"));
        productList.add(new Product("Part XVI","Special Provisions relating to Certain Classes","330-342"));
        productList.add(new Product("Part XVII","Official Language","343-351"));
        productList.add(new Product("Part XVIII","Emergency Provisions","352-360"));
        productList.add(new Product("Part XIX","Miscellaneous","361-367"));
        productList.add(new Product("Part XX","Amendment of the Constitution","368"));
        productList.add(new Product("Part XXI","Temporary, Transitional and Special Provisions","369-392"));
        productList.add(new Product("Part XXII","Short Title, Commencement, Authoritative Text in Hindi and Repeals","393-395"));

        adapter = new ProductAdapter(this,productList,this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void itemClickListener(int position) {
        if(position == 0) {
            Intent intent = new Intent(this,I.class);
            startActivity(intent);
        } else if(position == 1) {
            Intent intent = new Intent(this, II.class);
            startActivity(intent);
        } else if(position == 2) {
            Intent intent = new Intent(this, III.class);
            startActivity(intent);
        } else if(position == 3) {
            Intent intent = new Intent(this, IV.class);
            startActivity(intent);
        } else if(position == 4) {
            Intent intent = new Intent(this, IVA.class);
            startActivity(intent);
        } else if(position == 5) {
            Intent intent = new Intent(this, V.class);
            startActivity(intent);
        } else if(position == 6) {
            Intent intent = new Intent(this, VI.class);
            startActivity(intent);
        } else if(position == 7) {
            Intent intent = new Intent(this, VII.class);
            startActivity(intent);
        } else if(position == 8) {
            Intent intent = new Intent(this, VIII.class);
            startActivity(intent);
        } else if(position == 9) {
            Intent intent = new Intent(this, IX.class);
            startActivity(intent);
        } else if(position == 10) {
            Intent intent = new Intent(this, IXA.class);
            startActivity(intent);
        } else if(position == 11) {
            Intent intent = new Intent(this, IXB.class);
            startActivity(intent);
        } else if(position == 12) {
            Intent intent = new Intent(this, X.class);
            startActivity(intent);
        } else if(position == 13) {
            Intent intent = new Intent(this, XI.class);
            startActivity(intent);
        } else if(position == 14) {
            Intent intent = new Intent(this, XII.class);
            startActivity(intent);
        } else if(position == 15) {
            Intent intent = new Intent(this, XIII.class);
            startActivity(intent);
        } else if(position == 16) {
            Intent intent = new Intent(this, XIV.class);
            startActivity(intent);
        } else if(position == 17) {
            Intent intent = new Intent(this, XIVA.class);
            startActivity(intent);
        } else if(position == 18) {
            Intent intent = new Intent(this, XV.class);
            startActivity(intent);
        } else if(position == 19) {
            Intent intent = new Intent(this, XVI.class);
            startActivity(intent);
        } else if(position == 20) {
            Intent intent = new Intent(this, XVII.class);
            startActivity(intent);
        } else if(position == 21) {
            Intent intent = new Intent(this, XVIII.class);
            startActivity(intent);
        } else if(position == 22) {
            Intent intent = new Intent(this, XIX.class);
            startActivity(intent);
        } else if(position == 23) {
            Intent intent = new Intent(this, XX.class);
            startActivity(intent);
        } else if(position == 24) {
            Intent intent = new Intent(this, XXI.class);
            startActivity(intent);
        } else if(position == 25) {
            Intent intent = new Intent(this, XXII.class);
            startActivity(intent);
        }
    }
}
