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

#### Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort

membuat class program

            package Pertemuan6;

            public class DaftarMahasiswaBerprestasi {
                Mahasiswa listMhs[] = new Mahasiswa[5];
                int idx;

                void tambah(Mahasiswa m){
                    if(idx<listMhs.length){
                        listMhs[idx] = m;
                        idx++;
                    }else{
                        System.out.println("data sudah penuh");
                    }
                }

                void tampil(){
                    for(Mahasiswa m : listMhs){
                        m.tampil();
                        System.out.println("--------");
                    }
                }
                void bubblesort(){
                    for(int i=0; i<listMhs.length-1; i++){
                        for(int j = 1; j < listMhs.length-i; j++){
                            if(listMhs[j].ipk > listMhs[j-1].ipk){
                                Mahasiswa tmp = listMhs[j];
                                listMhs[j] = listMhs[j-1];
                                listMhs[j-1] = tmp;
                            }
                        }
                    }
                }
            }
            package Pertemuan6;

            public class main {
                public static void main(String[] args) {
                    DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
                    Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
                    Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
                    Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
                    Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
                    Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 23, 3.75);

                    list.tambah(m1);
                    list.tambah(m2);
                    list.tambah(m3);
                    list.tambah(m4);
                    list.tambah(m5);

                    System.out.println("data mahasiswa sebelum sorting = ");
                    list.tampil();
                    System.out.println("data mahasiswa setelah sorting desc berdasarkan ipk");
                    list.bubblesort();
                    list.tampil();
                }
            }
            package Pertemuan6;

            public class Mahasiswa {
                String nama;
                int thnMasuk, umur;
                double ipk;

                Mahasiswa(String n, int t, int u, double i){
                    nama = n;
                    thnMasuk = t;
                    umur = u;
                    ipk = i;
                }

                void tampil(){
                    System.out.println("Nama = "+ nama);
                    System.out.println("Tahun masuk = "+ thnMasuk);
                    System.out.println("Umur = "+ umur);
                    System.out.println("IPK = " + ipk);
                }
            }

verifikasi hasil program

        data mahasiswa sebelum sorting =
        Nama = Nusa
        Tahun masuk = 2017
        Umur = 25
        IPK = 3.0
        --------
        Nama = Rara
        Tahun masuk = 2012
        Umur = 19
        IPK = 4.0
        --------
        Nama = Dompu
        Tahun masuk = 2018
        Umur = 19
        IPK = 3.5
        --------
        Nama = Abdul
        Tahun masuk = 2017
        Umur = 23
        IPK = 2.0
        --------
        Nama = Ummi
        Tahun masuk = 2019
        Umur = 23
        IPK = 3.75
        --------
        data mahasiswa setelah sorting desc berdasarkan ipk
        Nama = Rara
        Tahun masuk = 2012
        Umur = 19
        IPK = 4.0
        --------
        Nama = Ummi
        Tahun masuk = 2019
        Umur = 23
        IPK = 3.75
        --------
        Nama = Dompu
        Tahun masuk = 2018
        Umur = 19
        IPK = 3.5
        --------
        Nama = Nusa
        Tahun masuk = 2017
        Umur = 25
        IPK = 3.0
        --------
        Nama = Abdul
        Tahun masuk = 2017
        Umur = 23
        IPK = 2.0

1. Terdapat di method apakah proses bubble sort?

Proses bubble sort terdapat di dalam method bubblesort() dalam kelas DaftarMahasiswaBerprestasi.

2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:

Untuk apakah proses tersebut?
Proses tersebut adalah langkah dalam algoritma bubble sort yang bertujuan untuk membandingkan dua elemen berturut-turut dalam array listMhs berdasarkan nilai IPK (indeks prestasi kumulatif) mahasiswa.

Pertama, perbandingan dilakukan antara elemen ke-j dengan elemen ke-(j-1), dimana j adalah indeks saat ini dalam iterasi. Jika nilai IPK dari listMhs[j] lebih besar dari nilai IPK dari listMhs[j-1], maka terjadi pertukaran posisi antara kedua elemen tersebut.

