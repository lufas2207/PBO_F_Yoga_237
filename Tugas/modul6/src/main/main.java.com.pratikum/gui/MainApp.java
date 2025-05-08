package main.java.com.praktikum.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.praktikum.users.*;

public class MainApp extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        showLoginPane();
    }

    public void showLoginPane() {
        LoginPane loginPane = new LoginPane(this);
        stage.setScene(new Scene(loginPane.getView(), 350, 250));
        stage.setTitle("Login");
        stage.show();
    }

    public void showAdminDashboard(Admin admin) {
        AdminDashboard dash = new AdminDashboard();
        stage.setScene(new Scene(dash.getView(), 500, 300));
        stage.setTitle("Dashboard Admin");
    }

    public void showMahasiswaDashboard(Mahasiswa mhs) {
        MahasiswaDashboard dash = new MahasiswaDashboard(mhs);
        stage.setScene(new Scene(dash.getView(), 400, 250));
        stage.setTitle("Dashboard Mahasiswa");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
