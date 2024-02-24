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
