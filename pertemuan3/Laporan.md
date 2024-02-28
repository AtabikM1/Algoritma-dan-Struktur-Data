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

### Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan

      package pertemuan3;
      public class PersegiPanjang{
         public int panjang;
         public int lebar;
         public static void main(String[] args) {
            PersegiPanjang[] ppArray = new PersegiPanjang[3];
            ppArray[0] = new PersegiPanjang();
            ppArray[0].panjang = 110;
            ppArray[0].lebar = 30;

            ppArray[1] = new PersegiPanjang();
            ppArray[1].panjang = 80;
            ppArray[1].lebar = 40;

            ppArray[2] = new PersegiPanjang();
            ppArray[2].panjang = 100;
            ppArray[2].lebar = 20;

            System.out.println("persegi panjang ke 1, panjang = " + ppArray[0].panjang + ", lebar = "+ ppArray[0].lebar);
            System.out.println("persegi panjang ke 2, panjang = " + ppArray[1].panjang + ", lebar = "+ ppArray[1].lebar);
            System.out.println("persegi panjang ke 3, panjang = " + ppArray[2].panjang + ", lebar = "+ ppArray[2].lebar);
         }
      }

output program

      persegi panjang ke 1, panjang = 110, lebar = 30
      persegi panjang ke 2, panjang = 80, lebar = 40
      persegi panjang ke 3, panjang = 100, lebar = 20

pertanyaan

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
   atribut dan sekaligus method?Jelaskan!

Tidak, class yang akan dibuat sebagai array of objects tidak selalu harus memiliki atribut dan method. Sebagai contoh, dalam kode yang diberikan untuk class PersegiPanjang, meskipun class tersebut memiliki atribut panjang dan lebar, tidak ada method yang didefinisikan di dalamnya. Meski begitu, itu tidak menjadi syarat wajib.

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
   konstruktur pada baris program berikut :

Class PersegiPanjang dalam kode yang diberikan tidak secara eksplisit mendefinisikan konstruktor. Jika konstruktor tidak didefinisikan di dalam sebuah class, Java akan menyediakan konstruktor default secara otomatis. Konstruktor default ini tidak memiliki parameter dan hanya melakukan inisialisasi default
Pemanggilan konstruktor terjadi dengan new PersegiPanjang()

3. Apa yang dimaksud dengan kode berikut ini:

code tersebut mendeklarasikan sebuah variable dengan nama ppArray dari objek persegi panjang. sekaligus menginisialisasi array dengan panjang 3 yang berarti menampung 3 elemen pada objek persegi panjang.

4. Apa yang dimaksud dengan kode berikut ini:

ppArray[1] = new PersegiPanjang();: Membuat objek baru dari kelas PersegiPanjang dan menetapkannya ke elemen kedua (ppArray[1]) dari array ppArray. Dengan kata lain, objek pertama telah diinisialisasi sebelumnya, dan objek kedua dibuat pada langkah ini.

ppArray[1].panjang = 80; dan ppArray[1].lebar = 40;: Mengatur nilai atribut panjang dan lebar dari objek kedua (ppArray[1]). Dengan cara ini, nilai panjang diatur menjadi 80 dan nilai lebar diatur menjadi 40 untuk objek kedua dalam array.

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

untuk memisahkan class main dan class objek (dalam hal ini, PersegiPanjang) membantu dalam organisasi kode. Setiap class dapat fokus pada tugasnya masing-masing, dan ini meningkatkan kejelasan dan pemahaman struktur program.

### Percobaan 2: Menerima Input Isian Array Menggunakan Looping

      package pertemuan3;

      import java.util.Scanner;

      public class PersegiPanjang{
         public int panjang;
         public int lebar;
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PersegiPanjang[] ppArray = new PersegiPanjang[3];

            for(int i = 0; i < 3; i++){
                  ppArray[i] = new PersegiPanjang();
                  System.out.println("masukkan persegi panjang ke " + i);
                  System.out.println("masukkan panjang = ");
                  ppArray[i].panjang = sc.nextInt();
                  System.out.println("masukkan lebar ");
                  ppArray[i].lebar = sc.nextInt();
            }

            for(int i = 0; i < 3; i++){
            System.out.println("persegi panjang ke "+ i);
            System.out.println("panjang " + ppArray[i].panjang + " lebar = "+ ppArray[i].lebar);
            }
         }
      }

output program

      persegi panjang ke 0
      panjang 56 lebar = 5
      persegi panjang ke 1
      panjang 645 lebar = 45
      persegi panjang ke 2
      panjang 34 lebar = 34

