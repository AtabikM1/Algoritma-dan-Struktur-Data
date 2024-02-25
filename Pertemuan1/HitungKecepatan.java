package Pertemuan1;

import java.util.Scanner;

public class HitungKecepatan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    System.exit(0); // Keluar dari program
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih kembali.");
            }
        }
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("Kecepatan (v): " + kecepatan + " m/s");
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak (s): " + jarak + " meter");
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu (t): " + waktu + " detik");
    }
}
