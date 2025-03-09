import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> adminAccounts = new HashMap<>();
        HashMap<String, String> studentAccounts = new HashMap<>();

        // Data admin (username -> password)
        adminAccounts.put("Admin069", "Password069");

        // Data mahasiswa (nama -> NIM)
        studentAccounts.put("Azril Kucai", "202310370311069");

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Konsum newline

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (adminAccounts.containsKey(username) && adminAccounts.get(username).equals(password)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (studentAccounts.containsKey(nama) && studentAccounts.get(nama).equals(nim)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}
