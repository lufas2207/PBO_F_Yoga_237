import java.util.Scanner;

class Admin {
    private String username = "admin123";
    private String password = "adminpass";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

class Mahasiswa {
    private String nama = "DwiYoga Rizki Pratama";
    private String nim = "202410370110237";

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equalsIgnoreCase(nama) && inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("\n=== Informasi Mahasiswa ===");
        System.out.println("Login berhasil sebagai Mahasiswa.");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("============================");
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("=== Sistem Login ===");
        System.out.print("Pilih jenis login (Admin/Mahasiswa): ");
        String pilihan = scanner.nextLine().trim();

        if (pilihan.equalsIgnoreCase("Admin")) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                System.out.println("\nLogin berhasil sebagai Admin.");
            } else {
                System.out.println("\nUsername atau password salah.");
            }

        } else if (pilihan.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("\nNama atau NIM salah.");
            }

        } else {
            System.out.println("\nPilihan tidak valid.");
        }

        scanner.close();
    }
}
