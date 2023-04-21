package com.example.retailstoresystem;

import com.sun.javafx.charts.Legend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ViewProductsController {

    @FXML
    private TableView<Product> productsTable;

    @FXML
    private TableColumn<Product, String> nameColumn;

    @FXML
    private TableColumn<Product, Double> priceColumn;

    @FXML
    private TableColumn<Product, Integer> quantityColumn;

    private ObservableList<Product> products;

    public void initialize(URL url, ResourceBundle rb) {
        // assume productList is your list of products
        List<Product> productList = null;

        // convert productList to an ObservableList
        ObservableList<Product> products = FXCollections.observableArrayList(productList);

        // set the items of the TableView

        productsTable.setItems(products);

        // set up the columns and map the values of the product attributes to the cells
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

}
