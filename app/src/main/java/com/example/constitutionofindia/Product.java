package com.example.constitutionofindia;

public class Product {

    private String headingparts, subheadingparts, sideheadingparts2;

    public Product(String headingparts, String subheadingparts, String sideheadingparts2) {
        this.headingparts = headingparts;
        this.subheadingparts = subheadingparts;
        this.sideheadingparts2 = sideheadingparts2;
    }

    public String getHeadingparts() {
        return headingparts;
    }

    public String getSubheadingparts() {
        return subheadingparts;
    }


    public String getSideheadingparts2() {
        return sideheadingparts2;
    }
}