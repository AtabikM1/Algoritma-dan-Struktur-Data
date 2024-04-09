# Laporan Praktikum Algoritma dan Struktur Data

## Pertemuan 6

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="ATM gif" width="30%"> 
</p>

---

Nama: Atabik Mutawakilalallah

NIM: 2341720090

No. Absen: 06

Kelas: TI-1B

---

### 6.2.1. Langkah-langkah Percobaan Sequential Search

buat class

            package Pertemuan7;

            public class Buku {
                int kodebuku, tahunterbit, stok;
                String judul, pengarang;

                Buku(int kodebuku, String judul, int tahunterbit, String pengarang, int stok){
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
            package Pertemuan7;

            public class Pencarianbuku06 {
                Buku lisBuku[] = new Buku[5];
                int idx;

                void tambah(Buku m){
                    if (idx < lisBuku.length){
                        lisBuku[idx] = m;
                        idx++;
                    } else {
                        System.out.println("Data Penuh");
                    }
                }
                void tampil(){
                    for (Buku m :lisBuku){
                        m.tampilDataBuku();
                    }
                }
                public int findSeqSearch(int cari){
                    int posisi = -1;
                    for (int j  =0; j < lisBuku.length; j++){
                        if (lisBuku[j].kodebuku==cari){
                            posisi=j;
                            break;
                        }
                    }
                    return posisi;
                }
                void tampilPosisi(int x, int pos){
                    if(pos!= -1){
                        System.out.println("data :" + x  + " ditemukan pada indeks ke "+ pos);

                    }else{
                        System.out.println("data "+ x + " tidak ditemukan");
                    }
                }
                public void tampildata(int x, int pos){
                    if (pos != -1){
                        System.out.println("Kode Buku\t : " + x);
                        System.out.println("judul\t : "+lisBuku[pos].judul);
                        System.out.println("Tahun Terbit\t : "+lisBuku[pos].pengarang);
                        System.out.println("pengarang\t : "+lisBuku[pos].pengarang);
                        System.out.println("Stock\t : "+lisBuku[pos].stok);

                    }else{
                        System.out.println("data "+ x + "tidak ditemukan");
                    }
                }

                public int findBinarySearch(int cari, int left, int right){
                    int mid;
                    if (right >= left){
                        mid = (right) / 2;
                        if(cari == lisBuku[mid].kodebuku){
                            return (mid);
                        }else if (lisBuku[mid].kodebuku > cari){
                            return findBinarySearch(cari, left, mid);
                        }else {
                            return findBinarySearch(cari, mid, right);
                        }
                    }
                    return -1;
                }


            }
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
                    System.out.println("Data keseluruhan Mahasiswa : ");
                    System.out.println("-------------------------");
                    System.out.println("data keseluruhan Buku : " );
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

                    System.out.println("==================");
                    System.out.println("menggunakan binary search");
                    posisi = data.findBinarySearch(cari, 0, jumlahbuku - 1);
                    data.tampilPosisi(cari, posisi);
                    data.tampildata(cari, posisi);
                }

            }

output

        Stok = 2
        ________________
        ________________
        Pencarian Data :
        Masukkan Kode Buku yang dicari =
        Kode Buku :
        111
        menggunakan sequential Search
        data :111 ditemukan pada indeks ke 0
        Kode Buku        : 111
        judul    : algoritma
        Tahun Terbit     : wahyuni
        pengarang        : wahyuni
        Stock    : 5
        ==================
        menggunakan binary search
        data :111 ditemukan pada indeks ke 0
        Kode Buku        : 111
        judul    : algoritma
        Tahun Terbit     : wahyuni
        pengarang        : wahyuni
        Stock    : 5

1.  Jelaskan fungsi break yang ada pada method FindSeqSearch!
    Fungsi break pada metode findSeqSearch digunakan untuk menghentikan iterasi melalui loop for begitu saja ketika kondisi tertentu terpenuhi.