### Pertanyaan

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

array of object dapat diimplementasikan pada array 2 dimensi di Java. Dalam konteks array 2 dimensi, setiap elemen array tidak lagi berupa tipe data primitif atau objek tunggal, melainkan dapat berupa array objek (objek dari suatu class).

2.  Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

    public class MatriksPersegiPanjang {
    public static void main(String[] args) {
    // Array of object pada array 2 dimensi
    PersegiPanjang[][] matriks = new PersegiPanjang[2][3];

            // Inisialisasi objek dalam matriks
            matriks[0][0] = new PersegiPanjang();
            matriks[0][1] = new PersegiPanjang();
            matriks[0][2] = new PersegiPanjang();


            // Pengaturan nilai panjang dan lebar untuk setiap objek dalam matriks
            matriks[0][0].panjang = 10;
            matriks[0][0].lebar = 5;

            matriks[0][1].panjang = 8;
            matriks[0][1].lebar = 4;



            // Menampilkan nilai panjang dan lebar untuk setiap objek dalam matriks
            for (int i = 0; i < matriks.length; i++) {
                  for (int j = 0; j < matriks[i].length; j++) {
                     System.out.println("Baris " + i + ", Kolom " + j + ": Panjang = " + matriks[i][j].panjang +
                              ", Lebar = " + matriks[i][j].lebar);
                  }
            }
         }

    }

PersegiPanjang adalah class objek, dan matriks adalah array 2 dimensi yang berisi objek-objek PersegiPanjang. Setiap elemen matriks merupakan objek PersegiPanjang,

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode
   dibawah ini akan memunculkan error saat dijalankan. Mengapa?

Karena Kode tersebut akan menyebabkan error karena pada saat pembuatan array pgarray, elemen-elemen array tersebut diisi dengan nilai null secara default (karena itu adalah objek), dan objek Persegi yang sesungguhnya tidak diinisialisasi. Oleh karena itu, ketika Anda mencoba mengakses pgarray[5].sisi = 20;, Anda sebenarnya mencoba mengakses atribut sisi dari objek yang masih null.

4.  Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
    public class PersegiPanjang{
    public int panjang;
    public int lebar;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan panjang array: ");
            int panjangArray = sc.nextInt();

            // Inisialisasi array berdasarkan input panjangArray
            PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];

            for(int i = 0; i < panjangArray; i++){
                  ppArray[i] = new PersegiPanjang();
                  System.out.println("masukkan persegi panjang ke " + i);
                  System.out.println("masukkan panjang = ");
                  ppArray[i].panjang = sc.nextInt();
                  System.out.println("masukkan lebar ");
                  ppArray[i].lebar = sc.nextInt();
            }

            for(int i = 0; i < panjangArray; i++){
            System.out.println("persegi panjang ke "+ i);
            System.out.println("panjang " + ppArray[i].panjang + " lebar = "+ ppArray[i].lebar);
            }
         }

    }

output program

         Masukkan panjang array: 2
         masukkan persegi panjang ke 0
         masukkan panjang =
         45
         masukkan lebar
         34
         masukkan persegi panjang ke 1
         masukkan panjang =
         23
         masukkan lebar
         45
         persegi panjang ke 0
         panjang 45 lebar = 34
         persegi panjang ke 1
         panjang 23 lebar = 45

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan
   pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

Tidak, dalam Java, tidak diizinkan melakukan duplikasi instansiasi array of objek pada indeks yang sama. Setiap elemen dalam array harus diinisialisasi hanya satu kali.menginisialisasi indeks yang sama, akan menyebabkan konflik dan hasilnya akan menyebabkan error atau hasil yang tidak diinginkan.

### Percobaan 3: Penambahan Operasi Matematika di Dalam Method

      package pertemuan3;

      public class Balok {
         public int panjang;
         public int lebar;
         public int tinggi;

         public Balok(int p, int l, int t){
            panjang = p;
            lebar = l;
            tinggi = t;
         }

         public int hitungvolume (){
            return panjang * lebar * tinggi;
         }
         public static void main(String[] args) {
            Balok[] blArray = new Balok[3];
            blArray[0] = new Balok(100, 30, 12);
            blArray[1] = new Balok(120, 40, 15);
            blArray[2] = new Balok(210, 50, 25);

            for(int i = 0; i < 3; i++){
                  System.out.println("volume balok ke -"+ i + ":" + blArray[i].hitungvolume());
            }
         }


      }

