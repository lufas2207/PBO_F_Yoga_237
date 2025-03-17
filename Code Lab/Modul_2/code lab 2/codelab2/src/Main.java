import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input untuk rekening1
        System.out.println("Masukkan data untuk Rekening 1");
        System.out.print("Nomor Rekening : ");
        String nomor1 = input.nextLine();
        System.out.print("Nama Pemilik   : ");
        String nama1 = input.nextLine();
        System.out.print("Saldo Awal     : ");
        double saldo1 = input.nextDouble();
        input.nextLine(); // Buat bersihkan newline

        RekeningBank rekening1 = new RekeningBank(nomor1, nama1, saldo1);

        // Input untuk rekening2
        System.out.println("\nMasukkan data untuk Rekening 2");
        System.out.print("Nomor Rekening : ");
        String nomor2 = input.nextLine();
        System.out.print("Nama Pemilik   : ");
        String nama2 = input.nextLine();
        System.out.print("Saldo Awal     : ");
        double saldo2 = input.nextDouble();

        RekeningBank rekening2 = new RekeningBank(nomor2, nama2, saldo2);

        // Tampilkan info
        System.out.println("\nInformasi Rekening 1:");
        rekening1.tampilkanInfo();
        System.out.println("Informasi Rekening 2:");
        rekening2.tampilkanInfo();

        // Simulasi transaksi
        System.out.println("\nTransaksi: Setor ke Rekening 1");
        System.out.print("Masukkan jumlah setor: ");
        double setor = input.nextDouble();
        rekening1.setorUang(setor);

        System.out.println("\nTransaksi: Tarik dari Rekening 2");
        System.out.print("Masukkan jumlah tarik: ");
        double tarik = input.nextDouble();
        rekening2.tarikUang(tarik);

        input.close();
    }
}

class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + namaPemilik);
        System.out.println("Saldo          : Rp " + saldo);
        System.out.println("-------------------------------");
    }

    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " setor uang sebesar Rp " + jumlah);
        System.out.println("Saldo sekarang: Rp " + saldo);
        System.out.println("-------------------------------");
    }

    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " tarik uang sebesar Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk tarik uang sebesar Rp " + jumlah);
        }
        System.out.println("-------------------------------");
    }
}
