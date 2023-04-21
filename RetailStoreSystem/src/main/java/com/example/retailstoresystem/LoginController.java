package com.example.retailstoresystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    public Button signupbtn;
    @FXML
    private TextField txtuser;
    @FXML
    private TextField txtpassword;

    @FXML
    private ComboBox RoleCB;

    public LoginController() {

    }

    @FXML
    protected void OnLoginButtonClick(ActionEvent event) throws IOException
    {
        if(txtuser.getText().equals("waseem") && txtpassword.getText().equals("123"))
        {
            //Son here add the code to Login


            Parent root = FXMLLoader.load(getClass().getResource("CustomerDashboard.fxml"));
            Scene scene = new Scene(root , 750, 500);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        }
    }
    @FXML
    protected void OnSignUpButtonCLick(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene = new Scene(root , 600, 400);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }


}
