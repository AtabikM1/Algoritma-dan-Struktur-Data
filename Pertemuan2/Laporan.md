# Laporan Praktikum Algoritma dan Struktur Data

## Pertemuan 1

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="ATM gif" width="30%"> 
</p>

---

Nama: Atabik Mutawakilalallah

NIM: 2341720090

No. Absen: 06

Kelas: TI-1B

---

### Percobaan 1 - Deklarasi Class, Atribut dan Method

    package Pertemuan2;
    class Buku {

    String judul, pengarang;
    int halaman, stok, harga;
    void tampilInformasi(){
        System.out.println("judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("jumlah halaman: " + halaman);
        System.out.println("stok: " + stok);
        System.out.println("harga: Rp" + harga);
    }

    void terjual(int jml){
        if(stok > jml){
            stok -= jml;
        }else{
            stok = 0;
        }

    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }

}

Hasil awal code:

Error: Main method not found in class Buku12, please define the main method as:
public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

Akan muncul error karena tidak ada method main

#### Pertanyaan:

1.  Sebutkan dua karakteristik class atau object!  
    class masih berupa konsep atau desain, dan objek sudah berupa realisasi

2.  Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
    Buku? Sebutkan apa saja atributnya!  
     ada 5 : judul, pengarang, halaman, stok, harga
3.  Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!  
    ada 4 : antara lain method tampilinformasi, terjual, restock, ganti harga
4.  Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut
    sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
    void terjual(int jml){
    if(stok > 0){
    stok -= jml;
    }else{
    stok = 0;
    }
    }
5.  Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?  
    karena berupa bilangan bulat (int) untuk mewakili jumlah tambahan stok yang akan ditambahkan ke objek buku. Dengan menyediakan parameter jml, kita memberikan fleksibilitas pada pengguna method untuk menentukan seberapa banyak stok yang akan ditambahkan ketika melakukan proses restok.

### Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

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
        }
    }

#### Pertanyaan:

1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!
   Apa nama object yang dihasilkan?
   Buku bk1 = new Buku();
   objek yang dihasilkan adalah bk1.
2. Bagaimana cara mengakses atribut dan method dari suatu objek?  
   menggunakan operator "."(titik).
   contoh  
    bk1.harga = 71000;  
    bk1.tampilInformasi();
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?
   karena output yang dihasilkan dari tampilInformasi() yang pertama tidak ada update dan menampilkan berdasarkan deklarasi awal, sedangkan pada output yang kedua dilakukan pemanggilan akses atribut dan method pada baris sebelumnya sehingga merubah nilai dari deklarasi awal.

### Percobaan 3: Membuat Konstruktor

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

### Verifikasi Hasil Percobaan

    pengarang: Denanda Pratiwi
    jumlah halaman: 198
    stok: 13
    harga: Rp71000
    judul: Today Ends Tomorrow Comes
    pengarang: Denanda Pratiwi
    jumlah halaman: 198
    stok: 8
    harga: Rp60000
    judul: self reward
    pengarang: Mahera Ayesha
    jumlah halaman: 160
    stok: 18
    harga: Rp59000

### pertanyaan

1.  Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!

        public Buku(String judul, String Pengarang, int halaman, int stok, int harga) {
            this.judul = judul;
            this.pengarang = Pengarang;
            this.halaman = halaman;
            this.stok = stok;
            this.harga = harga;
        }

2.  Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?  
    digunakan untuk membuat objek baru dari kelas Buku dengan menggunakan konstruktor berparameter.
3.  Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana
    hasilnya? Jelaskan mengapa hasilnya demikian!

        Exception in thread "main" java.lang.Error: Unresolved compilation problem:
                The constructor Buku() is undefined
                at Pertemuan2.BukuMain06.main(BukuMain06.java:5)

    karena menghapus konstruktor default (public Buku() {}), maka setiap kali mencoba membuat objek dari kelas Buku tanpa menyertakan argumen,maka java akan menghadapi kesalahan kompilasi.

4.  Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!

Tidak, setelah melakukan instansiasi objek dari kelas Buku, tidak harus mengakses method secara berurutan. program dapat memanggil method sesuai dengan kebutuhan atau urutan yang diinginkan, selama sesuai dengan logika program yang diimplementasikan.

5.  Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor
    berparameter dari class Buku!

         Buku Atabik = new Buku("atabik", "atabik",90, 39, 500000);
         Atabik.terjual(100);
         Atabik.tampilInformasi();

### Latihan Praktikum

1. Pada class Buku yang telah dibuat, tambahkan tiga method yaitu hitungHargaTotal(),
   hitungDiskon(), dan hitungHargaBayar() dengan penjelasan sebagai berikut:

o Method hitungHargaTotal() digunakan untuk menghitung harga total yang merupakan
perkalian antara harga dengan jumlah buku yang terjual

        int hitunghargatotal( int harga){
        hargatotal = stok * harga;
            return hargatotal;
        }

        public Buku() {

        }
        public Buku(String judul, String Pengarang, int halaman, int stok, int harga) {
            this.judul = judul;
            this.pengarang = Pengarang;
            this.halaman = halaman;
            this.stok = stok;
            this.harga = harga;
            hitunghargatotal(harga);
        }

    }

