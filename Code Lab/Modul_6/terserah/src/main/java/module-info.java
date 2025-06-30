module com.example.terserah {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.terserah to javafx.fxml;
    exports com.example.terserah;
}