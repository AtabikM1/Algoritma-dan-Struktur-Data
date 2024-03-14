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

### 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

program

            package Pertemuan5;
            import java.util.Scanner;

            public class faktorial {

                public int nilai;

                int faktorialBF(int n){
                    int fakto = 1;
                    for (int i = 1; i <= n; i++){
                        fakto = fakto * i; // Perubahan disini
                    }
                    return fakto;
                }

                int faktorialdc(int n){
                    if(n==1){
                        return 1;
                    }else{
                        int fakto = n * faktorialdc(n-1);
                        return fakto;
                    }
                }

                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("------------");
                    System.out.print("Masukkan jumlah elemen = ");
                    int jumlahElemen = sc.nextInt();

                    faktorial[] fk = new faktorial[jumlahElemen];
                    for (int i=0; i<jumlahElemen; i++){
                        fk[i] = new faktorial();
                        System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
                        int nilai = sc.nextInt();
                        fk[i].nilai = nilai; // Menyimpan nilai ke atribut nilai
                    }

                    System.out.println("Hasil - Brute Force");
                    for (int i = 0; i < jumlahElemen; i++){
                        System.out.println("Hasil penghitungan faktorial menggunakan brute force adalah " + fk[i].faktorialBF(fk[i].nilai));
                    }

                    System.out.println("Hasil - Divide Conquer");
                    for (int i = 0; i < jumlahElemen; i++){
                        System.out.println("Hasil penghitungan faktorial menggunakan Divide Conquer adalah " + fk[i].faktorialdc(fk[i].nilai));
                    }
                }
            }

output

        Masukkan jumlah elemen = 3
        Masukkan nilai data ke-1 : 5
        Masukkan nilai data ke-2 : 8
        Masukkan nilai data ke-3 : 3
        Hasil - Brute Force
        Hasil penghitungan faktorial menggunakan brute force adalah 120
        Hasil penghitungan faktorial menggunakan brute force adalah 40320
        Hasil penghitungan faktorial menggunakan brute force adalah 6
        Hasil - Divide Conquer
        Hasil penghitungan faktorial menggunakan Divide Conquer adalah 120
        Hasil penghitungan faktorial menggunakan Divide Conquer adalah 40320
        Hasil penghitungan faktorial menggunakan Divide Conquer adalah 6

1.  Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
    perbedaan bagian kode pada penggunaan if dan else!  
     pada bagian if adalah kondisi terminasi atau dasar dari rekursi, sementara pada bagian else adalah langkah rekursi itu sendiri di mana nilai faktorial dipecah menjadi perkalian nilai dengan faktorial nilai yang lebih kecil.

2.  Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
    for? Buktikan!  
    Ya, memungkinkan untuk mengganti perulangan for dengan jenis perulangan lainnya seperti while atau do-while. Ini bisa dilakukan dengan cara yang sama dengan yang dilakukan dalam perulangan for, yaitu dengan menginisialisasi sebuah variabel kontrol, menentukan kondisi berhenti, dan menyesuaikan variabel kontrol di setiap iterasi.

                    int faktorialBF(int n) {
                        int fakto = 1;
                        int i = 1; // inisialisasi variabel kontrol

                        do {
                            fakto = fakto * i;
                            i++; // menyesuaikan variabel kontrol
                        } while (i <= n); // kondisi berhenti

                        return fakto;
                    }

3.  Jelaskan perbedaan antara fakto _= i; dan int fakto = n _ faktorialDC(n-1); !

perbedaanya terletak pada cara mereka mengubah nilai variabel fakto serta cara penggunaannya dalam konteks perhitungan faktorial.

