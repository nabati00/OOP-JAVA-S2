import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelaminChar = scanner.next().charAt(0);
        String jenisKelamin = (jenisKelaminChar == 'P' || jenisKelaminChar == 'p') ? "Perempuan" : "Laki-Laki";

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        // Parsing tanggal lahir ke LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Perhitungan umur
        Period umur = Period.between(tanggalLahir, LocalDate.now());

        // Output informasi lengkap
        System.out.println("\nInformasi Lengkap:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");
    }
}
