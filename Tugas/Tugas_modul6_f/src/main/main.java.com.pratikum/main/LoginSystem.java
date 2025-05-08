package main.java.com.praktikum.main;

import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.praktikum.gui.AdminDashboard;
import main.java.com.praktikum.gui.MahasiswaDashboard;

public class LoginSystem {
    public static boolean login(Stage stage, String role, String username, String password) {
        if (role.equals("Mahasiswa") && username.equals("Nisrina") && password.equals("1234")) {
            stage.setScene(new Scene(new MahasiswaDashboard(username), 600, 400));
            return true;
        } else if (role.equals("Admin") && username.equals("admin") && password.equals("admin")) {
            stage.setScene(new Scene(new AdminDashboard(), 800, 500));
            return true;
        } else {
            return false;
        }
    }
}