fakto _= i; adalah singkatan dari fakto = fakto _ i;.
Ini adalah operasi penggandaan singkat (short-hand) yang biasanya digunakan dalam konteks perulangan seperti pada algoritma brute force untuk menghitung faktorial.
fakto akan dikalikan dengan i, dan hasilnya akan disimpan kembali ke dalam fakto. Dalam konteks perhitungan faktorial, ini akan terus mengakumulasi hasil perkalian dari 1 hingga n.  
int fakto = n \* faktorialDC(n-1) adalah langkah rekursif yang digunakan dalam algoritma Divide and Conquer untuk menghitung faktorial.
pada setiap langkah rekursif, nilai n akan dikalikan dengan hasil dari pemanggilan rekursif faktorialDC(n-1). Dalam konteks ini, n adalah nilai yang ingin dihitung faktorialnya, dan faktorialDC(n-1) adalah hasil faktorial dari nilai yang lebih kecil dari n.
cara ini membagi permasalahan menjadi sub-permasalahan yang lebih kecil, dengan menghitung faktorial nilai yang lebih kecil secara rekursif, dan kemudian mengalikan hasilnya dengan nilai n untuk mendapatkan hasil faktorial dari n.

### 4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

program

        package Pertemuan5;

        public class pangkat {
            public int nilai, pangkat;

            int pangkatBF(int a, int n){
                int hasil = 1; // Inisialisasi hasil ke 1
                for(int i = 0; i < n; i++){
                    hasil *= a; // Melakukan operasi perkalian sebanyak n kali
                }
                return hasil;
            }

            int pangkatDC(int a, int n){
                if(n == 0){
                    return 1;
                } else if(n % 2 == 0){
                    int temp = pangkatDC(a, n/2);
                    return temp * temp;
                } else {
                    int temp = pangkatDC(a, n/2);
                    return temp * temp * a;
                }
            }
        }
        package Pertemuan5;
        import java.util.Scanner;
        public class mainpangkat {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("==================");
                System.out.print("masukkan jumlah elemen yang dihitung = ");
                int elemen = sc.nextInt();

                pangkat[] png = new pangkat[elemen];
                for(int i = 0; i < elemen; i++){
                    png[i] = new pangkat();
                    System.out.print("masukkan nilai yang hendak dipangkatkan :");
                    png[i].nilai = sc.nextInt();
                    System.out.print("masukkan nilai pemangkat : ");
                    png[i].pangkat = sc.nextInt();
                }
                System.out.println("hasil pangkat brute force");
                for (int i =0; i < elemen; i++){
                    System.out.println("hasil dari "+ png[i].nilai+" pangkat "+ png[i].pangkat+" adalah "+ png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                System.out.println("hasil pangkat divide and conquer");
                for(int i = 0; i < elemen; i++){
                    System.out.println("hasil dari "+ png[i].nilai+" pangkat "+png[i].pangkat+ " adalah "+ png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
            }
        }

output

        masukkan jumlah elemen yang dihitung = 2
        masukkan nilai yang hendak dipangkatkan :6
        masukkan nilai pemangkat : 2
        masukkan nilai yang hendak dipangkatkan :4
        masukkan nilai pemangkat : 3
        hasil pangkat brute force
        hasil dari 6 pangkat 2 adalah 36
        hasil dari 4 pangkat 3 adalah 64
        hasil pangkat divide and conquer
        hasil dari 6 pangkat 2 adalah 36
        hasil dari 4 pangkat 3 adalah 64

1.  Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
    PangkatDC() (Divide and Conquer):
    Metode divide and conquer menghitung pangkat dengan cara membagi masalah menjadi sub-masalah yang lebih kecil, menyelesaikan sub-masalah tersebut secara rekursif, dan menggabungkan solusi untuk mendapatkan solusi akhir.
2.  Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
    PangkatBF() (Brute Force):
    Metode brute force menghitung pangkat dengan cara melakukan operasi perkalian secara berulang sebanyak n kali, di mana n adalah pangkat yang diinginkan.
3.  Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan
    konstruktor.
    package Pertemuan5;
    import java.util.Scanner;

            public class mainpangkat {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("==================");
                    System.out.print("Masukkan jumlah elemen yang dihitung = ");
                    int elemen = sc.nextInt();

                    pangkat[] png = new pangkat[elemen];
                    for(int i = 0; i < elemen; i++){
                        System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
                        int nilai = sc.nextInt();
                        System.out.print("Masukkan nilai pemangkat: ");
                        int pangkat = sc.nextInt();
                        png[i] = new pangkat(nilai, pangkat); // Menggunakan konstruktor
                    }
                    System.out.println("Hasil pangkat brute force:");
                    for (int i = 0; i < elemen; i++){
                        System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    System.out.println("Hasil pangkat divide and conquer:");
                    for(int i = 0; i < elemen; i++){
                        System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                }
            }

            class pangkat {
                public int nilai, pangkat;

                // Konstruktor untuk menginisialisasi nilai dan pangkat
                pangkat(int nilai, int pangkat) {
                    this.nilai = nilai;
                    this.pangkat = pangkat;
                }

                int pangkatBF(int a, int n){
                    int hasil = 1; // Inisialisasi hasil ke 1
                    for(int i = 0; i < n; i++){
                        hasil *= a; // Melakukan operasi perkalian sebanyak n kali
                    }
                    return hasil;
                }

                int pangkatDC(int a, int n){
                    if(n == 0){
                        return 1;
                    } else if(n % 2 == 0){
                        int temp = pangkatDC(a, n/2);
                        return temp * temp;
                    } else {
                        int temp = pangkatDC(a, n/2);
                        return temp * temp * a;
                    }
                }
            }

4.  Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan
    switch-case!

            package Pertemuan5;
            import java.util.Scanner;

            public class mainpangkat {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("==================");
                    System.out.print("Masukkan jumlah elemen yang dihitung = ");
                    int elemen = sc.nextInt();

                    pangkat[] png = new pangkat[elemen];
                    for(int i = 0; i < elemen; i++){
                        System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
                        int nilai = sc.nextInt();
                        System.out.print("Masukkan nilai pemangkat: ");
                        int pangkat = sc.nextInt();
                        png[i] = new pangkat(nilai, pangkat); // Menggunakan konstruktor
                    }

                    System.out.println("Pilih metode perhitungan pangkat:");
                    System.out.println("1. Brute Force");
                    System.out.println("2. Divide and Conquer");
                    System.out.print("Masukkan pilihan Anda: ");
                    int pilihan = sc.nextInt();

                    switch (pilihan) {
                        case 1:
                            System.out.println("Hasil pangkat brute force:");
                            for (int i = 0; i < elemen; i++){
                                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                            }
                            break;
                        case 2:
                            System.out.println("Hasil pangkat divide and conquer:");
                            for(int i = 0; i < elemen; i++){
                                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                            }
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!");
                            break;
                    }
                }
            }

            class pangkat {
                public int nilai, pangkat;

                // Konstruktor untuk menginisialisasi nilai dan pangkat
                pangkat(int nilai, int pangkat) {
                    this.nilai = nilai;
                    this.pangkat = pangkat;
                }

                int pangkatBF(int a, int n){
                    int hasil = 1; // Inisialisasi hasil ke 1
                    for(int i = 0; i < n; i++){
                        hasil *= a; // Melakukan operasi perkalian sebanyak n kali
                    }
                    return hasil;
                }

                int pangkatDC(int a, int n){
                    if(n == 0){
                        return 1;
                    } else if(n % 2 == 0){
                        int temp = pangkatDC(a, n/2);
                        return temp * temp;
                    } else {
                        int temp = pangkatDC(a, n/2);
                        return temp * temp * a;
                    }
                }
            }

### 4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

program

            package Pertemuan5;

            public class sum {
                int elemen;
                double keuntungan[], total;

                sum(int elemen){
                    this.elemen = elemen;
                    this.keuntungan = new double[elemen];
                    this.total = 0;

                }
                double totalBF(double arr[]){
                    for(int i = 0; i < elemen; i++){
                        total = total + arr[i];
                    }
                    return total;
                }
                double totalDC(double arr[], int l, int r){
                    if(l==r){
                        return arr[l];
                    }else if (l<r){
                        int mid = (l+r)/2;
                        double lsum = totalDC(arr, l, mid);// perbaikan parameter
                        double rsum = totalDC(arr, mid+1, r);
                        return lsum + rsum;//tidak perlu arr
                    }
                    return 0;
                }
            }
            package Pertemuan5;
            import java.util.Scanner;
            public class mainsum {
                public static void main(String[] args) {
                    Scanner sc = new Scanner (System.in);
                    System.out.println("==================================");
                    System.out.println("program menghitung keuntungan total (satuan juta. misal 5.9)");
                    System.out.print("masukkan jumlah bulan :");
                    int elm = sc.nextInt();

                    sum sm = new sum(elm);
                    System.out.println("==================================");
                    for(int i =0; i < sm.elemen; i++){
                        System.out.print("masukkan untung bulan ke "+(i + 1)+ " = ");
                        sm.keuntungan[i] = sc.nextDouble();

                    }

                    System.out.println("=====================================");
                    System.out.println("algoritma bruto force");
                    System.out.println("total keuntungan perusahaan selama "+ sm.elemen + "bulan adalah = "+ sm.totalBF(sm.keuntungan));
                    System.out.println("=====================================");
                    System.out.println("algoritma divide conquer");
                    System.out.println("total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
                }
            }

output program

    masukkan jumlah bulan :5
    ==================================
    masukkan untung bulan ke 1 = 8.5
    masukkan untung bulan ke 2 = 9.54
    masukkan untung bulan ke 3 = 7.2
    masukkan untung bulan ke 4 = 9.1
    masukkan untung bulan ke 5 = 6
    =====================================
    algoritma bruto force
    total keuntungan perusahaan selama 5bulan adalah = 40.339999999999996
    =====================================
    algoritma divide conquer
    total keuntungan perusahaan selama 5 bulan adalah = 40.339999999999996

### Pertanyaan

1.  Mengapa terdapat formulasi return value berikut?Jelaskan  
    Formulasi return lsum + rsum; digunakan untuk menggabungkan hasil dari kedua panggilan rekursif pada metode totalDC() dalam pendekatan Divide and Conquer.
    lsum adalah hasil dari panggilan rekursif untuk bagian kiri array, yang menyatakan total keuntungan dari bagian kiri array. rsum adalah hasil dari panggilan rekursif untuk bagian kanan array, yang menyatakan total keuntungan dari bagian kanan array. Dengan cara ini, lsum + rsum menggabungkan total keuntungan dari kedua bagian array tersebut, memberikan total keuntungan dari seluruh array.
2.  Kenapa dibutuhkan variable mid pada method TotalDC()?  
    Variabel mid pada metode totalDC() diperlukan untuk menentukan indeks tengah dari array yang akan digunakan untuk membagi masalah menjadi submasalah yang lebih kecil saat menggunakan pendekatan Divide and Conquer.
3.  Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
    Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
    perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan
    dengan program!

         package Pertemuan5;
         import java.util.Scanner;

         public class CompanyProfit {
             public int numCompanies;
             public sum[] companies;

             public CompanyProfit(int numCompanies) {
                 this.numCompanies = numCompanies;
                 companies = new sum[numCompanies];
             }

             public void setCompany(int index, sum company) {
                 companies[index] = company;
             }

             public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 System.out.print("Masukkan jumlah perusahaan: ");
                 int numCompanies = sc.nextInt();

                 CompanyProfit profitCalculator = new CompanyProfit(numCompanies);

                 for (int i = 0; i < numCompanies; i++) {
                     System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
                     int months = sc.nextInt();

                     sum companyProfit = new sum(months);

                     System.out.println("Masukkan keuntungan untuk setiap bulan:");
                     for (int j = 0; j < months; j++) {
                         System.out.print("Keuntungan bulan ke-" + (j + 1) + ": ");
                         companyProfit.keuntungan[j] = sc.nextDouble();
                     }

                     profitCalculator.setCompany(i, companyProfit);
                 }

                 System.out.println("\nTotal keuntungan setiap perusahaan:");
                 for (int i = 0; i < numCompanies; i++) {
                     sum currentCompany = profitCalculator.companies[i];
                     System.out.println("Perusahaan ke-" + (i + 1) + ":");
                     System.out.println("Total keuntungan (Brute Force): " + currentCompany.totalBF(currentCompany.keuntungan));
                     System.out.println("Total keuntungan (Divide and Conquer): " + currentCompany.totalDC(currentCompany.keuntungan, 0, currentCompany.elemen - 1));
                     System.out.println();
                 }
             }
         }

output program

        Masukkan jumlah perusahaan: 2
        Masukkan jumlah bulan untuk perusahaan ke-1: 3
        Masukkan keuntungan untuk setiap bulan:
        Keuntungan bulan ke-1: 2
        Keuntungan bulan ke-2: 3
        Keuntungan bulan ke-3: 3
        Masukkan jumlah bulan untuk perusahaan ke-2: 3
        Masukkan keuntungan untuk setiap bulan:
        Keuntungan bulan ke-1: 2
        Keuntungan bulan ke-2: 3
        Keuntungan bulan ke-3: 2

        Total keuntungan setiap perusahaan:
        Total keuntungan (Divide and Conquer): 8.0

        Perusahaan ke-2:
        Total keuntungan (Brute Force): 7.0
        Total keuntungan (Divide and Conquer): 7.0

1.  Sebuah showroom memiliki daftar mobil dengan data sesuai tabel di bawah ini
    Tentukan:
    a) top_acceleration tertinggi menggunakan Divide and Conquer!
    b) top_acceleration terendah menggunakan Divide and Conquer!
    c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force.

            package Pertemuan5;
            public class Showroom {

                // Struktur data untuk merepresentasikan mobil
                class Mobil {
                    String merk;
                    String tipe;
                    int tahun;
                    int top_acceleration;
                    int top_power;

                    public Mobil(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
                        this.merk = merk;
                        this.tipe = tipe;
                        this.tahun = tahun;
                        this.top_acceleration = top_acceleration;
                        this.top_power = top_power;
                    }
                }

                // Metode untuk mencari top_acceleration tertinggi menggunakan Divide and Conquer
                private int maxAcceleration(Mobil[] mobil, int low, int high) {
                    if (low == high) {
                        return mobil[low].top_acceleration;
                    }

                    int mid = (low + high) / 2;
                    int leftMax = maxAcceleration(mobil, low, mid);
                    int rightMax = maxAcceleration(mobil, mid + 1, high);

                    return Math.max(leftMax, rightMax);
                }

                // Metode untuk mencari top_acceleration terendah menggunakan Divide and Conquer
                private int minAcceleration(Mobil[] mobil, int low, int high) {
                    if (low == high) {
                        return mobil[low].top_acceleration;
                    }

                    int mid = (low + high) / 2;
                    int leftMin = minAcceleration(mobil, low, mid);
                    int rightMin = minAcceleration(mobil, mid + 1, high);

                    return Math.min(leftMin, rightMin);
                }

                // Metode untuk menghitung rata-rata top_power dari seluruh mobil menggunakan Brute Force
                private double averagePower(Mobil[] mobil) {
                    double totalPower = 0;
                    for (Mobil car : mobil) {
                        totalPower += car.top_power;
                    }
                    return totalPower / mobil.length;
                }

                public static void main(String[] args) {
                    Showroom showroom = new Showroom();

                    // Data mobil
                    Mobil[] mobil = {
                        showroom.new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
                        showroom.new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
                        showroom.new Mobil("Nissan", "370Z", 2009, 4360, 657),
                        showroom.new Mobil("Subaru", "BRZ", 2014, 4058, 609),
                        showroom.new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                        showroom.new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
                        showroom.new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
                        showroom.new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631)
                    };

                    // Mencari top_acceleration tertinggi
                    int maxAcc = showroom.maxAcceleration(mobil, 0, mobil.length - 1);
                    System.out.println("Top acceleration tertinggi: " + maxAcc);

                    // Mencari top_acceleration terendah
                    int minAcc = showroom.minAcceleration(mobil, 0, mobil.length - 1);
                    System.out.println("Top acceleration terendah: " + minAcc);

                    // Menghitung rata-rata top_power
                    double avgPower = showroom.averagePower(mobil);
                    System.out.println("Rata-rata top power: " + avgPower);
                }
            }

output program

Top acceleration tertinggi: 6816
Top acceleration terendah: 3700
Rata-rata top power: 633.125
