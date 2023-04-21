package com.example.retailstoresystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
public class ProductDL implements Serializable{
    private static List<Product> productList = new ArrayList<>();

    public static void addProduct(String productName, float productPrice) {
        productList.add(new Product(productName, productPrice));
    }

    public Product getPorduct(String name) {
        for (Product item : productList) {
            if(item.getProductName()==name){
                return item;
            }
        }
        return null;
    }

    public static void storeProductsToFile(String filename)
    {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void loadProductsFromBinaryFile(String filename) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
            productList = (ArrayList<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
