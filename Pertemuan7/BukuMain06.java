package Pertemuan7;
import java.util.Scanner;
public class BukuMain06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
    
        Pencarianbuku06 data = new Pencarianbuku06();
        int jumlahbuku = 5;
    
        System.out.println("-------------------------");    
        System.out.println("Masukkan data buku secara urut dari kodebuku terkecil : ");
        for(int i = 0; i < jumlahbuku; i++){
            System.out.println("------------");
            System.out.print("Kode Buku \t: ");
            int kodebuku = s.nextInt();
            System.out.print("judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunterbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t :");
            int stok = s.nextInt();

            Buku m = new Buku(kodebuku, judulBuku, tahunterbit, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("--------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();
        System.out.println("________________");
        System.out.println("________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari = ");
        System.out.println("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampildata(cari, posisi);
        // Mencari buku dengan kode buku yang dicari
        Buku dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("==================");
        System.out.println("menggunakan binary search");
        data.bubbleSort();
        posisi = data.findBinarySearch(cari, 0, jumlahbuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampildata(cari, posisi);
        
            
        

    }
    
}

