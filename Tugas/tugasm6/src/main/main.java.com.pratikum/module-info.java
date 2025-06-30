module com.example.tugasm6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugasm6 to javafx.fxml;
    exports com.example.tugasm6;
}