package com.example.retailstoresystem;

public class OrderItem {
    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItem(Product item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    private Product item;
    int quantity;
}
