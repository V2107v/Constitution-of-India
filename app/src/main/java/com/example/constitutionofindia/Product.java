package com.example.constitutionofindia;

public class Product {

    private String headingparts, subheadingparts, sideheadingparts;

    public Product(String headingparts, String subheadingparts, String sideheadingparts) {
        this.headingparts = headingparts;
        this.subheadingparts = subheadingparts;
        this.sideheadingparts = sideheadingparts;
    }

    public String getHeadingparts() {
        return headingparts;
    }

    public String getSubheadingparts() {
        return subheadingparts;
    }

    public String getSideheadingparts() {
        return sideheadingparts;
    }
}