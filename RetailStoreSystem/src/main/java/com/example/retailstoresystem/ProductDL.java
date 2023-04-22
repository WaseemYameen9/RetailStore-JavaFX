package com.example.retailstoresystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
public class ProductDL implements Serializable{
    private static List<Product> productList = new ArrayList<>();

    public static void addProduct(String productName, float productPrice) {
        Product searchItem=searchProduct(productName);
        if(searchItem!=null){
            searchItem.setProductPrice(productPrice);
            return;
        }
        productList.add(new Product(productName, productPrice));
        storeProductsToFile("products.dat");
    }
public static List<Product> getList(){ return productList;}
    public Product getPorduct(String name) {
        for (Product item : productList) {
            if(item.getProductName()==name){
                return item;
            }
        }
        return null;
    }
    public static  Product searchProduct(String productName){
        for (Product item:productList ) {
            if(item.getProductName().equals(productName)){
                return  item;
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
    public static boolean UpdateInfo(String productName,float price){
        Product item=searchProduct(productName);
        if(item!=null){
            item.setProductPrice(price);
            storeProductsToFile("products.dat");
            return true;
        }
        return false;
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