2.  Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
    dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
    dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?  
    Dalam algoritma pencarian sekuensial seperti yang diterapkan dalam metode findSeqSearch, keberhasilan pencarian tidak bergantung pada keterurutan data. Artinya, program akan tetap berjalan dan memberikan hasil yang benar bahkan jika data Kode Buku tidak terurut dari kecil ke besar.

         Masukkan data buku secara urut dari kodebuku terkecil :
         ------------
         Kode Buku       : 9
         judul Buku      : ruhg
         Tahun Terbit    : 1
         Pengarang       : ir
         Stock    :3
         ------------
         Kode Buku       : 5
         judul Buku      : rejg
         Tahun Terbit    : 34
         Pengarang       : 34
         Stock    :34
         ------------
         Kode Buku       : 34
         judul Buku      : 34
         Tahun Terbit    : 34
         Pengarang       : 34
         Stock    :45
         ------------
         Kode Buku       : 56
         judul Buku      : 67
         Tahun Terbit    : 56
         Pengarang       : 34
         Stock    :34
         ------------
         Kode Buku       : 45
         judul Buku      : 56
         Tahun Terbit    : 87
         Pengarang       : 54
         Stock    :34
         --------------------
         Data keseluruhan Mahasiswa :
         -------------------------
         data keseluruhan Buku :
         ===================
         Kode Buku = 9
         Judul buku = ruhg
         Tahun Terbit = 1
         Pengarang = ir
         Stok = 3
         ===================
         Kode Buku = 5
         Judul buku = rejg
         Tahun Terbit = 34
         Pengarang = 34
         Stok = 34
         ===================
         Kode Buku = 34
         Judul buku = 34
         Tahun Terbit = 34
         Pengarang = 34
         Stok = 45
         ===================
         Kode Buku = 56
         Judul buku = 67
         Tahun Terbit = 56
         Pengarang = 34
         Stok = 34
         ===================
         Kode Buku = 45
         Judul buku = 56
         Tahun Terbit = 87
         Pengarang = 54
         Stok = 34
         ________________
         ________________
         Pencarian Data :
         Masukkan Kode Buku yang dicari =
         Kode Buku :
         5
         menggunakan sequential Search
         data :5 ditemukan pada indeks ke 1
         Kode Buku        : 5
         judul    : rejg
         Tahun Terbit     : 34
         pengarang        : 34
         Stock    : 34

3.  Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
    method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
    tersebut pada class BukuMain seperti gambar berikut :

                Buku dataBuku = data.FindBuku(cari);

            // Jika buku ditemukan, tampilkan detail buku
            if (dataBuku != null) {
                System.out.println("Buku ditemukan:");
                dataBuku.tampilDataBuku();
            } else {
                System.out.println("Buku tidak ditemukan.");
            }

method

            public Buku FindBuku(int cari) {
                for (Buku buku : lisBuku) {
                    if (buku.kodebuku == cari) {
                        return buku; // Mengembalikan objek Buku jika kode buku ditemukan
                    }
                }
                return null; // Mengembalikan null jika kode buku tidak ditemukan
            }

### 6.3. Searching / Pencarian Menggunakan Binary Search

tambahkan method FindBinarySearch bertipe
integer pada class PencarianBukuNoAbsen

            public int findBinarySearch(int cari, int left, int right){
                int mid;
                if (right >= left){
                    mid = (right) / 2;
                    if(cari == lisBuku[mid].kodebuku){
                        return (mid);
                    }else if (lisBuku[mid].kodebuku > cari){
                        return findBinarySearch(cari, left, mid);
                    }else {
                        return findBinarySearch(cari, mid, right);
                    }
                }
                return -1;
            }

Panggil method FindBinarySearch di kelas BukuMainNoAbsen. Kemudia panggil
method tampilposisi dan tampilData

            System.out.println("==================");
            System.out.println("menggunakan binary search");
            posisi = data.findBinarySearch(cari, 0, jumlahbuku - 1);
            data.tampilPosisi(cari, posisi);
            data.tampildata(cari, posisi);

Verifikasi Hasil Percobaan

        menggunakan binary search
        data :126 ditemukan pada indeks ke 3
        Kode Buku        : 126
        judul    : web programming
        Tahun Terbit     : pustaka adi
        pengarang        : pustaka adi
        Stock    : 2

### 6.3.3. Pertanyaan

