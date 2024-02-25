package Pertemuan1;

import java.util.Scanner;

public class PlatMobilProgram {

    public static void main(String[] args) {
        // Inisialisasi array KODE dan KOTA
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
                {"Banten"},
                {"Jakarta"},
                {"Bandung", },
                {"Cirebon"},
                {"Bogor"},
                {"Pekalongan"},
                {"Semarang"},
                {"Surabaya"},
                {"Malang"},
                {"Karawang"}
        };

        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input kode plat nomor dari pengguna
        System.out.print("Masukkan kode plat mobil: ");
        String inputKode = scanner.next().toUpperCase(); // Mengubah input ke huruf besar

        // Mencari indeks kode plat pada array KODE
        int indeksKode = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (inputKode.equals(String.valueOf(KODE[i]))) {
                indeksKode = i;
                break;
            }
        }

        // Menampilkan hasil
        if (indeksKode != -1) {
            System.out.println("Nama kota untuk kode plat " + inputKode + ":");
            for (String kota : KOTA[indeksKode]) {
                System.out.println("- " + kota);
            }
        } else {
            System.out.println("Kode plat tidak valid");
        }

        // Menutup Scanner
        scanner.close();
    }
}

