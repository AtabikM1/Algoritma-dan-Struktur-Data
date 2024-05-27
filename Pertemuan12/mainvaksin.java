package Pertemuan12;

import java.util.Scanner;

public class mainvaksin {
    public static void main(String[] args) {
        vaksindll pasien = new vaksindll(7);
        System.out.println("++++++++++++++++++");
        System.out.println(" Pengantri Vaksin");
        System.out.println("++++++++++++++++++");
        System.out.println();
        

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. tambah data penerima vaksin");
            System.out.println("2. hapus data pengantri vaksin");
            System.out.println("3. daftar penerima vaksin");
            System.out.println("4. keluar");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("no antrian : ");
                    int antrian = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nama penerima : ");
                    String nama = sc.nextLine();
                    pasien.enqueuedll(antrian, nama);
                    break;
                case 2:
                    pasien.dequeuedll();
                case 3:
                    pasien.print();
                default:
                    break;
            }
            
        }
    }
}
