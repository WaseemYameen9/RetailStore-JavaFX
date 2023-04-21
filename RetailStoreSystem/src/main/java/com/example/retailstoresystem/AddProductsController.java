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
        String name = nametxt.getText();
        String price = pricetxt.getText();
        String Qty = Qtytxt.getText();

        // make an object and send it to list


        nametxt.clear();
        pricetxt.clear();
        Qtytxt.clear();


    }


}
