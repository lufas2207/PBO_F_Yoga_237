package com.praktikum.users;

import com.praktikum.actions.MenuAction;

public class Admin extends User implements MenuAction {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void showMenu() {
        tampilkanMenuAdmin();
    }

    @Override
    public void tampilkanMenuAdmin() {
        System.out.println("=== Menu Admin ===");
        System.out.println("1. Kelola Data Mahasiswa");
        System.out.println("2. Lihat Laporan");
        System.out.println("3. Logout");
    }

    @Override
    public void tampilkanMenuMahasiswa() {
        // Tidak digunakan oleh Admin
    }
}
