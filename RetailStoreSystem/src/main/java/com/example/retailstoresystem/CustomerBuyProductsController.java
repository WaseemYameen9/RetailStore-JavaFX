package com.example.retailstoresystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CustomerBuyProductsController {
    private TextField nametxt;
    private TextField Qtytxt;

    @FXML
    protected void BuyProduct()
    {
        String name = nametxt.getText();
        String Qty = Qtytxt.getText();

        //Wrte code here

    }
}
