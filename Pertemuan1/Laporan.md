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

### Praktikum Pemilihan

1.  Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai
    tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan
    mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan diluar rentang tersebut maka
    akan keluar output “nilai tidak valid”.
    Jika Nilai Huruf yang didapatkan adalah A,B+,B+C+,C maka LULUS, jika nilai huruf D dan E
    maka TIDAK LULUS.
    • Input dari program berupa komponen nilai tugas,kuis, UTS, UAS
    • Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan
    • Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan
    LULUS/TIDAK LULUS

         package Pertemuan1;

         import java.util.Scanner;

         public class Nilai06 {
             public static void main(String[] args) {
                 int NilaiTugas, NilaKuis, NilaiUAS, NilaiUTS;
                 Scanner sc = new Scanner(System.in);
                 while (true) {
                     System.out.println("Masukkan Nilai Tugas : ");
                     NilaiTugas = sc.nextInt();
                     if(NilaiTugas > 100 || NilaiTugas < 0){
                         System.out.println("invalid input");
                     }else{
                         break;
                     }
                 }
                 while (true) {
                     System.out.println("Masukkan Nilai Kuis : ");
                     NilaKuis = sc.nextInt();
                     if (NilaKuis > 100 || NilaKuis < 0){
                         System.out.println("invalid input");
                     }else{
                         break;
                     }
                 }
                 while (true) {
                     System.out.println("Masukkan Nilai UTS : ");
                     NilaiUTS = sc.nextInt();
                     if (NilaiUTS > 100 || NilaiUTS < 0){
                         System.out.println("nilai invalid");
                     }else{
                         break;
                     }
                 }
                 while (true) {
                     System.out.println("Masukkan Nilai UAS : ");
                     NilaiUAS = sc.nextInt();
                     if (NilaiUAS < 0 || NilaiUAS > 100){
                         System.out.println("invalid nilai");
                     }else{
                         break;
                     }
                 }
                 System.out.println("nilai Tugas = "+ NilaiTugas);
                 System.out.println("nilai kuis = "+ NilaKuis);
                 System.out.println("nilai UTS = " + NilaiUTS);
                 System.out.println("nilai UAS = " + NilaiUAS);
                 double nilaiakhir = (NilaiTugas * 0.2)  + (NilaKuis * 0.2) + (NilaiUAS * 0.3) + (NilaiUTS * 0.3);
                 System.out.println("nilai akhir = " + nilaiakhir);
                 if (80 < nilaiakhir && nilaiakhir <= 100){
                     System.out.println("nilai huruf = A");
                 }else if (73 < nilaiakhir && nilaiakhir <= 80){
                     System.out.println("nilai huruf = B+");
                 }else if (65 < nilaiakhir && nilaiakhir <= 73){
                     System.out.println("nilai  = B");
                 }else if (60 < nilaiakhir && nilaiakhir <= 65){
                     System.out.println("nilai huruf = C+");
                 }else if (50 < nilaiakhir && nilaiakhir <= 60){
                     System.out.println("nilai huruf = C");
                 }else if (39 < nilaiakhir && nilaiakhir <= 50){
                     System.out.println("nilai huruf = D");
                 }else if (nilaiakhir <= 39){
                     System.out.println("nilai huruf = E");
                 }

                 if(nilaiakhir <= 50){
                     System.out.println("Anda Tidak Lulus");
                 }else{
                     System.out.println("Selamat Anda Lulus");
                 }

             }

         }

### Perulangan

Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n kecuali
angka 6 dan 10, angka ganjil dicetak dengan asterik “*”, angka genap dicetak sesuai bilangan
aslinya, dengan n = 2 digit terakhir NIM anda.
*bila n<10 maka tambahkan 10 (n+=10)  
Contoh:  
Input NIM: 2341720102 maka n=12  
OUTPUT : _ 2 _ 4 \* _ 8 _ _ 12  
Contoh 2:  
Input NIM: 2341720113 maka n=13  
OUTPUT : _ 2 _ 4 _ _ 8 _ \* 12

        import java.util.Scanner;

        public class DeretBilangan {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Input NIM: ");
                long nim;
                try {
                    nim = Long.parseLong(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input NIM tidak valid. Masukkan bilangan bulat.");
                    return;
                }

                long n = nim % 100; // Mengambil dua digit terakhir dari NIM
                if (n < 10) {
                    n += 10;
                }

                System.out.print("OUTPUT: ");
                for (long i = 1; i <= n; i++) {
                    if (i == 6 || i == 10) {
                        continue; // Skip printing 6 and 10
                    }

                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("* ");
                    }
                }

                scanner.close();
            }
        }

