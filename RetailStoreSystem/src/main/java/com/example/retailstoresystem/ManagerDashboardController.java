package com.example.retailstoresystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerDashboardController {
    @FXML
    private StackPane contentarea;

    @FXML
    protected void ViewProductButtonClick() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("ViewProducts.fxml"));
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
    protected void UpdateProductButtonClick() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("UpdateProducts.fxml"));
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
    protected void DeleteProductButtonClick() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("DeleteProducts.fxml"));
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
    protected void AddProductButtonClick() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("AddProducts.fxml"));
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
    protected void SignoutButtonClick(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root , 600, 400);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }





}