3.  Perhatikan perulangan di dalam bubbleSort() di bawah ini:

                for(int i=0; i<listMhs.length-1; i++){
                    for(int j = 1; j < listMhs.length-i; j++){

a. Perbedaan antara kegunaan perulangan i dan perulangan j:

Perulangan i digunakan untuk mengontrol jumlah iterasi dari awal hingga akhir saat melakukan sorting secara keseluruhan.
Perulangan j digunakan untuk membandingkan setiap pasangan elemen dalam array untuk melakukan pertukaran jika diperlukan.

b. Mengapa syarat dari perulangan i adalah i < listMhs.length-1:

Karena pada setiap iterasi, setidaknya satu elemen akan berpindah ke posisi yang benar di akhir array. Oleh karena itu, tidak perlu melanjutkan perulangan hingga elemen terakhir, karena elemen terakhir sudah pasti akan berada di posisi yang tepat setelah iterasi ke-i dari bubble sort.

c. Mengapa syarat dari perulangan j adalah j < listMhs.length-i:

Karena pada setiap iterasi dari perulangan i, satu elemen terbesar atau terkecil akan bergerak ke posisi yang benar di ujung array. Oleh karena itu, tidak perlu membandingkan elemen yang sudah diurutkan pada iterasi sebelumnya. Dengan mengurangi nilai j dari listMhs.length dengan nilai i, kita memastikan bahwa perulangan j hanya membandingkan elemen yang belum diurutkan.

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh:

Jika banyak data adalah 50, perulangan i akan berlangsung sebanyak 49 kali, karena listMhs.length - 1 adalah 49.
Jumlah tahap (iterasi) bubble sort adalah sama dengan jumlah perulangan i, yaitu 49 tahap. Pada setiap tahap, elemen terbesar atau terkecil akan "mengapung" ke posisi yang benar.

#### 5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort

            package Pertemuan6;

            public class DaftarMahasiswaBerprestasi {
                Mahasiswa listMhs[] = new Mahasiswa[5];
                int idx;

                void tambah(Mahasiswa m){
                    if(idx<listMhs.length){
                        listMhs[idx] = m;
                        idx++;
                    }else{
                        System.out.println("data sudah penuh");
                    }
                }

                void tampil(){
                    for(Mahasiswa m : listMhs){
                        m.tampil();
                        System.out.println("--------");
                    }
                }
                void bubblesort(){
                    for(int i=0; i<listMhs.length-1; i++){
                        for(int j = 1; j < listMhs.length-i; j++){
                            if(listMhs[j].ipk > listMhs[j-1].ipk){
                                Mahasiswa tmp = listMhs[j];
                                listMhs[j] = listMhs[j-1];
                                listMhs[j-1] = tmp;
                            }
                        }
                    }
                }
                void selectionsort(){
                    for(int i = 0; i < listMhs.length-1; i++){
                        int idxmin = i;
                        for(int j = i+1; j<listMhs.length; j++){
                            if(listMhs[j].ipk < listMhs[idxmin].ipk){
                                idxmin = j;
                            }
                        }
                        //swap
                        Mahasiswa tmp = listMhs[idxmin];
                        listMhs[idxmin] = listMhs[i];
                        listMhs[i] = tmp;

                    }
                }
        package Pertemuan6;

        public class main {
            public static void main(String[] args) {
                DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
                Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
                Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
                Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
                Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
                Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 23, 3.75);

                list.tambah(m1);
                list.tambah(m2);
                list.tambah(m3);
                list.tambah(m4);
                list.tambah(m5);

                System.out.println("data mahasiswa sebelum sorting = ");
                list.tampil();
                System.out.println("data mahasiswa setelah sorting desc berdasarkan ipk");
                list.bubblesort();
                list.tampil();
                System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
                list.selectionsort();
                list.tampil();
                System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
                list.insertionsort();
                list.tampil();
            }
        }

output program

        Data mahasiswa setelah sorting asc berdasarkan ipk
        Nama = Abdul
        Tahun masuk = 2017
        Umur = 23
        IPK = 2.0
        --------
        Nama = Nusa
        Tahun masuk = 2017
        Umur = 25
        IPK = 3.0
        --------
        Nama = Dompu
        Tahun masuk = 2018
        Umur = 19
        IPK = 3.5
        --------
        Nama = Ummi
        Tahun masuk = 2019
        Umur = 23
        IPK = 3.75
        --------
        Nama = Rara
        Tahun masuk = 2012
        Umur = 19
        IPK = 4.0
        --------

#### 5.3.3. Pertanyaan

Di dalam method selection sort, terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut, jelaskan!

proses yang terjadi di dalam baris program tersebut adalah mencari elemen dengan nilai IPK terendah di dalam sisa array yang belum terurut dan menukarnya dengan elemen yang sedang diproses di dalam iterasi loop luar. Proses tersebut merupakan bagian dari algoritma "Selection Sort".
Pada baris program yang disediakan, prosesnya adalah sebagai berikut:

Iterasi pertama (loop luar) dimulai dari indeks 0 hingga panjang array dikurangi satu (listMhs.length - 1). Ini dilakukan untuk memastikan bahwa setelah iterasi terakhir, elemen terakhir telah berada di posisi yang benar.
Di dalam iterasi pertama, ada variabel idxmin yang berfungsi untuk menyimpan indeks elemen dengan nilai IPK terendah yang ditemukan sejauh ini.
Iterasi kedua (loop dalam) dimulai dari indeks setelah elemen yang sedang diproses oleh loop luar (yaitu i+1) hingga elemen terakhir array.
Di dalam iterasi kedua, setiap elemen dibandingkan dengan elemen yang disimpan dalam idxmin. Jika ditemukan elemen yang memiliki nilai IPK lebih kecil, maka indeks idxmin diperbarui menjadi indeks elemen tersebut.
Setelah loop dalam selesai, elemen dengan nilai IPK terendah yang ditemukan di dalam sisa array akan disimpan di idxmin.
Terakhir, elemen di indeks i (elemen yang sedang diproses oleh loop luar) ditukar dengan elemen yang memiliki nilai IPK terendah yang ditemukan di loop dalam (elemen di indeks idxmin). Hal ini dilakukan untuk memindahkan elemen dengan nilai IPK terendah ke posisi yang sesuai di dalam urutan yang sedang disortir.

#### Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

        void insertionsort(){
                for (int i =1; i < listMhs.length; i++){
                    Mahasiswa temp = listMhs[i];
                    int j = i;
                    while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
                        listMhs[j] = listMhs[j-1];
                        j--;

                    }
                    listMhs[j] = temp;
                }
            }

output verifikasi hasil program

        Data mahasiswa setelah sorting asc berdasarkan ipk
        Nama = Abdul
        Tahun masuk = 2017
        Umur = 23
        IPK = 2.0
        --------
        Nama = Nusa
        Tahun masuk = 2017
        Umur = 25
        IPK = 3.0
        --------
        Nama = Dompu
        Tahun masuk = 2018
        Umur = 19
        IPK = 3.5
        --------
        Nama = Ummi
        Tahun masuk = 2019
        Umur = 23
        IPK = 3.75
        --------
        Nama = Rara
        Tahun masuk = 2012
        Umur = 19
        IPK = 4.0
        --------

### pertanyaan

Sebuah platform travel yang menyediakan layanan pemesanan kebutuhan travelling sedang
mengembangkan backend untuk sistem pemesanan/reservasi akomodasi (penginapan), salah
satu fiturnya adalah menampilkan daftar penginapan yang tersedia berdasarkan pilihan filter
yang diinginkan user. Daftar penginapan ini harus dapat disorting berdasarkan

1.  Harga dimulai dari harga termurah ke harga tertinggi.
2.  Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1)
    Buatlah proses sorting data untuk kedua filter tersebut dengan menggunakan algoritma
    bubble sort dan selection sort.

             package Pertemuan6;

             public class Hotel {
                 String nama, kota;
                 int harga;
                 Byte bintang;

                 Hotel(String n, String k, int h, Byte b){
                     nama = n;
                     kota = k;
                     harga = h;
                     bintang = b;
                 }
             }
             package Pertemuan6;

             public class MainHotel {
                 public static void main(String[] args) {
                     HotelServis hotelservis = new HotelServis();
                     Hotel h1 = new Hotel("valhalla", "surabaya", 200, (byte)5);
                     Hotel h2 = new Hotel("jw marriot", "surabaya", 400, (byte)1);
                     Hotel h3 = new Hotel("aston", "surabaya", 700, (byte)3);
                     Hotel h4 = new Hotel("empire", "surabaya", 3400, (byte)4);
                     Hotel h5 = new Hotel("grand impala", "surabaya", 100, (byte)5);
                     hotelservis.tambah(h1);
                     hotelservis.tambah(h2);
                     hotelservis.tambah(h3);
                     hotelservis.tambah(h4);
                     hotelservis.tambah(h5);

                     System.out.println("data hotel sebelum sorting =");
                     hotelservis.tampilAll();

                     System.out.println("Sorting dengan buble sort");
                     hotelservis.bubblesort();
                     hotelservis.tampilAll();

                     System.out.println("sorting dengan selection sort");
                     hotelservis.selectionsort();
                     hotelservis.tampilAll();
                 }
             }
             package Pertemuan6;

             public class HotelServis {
                 Hotel rooms[] = new Hotel[5];
                 int idx;

                 void tambah(Hotel H){
                     if(idx<rooms.length){
                         rooms[idx] = H;
                         idx++;
                     }else{
                         System.out.println("data hotel sudah penuh");
                     }
                 }

                 void tampilAll(){
                     for(int i = 0; i < idx; i++){
                         System.out.println("Nama hotel = " + rooms[i].nama);
                         System.out.println("Kota = "+ rooms[i].kota);
                         System.out.println("Harga = " + rooms[i].harga);
                         System.out.println("Bintang = "+ rooms[i].bintang);
                         System.out.println("==========");

                     }

                 }


                 void bubblesort(){
                     for(int i = 0; i < rooms.length-1; i++){
                         for(int j=1; j < rooms.length-i; j++){
                             if(rooms[j].harga > rooms[j-1].harga){
                                 Hotel tmp = rooms[j];
                                 rooms[j] = rooms[j-1];
                                 rooms[j-1] = tmp;
                             }
                         }
                     }
                 }

                 void selectionsort(){
                     for(int i = 0; i < rooms.length -1; i++){
                         int idxmin = i;
                         for(int j = i+1; j < rooms.length; j++){
                             if(rooms[j].bintang < rooms[idxmin].bintang){
                                 idxmin = j;
                             }
                         }
                         //swap
                         Hotel tmp = rooms[idxmin];
                         rooms[idxmin] = rooms[i];
                         rooms[i]= tmp;
                     }
                 }
             }

