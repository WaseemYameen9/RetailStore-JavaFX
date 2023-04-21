package com.example.retailstoresystem;

public class Stock {
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    private Product product;
    private int Qty;

    public Stock(Product product, int qty) {
        this.product = product;
        Qty = qty;
    }
    public boolean AvailableQTY(int qty){
        if(this.Qty<=qty){
            this.Qty=this.Qty-qty;
        }
        return false;
    }
}