output program

        Input NIM: 2341720090
        OUTPUT: * 2 * 4 * * 8 * * 12 * 14 * 16 * 18 * 20 * 22 * 24 * 26 * 28 * 30 * 32 * 34 * 36 * 38 * 40 * 42 * 44 * 46 * 48 * 50 * 52 * 54 * 56 * 58 * 60 * 62 * 64 * 66 * 68 * 70 * 72 * 74 * 76 * 78 * 80 * 82 * 84 * 86 * 88 * 90

### Praktikum Array

Buatlah program untuk menghitung IP Semester dari matakuliah yang Anda tempuh
semester lalu. Formula untuk menghitung IP semester sebagai berikut :
𝐼𝑃 𝑆𝑒𝑚𝑒𝑠𝑡𝑒𝑟 =  
∑𝑖(𝑁𝑖𝑙𝑎𝑖 𝑆𝑒𝑡𝑎𝑟𝑎𝑖 ∗ 𝑏𝑜𝑏𝑜𝑡 𝑆𝐾𝑆𝑖)  
∑ 𝑆𝐾𝑆  
Nilai setara didapatkan dari tabel konversi berikut ini :
Input dari program berupa nama matakuliah, bobot SKS, serta nilai huruf dari matakuliah
tersebut.

        package Pertemuan1;
        import java.util.Scanner;

        public class IPSemesterCalculator {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Matakuliah dan bobot SKS yang sudah ditentukan
                String[] matakuliah = {"Ppkn", "KTI", "CTPS", "MatDas", "Bing", "Daspro", "P.Daspr", "K3"};
                int[] bobotSKS = {3, 3, 3, 4, 3, 3, 2, 2}; // Misalkan bobot SKS untuk setiap matakuliah

                // Array untuk menyimpan nilai angka, nilai huruf, dan bobot nilai
                double[] nilaiAngka = new double[matakuliah.length];
                String[] nilaiHuruf = new String[matakuliah.length];
                double[] bobotNilai = new double[matakuliah.length];

                // Input nilai angka untuk setiap matakuliah
                for (int i = 0; i < matakuliah.length; i++) {
                    System.out.println("\nMatakuliah: " + matakuliah[i]);
                    System.out.print("Nilai Angka: ");
                    nilaiAngka[i] = scanner.nextDouble();

                    nilaiHuruf[i] = konversiAngkaKeHuruf(nilaiAngka[i]);
                    bobotNilai[i] = konversihurufkeangka(nilaiHuruf[i]);
                }

                // Tampilkan hasil
                System.out.println("\n==============================");
                System.out.println("Jenis Matakuliah\tNilai Angka\tNilai Huruf\tBobot Nilai");
                System.out.println("==============================");
                for (int i = 0; i < matakuliah.length; i++) {
                    System.out.printf("%s\t\t\t%.2f\t\t%s\t\t%.2f\n", matakuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
                }

                double totalBobotNilai = 0;
                double totalSKS = 0;

                for (int i = 0; i < matakuliah.length; i++) {
                    totalBobotNilai += bobotNilai[i];
                    totalSKS += bobotSKS[i];
                }

                double ipSemester = totalBobotNilai / 8;

                System.out.println("==============================");
                System.out.println("IP Semester Anda: " + ipSemester);

                scanner.close();
            }

            // Metode untuk konversi nilai angka ke huruf
            private static String konversiAngkaKeHuruf(double nilaiAngka) {
                if (nilaiAngka >= 80) {
                    return "A";
                } else if (nilaiAngka > 73) {
                    return "B+";
                } else if (nilaiAngka > 65) {
                    return "B";
                } else if (nilaiAngka > 60) {
                    return "C+";
                } else if (nilaiAngka > 50) {
                    return "C";
                } else if (nilaiAngka > 39) {
                    return "D";
                } else {
                    return "E";
                }
            }

            //metode konversi nilai huruf ke bobot nilai
        //metode konversi nilai huruf ke bobot nilai
            private static double konversihurufkeangka(String nilaiHuruf) {
                switch (nilaiHuruf) {
                    case "A":
                        return 4.0;
                    case "B+":
                        return 3.5;
                    case "B":
                        return 3.0;
                    case "C+":
                        return 2.5;
                    case "C":
                        return 2.0;
                    case "D":
                        return 1.0;
                    default:
                        return 0.0; // Nilai E atau nilai huruf tidak valid
                }
            }

        }

