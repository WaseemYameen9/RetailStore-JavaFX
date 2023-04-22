package com.example.retailstoresystem;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class BuyProductController {
    @FXML
    private TextField nametxt;
    @FXML
    private TextField Qtytxt;


    @FXML
    protected void AddBuyBtnClick(){
        String name = nametxt.getText();
        int Qty =Integer.parseInt(Qtytxt.getText());
        if(StockDL.getProductQty(name,Qty)){
            Product buyProduct=ProductDL.searchProduct(name);
            OrderItem o=new OrderItem(buyProduct,Qty);
            nametxt.setText("");
            Qtytxt.setText("");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Message Box");
            alert.setHeaderText(null);
            alert.setContentText("Product Had been Purchased");
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Message Box");
            alert.setHeaderText(null);
            alert.setContentText("Product cannot be Purchased");
        }
    }

}
