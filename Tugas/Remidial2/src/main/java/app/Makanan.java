package app;

public class Makanan {
    private String namaMakanan;
    private double harga;
    private int jumlahPorsi;

    public Makanan(String namaMakanan, double harga, int jumlahPorsi) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.jumlahPorsi = jumlahPorsi;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlahPorsi() {
        return jumlahPorsi;
    }

    public double hitungTotal() {
        return harga * jumlahPorsi;
    }

    public String tampilkanInfo() {
        return String.format(
                "Makanan: %s\nHarga per porsi: Rp%.0f\nJumlah porsi: %d\nTotal: Rp%.0f",
                namaMakanan, harga, jumlahPorsi, hitungTotal()
        );
    }
}
