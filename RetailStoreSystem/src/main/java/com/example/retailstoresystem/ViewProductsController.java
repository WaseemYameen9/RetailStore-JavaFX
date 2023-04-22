package com.example.retailstoresystem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewProductsController {

    @FXML
    private TableView<Stock> productsTable;

    @FXML
    private TableColumn<Stock, String> nameColumn;

    @FXML
    private TableColumn<Stock, Double> priceColumn;

    @FXML
    private TableColumn<Stock, Integer> quantityColumn;

    private ObservableList<Stock> products;

    public void initialize(URL url, ResourceBundle rb) {
        refreshTable();
    }

    public void handleRefreshButton() {
        refreshTable();
    }

    private void refreshTable() {
        StockDL.loadStocksFromBinaryFile("stock.dat");
        if (!StockDL.getList().isEmpty()) {
            // convert productList to an ObservableList
            ObservableList<Stock> products = FXCollections.observableArrayList(StockDL.getList());

            // set the items of the TableView
            productsTable.setItems(products);

            // set up the columns and map the values of the product attributes to the cells
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
            priceColumn.setCellValueFactory(new PropertyValueFactory<>("productPrice"));
            quantityColumn.setCellValueFactory(new PropertyValueFactory<>("qty"));

            // custom cell factory for the quantity column to display the available quantity of the product in stock
            quantityColumn.setCellFactory(column -> {
                return new TableCell<Stock, Integer>() {
                    @Override
                    protected void updateItem(Integer qty, boolean empty) {
                        super.updateItem(qty, empty);
                        if (empty) {
                            setText("");
                        } else {
                            setText(String.valueOf(qty));
                            Stock stock = (Stock) getTableRow().getItem();
                            if (stock != null && qty > 0) {
                                setTextFill(javafx.scene.paint.Color.GREEN);
                            } else {
                                setTextFill(javafx.scene.paint.Color.RED);
                            }
                        }
                    }
                };
            });
        } else {
            // show message box
        }
    }

}
