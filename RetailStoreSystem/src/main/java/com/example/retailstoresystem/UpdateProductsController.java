package com.example.retailstoresystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UpdateProductsController {

    @FXML
    private TextField nametxt;
    @FXML
    private TextField pricetxt;
    @FXML
    private TextField Qtytxt;


    @FXML
    protected void updateBtnClicked()
    {
        ProductDL.loadProductsFromBinaryFile("products.dat");
        StockDL.loadStocksFromBinaryFile("stock.dat");
        if(! nametxt.getText().isEmpty() || ! pricetxt.getText().isEmpty() || ! Qtytxt.getText().isEmpty()) {
            String name = nametxt.getText();
            float price = Float.parseFloat(pricetxt.getText());
            int Qty = Integer.parseInt(Qtytxt.getText());


            // make an object and send it to list
            if(ProductDL.UpdateInfo(name,price)){
                if(StockDL.UpdateInfo(ProductDL.searchProduct(name),Qty)){
                    nametxt.clear();
                    pricetxt.clear();
                    Qtytxt.clear();
                    ProductDL.storeProductsToFile("products.dat");
                    StockDL.storeStockToFile("stock.dat");
                }
            }
            else {
                // not found message
            }

        }
    }

}
