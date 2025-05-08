package main.java.com.praktikum.gui;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class MahasiswaDashboard extends VBox {
    public MahasiswaDashboard(String nama) {
        setSpacing(10);
        setPadding(new Insets(10));

        Label greeting = new Label("Selamat datang, " + nama);
        Label laporanLabel = new Label("Laporkan Barang Hilang/Temuan");

        TextField namaBarang = new TextField();
        TextField deskripsi = new TextField();
        TextField lokasi = new TextField();

        Button laporkan = new Button("Laporkan");

        TableView<String> tabel = new TableView<>(); // Placeholder, bisa diisi lebih lanjut.

        Button logout = new Button("Logout");
        logout.setOnAction(e -> System.exit(0));

        getChildren().addAll(greeting, laporanLabel, namaBarang, deskripsi, lokasi, laporkan, tabel, logout);
    }
}