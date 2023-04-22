package com.example.retailstoresystem;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class DeleteProductsController {


    @FXML
    private TextField txtProductName;


    @FXML
    protected void deleteButtonClicked()
    {
        // Delete the product selected in the combobox also add products name in combobox
        if(StockDL.deleteStock(txtProductName.getText())){
            // message box done
            txtProductName.setText("");
        }
    }


    public void DeleteProductButtonClick(ActionEvent actionEvent) {
    }
}