output program

        data hotel sebelum sorting =
        Nama hotel = valhalla
        Kota = surabaya
        Harga = 200
        Bintang = 5
        ==========
        Nama hotel = jw marriot
        Kota = surabaya
        Harga = 400
        Bintang = 1
        ==========
        Nama hotel = aston
        Kota = surabaya
        Harga = 700
        Bintang = 3
        ==========
        Nama hotel = empire
        Kota = surabaya
        Harga = 3400
        Bintang = 4
        ==========
        Nama hotel = grand impala
        Kota = surabaya
        Harga = 100
        Bintang = 5
        ==========
        Sorting dengan buble sort
        Nama hotel = empire
        Kota = surabaya
        Harga = 3400
        Bintang = 4
        ==========
        Nama hotel = aston
        Kota = surabaya
        Harga = 700
        Bintang = 3
        ==========
        Nama hotel = jw marriot
        Kota = surabaya
        Harga = 400
        Bintang = 1
        ==========
        Nama hotel = valhalla
        Kota = surabaya
        Harga = 200
        Bintang = 5
        ==========
        Nama hotel = grand impala
        Kota = surabaya
        Harga = 100
        Bintang = 5
        ==========
        sorting dengan selection sort
        Nama hotel = jw marriot
        Kota = surabaya
        Harga = 400
        Bintang = 1
        ==========
        Nama hotel = aston
        Kota = surabaya
        Harga = 700
        Bintang = 3
        ==========
        Nama hotel = empire
        Kota = surabaya
        Harga = 3400
        Bintang = 4
        ==========
        Nama hotel = valhalla
        Kota = surabaya
        Harga = 200
        Bintang = 5
        ==========
        Nama hotel = grand impala
        Kota = surabaya
        Harga = 100
        Bintang = 5
