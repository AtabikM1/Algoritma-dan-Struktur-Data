package Pertemuan8;

import java.util.Scanner;

public class utama06 {
    public static void main(String[] args) {
        gudang06 gudang = new gudang06(7);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. selesai");
            System.out.println("Pilih operasi ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("masukkan kode barang : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("masukkan nama barang : ");
                    String nama = sc.nextLine();
                    System.out.print("masukkan nama kategori : ");
                    String kategori = sc.nextLine();
                    barang06 barangBaru = new barang06(kode, nama, kategori);
                    gudang.tambahbarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilbarang();
                    break;
                case 3 :
                    gudang.tampilkanbarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                case 5:
                    break;
                default:
                    System.out.println("pilihan tidak valid, silahkan coba lagi. ");    
                    
            
                
                    
            }
        }
    }
}
