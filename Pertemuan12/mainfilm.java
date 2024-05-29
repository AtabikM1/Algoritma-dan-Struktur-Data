package Pertemuan12;

import java.util.Scanner;

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
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("masukkan judul film = ");
                    judul = sc.nextLine();
                    System.out.println("masukkan rating film");
                    rating = sc.nextFloat();
                    film.addLast(id, judul, rating);
                case 3:
                    System.out.println("masukkan id film = ");
                    id = sc.nextInt();
                    System.out.println("masukkan judul film = ");
                    judul = sc.next();
                    System.out.println("masukkan rating film");
                    rating = sc.nextFloat();
                    System.out.println("data film ini akan dimasukan di urutan ke-");
                    int ke = sc.nextInt();
                    film.addtertentu(id, judul, rating, ke);
                    break;
                case 4:
                    film.removefirst();
                    break;
                case 5:
                    film.removelast();
                    break;
                case 6:
                    System.out.println("hapus urutan ke-");
                    ke = sc.nextInt();
                    film.remove(ke);
                    break;
                case 7:
                    film.cetak();
                    break;
                case 8:
                    System.out.println("masukkan id film : ");
                    id = sc.nextInt();
                    nodefilm filmditemukan = film.carifilm(id);
                    if(filmditemukan != null){
                        System.out.println("Identitas :");
                        System.out.println("id film : " + filmditemukan.id);
                        System.out.println("judul film : "+ filmditemukan.judul);
                        System.out.println("rating imdb : "+ filmditemukan.rating);
                    }else{
                        System.out.println("film dengan id " + id + " tidak ditemukan");
                    }
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    break;
            }
        }
    }
}
