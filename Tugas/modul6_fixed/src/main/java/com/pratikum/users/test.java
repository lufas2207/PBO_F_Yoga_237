package main.java.com.praktikum.users;

import main.java.com.praktikum.actions.AdminActions;
import main.java.com.praktikum.actions.MahasiswaActions;

public class test {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Aqil", "123", "202410370110235");
        Admin a1 = new Admin("admin", "admin");

        // Test logika tanpa GUI
        System.out.println("Testing Mahasiswa:");
        System.out.println("Nama: " + m1.getUsername() + ", NIM: " + m1.getNim());

        System.out.println("Testing Admin:");
        System.out.println("Username: " + a1.getUsername());

        // Tes aksi (non-GUI print)
        AdminActions.exportData();
        MahasiswaActions.submitTugas();
    }
}
