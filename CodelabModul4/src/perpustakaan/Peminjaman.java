package perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judulBuku);
    void pinjamBuku(String judulBuku, int durasi);
    void kembalikanBuku(String judulBuku);
}