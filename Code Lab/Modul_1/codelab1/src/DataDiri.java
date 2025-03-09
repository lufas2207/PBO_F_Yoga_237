import java.util.Scanner;
import java.time.Year;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menentukan jenis kelamin dalam teks
        String gender = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        // Menghitung umur
        int tahunSekarang = Year.now().getValue();
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + gender);
        System.out.println("Umur           : " + umur + " tahun");

        scanner.close();
    }
}
