package com.example.retailstoresystem;

import java.io.Serializable;

public class Product implements Serializable {
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
