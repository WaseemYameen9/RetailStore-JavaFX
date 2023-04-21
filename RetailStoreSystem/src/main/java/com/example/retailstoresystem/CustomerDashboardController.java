package com.example.retailstoresystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class CustomerDashboardController {


    @FXML
    private StackPane contentarea;

    @FXML
    protected void ViewProductButtonClick() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("CustomerViewProducts.fxml"));
            if (contentarea != null) {
                contentarea.getChildren().removeAll();
                contentarea.getChildren().setAll(fxml);
            } else {
                // handle the case when contentarea is null
                System.out.println("contentarea is null");
            }
        } catch (IOException e) {
            // Handle the exception here
            e.printStackTrace();
        }
    }




    @FXML
    protected void BuyProductButtonClick() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("CustomerBuyProducts.fxml"));
            if (contentarea != null) {
                contentarea.getChildren().removeAll();
                contentarea.getChildren().setAll(fxml);
            } else {
                // handle the case when contentarea is null
                System.out.println("contentarea is null");
            }
        } catch (IOException e) {
            // Handle the exception here
            e.printStackTrace();
        }
    }





}
