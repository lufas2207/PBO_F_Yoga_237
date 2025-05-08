package com.example.terserah;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.Random;

public class apapun extends Application {

    private int targetNumber;
    private int attempts;
    private Label feedbackLabel;
    private Label attemptLabel;
    private TextField inputField;
    private Button guessButton;

    @Override
    public void start(Stage primaryStage) {
        generateNewGame();


        Label promptLabel = new Label("Tebak angka (10–50):");
        inputField = new TextField();
        inputField.setPromptText("Masukkan angka");

        feedbackLabel = new Label("");
        attemptLabel = new Label("Jumlah percobaan: 0");

        guessButton = new Button("Coba Tebak!");
        guessButton.setOnAction(e -> processGuess());

        HBox inputBox = new HBox(10, inputField, guessButton);
        VBox root = new VBox(10, promptLabel, inputBox, feedbackLabel, attemptLabel);
        root.setStyle("-fx-padding: 20px");

        primaryStage.setScene(new Scene(root, 350, 180));
        primaryStage.setTitle("Tebak Angka");
        primaryStage.show();
    }

    private void processGuess() {
        String input = inputField.getText();
        try {
            int guess = Integer.parseInt(input);
            attempts++;
            attemptLabel.setText("Jumlah percobaan: " + attempts);

            if (guess < targetNumber) {
                feedbackLabel.setText("Terlalu kecil!");
            } else if (guess > targetNumber) {
                feedbackLabel.setText("Terlalu besar!");
            } else {
                feedbackLabel.setText("Tebakan benar!");
                guessButton.setText("Main Lagi");
                guessButton.setOnAction(e -> resetGame());
            }
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Masukkan angka yang valid!");
        }
    }

    private void resetGame() {
        generateNewGame();
        inputField.clear();
        feedbackLabel.setText("");
        attemptLabel.setText("Jumlah percobaan: 0");
        guessButton.setText("Coba Tebak!");
        guessButton.setOnAction(e -> processGuess());
    }

    private void generateNewGame() {
        targetNumber = new Random().nextInt(100) + 1;
        attempts = 0;
    }

    public static void main(String[] args) {
        launch(args);
    }
}