1.  Tunjukkan pada kode program yang mana proses divide dijalankan!

            public int findBinarySearch(int cari, int left, int right){
                if (right >= left){
                    int mid = left + (right - left) / 2; // Perhitungan nilai mid yang benar

2.  Tunjukkan pada kode program yang mana proses conquer dijalankan!

                    if (lisBuku[mid].kodebuku == cari){
                        return mid; // Kode buku ditemukan di tengah
                    }

3.  Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
    demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan
    Mengapa hal tersebut bisa terjadi?  
    Dalam algoritma pencarian biner, asumsi dasarnya adalah bahwa data harus diurutkan terlebih dahulu sebelum pencarian dilakukan. Jika data Kode Buku yang dimasukkan tidak diurutkan, maka program tidak akan memberikan hasil yang benar.

4.  Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214,
    20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search?
    Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!

hasilnya tidak sesuai, untuk menjalankan program binary search harus mengurutkan data terblebih dahulu, berikut adalah modifikasi program.

        public int findBinarySearch(int cari, int left, int right) {
            if (right >= left) {
                int mid = left + (right - left) / 2;

                // Jika kode buku ditemukan di tengah
                if (lisBuku[mid].kodebuku == cari) {
                    return mid;
                }

                // Jika kode buku yang dicari lebih besar dari kode buku di tengah
                if (lisBuku[mid].kodebuku < cari) {
                    return findBinarySearch(cari, left, mid - 1); // Pencarian dilakukan pada setengah kiri
                } else {
                    return findBinarySearch(cari, mid + 1, right); // Pencarian dilakukan pada setengah kanan
                }
            }

            return -1; // Jika kode buku tidak ditemukan dalam rentang tertentu
        }

6.4. Percobaan Pengayaan Divide and Conquer

membuat program

package Pertemuan7;

        public class mergeSort {
            public void mergeSorting(int[] data){
                sort(data, 0, data.length - 1);
            }
            // public mergeSort(int[] data){
            // }
                void merge(int data[], int left, int middle, int right){
                    int[] temp = new int[data.length];
                    for (int i = left; i<= right; i++){
                        temp[i] = data[i];
                    }
                    int a = left;
                    int b = middle + 1;
                    int c = left;

                    while (a <= middle && b <= right) {
                        if (temp[a] <= temp[b]){
                            data[c] = temp[a];
                            a++;
                        } else {
                            data[c] = temp[b];
                            b++;
                        }
                        c++;
                    }

                    // Menyalin sisa elemen dari sub-array kiri jika masih ada
                    while (a <= middle) {
                        data[c] = temp[a];
                        a++;
                        c++;
                    }

                    // Menyalin sisa elemen dari sub-array kanan jika masih ada
                    while (b <= right) {
                        data[c] = temp[b];
                        b++;
                        c++;
                    }
                }

                void sort(int data[], int left, int right){
                    if(left < right){
                        int middle = (left + right)/2;
                        sort(data, left, middle);
                        sort(data, middle + 1, right);
                        merge(data, left, middle, right);
                    }
                }

                void printarray (int arr[]){
                    for(int i = 0; i < arr.length; i++){
                        System.out.println(arr[i] + " ");
                    }
                    System.out.println();
                }

        }
        package Pertemuan7;

        public class mergesortMain06 {
            public static void main(String[] args) {
                int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
                System.out.println("sorting dengan merge  sort");
                mergeSort msort = new mergeSort();
                System.out.println("data awal");
                msort.printarray(data);
                msort.mergeSorting(data);
                System.out.println("setelah diurutkan");
                msort.printarray(data);

            }

        }

output program

        sorting dengan merge  sort
        data awal
        10
        40
        30
        50
        70
        20
        100
        90

        setelah diurutkan
        10
        20
        30
        40
        50
        70
        90
        100

#### 6.5. Latihan Praktikum

1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini

- Ubah tipe data dari kode Buku yang awalnya int menjadi String
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan
  sequential search dan binary search.

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
                    String kodebuku = s1.nextLine(); //modifikasi menjadi string
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
                String cari = s1.nextLine();// menggunakan String
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

        package Pertemuan7;

        public class Buku {
            String kodebuku;//deklarasi atribut kode buku dengan tipe data String
            int tahunterbit, stok;
            String judul, pengarang;

            Buku(String kodebuku, String judul, int tahunterbit, String pengarang, int stok){
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
        package Pertemuan7;

        public class Pencarianbuku06 {
            Buku lisBuku[] = new Buku[5];
            int idx;

            void tambah(Buku m){
                if (idx < lisBuku.length){
                    lisBuku[idx] = m;
                    idx++;
                } else {
                    System.out.println("Data Penuh");
                }
            }

            void tampil(){
                for (Buku m : lisBuku){
                    m.tampilDataBuku();
                }
            }

            public int findSeqSearch(String cari){
                int posisi = -1;
                for (int j = 0; j < lisBuku.length; j++){
                    if (lisBuku[j].kodebuku.equals(cari)){
                        posisi = j;
                        break;
                    }
                }
                return posisi;
            }

            public int findBinarySearch(String cari, int left, int right){
                if (right >= left){
                    int mid = left + (right - left) / 2; // Perhitungan nilai mid yang benar

                    if (lisBuku[mid].kodebuku.equals(cari)){
                        return mid; // Kode buku ditemukan di tengah
                    }

                    // Jika kode buku yang dicari lebih kecil dari kode buku di tengah
                    if (lisBuku[mid].kodebuku.compareTo(cari) > 0){
                        return findBinarySearch(cari, left, mid - 1); // Pencarian dilakukan pada setengah kiri
                    }

                    // Jika kode buku yang dicari lebih besar dari kode buku di tengah
                    return findBinarySearch(cari, mid + 1, right); // Pencarian dilakukan pada setengah kanan
                }

                return -1; // Jika kode buku tidak ditemukan dalam rentang tertentu
            }

            public void tampilPosisi(String x, int pos){
                if(pos!= -1){
                    System.out.println("data :" + x  + " ditemukan pada indeks ke "+ pos);

                }else{
                    System.out.println("data "+ x + " tidak ditemukan");
                }
            }

            public void tampildata(String x, int pos){
                if (pos != -1){
                    System.out.println("Kode Buku\t : " + x);
                    System.out.println("judul\t : "+lisBuku[pos].judul);
                    System.out.println("Tahun Terbit\t : "+lisBuku[pos].pengarang);
                    System.out.println("pengarang\t : "+lisBuku[pos].pengarang);
                    System.out.println("Stock\t : "+lisBuku[pos].stok);

                }else{
                    System.out.println("data "+ x + "tidak ditemukan");
                }
            }

            public Buku FindBuku(String cari) {
                int posisi = -1;
                for (int j = 0; j < lisBuku.length; j++) {
                    if (lisBuku[j].kodebuku.equals(cari)) {
                        posisi = j;
                        break;
                    }
                }
                return lisBuku[posisi];
            }

            void bubbleSort() {
                for (int i = 0; i < lisBuku.length - 1; i++) {
                    for (int j = 1; j < lisBuku.length - i; j++) {
                        if (lisBuku[j].kodebuku.compareTo(lisBuku[j - 1].kodebuku) < 0) {
                            Buku tmp = lisBuku[j];
                            lisBuku[j] = lisBuku[j - 1];
                            lisBuku[j - 1] = tmp;
                        }
                    }
                }
            }
        }

Tambahkan method pencarian judul buku menggunakan sequential search dan binary
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga
ketika input data acak, maka algoritma searching akan tetap berjalan

- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam
  bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang
  diberikan!

dalam case ini, algoritma menggunakan metode brute force, supaya dengan data acak, program mampu untuk menjalankan searching. dengan hasil yang diinginkan.

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
                    String kodebuku = s1.nextLine();
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
                System.out.println("1. Pencarian berdasarkan Kode Buku");
                System.out.println("2. Pencarian berdasarkan Judul Buku");
                System.out.print("Pilihan Anda : ");
                int pilihan = s.nextInt();

                if (pilihan == 1) {
                    // Implementasi pencarian berdasarkan kode buku seperti sebelumnya
                } else if (pilihan == 2) {
                    System.out.println("Masukkan Judul Buku yang dicari : ");
                    System.out.print("Judul Buku : ");
                    String cariJudul = s1.nextLine();
                    System.out.println("Menggunakan brute force");
                    int countBruteJudul = data.findBruteForceByTitle(cariJudul);
                    if (countBruteJudul == 0) {
                        System.out.println("Data tidak ditemukan");
                    } else if (countBruteJudul == 1) {
                        int posisiJudul = data.findSeqSearch(cariJudul);
                        data.tampilPosisi(cariJudul, posisiJudul);
                        data.tampildata(cariJudul, posisiJudul);

                        // Mencari buku dengan judul buku yang dicari
                        Buku dataBukuJudul = data.FindBuku(cariJudul);
                        dataBukuJudul.tampilDataBuku();
                    } else {
                        System.out.println("Peringatan: Lebih dari satu buku dengan judul tersebut ditemukan!");
                    }
                } else {
                    System.out.println("Pilihan tidak valid!");
                }
            }
        }
        package Pertemuan7;

        public class Pencarianbuku06 {
            Buku lisBuku[] = new Buku[5];
            int idx;

            // Metode tambah, tampil, dan metode lainnya tetap sama seperti sebelumnya

            // Method pencarian judul buku dengan brute force
            public int findBruteForceByTitle(String title) {
                int count = 0;
                for (int j = 0; j < lisBuku.length; j++) {
                    if (lisBuku[j].judul.equalsIgnoreCase(title)) {
                        count++;
                    }
                }
                return count;
            }
        }
