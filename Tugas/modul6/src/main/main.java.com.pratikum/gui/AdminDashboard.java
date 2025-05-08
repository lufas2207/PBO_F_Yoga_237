package main.java.com.praktikum.gui;

import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import main.java.com.praktikum.data.DataStore;
import main.java.com.praktikum.users.Mahasiswa;

public class AdminDashboard {
    private VBox root;

    public AdminDashboard() {
        root = new VBox(10);

        TableView<Mahasiswa> table = new TableView<>();
        TableColumn<Mahasiswa, String> namaCol = new TableColumn<>("Nama");
        namaCol.setCellValueFactory(new PropertyValueFactory<>("username"));

        TableColumn<Mahasiswa, String> nimCol = new TableColumn<>("NIM");
        nimCol.setCellValueFactory(new PropertyValueFactory<>("nim"));

        ObservableList<Mahasiswa> data = DataStore.getMahasiswaList();
        table.setItems(data);
        table.getColumns().addAll(namaCol, nimCol);

        root.getChildren().addAll(new Label("Dashboard Admin"), table);
    }

    public VBox getView() {
        return root;
    }
}
