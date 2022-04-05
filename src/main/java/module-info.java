module com.example.sepuebung04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sepuebung04 to javafx.fxml;
    exports com.example.sepuebung04;
}