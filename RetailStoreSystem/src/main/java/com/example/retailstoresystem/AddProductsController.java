package com.example.retailstoresystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddProductsController {

    @FXML
    private TextField nametxt;
    @FXML
    private TextField pricetxt;
    @FXML
    private TextField Qtytxt;



    @FXML
    protected void AddBtnClick()
    {
        if(! nametxt.getText().isEmpty() || ! pricetxt.getText().isEmpty() || ! Qtytxt.getText().isEmpty()) {
            String name = nametxt.getText();
            float price = Float.parseFloat(pricetxt.getText());
            int Qty = Integer.parseInt(Qtytxt.getText());

            ProductDL.addProduct(name, price);
            Product item = ProductDL.searchProduct(name);
            StockDL.addInStock(item, Qty);


            nametxt.clear();
            pricetxt.clear();
            Qtytxt.clear();
        }
        else{
            // show message box
        }

    }


}
