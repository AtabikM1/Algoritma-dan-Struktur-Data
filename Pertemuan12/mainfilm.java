package Pertemuan12;

import java.util.Scanner;

import Pertemuan5.faktorial;
public class mainfilm {
    public static void main(String[] args) {
        filmdll film = new filmdll();

        System.out.println("=====================");
        System.out.println("data film layar lebar");
        System.out.println("=====================");

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data Index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data Index tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID film");
            System.out.println("9. Urutkan data rating film - desc");
            System.out.println("10. keluar");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("masukkan id film = ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("masukkan judul film = ");
                    String judul = sc.nextLine();
                    System.out.println("masukkan rating film");
                    float rating = sc.nextFloat();
                    film.addfirst(id, judul, rating);
                    break;
                case 2:
                    System.out.println("masukkan id film = ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("masukkan judul film = ");
                    String judul1 = sc.nextLine();
                    System.out.println("masukkan rating film");
                    float rating1 = sc.nextFloat();
                    film.addLast(id1, judul1, rating1);
            
                default:
                    break;
            }
        }
    }
}