output program

volume balok ke -0:36000
volume balok ke -1:72000
volume balok ke -2:262500

### Pertanyaan

1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!

Ya, dalam sebuah kelas, dapat ada lebih dari satu konstruktor, yang dikenal sebagai overloading konstruktor. Overloading memungkinkan sebuah kelas memiliki beberapa konstruktor dengan jumlah parameter atau jenis parameter yang berbeda.

contoh

      public class MyClass {
         private int nilai1;
         private int nilai2;

         // Konstruktor pertama tanpa parameter
         public MyClass() {
            nilai1 = 0;
            nilai2 = 0;
         }

         // Konstruktor kedua dengan dua parameter
         public MyClass(int a, int b) {
            nilai1 = a;
            nilai2 = b;
         }

         // Metode untuk mendapatkan nilai1
         public int getNilai1() {
            return nilai1;
         }

         // Metode untuk mendapatkan nilai2
         public int getNilai2() {
            return nilai2;
         }

         public static void main(String[] args) {
            // Menggunakan konstruktor pertama
            MyClass obj1 = new MyClass();
            System.out.println("Nilai1: " + obj1.getNilai1()); // Output: 0
            System.out.println("Nilai2: " + obj1.getNilai2()); // Output: 0

            // Menggunakan konstruktor kedua
            MyClass obj2 = new MyClass(10, 20);
            System.out.println("Nilai1: " + obj2.getNilai1()); // Output: 10
            System.out.println("Nilai2: " + obj2.getNilai2()); // Output: 20
         }
      }

2.  Jika diketahui terdapat class Segitiga seperti berikut ini:
    Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
    yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.

             public class Segitiga {
                public int alas;
                public int tinggi;

                // Konstruktor dengan parameter alas dan tinggi
                public Segitiga(int a, int t) {
                   alas = a;
                   tinggi = t;
                }

                public static void main(String[] args) {

                   // Menggunakan konstruktor dengan parameter
                   Segitiga segitiga2 = new Segitiga(5, 8);
                   System.out.println("Alas: " + segitiga2.alas);     // Output: 5
                   System.out.println("Tinggi: " + segitiga2.tinggi); // Output: 8
                }
             }

3.  Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
    tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan
    library Math pada Java untuk mengkalkulasi sisi miring)

          public class Segitiga {
             public int alas;
             public int tinggi;

             // Konstruktor tanpa parameter
             public Segitiga() {
                alas = 0;
                tinggi = 0;
             }

             // Konstruktor dengan parameter alas dan tinggi
             public Segitiga(int a, int t) {
                alas = a;
                tinggi = t;
             }

             // Method untuk menghitung luas segitiga
             public double hitungLuas() {
                return 0.5 * alas * tinggi;
             }

             // Method untuk menghitung keliling segitiga (asumsi segitiga siku-siku)
             public double hitungKeliling() {
                double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
                return alas + tinggi + sisiMiring;
             }

             public static void main(String[] args) {
                // Menggunakan konstruktor tanpa parameter
                Segitiga segitiga1 = new Segitiga();
                segitiga1.alas = 6;
                segitiga1.tinggi = 8;

                // Menggunakan konstruktor dengan parameter
                Segitiga segitiga2 = new Segitiga(3, 4);

                // Menghitung luas dan keliling segitiga
                System.out.println("Luas segitiga 1: " + segitiga1.hitungLuas()); // Output: 24.0
                System.out.println("Keliling segitiga 1: " + segitiga1.hitungKeliling()); // Output: 21.6

                System.out.println("Luas segitiga 2: " + segitiga2.hitungLuas()); // Output: 6.0
                System.out.println("Keliling segitiga 2: " + segitiga2.hitungKeliling()); // Output: 12.0
             }
          }

