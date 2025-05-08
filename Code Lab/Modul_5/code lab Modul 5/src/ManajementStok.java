import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManajementStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        daftarBarang.add(new Barang("Pulpen", 100));
        daftarBarang.add(new Barang("Buku", 50));

        boolean running = true;
        while (running) {
            System.out.println("\n=== Menu Manajemen Stok ===");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            if (pilihan == 1) {
                System.out.print("Masukkan nama barang: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan stok awal: ");
                try {
                    int stok = scanner.nextInt();
                    scanner.nextLine();
                    daftarBarang.add(new Barang(nama, stok));
                    System.out.println("Barang berhasil ditambahkan.");
                } catch (InputMismatchException e) {
                    System.out.println("Input stok harus berupa angka!");
                    scanner.nextLine();
                }
            } else if (pilihan == 2) {
                if (daftarBarang.isEmpty()) {
                    System.out.println("Stok barang kosong.");
                } else {
                    System.out.println("\nDaftar Barang:");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        Barang b = daftarBarang.get(i);
                        System.out.println(i + ". " + b.getNama() + " - Stok: " + b.getStok());
                    }
                }
            } else if (pilihan == 3) {
                if (daftarBarang.isEmpty()) {
                    System.out.println("Stok barang kosong.");
                    continue;
                }

                System.out.println("\nDaftar Barang:");
                for (int i = 0; i < daftarBarang.size(); i++) {
                    Barang b = daftarBarang.get(i);
                    System.out.println(i + ". " + b.getNama() + " - Stok: " + b.getStok());
                }

                try {
                    System.out.print("Pilih indeks barang: ");
                    int indeks = scanner.nextInt();
                    Barang barang = daftarBarang.get(indeks);

                    System.out.print("Jumlah stok yang diambil: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();

                    if (jumlah > barang.getStok()) {
                        throw new StokTidakCukupException("Stok untuk " + barang.getNama() + " hanya tersisa " + barang.getStok());
                    }

                    barang.setStok(barang.getStok() - jumlah);
                    System.out.println("Stok berhasil dikurangi.");
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka!");
                    scanner.nextLine();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Indeks tidak valid.");
                } catch (StokTidakCukupException e) {
                    System.out.println(e.getMessage());
                }
            } else if (pilihan == 0) {
                running = false;
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Menu tidak valid.");
            }
        }

        scanner.close();
    }
}
