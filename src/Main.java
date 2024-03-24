import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    int usia;
    String universitas = "Universitas MUhammadiyah Malang";

    public Mahasiswa(String nama, String nim, String jurusan, int usia) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.usia = usia;
    }

    public void tampilDataMahasiswa() {
        System.out.println("Masukkan Nama: " + nama);
        System.out.println("Masukkan NIM: " + nim);
        System.out.println("Masukkan Jurusan: " + jurusan);
        System.out.println("Masukkan Usia: " + usia);
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas: Universitas Muhammadiyah Malang");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa:");
        String nama = scanner.nextLine();

        System.out.println("Masukkan NIM mahasiswa (panjang maksimal 15 karakter):");
        String nim = scanner.nextLine();
        while (nim.length() > 15) {
            System.out.println("NIM terlalu panjang! Mohon ulangi proses:");
            nim = scanner.nextLine();
        }

        System.out.println("Masukkan jurusan mahasiswa:");
        String jurusan = scanner.nextLine();

        System.out.println("Masukkan usia mahasiswa:");
        int usia = scanner.nextInt();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, usia);

        System.out.println("\nDetail Mahasiswa:");
        mahasiswa.tampilDataMahasiswa();

        System.out.println("\nInfo Universitas:");
        Mahasiswa.tampilUniversitas();
    }
}