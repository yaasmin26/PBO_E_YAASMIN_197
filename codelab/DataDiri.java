import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Input tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Hitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Konversi jenis kelamin
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        } else {
            jenisKelaminStr = "Tidak valid";
        }

        // Tampilkan hasil
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminStr);
        System.out.println("Umur          : " + umur + " tahun");

        // Tutup scanner
        scanner.close();
    }
}