package Pertemuan7;

public class Buku06 {
    int kodebuku, tahunterbit, stok;
    String judul, pengarang;

    Buku06(int kodebuku, String judul, int tahunterbit, String pengarang, int stok){
        this.kodebuku = kodebuku;
        this.judul = judul;
        this.tahunterbit = tahunterbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public void tampilDataBuku(){
        System.out.println("===================");
        System.out.println("Kode Buku = "+kodebuku);
        System.out.println("Judul buku = "+judul);
        System.out.println("Tahun Terbit = "+ tahunterbit);
        System.out.println("Pengarang = "+ pengarang);
        System.out.println("Stok = "+stok);

    }

    
}
