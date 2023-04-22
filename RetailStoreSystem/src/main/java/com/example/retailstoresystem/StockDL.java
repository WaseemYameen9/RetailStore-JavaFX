package com.example.retailstoresystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
public class StockDL implements Serializable {
    private static List<Stock> stockList=new ArrayList<>();
    public static Boolean getProductQty(String productName,int qty){
        loadStocksFromBinaryFile("stock.dat");
        for (Stock item:stockList) {
            if(item.getProduct().getProductName().equals(productName)){
                if(item.AvailableQTY(qty)){
                    if(item.getQty()==0){
                        stockList.remove(item);
                    }
                    storeStockToFile("stock.dat");
                }
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static boolean UpdateInfo(Product productitem,int qty){
        Stock item=searchStock(productitem.getProductName());
        if(item!=null){
            item.setProduct(productitem);
            item.setQty(qty);
            return true;
        }
        return false;
    }
    public static boolean deleteStock(String ProductName){
        loadStocksFromBinaryFile("stock.dat");
        Stock s=searchStock(ProductName);
        if(s!=null){
            stockList.remove(s);
            storeStockToFile("stock.dat");
            return true;
        }
        return false;
    }
    public static List<Stock> getList(){ return stockList;}
    public static void addInStock(Product product,int qty){
        Stock prevStock=searchStock(product.getProductName());
        if(prevStock!=null){
            prevStock.setQty(prevStock.getQty()+qty);
            storeStockToFile("stock.dat");
            return;
        }
        stockList.add(new Stock(product,qty));
        storeStockToFile("stock.dat");
    }
    public static Stock searchStock(String productName){
        for (Stock s:stockList ) {
            if(s.getProduct().getProductName().equals(productName))
                return s;
        }
        return null;
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

