package main.java.com.praktikum.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import main.java.com.praktikum.users.Mahasiswa;

public class DataStore {
    public static ObservableList<Mahasiswa> getMahasiswaList() {
        return FXCollections.observableArrayList(
                new Mahasiswa("Dwiyoga Rizki Pratama", "123", "202410370110237"),
                new Mahasiswa("Aqil", "123", "202410370110235"),
                new Mahasiswa("Vero", "123", "202410370110234")
        );
    }
}
