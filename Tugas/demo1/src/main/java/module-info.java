module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.java.com.pratikum to javafx.fxml;
    exports main.java.com.pratikum;
}