output program

        Matakuliah: Ppkn
        Nilai Angka: 87

        Matakuliah: KTI
        Nilai Angka: 89

        Matakuliah: CTPS
        Nilai Angka: 76

        Matakuliah: MatDas
        Nilai Angka: 56

        Matakuliah: Bing
        Nilai Angka: 67

        Matakuliah: Daspro
        Nilai Angka: 56

        Matakuliah: P.Daspr
        Nilai Angka: 45

        Matakuliah: K3
        Nilai Angka: 78

        ==============================
        Jenis Matakuliah        Nilai Angka     Nilai Huruf     Bobot Nilai
        ==============================
        Ppkn                    87.00           A               4.00
        KTI                     89.00           A               4.00
        CTPS                    76.00           B+              3.50
        MatDas                  56.00           C               2.00
        Bing                    67.00           B               3.00
        Daspro                  56.00           C               2.00
        P.Daspr                 45.00           D               1.00
        K3                      78.00           B+              3.50
        ==============================
        IP Semester Anda: 2.875

### fungsi

Pertanyaan
RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bungabunga yang dijual selalu dicatat dengan rincian seperti berikut ini:
Baris = Cabang Toko, Kolom = Stock bunga pada hari x
Aglonema Keladi Alocasia Mawar
RoyalGarden1 10 5 15 7  
RoyalGarden 2 6 11 9 12  
RoyalGarden 3 2 10 10 5  
RoyalGarden 4 5 7 12 9  
Rincian Harga Aglonema =75.000 , Keladi = 50.000, Alocasia =60.000, Mawar =10.000.

1.  Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis
    terjual.
