package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Buku;

import java.io.IOException;

public class BukuController {
    @FXML private TextField tfKode, tfJudul, tfPengarang, tfTahun;
    @FXML private CheckBox cbTersedia;
    @FXML private TableView<Buku> tableBuku;
    @FXML private TableColumn<Buku, String> colKode, colJudul, colPengarang;
    @FXML private TableColumn<Buku, Integer> colTahun;
    @FXML private TableColumn<Buku, Boolean> colTersedia;

    private ObservableList<Buku> daftarBuku = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colKode.setCellValueFactory(new PropertyValueFactory<>("kodeBuku"));
        colJudul.setCellValueFactory(new PropertyValueFactory<>("judul"));
        colPengarang.setCellValueFactory(new PropertyValueFactory<>("pengarang"));
        colTahun.setCellValueFactory(new PropertyValueFactory<>("tahunTerbit"));
        colTersedia.setCellValueFactory(new PropertyValueFactory<>("tersedia"));

        tableBuku.setItems(daftarBuku);
    }

    @FXML
    public void tambahBuku(ActionEvent event) {
        String kode = tfKode.getText();
        String judul = tfJudul.getText();
        String pengarang = tfPengarang.getText();
        int tahun = Integer.parseInt(tfTahun.getText());
        boolean tersedia = cbTersedia.isSelected();

        Buku buku = new Buku(kode, judul, pengarang, tahun, tersedia);
        daftarBuku.add(buku);

        tfKode.clear(); tfJudul.clear(); tfPengarang.clear(); tfTahun.clear(); cbTersedia.setSelected(false);
    }
}