4.  Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing
    atributnya sebagai berikut:
    sgArray ke-0 alas: 10, tinggi: 4
    sgArray ke-1 alas: 20, tinggi: 10
    sgArray ke-2 alas: 15, tinggi: 6
    sgArray ke-3 alas: 25, tinggi: 10

         public static void main(String[] args) {

            Segitiga []sgArray = new Segitiga[4];
            sgArray[0] = new Segitiga(10, 4);
            sgArray[1] = new Segitiga(20, 10);
            sgArray[2] = new Segitiga(15, 6);
            sgArray[3] = new Segitiga(25, 10);

5.  Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method
    hitungLuas() dan hitungKeliling().

           // Menghitung luas dan keliling segitiga
                for (int i = 0; i < sgArray.length; i++) {
                   System.out.println("sgArray ke-" + i + " alas: " + sgArray[i].alas +
                         ", tinggi: " + sgArray[i].tinggi);
                   System.out.println("Luas: " + sgArray[i].hitungLuas());
                   System.out.println("Keliling: " + sgArray[i].hitungKeliling());
                   System.out.println();
             }

output program

      sgArray ke-0 alas: 10, tinggi: 4
      Luas: 20.0
      Keliling: 24.77032961426901

      sgArray ke-1 alas: 20, tinggi: 10
      Luas: 100.0
      Keliling: 52.3606797749979

      sgArray ke-2 alas: 15, tinggi: 6
      Luas: 45.0
      Keliling: 37.15549442140351

      sgArray ke-3 alas: 25, tinggi: 10
      Luas: 125.0
      Keliling: 61.92582403567252

### Latihan Praktikum

1.  Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut,
    limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun
    ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atributatribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan,
    a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan
    luas permukaan dan volume dari tiap jenis bangun ruang tersebut.
    b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
    c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan
    tinggi limas
    d. Pada bola, inpuntan untuk atribut hanya jari-jari

             package pertemuan3;

             import java.util.Scanner;

             class Kerucut {
                private double jariJari;
                private double sisiMiring;

                public Kerucut(double jariJari, double sisiMiring) {
                   this.jariJari = jariJari;
                   this.sisiMiring = sisiMiring;
                }

                public double hitungLuasPermukaan() {
                   return Math.PI * jariJari * (jariJari + sisiMiring);
                }

                public double hitungVolume() {
                   return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
                }
             }

             class LimasSegiEmpat {
                private double panjangSisiAlas;
                private double tinggiLimas;

                public LimasSegiEmpat(double panjangSisiAlas, double tinggiLimas) {
                   this.panjangSisiAlas = panjangSisiAlas;
                   this.tinggiLimas = tinggiLimas;
                }

                public double hitungLuasPermukaan() {
                   return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggiLimas);
                }

                public double hitungVolume() {
                   return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
                }
             }

             class Bola {
                private double jariJari;

                public Bola(double jariJari) {
                   this.jariJari = jariJari;
                }

                public double hitungLuasPermukaan() {
                   return 4 * Math.PI * jariJari * jariJari;
                }

                public double hitungVolume() {
                   return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
                }
             }

             public class Main {
                public static void main(String[] args) {
                   Scanner scanner = new Scanner(System.in);

                   System.out.println("Masukkan atribut untuk Kerucut:");
                   System.out.print("Jari-jari: ");
                   double jariJariKerucut = scanner.nextDouble();
                   System.out.print("Sisi miring: ");
                   double sisiMiringKerucut = scanner.nextDouble();

                   System.out.println("\nMasukkan atribut untuk Limas Segi Empat Sama Sisi:");
                   System.out.print("Panjang sisi alas: ");
                   double panjangSisiAlasLimas = scanner.nextDouble();
                   System.out.print("Tinggi limas: ");
                   double tinggiLimas = scanner.nextDouble();

                   System.out.println("\nMasukkan atribut untuk Bola:");
                   System.out.print("Jari-jari: ");
                   double jariJariBola = scanner.nextDouble();

                   // Membuat array objek
                   Kerucut kerucut = new Kerucut(jariJariKerucut, sisiMiringKerucut);
                   LimasSegiEmpat limas = new LimasSegiEmpat(panjangSisiAlasLimas, tinggiLimas);
                   Bola bola = new Bola(jariJariBola);

                   // Menampilkan hasil
                   System.out.println("\nHasil Perhitungan:");
                   System.out.println("Luas Permukaan Kerucut: " + kerucut.hitungLuasPermukaan());
                   System.out.println("Volume Kerucut: " + kerucut.hitungVolume());

                   System.out.println("\nLuas Permukaan Limas Segi Empat Sama Sisi: " + limas.hitungLuasPermukaan());
                   System.out.println("Volume Limas Segi Empat Sama Sisi: " + limas.hitungVolume());

                   System.out.println("\nLuas Permukaan Bola: " + bola.hitungLuasPermukaan());
                   System.out.println("Volume Bola: " + bola.hitungVolume());
                }
             }

