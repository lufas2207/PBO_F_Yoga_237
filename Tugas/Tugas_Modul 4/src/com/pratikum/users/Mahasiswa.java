package com.praktikum.users;

import com.praktikum.actions.MenuAction;

public class Mahasiswa extends User implements MenuAction {

    public Mahasiswa(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void showMenu() {
        tampilkanMenuMahasiswa();
    }

    @Override
    public void tampilkanMenuAdmin() {
        // Tidak digunakan oleh Mahasiswa
    }

    @Override
    public void tampilkanMenuMahasiswa() {
        System.out.println("=== Menu Mahasiswa ===");
        System.out.println("1. Lihat Nilai");
        System.out.println("2. Edit Profil");
        System.out.println("3. Logout");
    }
}
