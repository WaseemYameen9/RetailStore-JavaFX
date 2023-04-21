module com.example.retailstoresystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.retailstoresystem to javafx.fxml;
    exports com.example.retailstoresystem;
}