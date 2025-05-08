package com.praktikum.main;

import com.praktikum.users.*;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data user dummy
        User[] users = {
                new Admin("admin", "admin123"),
                new Mahasiswa("mahasiswa", "mhs123")
        };

        System.out.println("=== Sistem Login ===");
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        boolean isLoggedIn = false;

        for (User user : users) {
            if (user.login(username, password)) {
                System.out.println("\nLogin berhasil sebagai " + user.getClass().getSimpleName());
                user.showMenu(); // Panggil menu sesuai role (Admin / Mahasiswa)
                isLoggedIn = true;
                break;
            }
        }

        if (!isLoggedIn) {
            System.out.println("\nLogin gagal. Username atau password salah.");
        }

        scanner.close();
    }
}