output program

      Masukkan atribut untuk Kerucut:
      Jari-jari: 3
      Sisi miring: 2

      Masukkan atribut untuk Limas Segi Empat Sama Sisi:
      Panjang sisi alas: 3
      Tinggi limas: 4

      Masukkan atribut untuk Bola:
      Jari-jari: 5

      Hasil Perhitungan:
      Luas Permukaan Kerucut: 47.12388980384689
      Volume Kerucut: 18.84955592153876

      Luas Permukaan Limas Segi Empat Sama Sisi: 33.0
      Volume Limas Segi Empat Sama Sisi: 12.0

      Luas Permukaan Bola: 314.1592653589793
      Volume Bola: 523.5987755982989

2.  Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama,
    nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi
    tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika
    dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:

                 package pertemuan3;

    import java.util.Scanner;

public class InformasiMahasiswa {
private String[] namaMahasiswa;
private String[] nimMahasiswa;
private String[] jenisKelaminMahasiswa;
private double[] ipkMahasiswa;

    public InformasiMahasiswa(int jumlahMahasiswa) {
        namaMahasiswa = new String[jumlahMahasiswa];
        nimMahasiswa = new String[jumlahMahasiswa];
        jenisKelaminMahasiswa = new String[jumlahMahasiswa];
        ipkMahasiswa = new double[jumlahMahasiswa];
    }

    public void inputInformasiMahasiswa(Scanner scanner, int index) {
        System.out.println("Masukkan informasi untuk Mahasiswa ke-" + (index + 1) + ":");
        System.out.print("Nama: ");
        namaMahasiswa[index] = scanner.nextLine();
        System.out.print("NIM: ");
        nimMahasiswa[index] = scanner.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelaminMahasiswa[index] = scanner.nextLine();
        System.out.print("IPK: ");
        ipkMahasiswa[index] = scanner.nextDouble();
        scanner.nextLine(); // Menangani newline character setelah input IPK
        System.out.println();
    }

    public void tampilkanInformasiMahasiswa() {
        System.out.println("Informasi Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            System.out.println("Nama: " + namaMahasiswa[i]);
            System.out.println("NIM: " + nimMahasiswa[i]);
            System.out.println("Jenis Kelamin: " + jenisKelaminMahasiswa[i]);
            System.out.println("IPK: " + ipkMahasiswa[i]);
            System.out.println();
        }
    }

    public void hitungDanTampilkanRataRata() {
        double totalIpk = 0;
        for (double ipk : ipkMahasiswa) {
            totalIpk += ipk;
        }

        double rataRataIpk = totalIpk / ipkMahasiswa.length;
        System.out.println("Rata-rata IPK: " + rataRataIpk);
    }

    public void tampilkanDataTerbesar() {
        double ipkTerbesar = ipkMahasiswa[0];
        int indeksTerbesar = 0;

        for (int i = 1; i < ipkMahasiswa.length; i++) {
            if (ipkMahasiswa[i] > ipkTerbesar) {
                ipkTerbesar = ipkMahasiswa[i];
                indeksTerbesar = i;
            }
        }

        System.out.println("Mahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + namaMahasiswa[indeksTerbesar]);
        System.out.println("IPK: " + ipkTerbesar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        InformasiMahasiswa informasi = new InformasiMahasiswa(jumlahMahasiswa);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            informasi.inputInformasiMahasiswa(scanner, i);
        }

        informasi.tampilkanInformasiMahasiswa();
        informasi.hitungDanTampilkanRataRata();
        informasi.tampilkanDataTerbesar();
    }

}

output program

      Masukkan informasi untuk Mahasiswa ke-1:
      Nama: oqwi
      NIM: 2923
      Jenis Kelamin: kjef
      IPK: 39

      Masukkan informasi untuk Mahasiswa ke-2:
      Nama: 0294
      NIM: 249
      Jenis Kelamin: 409
      IPK: 293

      Masukkan informasi untuk Mahasiswa ke-3:
      Nama: 923
      NIM: 2039
      Jenis Kelamin: 40
      IPK: 2309

      Informasi Mahasiswa:
      Mahasiswa ke-1:
      Nama: oqwi
      NIM: 2923
      Jenis Kelamin: kjef

      Mahasiswa ke-2:
      Nama: 0294
      NIM: 249
      Jenis Kelamin: 409
      IPK: 293.0

