package main.java.com.praktikum.gui;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import main.java.com.praktikum.users.Mahasiswa;

public class MahasiswaDashboard {
    private VBox root;

    public MahasiswaDashboard(Mahasiswa mhs) {
        root = new VBox(10);
        root.getChildren().addAll(
                new Label("Dashboard Mahasiswa"),
                new Label("Selamat datang, " + mhs.getUsername()),
                new Label("NIM: " + mhs.getNim())
        );
    }

    public VBox getView() {
        return root;
    }
}
