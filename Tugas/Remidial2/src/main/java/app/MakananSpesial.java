package app;

public class MakananSpesial extends Makanan {
    private String tambahan;
    private double biayaTambahan;

    public MakananSpesial(String namaMakanan, double harga, int jumlahPorsi, String tambahan, double biayaTambahan) {
        super(namaMakanan, harga, jumlahPorsi);
        this.tambahan = tambahan;
        this.biayaTambahan = biayaTambahan;
    }

    @Override
    public double hitungTotal() {
        return super.getHarga() * super.getJumlahPorsi() + biayaTambahan * super.getJumlahPorsi();
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + String.format(
                "\nTambahan: %s\nBiaya Tambahan per porsi: Rp%.0f",
                tambahan, biayaTambahan
        );
    }
}