      Mahasiswa ke-3:
      Nama: 923
      NIM: 2039
      Jenis Kelamin: 40
      IPK: 2309.0

3.  Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK,
    serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing
    proses tersebut)

             package pertemuan3;
             import java.util.Scanner;

             public class InformasiMahasiswa {
                public static void main(String[] args) {
                   Scanner scanner = new Scanner(System.in);

                   // Menyiapkan array untuk menyimpan informasi 3 mahasiswa
                   String[] namaMahasiswa = new String[3];
                   String[] nimMahasiswa = new String[3];
                   String[] jenisKelaminMahasiswa = new String[3];
                   double[] ipkMahasiswa = new double[3];

                   // Mengisi informasi untuk setiap mahasiswa
                   for (int i = 0; i < 3; i++) {
                         System.out.println("Masukkan informasi untuk Mahasiswa ke-" + (i + 1) + ":");
                         System.out.print("Nama: ");
                         namaMahasiswa[i] = scanner.nextLine();
                         System.out.print("NIM: ");
                         nimMahasiswa[i] = scanner.nextLine();
                         System.out.print("Jenis Kelamin: ");
                         jenisKelaminMahasiswa[i] = scanner.nextLine();
                         System.out.print("IPK: ");
                         ipkMahasiswa[i] = scanner.nextDouble();
                         // Menangani newline character setelah input IPK
                         scanner.nextLine();
                         System.out.println();
                   }

                   // Menampilkan informasi mahasiswa
                   System.out.println("Informasi Mahasiswa:");
                   for (int i = 0; i < 3; i++) {
                         System.out.println("Mahasiswa ke-" + (i + 1) + ":");
                         System.out.println("Nama: " + namaMahasiswa[i]);
                         System.out.println("NIM: " + nimMahasiswa[i]);
                         System.out.println("Jenis Kelamin: " + jenisKelaminMahasiswa[i]);
                         System.out.println("IPK: " + ipkMahasiswa[i]);
                         System.out.println();
                   }

                   // Menampilkan rata-rata IPK
                   double rataRataIPK = hitungRataRataIPK(ipkMahasiswa);
                   System.out.println("Rata-rata IPK: " + rataRataIPK);

                   // Menampilkan data mahasiswa dengan IPK terbesar
                   int indeksMaxIPK = cariIndeksIPKTerbesar(ipkMahasiswa);
                   System.out.println("Data Mahasiswa dengan IPK Terbesar:");
                   System.out.println("Nama: " + namaMahasiswa[indeksMaxIPK]);
                   System.out.println("NIM: " + nimMahasiswa[indeksMaxIPK]);
                   System.out.println("Jenis Kelamin: " + jenisKelaminMahasiswa[indeksMaxIPK]);
                   System.out.println("IPK: " + ipkMahasiswa[indeksMaxIPK]);
                }

                // Method untuk menghitung rata-rata IPK
                private static double hitungRataRataIPK(double[] ipkMahasiswa) {
                   double totalIPK = 0;
                   for (double ipk : ipkMahasiswa) {
                         totalIPK += ipk;
                   }
                   return totalIPK / ipkMahasiswa.length;
                }

                // Method untuk mencari indeks IPK terbesar
                private static int cariIndeksIPKTerbesar(double[] ipkMahasiswa) {
                   int indeksMaxIPK = 0;
                   for (int i = 1; i < ipkMahasiswa.length; i++) {
                         if (ipkMahasiswa[i] > ipkMahasiswa[indeksMaxIPK]) {
                            indeksMaxIPK = i;
                         }
                   }
                   return indeksMaxIPK;
                }
             }

output program

      Masukkan informasi untuk Mahasiswa ke-1:
      Nama: atabik
      NIM: 909090
      Jenis Kelamin: L
      IPK: 3.9

      Masukkan informasi untuk Mahasiswa ke-2:
      Nama: rangga
      NIM: 909092
      Jenis Kelamin: L
      IPK: 2.3

      Masukkan informasi untuk Mahasiswa ke-3:
      Nama: ivan
      NIM: 488484
      Jenis Kelamin: L
      IPK: 3.0

      Informasi Mahasiswa:
      Mahasiswa ke-1:
      Nama: atabik
      NIM: 909090
      Jenis Kelamin: L
      IPK: 3.9

      Mahasiswa ke-2:
      Nama: rangga
      NIM: 909092
      Jenis Kelamin: L
      IPK: 2.3

      Mahasiswa ke-3:
      Nama: ivan
      NIM: 488484
      Jenis Kelamin: L
      IPK: 3.0

      Rata-rata IPK: 3.0666666666666664
      Data Mahasiswa dengan IPK Terbesar:
      Nama: atabik
      NIM: 909090
      Jenis Kelamin: L
      IPK: 3.9
