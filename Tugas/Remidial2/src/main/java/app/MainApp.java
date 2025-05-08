package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField tfNama = new TextField();
        tfNama.setPromptText("Nama Makanan");

        TextField tfHarga = new TextField();
        tfHarga.setPromptText("Harga");

        TextField tfJumlah = new TextField();
        tfJumlah.setPromptText("Jumlah Porsi");

        Label lblOutputBiasa = new Label();
        Label lblOutputSpesial = new Label();

        Button btnTampilkan = new Button("Tampilkan Pesanan");
        Button btnReset = new Button("Reset");

        MakananSpesial makananSpesial = new MakananSpesial("Steak", 75000, 1, "Saus Premium", 15000);

        btnTampilkan.setOnAction(e -> {
            try {
                String nama = tfNama.getText();
                double harga = Double.parseDouble(tfHarga.getText());
                int jumlah = Integer.parseInt(tfJumlah.getText());

                Makanan makanan = new Makanan(nama, harga, jumlah);

                lblOutputBiasa.setText("Makanan Biasa:\n" + makanan.tampilkanInfo());
                lblOutputSpesial.setText("Makanan Spesial:\n" + makananSpesial.tampilkanInfo());

            } catch (NumberFormatException ex) {
                lblOutputBiasa.setText("Input tidak valid!");
                lblOutputSpesial.setText("");
            }
        });

        btnReset.setOnAction(e -> {
            tfNama.clear();
            tfHarga.clear();
            tfJumlah.clear();
            lblOutputBiasa.setText("");
            lblOutputSpesial.setText("");
        });

        VBox root = new VBox(10,
                new Label("Pemesanan Makanan Restoran"),
                tfNama, tfHarga, tfJumlah,
                btnTampilkan, btnReset,
                lblOutputBiasa, lblOutputSpesial
        );
        root.setStyle("-fx-padding: 15; -fx-font-size: 14;");

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Pemesanan Makanan Restoran");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
