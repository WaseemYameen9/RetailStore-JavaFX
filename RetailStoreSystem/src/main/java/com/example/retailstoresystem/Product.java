package com.example.retailstoresystem;

public class Product {
    private String productName;

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    private float productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }




    public Product(String productName, float productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;

    }

}
