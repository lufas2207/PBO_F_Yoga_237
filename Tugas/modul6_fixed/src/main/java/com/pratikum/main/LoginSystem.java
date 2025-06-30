package main.java.com.praktikum.main;

import main.java.com.praktikum.users.*;

public class LoginSystem {
    public static User authenticate(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return new Admin(username, password);
        }

        // Cek data mahasiswa dari DataStore
        for (Mahasiswa m : main.java.com.praktikum.data.DataStore.getMahasiswaList()) {
            if (m.getUsername().equals(username) && m.getPassword().equals(password)) {
                return m;
            }
        }

        return null;
    }
}
