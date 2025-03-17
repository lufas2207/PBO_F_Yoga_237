import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input untuk Hewan 1
        System.out.println("Masukkan data Hewan 1:");
        System.out.print("Nama  : ");
        String nama1 = input.nextLine();
        System.out.print("Jenis : ");
        String jenis1 = input.nextLine();
        System.out.print("Suara : ");
        String suara1 = input.nextLine();

        // Input untuk Hewan 2
        System.out.println("\nMasukkan data Hewan 2:");
        System.out.print("Nama  : ");
        String nama2 = input.nextLine();
        System.out.print("Jenis : ");
        String jenis2 = input.nextLine();
        System.out.print("Suara : ");
        String suara2 = input.nextLine();

        // Output seperti di gambar
        System.out.println("\nNama: " + nama1);
        System.out.println("Jenis: " + jenis1);
        System.out.println("Suara: " + suara1);

        System.out.println("\nNama: " + nama2);
        System.out.println("Jenis: " + jenis2);
        System.out.println("Suara: " + suara2);

        input.close();
    }
}
