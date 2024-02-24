package Pertemuan1;
import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input NIM: ");
        long nim;
        try {
            nim = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input NIM tidak valid. Masukkan bilangan bulat.");
            return;
        }

        long n = nim % 100; // Mengambil dua digit terakhir dari NIM
        if (n < 10) {
            n += 10;
        }

        System.out.print("OUTPUT: ");
        for (long i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Skip printing 6 and 10
            }

            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        scanner.close();
    }
}

