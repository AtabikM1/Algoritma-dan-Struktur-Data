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

### Stack

### percobaan 1 : Penyimpanan Tumpukan Barang dalam Gudang

class barang

            package Pertemuan8;

            public class barang06 {
                int kode;
                String nama;
                String kategori;

                barang06 (int kode, String nama, String kategori){
                    this.kode = kode;
                    this.nama = nama;
                    this.kategori = kategori;
                }
            }

class main

            package Pertemuan8;

            import java.util.Scanner;

            public class utama06 {
                public static void main(String[] args) {
                    gudang06 gudang = new gudang06(7);
                    Scanner sc = new Scanner(System.in);
                    while (true){
                        System.out.println("\nMenu");
                        System.out.println("1. Tambah barang");
                        System.out.println("2. Ambil barang");
                        System.out.println("3. Tampilkan tumpukan barang");
                        System.out.println("4. Keluar");
                        System.out.println("Pilih operasi ");
                        int pilihan = sc.nextInt();
                        switch (pilihan) {
                            case 1:
                                System.out.print("masukkan kode barang : ");
                                int kode = sc.nextInt();
                                sc.nextLine();
                                System.out.print("masukkan nama barang : ");
                                String nama = sc.nextLine();
                                System.out.print("masukkan nama kategori : ");
                                String kategori = sc.nextLine();
                                barang06 barangBaru = new barang06(kode, nama, kategori);
                                gudang.tambahbarang(barangBaru);
                                break;
                            case 2:
                                gudang.ambilbarang();
                                break;
                            case 3 :
                                gudang.tampilkanbarang();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("pilihan tidak valid, silahkan coba lagi. ");




                        }
                    }
                }
            }

