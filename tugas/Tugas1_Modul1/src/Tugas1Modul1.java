import java.util.Scanner;

public class Tugas1Modul1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nimLengkap = "202410370110197"; // Ganti dengan NIM lengkap Anda
        String tigaDigitTerakhirNIM = nimLengkap.substring(nimLengkap.length() - 3);

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine(); // Membersihkan newline

        if (pilihan == 1) {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (username.equals("Admin" + tigaDigitTerakhirNIM) && password.equals("password" + tigaDigitTerakhirNIM)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIM: ");
            String nim = input.nextLine();

            if (nama.equals("Yaasmin") && nim.equals(tigaDigitTerakhirNIM)) { // Ganti "Nama Kalian" dengan nama Anda
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}