package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Anggota;

public class AnggotaController {
    @FXML private TextField tfID, tfNama, tfAlamat, tfHP;
    @FXML private TableView<Anggota> tableAnggota;
    @FXML private TableColumn<Anggota, String> colID, colNama, colAlamat, colHP;

    private ObservableList<Anggota> daftarAnggota = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colID.setCellValueFactory(new PropertyValueFactory<>("idAnggota"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colAlamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        colHP.setCellValueFactory(new PropertyValueFactory<>("nomorHp"));
        tableAnggota.setItems(daftarAnggota);
    }

    @FXML
    public void tambahAnggota(ActionEvent event) {
        String id = tfID.getText();
        String nama = tfNama.getText();
        String alamat = tfAlamat.getText();
        String hp = tfHP.getText();

        Anggota anggota = new Anggota(id, nama, alamat, hp);
        daftarAnggota.add(anggota);

        tfID.clear(); tfNama.clear(); tfAlamat.clear(); tfHP.clear();
    }
}