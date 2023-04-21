package com.example.retailstoresystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {
    @FXML
    public Button signupbtn;
    @FXML
    private TextField txtuser;
    @FXML
    private TextField txtpassword;

    @FXML
    private ComboBox<String> RoleCB;

    @FXML
    public void initialize() {
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Manager",
                        "Customer",
                        "Cashier"
                );
        RoleCB.setItems(options);
        RoleCB.setPromptText("Select a role");
    }

    @FXML
    protected void OnSignUpButtonCLick(ActionEvent event) throws IOException
    {
        // Son here add the code to signup


        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root , 600, 400);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }


}
