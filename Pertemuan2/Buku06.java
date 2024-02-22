package Pertemuan2;

class Buku {
    String judul, pengarang;
    int halaman, stok, harga, hargatotal, diskon, hargabayar;
    
    void tampilInformasi(){
        hitunghargatotal();
        hitungDiskon();
        hitungHargaBayar();
        System.out.println("judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("jumlah halaman: " + halaman);
        System.out.println("stok: " + stok);
        System.out.println("harga: Rp" + harga);
        System.out.println("harga total = " + hargatotal);
        System.out.println("diskon : " + diskon);
        System.out.println("harga bayar :" + hargabayar);
    }
    
    void terjual(int jml){
        if( stok > jml) {
            stok -= jml;
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
    int hitunghargatotal(){
       hargatotal = stok * harga;
       return hargatotal;
    }

    int hitungDiskon() {
        if (hargatotal > 150000) {
            // Diskon 12%
            diskon += hargatotal * 0.12;
        } else if (hargatotal >= 75000 && hargatotal <= 150000) {
            // Diskon 5%
            diskon += hargatotal * 0.05;
        }else{
            
        }
        return diskon;
    }
    int hitungHargaBayar() {
        hargabayar = hargatotal - diskon;
        return hargabayar;
    }

    public Buku() {

    }
    public Buku(String judul, String Pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = Pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }
}