output

        harga total = 1711000
        judul: atabik
        pengarang: atabik
        jumlah halaman: 90
        stok: 29
        harga: Rp50000
        harga total = 1950000

Method hitungDiskon() digunakan untuk menghitung diskon dengan aturan berikut:  
▪ Jika harga total lebih dari 150000, maka harga didiskon sebesar 12%  
▪ Jika harga total antara 75000 sampai 150000, maka harga didiskon sebesar 5%
▪ Jika harga total kurang dari 75000, maka harga tidak didiskon

    void tampilInformasi(){
        hitunghargatotal();
        hitungDiskon();
        System.out.println("judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("jumlah halaman: " + halaman);
        System.out.println("stok: " + stok);
        System.out.println("harga: Rp" + harga);
        System.out.println("harga total = " + hargatotal);
        System.out.println("diskon : " + diskon);
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

output

        judul: atabik
        pengarang: atabik
        jumlah halaman: 90
        stok: 29
        harga: Rp50000
        harga total = 1450000
        diskon : 174000

o Method hitungHargaBayar() digunakan untuk menghitung harga total setelah dikurangi
diskon

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
        int hitungHargaBayar() {
        hargabayar = hargatotal - diskon;
        return hargabayar;
    }

output

        judul: atabik
        pengarang: atabik
        jumlah halaman: 90
        stok: 29
        harga: Rp50000
        harga total = 1450000
        diskon : 174000
        harga bayar :1276000

2.  Buat program berdasarkan class
    Penjelasan dari atribut dan method pada class Dragon tersebut adalah sebagai berikut:  
    • Atribut x digunakan untuk menyimpan posisi koordinat x (mendatar) dari dragon, sedangkan
    atribut y untuk posisi koordinat y (vertikal)  
    • Atribut width digunakan untuk menyimpan lebar dari area permainan, sedangkan height
    untuk menyimpan panjang area  
    • Method moveLeft() digunakan untuk mengubah posisi dragon ke kiri (koordinat x akan
    berkurang 1), sedangkan moveRight() untuk bergerak ke kanan (koordinat x akan bertambah
    1). Perlu diperhatikan bahwa koordinat x tidak boleh lebih kecil dari 0 atau lebih besar dari
    nilai width. Jika koordinat x < 0 atau x > width maka panggil method detectCollision()  
    • Method moveUp() digunakan untuk mengubah posisi dragon ke atas (koordinat y akan
    berkurang 1), sedangkan moveDown() untuk bergerak ke bawah (koordinat y akan bertambah
    Algoritma dan Struktur Data 2023-2024
    7
    Tim Ajar Algoritma dan Struktur Data 2023-2024
    Jurusan Teknologi Informasi-Politeknik Negeri Malang
    1). Perlu diperhatikan bahwa koordinat y tidak boleh lebih kecil dari 0 atau lebih besar dari
    nilai height. Jika koordinat y < 0 atau y > height maka panggil method detectCollision()  
    • Method detectCollision() akan mencetak pesan “Game Over” apabila dragon menyentuh
    ujung area permainan.

         package Pertemuan2;
         public class Dragon {
             private int x;
             private int y;
             private int width;
             private int height;

             public Dragon(int initialX, int initialY, int width, int height) {
                 this.x = initialX;
                 this.y = initialY;
                 this.width = width;
                 this.height = height;
             }

             public void moveLeft() {
                 x = Math.max(x - 1, 0);
                 detectCollision();
             }

             public void moveRight() {
                 x = Math.min(x + 1, width - 1);
                 detectCollision();
             }

             public void moveUp() {
                 y = Math.max(y + 1, 0);
                 detectCollision();
             }

             public void moveDown() {
                 y = Math.min(y - 1, height - 1);
                 detectCollision();
             }

             public void printPosition() {
                 System.out.println("Dragon position: (" + x + ", " + y + ")");
             }

             public void detectCollision() {
                 if (x <= 0 || x >= width || y <= 0 || y >= height) {
                     System.out.println("Dragon collided with the boundary!");
                     // Handle collision logic here
                 }
             }


         }
         package Pertemuan2;

         public class Dragonmain {
             public static void main(String[] args) {
                 // Example usage
                 Dragon dragon = new Dragon(5, 5, 10, 10);
                 dragon.printPosition();

                 dragon.moveLeft();
                 dragon.moveLeft();
                 dragon.moveLeft();
                 dragon.moveLeft();
                 dragon.moveLeft();
                 dragon.printPosition();
                 dragon.moveUp();
                 dragon.printPosition();
                 dragon.moveRight();
                 dragon.printPosition();
                 dragon.moveDown();
                 dragon.moveDown();
                 dragon.printPosition();


             }
         }

output

        Dragon position: (5, 5)
        Dragon collided with the boundary!
        Dragon position: (0, 5)
        Dragon collided with the boundary!
        Dragon position: (0, 6)
        Dragon position: (1, 6)
        Dragon position: (1, 4)

"Dragon collided with the boundary!" terjadi saat pergerakan dragon menyentuh 0 dan max dari width dan height.
