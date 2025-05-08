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

}
