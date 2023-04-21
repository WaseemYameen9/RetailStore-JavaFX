package com.example.retailstoresystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
public class StockDL implements Serializable {
    private static List<Stock> stockList=new ArrayList<>();
    public static Boolean getProductQty(String productName,int qty){
        for (Stock item:stockList) {
            if(item.getProduct().getProductName().equals(productName)){
                if(item.AvailableQTY(qty))
                    if(item.getQty()==0){
                        stockList.remove(item);
                    }
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public void addInStock(Product product,int qty){
        stockList.add(new Stock(product,qty));
    }

    public static void storeStockToFile(String filename)
    {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(stockList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void loadStocksFromBinaryFile(String filename) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
            stockList = (ArrayList<Stock>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

