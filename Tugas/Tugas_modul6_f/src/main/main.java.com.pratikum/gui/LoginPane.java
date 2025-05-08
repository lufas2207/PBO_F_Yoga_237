package main.java.com.praktikum.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import main.java.com.praktikum.main.LoginSystem;

public class LoginPane extends VBox {
    public LoginPane(Stage stage) {
        setSpacing(10);
        setPadding(new Insets(20));
        setAlignment(Pos.CENTER);

        Label title = new Label("Login Sistem Lost & Found");

        ComboBox<String> roleBox = new ComboBox<>();
        roleBox.getItems().addAll("Mahasiswa", "Admin");
        roleBox.setValue("Mahasiswa");

        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Label feedback = new Label();

        Button loginBtn = new Button("Login");
        loginBtn.setOnAction(e -> {
            String role = roleBox.getValue();
            String user = usernameField.getText();
            String pass = passwordField.getText();

            boolean success = LoginSystem.login(stage, role, user, pass);
            if (!success) {
                feedback.setText("Login gagal, periksa kredensial.");
            }
        });

        getChildren().addAll(title, roleBox, usernameField, passwordField, loginBtn, feedback);
    }
}
