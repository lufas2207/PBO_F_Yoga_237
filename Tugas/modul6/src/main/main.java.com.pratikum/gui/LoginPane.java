package main.java.com.praktikum.gui;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import main.java.com.praktikum.main.LoginSystem;
import main.java.com.praktikum.users.*;

public class LoginPane {
    private VBox root;
    private MainApp app;

    public LoginPane(MainApp app) {
        this.app = app;

        root = new VBox(10);
        root.setPadding(new Insets(20));

        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Label status = new Label();
        Button loginButton = new Button("Login");

        root.getChildren().addAll(
                new Label("Username:"), usernameField,
                new Label("Password:"), passwordField,
                loginButton, status
        );

        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            User user = LoginSystem.authenticate(username, password);

            if (user == null) {
                status.setText("Login gagal.");
            } else if (user instanceof Admin) {
                app.showAdminDashboard((Admin) user);
            } else {
                app.showMahasiswaDashboard((Mahasiswa) user);
            }
        });
    }

    public VBox getView() {
        return root;
    }
}