2.  Buatlah fungsi untuk mengetahui jumlah Stock setiap jenis bunga pada cabang royalgarden
3.  Jika terdapat informasi tambahan berupa pengurangan stock karena bunga tersebut mati.
    Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.

            package Pertemuan1;
            import java.util.HashMap;
            import java.util.Map;

            public class RoyalGarden {

                // Rincian Harga Bunga
                private static final int HARGA_AGLONEMA = 75000;
                private static final int HARGA_KELADI = 50000;
                private static final int HARGA_ALOCASIA = 60000;
                private static final int HARGA_MAWAR = 10000;

                // Daftar nama bunga
                private static final String[] NAMA_BUNGA = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

                // Data penjualan bunga
                private int[][] penjualan;

                // Konstruktor untuk RoyalGarden
                public RoyalGarden(int[][] penjualan) {
                    this.penjualan = penjualan;
                }

                // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
                public void tampilkanPendapatan() {
                    for (int i = 0; i < penjualan.length; i++) {
                        int pendapatanCabang = 0;
                        for (int j = 1; j < penjualan[i].length; j++) {
                            pendapatanCabang += penjualan[i][j] * getHargaBunga(j - 1);
                        }
                        System.out.println("Pendapatan Cabang " + penjualan[i][0] + ": " + pendapatanCabang);
                    }
                }

                // Fungsi untuk mendapatkan jumlah stock setiap jenis bunga pada cabang RoyalGarden
                public void tampilkanJumlahStock() {
                    Map<String, Integer> jumlahStock = new HashMap<>();

                    for (int j = 1; j < penjualan[0].length; j++) {
                        int totalStock = 0;
                        for (int i = 0; i < penjualan.length; i++) {
                            totalStock += penjualan[i][j];
                        }
                        jumlahStock.put(NAMA_BUNGA[j - 1], totalStock);
                    }

                    System.out.println("Jumlah Stock pada Cabang RoyalGarden 4:");
                    for (Map.Entry<String, Integer> entry : jumlahStock.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                }

                // Fungsi untuk mengurangi stock karena bunga mati
                public void kurangiStockMati() {
                    // Rincian pengurangan stock karena bunga mati
                    int[] penguranganStock = {-1, -2, 0, -5};

                    for (int j = 1; j < penjualan[0].length; j++) {
                        for (int i = 0; i < penjualan.length; i++) {
                            penjualan[i][j] += penguranganStock[j - 1];
                        }
                    }
                }

                // Fungsi untuk mendapatkan harga bunga berdasarkan indeks
                private int getHargaBunga(int indeks) {
                    switch (indeks) {
                        case 0:
                            return HARGA_AGLONEMA;
                        case 1:
                            return HARGA_KELADI;
                        case 2:
                            return HARGA_ALOCASIA;
                        case 3:
                            return HARGA_MAWAR;
                        default:
                            return 0;
                    }
                }
                    // Fungsi untuk mendapatkan jumlah stock setiap jenis bunga pada cabang RoyalGarden 4
                public void tampilkanJumlahStockCabang4() {
                    Map<String, Integer> jumlahStock = new HashMap<>();

                    int cabangKe = 4;

                    for (int j = 1; j < penjualan[cabangKe - 1].length; j++) {
                        int totalStock = penjualan[cabangKe - 1][j];
                        jumlahStock.put(NAMA_BUNGA[j - 1], totalStock);
                    }

                    System.out.println("Jumlah Stock pada Cabang RoyalGarden " + cabangKe + ":");
                    for (Map.Entry<String, Integer> entry : jumlahStock.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                }


                public static void main(String[] args) {
                    int[][] penjualan = {
                            {1, 10, 5, 15, 7},
                            {2, 6, 11, 9, 12},
                            {3, 2, 10, 10, 5},
                            {4, 5, 7, 12, 9}
                    };

                    RoyalGarden royalGarden = new RoyalGarden(penjualan);

                    // Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
                    royalGarden.tampilkanPendapatan();

                    // Menampilkan jumlah stock setiap jenis bunga pada cabang RoyalGarden 4
                    royalGarden.tampilkanJumlahStockCabang4();

                    // Mengurangi stock karena bunga mati
                    royalGarden.kurangiStockMati();

                    // Menampilkan jumlah stock setiap jenis bunga setelah pengurangan stock
                    royalGarden.tampilkanJumlahStockCabang4();
                }
            }

output program

        Pendapatan Cabang 1: 1970000
        Pendapatan Cabang 2: 1660000
        Pendapatan Cabang 3: 1300000
        Pendapatan Cabang 4: 1535000
        Jumlah Stock pada Cabang RoyalGarden 4:
        Alocasia: 12
        Keladi: 7
        Aglonema: 5
        Mawar: 9
        Jumlah Stock pada Cabang RoyalGarden 4:
        Alocasia: 12
        Keladi: 5
        Aglonema: 4
        Mawar: 4

### Tugas 1

Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array
pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array
dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil.
Ilustrasi tampilan array tersebut adalah sebagai berikut
Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan
nama kota dari kode plat nomor tersebut.

        package Pertemuan1;

        import java.util.Scanner;

        public class PlatMobilProgram {

            public static void main(String[] args) {
                // Inisialisasi array KODE dan KOTA
                char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
                String[][] KOTA = {
                        {"Banten"},
                        {"Jakarta"},
                        {"Bandung", },
                        {"Cirebon"},
                        {"Bogor"},
                        {"Pekalongan"},
                        {"Semarang"},
                        {"Surabaya"},
                        {"Malang"},
                        {"Karawang"}
                };

                // Membuat Scanner untuk input dari pengguna
                Scanner scanner = new Scanner(System.in);

                // Meminta input kode plat nomor dari pengguna
                System.out.print("Masukkan kode plat mobil: ");
                String inputKode = scanner.next().toUpperCase(); // Mengubah input ke huruf besar

                // Mencari indeks kode plat pada array KODE
                int indeksKode = -1;
                for (int i = 0; i < KODE.length; i++) {
                    if (inputKode.equals(String.valueOf(KODE[i]))) {
                        indeksKode = i;
                        break;
                    }
                }

                // Menampilkan hasil
                if (indeksKode != -1) {
                    System.out.println("Nama kota untuk kode plat " + inputKode + ":");
                    for (String kota : KOTA[indeksKode]) {
                        System.out.println("- " + kota);
                    }
                } else {
                    System.out.println("Kode plat tidak valid");
                }

                // Menutup Scanner
                scanner.close();
            }
        }

output program

        Masukkan kode plat mobil: a
        Nama kota untuk kode plat A:
        - Banten

### Buat program untuk menghitung rumus kecepatan, jarak, dan waktu

Berikut adalah persamaan untuk menghitung rumus tersebut :
Rumus Kecepatan
𝑣 =
𝑠
𝑡
Rumus Jarak
𝑠 = 𝑣.𝑡
Rumus Waktu
𝑡 =
𝑠
𝑣
Keterangan :
𝑣 = 𝑘𝑒𝑐𝑒𝑝𝑎𝑡𝑎𝑛
𝑠 = 𝑗𝑎𝑟𝑎𝑘
𝑡 = 𝑤𝑎𝑘𝑡𝑢
Program yang dibuat memiliki fungsi sebagai berikut:  
a. Menu (Untuk memilih rumus yang akan dihitung (kecepatan/jarak/waktu)  
b. Menghitung hasil perhitungan Kecepatan  
c. Menghitung hasil perhitungan Jarak
d. Menghitung hasil perhitungan Waktu
Panggil fungsi-fungsi tersebut pada fungsi main!

        package Pertemuan1;

        import java.util.Scanner;

        public class HitungKecepatan {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("=== Menu ===");
                    System.out.println("1. Hitung Kecepatan");
                    System.out.println("2. Hitung Jarak");
                    System.out.println("3. Hitung Waktu");
                    System.out.println("4. Keluar");

                    System.out.print("Pilih menu (1-4): ");
                    int menu = scanner.nextInt();

                    switch (menu) {
                        case 1:
                            hitungKecepatan();
                            break;
                        case 2:
                            hitungJarak();
                            break;
                        case 3:
                            hitungWaktu();
                            break;
                        case 4:
                            System.out.println("Terima kasih, program selesai.");
                            System.exit(0); // Keluar dari program
                        default:
                            System.out.println("Pilihan menu tidak valid. Silakan pilih kembali.");
                    }
                }
            }

            public static void hitungKecepatan() {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Masukkan jarak (s): ");
                double jarak = scanner.nextDouble();

                System.out.print("Masukkan waktu (t): ");
                double waktu = scanner.nextDouble();

                double kecepatan = jarak / waktu;

                System.out.println("Kecepatan (v): " + kecepatan + " m/s");
            }

            public static void hitungJarak() {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Masukkan kecepatan (v): ");
                double kecepatan = scanner.nextDouble();

                System.out.print("Masukkan waktu (t): ");
                double waktu = scanner.nextDouble();

                double jarak = kecepatan * waktu;

                System.out.println("Jarak (s): " + jarak + " meter");
            }

            public static void hitungWaktu() {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Masukkan jarak (s): ");
                double jarak = scanner.nextDouble();

                System.out.print("Masukkan kecepatan (v): ");
                double kecepatan = scanner.nextDouble();

                double waktu = jarak / kecepatan;

                System.out.println("Waktu (t): " + waktu + " detik");
            }
        }

output program

        Pilih menu (1-4): 1
        Masukkan jarak (s): 400
        Masukkan waktu (t): 1
        Kecepatan (v): 400.0 m/s
        === Menu ===
        1. Hitung Kecepatan
        2. Hitung Jarak
        3. Hitung Waktu
        4. Keluar
        Pilih menu (1-4):

program akan terus melakukan looping hingga pengguna memilih angka 4
