package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Peminjaman;

import java.time.LocalDate;

public class PeminjamanController {
    @FXML private TextField tfIDPinjam, tfIDAnggota, tfKodeBuku;
    @FXML private DatePicker dpPinjam, dpKembali;
    @FXML private TableView<Peminjaman> tablePeminjaman;
    @FXML private TableColumn<Peminjaman, String> colIDPinjam, colIDAnggota, colKodeBuku;
    @FXML private TableColumn<Peminjaman, LocalDate> colTglPinjam, colTglKembali;

    private ObservableList<Peminjaman> daftarPeminjaman = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colIDPinjam.setCellValueFactory(new PropertyValueFactory<>("idPeminjaman"));
        colIDAnggota.setCellValueFactory(new PropertyValueFactory<>("idAnggota"));
        colKodeBuku.setCellValueFactory(new PropertyValueFactory<>("kodeBuku"));
        colTglPinjam.setCellValueFactory(new PropertyValueFactory<>("tanggalPinjam"));
        colTglKembali.setCellValueFactory(new PropertyValueFactory<>("tanggalKembali"));
        tablePeminjaman.setItems(daftarPeminjaman);
    }

    @FXML
    public void tambahPeminjaman(ActionEvent event) {
        String idPinjam = tfIDPinjam.getText();
        String idAnggota = tfIDAnggota.getText();
        String kodeBuku = tfKodeBuku.getText();
        LocalDate tglPinjam = dpPinjam.getValue();
        LocalDate tglKembali = dpKembali.getValue();

        Peminjaman pinjam = new Peminjaman(idPinjam, idAnggota, kodeBuku, tglPinjam, tglKembali);
        daftarPeminjaman.add(pinjam);

        tfIDPinjam.clear(); tfIDAnggota.clear(); tfKodeBuku.clear();
        dpPinjam.setValue(null); dpKembali.setValue(null);
    }
}