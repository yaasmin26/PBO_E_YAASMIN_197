package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku nonFiksi = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku fiksi = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        nonFiksi.displayInfo();
        fiksi.displayInfo();

        Anggota anggota1 = new Anggota("Yaasmin", "197");
        Anggota anggota2 = new Anggota("Elvira", "186");

        anggota1.displayInfo();
        anggota2.displayInfo();

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}