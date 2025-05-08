package main.java.com.praktikum.actions;

import javafx.scene.control.Alert;
import main.java.com.praktikum.users.Mahasiswa;

public class AdminActions {

    public static void showMahasiswaInfo(Mahasiswa mhs) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info Mahasiswa");
        alert.setHeaderText("Data Mahasiswa");
        alert.setContentText("Nama: " + mhs.getUsername() + "\nNIM: " + mhs.getNim());
        alert.showAndWait();
    }

    public static void exportData() {
        System.out.println("Data mahasiswa diekspor! (contoh)");
    }
}
