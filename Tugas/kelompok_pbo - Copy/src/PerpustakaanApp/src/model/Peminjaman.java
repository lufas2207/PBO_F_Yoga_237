package model;

import java.time.LocalDate;

public class Peminjaman {
    private String idPeminjaman;
    private String idAnggota;
    private String kodeBuku;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;

    public Peminjaman(String idPeminjaman, String idAnggota, String kodeBuku,
                      LocalDate tanggalPinjam, LocalDate tanggalKembali) {
        this.idPeminjaman = idPeminjaman;
        this.idAnggota = idAnggota;
        this.kodeBuku = kodeBuku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    // Getter dan Setter
    public String getIdPeminjaman() { return idPeminjaman; }
    public void setIdPeminjaman(String idPeminjaman) { this.idPeminjaman = idPeminjaman; }

    public String getIdAnggota() { return idAnggota; }
    public void setIdAnggota(String idAnggota) { this.idAnggota = idAnggota; }

    public String getKodeBuku() { return kodeBuku; }
    public void setKodeBuku(String kodeBuku) { this.kodeBuku = kodeBuku; }

    public LocalDate getTanggalPinjam() { return tanggalPinjam; }
    public void setTanggalPinjam(LocalDate tanggalPinjam) { this.tanggalPinjam = tanggalPinjam; }

    public LocalDate getTanggalKembali() { return tanggalKembali; }
    public void setTanggalKembali(LocalDate tanggalKembali) { this.tanggalKembali = tanggalKembali; }
}
