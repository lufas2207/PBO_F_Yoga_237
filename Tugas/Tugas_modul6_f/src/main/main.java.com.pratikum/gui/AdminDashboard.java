package main.java.com.praktikum.gui;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class AdminDashboard extends HBox {
    public AdminDashboard() {
        setSpacing(20);
        setPadding(new Insets(10));

        VBox laporanBox = new VBox(10);
        laporanBox.getChildren().addAll(new Label("Laporan Barang"), new TableView<>());

        VBox mahasiswaBox = new VBox(10);
        mahasiswaBox.getChildren().addAll(new Label("Data Mahasiswa"), new TableView<>());

        getChildren().addAll(laporanBox, mahasiswaBox);
    }
}
