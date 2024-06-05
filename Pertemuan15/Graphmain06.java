package Pertemuan15;

import java.util.Scanner;

public class Graphmain06 {
    public static void main(String[] args) throws Exception {
        Graph06 gedung = new Graph06(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge( 0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        Scanner sc = new Scanner(System.in);
        System.out.println("modifikasi tugas nomor 1");
        boolean running = true;
        while (running) {
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Keluar");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("masukkan asal = ");
                    int asal = sc.nextInt();
                    System.out.println("masukkan tujuan = ");
                    int tujuan = sc.nextInt();
                    System.out.println("masukkan jarak = ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.println("masukkan asal yang akan dihapus = ");
                    int asal1 = sc.nextInt();
                    System.out.println("masukkan indeks yang akan dihapus = ");
                    int indeks = sc.nextInt();
                    gedung.removeEdge(asal1, indeks);
                    break;
                case 3:
                    System.out.println("masukkan nilai asal = ");
                    int x = sc.nextInt();
                    gedung.degree(x);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.println("masukkan asal nilai = ");
                    int awal = sc.nextInt();
                    System.out.println("masukkan nilai tujuan = ");
                    int sampai = sc.nextInt();
                    gedung.checkEdge(awal, sampai);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        }
    }
}
