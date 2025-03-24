import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Buat Akun Admin ===");
        System.out.print("Masukkan Nama Admin: ");
        String namaAdmin = scanner.nextLine();
        System.out.print("Masukkan NIM Admin: ");
        String nimAdmin = scanner.nextLine();
        System.out.print("Masukkan Username Admin: ");
        String usernameAdmin = scanner.nextLine();
        System.out.print("Masukkan Password Admin: ");
        String passwordAdmin = scanner.nextLine();

        Admin admin = new Admin(namaAdmin, nimAdmin, usernameAdmin, passwordAdmin);

        System.out.println("\n=== Buat Akun Mahasiswa ===");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMhs = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nimMhs = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(namaMhs, nimMhs);

        System.out.println("\n=== Menu Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String inputPassword = scanner.nextLine();

            if (admin.login(inputUsername, inputPassword)) {
                admin.displayInfo();
            } else {
                System.out.println("Login Admin Gagal. Username atau Password salah.");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String inputNama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String inputNim = scanner.nextLine();

            if (mahasiswa.login(inputNama, inputNim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Mahasiswa Gagal. Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    // ================= Superclass User =================
    static class User {
        private String nama;
        private String nim;

        public User(String nama, String nim) {
            this.nama = nama;
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public boolean login(String input1, String input2) {
            // Akan di-override
            return false;
        }

        public void displayInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
        }
    }

    // ================= Subclass Admin =================
    static class Admin extends User {
        private String username;
        private String password;

        public Admin(String nama, String nim, String username, String password) {
            super(nama, nim);
            this.username = username;
            this.password = password;
        }

        @Override
        public boolean login(String inputUsername, String inputPassword) {
            return this.username.equals(inputUsername) && this.password.equals(inputPassword);
        }

        @Override
        public void displayInfo() {
            System.out.println("=== Login Admin Berhasil ===");
            super.displayInfo();
            System.out.println("Username: " + username);
        }
    }

    // ================= Subclass Mahasiswa =================
    static class Mahasiswa extends User {

        public Mahasiswa(String nama, String nim) {
            super(nama, nim);
        }

        @Override
        public boolean login(String inputNama, String inputNim) {
            return this.getNama().equals(inputNama) && this.getNim().equals(inputNim);
        }

        @Override
        public void displayInfo() {
            System.out.println("=== Login Mahasiswa Berhasil ===");
            super.displayInfo();
        }
    }
}
