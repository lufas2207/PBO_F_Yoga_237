import java.util.Scanner;

public class Main {


    static class KarakterGame {
        private String nama;
        private int kesehatan;

        public KarakterGame(String nama, int kesehatan) {
            this.nama = nama;
            this.kesehatan = kesehatan;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getKesehatan() {
            return kesehatan;
        }

        public void setKesehatan(int kesehatan) {
            this.kesehatan = kesehatan;
        }

        public void serang(KarakterGame target) {
            // Di-override di subclass
        }
    }


    static class Pahlawan extends KarakterGame {
        public Pahlawan(String nama, int kesehatan) {
            super(nama, kesehatan);
        }

        @Override
        public void serang(KarakterGame target) {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
            target.setKesehatan(target.getKesehatan() - 20);
            System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }


    static class Musuh extends KarakterGame {
        public Musuh(String nama, int kesehatan) {
            super(nama, kesehatan);
        }

        @Override
        public void serang(KarakterGame target) {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
            target.setKesehatan(target.getKesehatan() - 15);
            System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data karakter umum
        System.out.print("Masukkan nama Karakter Umum: ");
        String namaUmum = input.nextLine();
        System.out.print("Masukkan kesehatan " + namaUmum + ": ");
        int hpUmum = input.nextInt();
        input.nextLine(); // Clear buffer
        KarakterGame karakterUmum = new KarakterGame(namaUmum, hpUmum);

        // Input data Pahlawan
        System.out.print("Masukkan nama Pahlawan: ");
        String namaPahlawan = input.nextLine();
        System.out.print("Masukkan kesehatan " + namaPahlawan + ": ");
        int hpPahlawan = input.nextInt();
        input.nextLine();
        Pahlawan pahlawan = new Pahlawan(namaPahlawan, hpPahlawan);

        // Input data Musuh
        System.out.print("Masukkan nama Musuh: ");
        String namaMusuh = input.nextLine();
        System.out.print("Masukkan kesehatan " + namaMusuh + ": ");
        int hpMusuh = input.nextInt();
        input.nextLine();
        Musuh musuh = new Musuh(namaMusuh, hpMusuh);

        // Tampilkan status awal
        System.out.println("\n--- Status Awal ---");
        System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());

        // Input nama serangan Pahlawan
        System.out.print("\nMasukkan nama serangan " + pahlawan.getNama() + ": ");
        String seranganPahlawan = input.nextLine();
        System.out.println(pahlawan.getNama() + " menyerang " + musuh.getNama() + " menggunakan " + seranganPahlawan + "!");
        musuh.setKesehatan(musuh.getKesehatan() - 20);
        System.out.println(musuh.getNama() + " sekarang memiliki kesehatan " + musuh.getKesehatan());

        // Input nama serangan Musuh
        System.out.print("\nMasukkan nama serangan " + musuh.getNama() + ": ");
        String seranganMusuh = input.nextLine();
        System.out.println(musuh.getNama() + " menyerang " + pahlawan.getNama() + " menggunakan " + seranganMusuh + "!");
        pahlawan.setKesehatan(pahlawan.getKesehatan() - 15);
        System.out.println(pahlawan.getNama() + " sekarang memiliki kesehatan " + pahlawan.getKesehatan());

        input.close();
    }
}