class gudang

            package Pertemuan8;

            public class gudang06 {
                barang06[] tumpukan;
                int size;
                int top;

                gudang06(int kapasitas){
                    size = kapasitas;
                    tumpukan = new barang06[size];
                    top = -1;
                }
                boolean cekkosong(){
                    if (top == -1){
                        return true;
                    } else {
                        return false;
                    }
                }
                boolean cekpenuh(){
                    if (top == size -1){
                        return true;
                    }else{
                        return false;
                    }
                }
                void tambahbarang(barang06 brg){
                    if (!cekpenuh()){
                        top++;
                        tumpukan[top] = brg;
                        System.out.println("barang "+ brg.nama+ " berhasil ditambahkan ke Gudang");

                    }else{
                        System.out.println("gagal! tumpukan barang digudang sudah penuh");
                    }
                }
                barang06 ambilbarang(){
                    if(!cekkosong()){
                        barang06 delete = tumpukan[top];
                        top--;
                        System.out.println("barang "+ delete.nama + "diambil dari gudang. ");
                        return delete;
                    }else{
                        System.out.println("tumpukan barang kosong. ");
                        return null;
                    }
                }
                barang06 lihatBarangTeratas(){
                    if(!cekkosong()){
                        barang06 barangTeratas = tumpukan[top];
                        System.out.println("barang teratas ; "+ barangTeratas.nama);
                        return barangTeratas;
                    } else {
                        System.out.println("tumpukkan barang kosong. ");
                        return null;
                    }
                }
                void tampilkanbarang(){
                    if(!cekkosong()){
                        System.out.println("rincian tumpukan barang di gudang: ");
                        //for (int i = top; i >= 0; i--) {
                        for (int i = 0; i <= top; i++){
                            System.out.printf("kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);

                        }

                    }else{
                        System.out.println("tumpukkan barang kosong");
                    }

                }
            }

hasil compile kode program

        Menu
        1. Tambah barang
        2. Ambil barang
        3. Tampilkan tumpukan barang
        4. Keluar
        Pilih operasi
        1
        masukkan kode barang : 21
        masukkan nama barang : majalah
        masukkan nama kategori : Buku
        barang majalah berhasil ditambahkan ke Gudang

        Menu
        1. Tambah barang
        2. Ambil barang
        3. Tampilkan tumpukan barang
        4. Keluar
        Pilih operasi
        1
        masukkan kode barang : 26
        masukkan nama barang : jaket
        masukkan nama kategori : pakaian
        barang jaket berhasil ditambahkan ke Gudang

        Menu
        1. Tambah barang
        2. Ambil barang
        3. Tampilkan tumpukan barang
        4. Keluar
        Pilih operasi
        2
        barang jaketdiambil dari gudang.

        Menu
        1. Tambah barang
        2. Ambil barang
        3. Tampilkan tumpukan barang
        4. Keluar
        Pilih operasi
        1
        masukkan kode barang : 33
        masukkan nama barang : pizza
        masukkan nama kategori : makanan
        barang pizza berhasil ditambahkan ke Gudang

        Menu
        1. Tambah barang
        2. Ambil barang
        3. Tampilkan tumpukan barang
        4. Keluar
        Pilih operasi
        3
        rincian tumpukan barang di gudang:
        kode 21: majalah (Kategori Buku)
        kode 33: pizza (Kategori makanan)

### pertanyaan

1.  Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
    hasil percobaan! Bagian mana saja yang perlu diperbaiki?
    - pada method lihatbarangteratas() struktur pemilihan menggunakan method isempty() sedangkan program sudah memiliki cekkosong()
    - pada method tampilkanbarang() penggunaan looping yang benar menggunakan
      for (int i = top; i >= 0; i--)
      supaya output yang dihasilkan tidak terbailk.
2.  Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode
    programnya!  
    ada 7

                public static void main(String[] args) {
                    gudang06 gudang = new gudang06(7);

3.  Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi
    tersebut dihapus, apa dampaknya?  
    untuk memastikan bahwa gudang tidak kosong sebelum mencoba untuk menampilkan barang teratas.

4.  Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat
    barang teratas, serta dapat secara bebas menentukan kapasitas gudang!

hasil modifikasi program

        package Pertemuan8;

        import java.util.Scanner;

        public class utama06 {
            public static void main(String[] args) {
                gudang06 gudang = new gudang06(7);
                Scanner sc = new Scanner(System.in);
                while (true){
                    System.out.println("\nMenu");
                    System.out.println("1. Tambah barang");
                    System.out.println("2. Ambil barang");
                    System.out.println("3. Tampilkan tumpukan barang");
                    System.out.println("4. Tampilkan barang teratas");
                    System.out.println("5. selesai");
                    System.out.println("Pilih operasi ");
                    int pilihan = sc.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.print("masukkan kode barang : ");
                            int kode = sc.nextInt();
                            sc.nextLine();
                            System.out.print("masukkan nama barang : ");
                            String nama = sc.nextLine();
                            System.out.print("masukkan nama kategori : ");
                            String kategori = sc.nextLine();
                            barang06 barangBaru = new barang06(kode, nama, kategori);
                            gudang.tambahbarang(barangBaru);
                            break;
                        case 2:
                            gudang.ambilbarang();
                            break;
                        case 3 :
                            gudang.tampilkanbarang();
                            break;
                        case 4:
                            gudang.lihatBarangTeratas();
                        case 5:
                            break;
                        default:
                            System.out.println("pilihan tidak valid, silahkan coba lagi. ");




                    }
                }
            }
        }

### Percobaan 2: Konversi Kode Barang ke Biner

tambah methode konversi desimal ke biner dengan parameter kode.

            String konversiDesimalkeBiner(int kode){
                StackKonversi stack = new StackKonversi();
                while (kode > 0){
                    int sisa = kode % 2;
                    stack.push(sisa);
                    kode = kode / 2;
                }
                String biner = new String();
                while(!stack.isEmpty()){
                    biner += stack.pop();
                }
                return biner;
            }

buat class stack konversi

            package Pertemuan8;

            public class StackKonversi06 {
                int size;
                int []tumpukanBiner;
                barang06[] tumpukan;
                int top;

                StackKonversi06(){
                    this.size = 32; //asumsi 32 bit
                    tumpukanBiner = new int[size];
                    top = -1;
                }
                boolean isEmpty(){
                    return top == -1;
                }
                boolean isFull(){
                    return top == size - 1;
                }
                void push (int data){
                    if (isFull()){
                        System.out.println("Stack penuh");
                    }else {
                        top++;
                        tumpukanBiner[top] = data;
                    }
                }
                int pop(){
                    if (isEmpty()){
                        System.out.println("Stack kosong");
                        return -1;
                    }else{
                        int data = tumpukanBiner[top];
                        top--;
                        return data;
                    }
                }
            }

kompile dan hasil program

        Menu
        1. Tambah barang
        2. Ambil barang
        3. Tampilkan tumpukan barang
        4. Tampilkan barang teratas
        5. selesai
        Pilih operasi
        1
        masukkan kode barang : 13
        masukkan nama barang : setrika
        masukkan nama kategori : elektronik
        barang setrika berhasil ditambahkan ke Gudang

        Menu
        1. Tambah barang
        2. Ambil barang
        3. Tampilkan tumpukan barang
        4. Tampilkan barang teratas
        5. selesai
        Pilih operasi
        2
        barang setrikadiambil dari gudang.
        Kode unik dalam biner : 1101

### pertanyaaan

1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
   bagaimana hasilnya? Jelaskan alasannya!  
   hasilnya akan tetap sama, dalam kode tersebut. program akan memproses(membagi dengan 2) semua digit kode sampai kode mencapai 0.
2. Jelaskan alur kerja dari method konversiDesimalKeBiner!  
   sebuah objek stackkonversi06 dengan nama stack dibuat untuk menyimpan sisa pembagian dari konversi desimal ke biner. dalam perulangan while, nilai kode dicek, saat(while) kode tidak sama, perulangan akan terus berjalan dengan operasi (kode % 2), pada perulangan (while) Stack.isEmpty() digit biner diperoleh dengan memanggil method pop dari tumpukan, sehingga digit paling kanan akan di pop terlebih dahulu hingga kekiri. setelah semua tersusun dalam String biner, String biner akan dikembalikan sebagai hasil konbersi dari desimal ke biner.

### Percobaan 3: Konversi Notasi Infix ke Postfix

kode program

        package Pertemuan8;

        public class postfix06 {
            int n;
            int top;
            char[] stack;
            postfix06(int total){
                n = total;
                top = -1;
                stack = new char[n];
                push('(');
            }
            void push(char c){
                top++;
                stack[top] = c;
            }
            public char pop(){
                char item = stack[top];
                top--;
                return item;
            }
            boolean isoperand(char c){
                if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')||(c >= '0' && c <= '9') || c== '.'){
                    return true;
                }else{
                    return false;
                }
            }
            boolean isoperator(char c){
                if (c == '^'|| c == '%'||c == '/' || c == '*' || c == '-' || c =='+' ){
                    return true;
                }else{
                    return false;
                }
            }
            int derajat(char c){
                switch (c){
                    case '^':
                        return 3;
                    case '%':
                        return 2;
                    case '/':
                        return 2;
                    case '*':
                        return 2;
                    case '-':
                        return 1;
                    case '+':
                        return 1;
                    default:
                        return 0;
                }
            }
            String konversi(String Q){
                String P = "";
                char c;
                for (int i = 0; i < n; i++){
                    c = Q.charAt(i);
                    if (isoperand(c)){
                        P = P + c;
                    }
                    if (c == '('){
                        push(c);
                    }
                    if (c == ')'){
                        while (stack[top] != '(') {
                            P = P + pop();
                        }
                        pop();
                    }
                    if (isoperator(c)){
                        while (derajat(stack[top]) >= derajat(c)){
                            P = P + pop();
                        }
                        push(c);
                    }
                }
                return P;

            }
        }

output verifikasi program

        masukkan ekspresi matematika (infix):
        a+b*(c+d-e)/f
        Postfix: abcd+e-*f/+

### pertanyaan

1. Pada method derajat, mengapa return value beberapa case bernilai sama?

Apabila return
value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?
sebagai ketentuan untuk mengurutkan infix menjadi postfix. apabila nilai dari return value tersebut dirubah dengan nilai lain, maka akan merubah urutan pengoperasian postfix 2. Jelaskan alur kerja method konversi!

alur method konversi pada class stack konversi dimulai dengan parameter string Q. dalam method tersebut terdapat atribut String P dan char c. proses looping dilakukan unutk mengidentifikasi nilai infix yang kita masukkan, kemudian didalamnya masuk pada struktur pemilihan untuk mengidentifikasi
