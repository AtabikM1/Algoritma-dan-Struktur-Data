package Pertemuan2;

public class BukuMain06 {
    public static void main(String[] args) {
        Buku bk1 = new Buku();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku bk2 = new Buku("self reward", "Mahera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku Atabik = new Buku("atabik", "atabik",90, 39, 50000);
        Atabik.terjual(10);
        Atabik.tampilInformasi();
        
        
    }
}
