package com.example.retailstoresystem;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.Serializable;
public class Customer extends Muser implements Serializable  {
    public Customer(String userName, String userPassword, String userRole) {
        super(userName, userPassword, userRole);
    }

    private List<OrderItem> buyItemList=new ArrayList<>();

    public void addIntoTheList(Product product,int qty){
        buyItemList.add(new OrderItem(product,qty));
    }


}
