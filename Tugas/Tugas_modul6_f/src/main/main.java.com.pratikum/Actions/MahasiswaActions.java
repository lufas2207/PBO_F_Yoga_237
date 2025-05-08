package main.java.com.praktikum.actions;

import javafx.scene.control.Alert;
import main.java.com.praktikum.users.Mahasiswa;

public class MahasiswaActions {

    public static void showWelcomeMessage(Mahasiswa mhs) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Selamat Datang");
        alert.setHeaderText(null);
        alert.setContentText("Halo " + mhs.getUsername() + "!\nNIM: " + mhs.getNim());
        alert.showAndWait();
    }

    public static void submitTugas() {
        System.out.println("Tugas berhasil dikumpulkan! (contoh)");
    }
}
