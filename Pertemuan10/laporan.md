# Laporan Praktikum Algoritma dan Struktur Data

## Pertemuan 10

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="ATM gif" width="30%"> 
</p>

---

Nama: Atabik Mutawakilalallah

NIM: 2341720090

No. Absen: 06

Kelas: TI-1B

---
### membuat class queue



            package Pertemuan10;

            public class Queue {
                int[] data;
                int front;
                int rear;
                int size;
                int max;

                Queue(int n){
                    max = n;
                    data = new int[max];
                    size = 0;
                    front = rear = -1;
                }

                boolean isEmpty(){
                    if(size == 0){
                        return true;
                    }else{
                        return false;
                    }
                }

                boolean isFull(){
                    if(size == max){
                        return true;
                    }else{
                        return false;
                    }
                }

                void peek(){//method untuk menampilkan elemen queue pada posisi paling depan
                    if(!isEmpty()){
                        System.out.println("elemen terdepan: " + data[front]);
                    }else{
                        System.out.println("Queue masih kosong");
                    }
                }

                void print(){//menampilkan seluruh elemen pada queue dari posisi depan sampai dengan belakang
                    if(isEmpty()){
                        System.out.println("Queue masih kosong");
                    }else{
                        int i = front;
                        while (i != rear){
                            System.out.println(data[i] + " ");
                            i = (i + 1) % max;
                        }
                        System.out.println(data[i] + " ");
                        System.out.println("jumlah elemen = " + size);
                    }
                }

                void clear(){//untuk menghappus semua elemen pada queue
                    if(!isEmpty()){
                        front = rear = -1;
                        size = 0;
                        System.out.println("Queue berhasil dikosongkan");
                    }else{
                        System.out.println("Queue masih kosong");
                    }
                }

                void Enqueue(int dt){
                    if (isFull()) {
                        System.out.println("Queue sudah penuh");
                    }else{
                        if(isEmpty()){
                            front = rear = 0;
                        }else{
                            if(rear == max -1){
                                rear = 0;
                            }else{
                                rear++;
                            }
                        }
                        data[rear] = dt;
                        size++;
                    }
                }

                int dequeue(){//mengeluarkan data pada queue di posisi belakang
                    int dt = 0;
                    if (isEmpty()) {
                        System.out.println("Queue masih kosong");
                    }else{
                        dt = data[front];
                        size--;
                        if(isEmpty()){
                            front = rear = -1;
                        }else{
                            if(front == max -1){
                                front = 0;
                            }else{
                                rear++;
                            }
                        }
                    }
                    return dt;
                }
            }

membuat class main dan method menu

            package Pertemuan10;
            import java.util.Scanner;
            public class QueueMain {
                
                public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);



                    System.out.print("masukkan kapasitas queue:");
                    int n = sc.nextInt();
                    int pilih;
                    Queue Q = new Queue(n);
                    do {
                        menu();
                        pilih = sc.nextInt();
                        switch (pilih) {
                            case 1:
                                System.out.println("masukkan data baru: ");
                                int datamasuk = sc.nextInt();
                                Q.Enqueue(datamasuk);
                                break;
                            case 2:
                                int dataKeluar = Q.dequeue();
                                if(dataKeluar != 0){
                                    System.out.println("data yang dikeluarkan = " + dataKeluar);
                                    break;
                                }
                            case 3: 
                                Q.print();
                                break;
                            case 4:
                                Q.peek();
                                break;
                            case 5:
                                Q.clear();
                                break;
                            default:
                                break;
                        }

                    }while(pilih == 1|| pilih ==2|| pilih ==3 || pilih == 4|| pilih == 5);
                }

                static void menu(){
                    System.out.println("masukkan operasi yang diinginkan : ");
                    System.out.println("1. Enqueue");
                    System.out.println("2. Dequeue");
                    System.out.println("3. Print");
                    System.out.println("4. Peek");
                    System.out.println("5. Clear");
                    System.out.println("-------------");
                }

            }

hasil compile : 

        masukkan kapasitas queue:4
        masukkan operasi yang diinginkan : 
        1. Enqueue
        2. Dequeue
        3. Print
        4. Peek
        5. Clear
        -------------
        1
        masukkan data baru: 
        15
        masukkan operasi yang diinginkan : 
        1. Enqueue
        2. Dequeue
        3. Print
        4. Peek
        5. Clear
        -------------
        1
        masukkan data baru: 
        31
        masukkan operasi yang diinginkan : 
        1. Enqueue
        2. Dequeue
        3. Print
        4. Peek
        5. Clear
        -------------
        4
        elemen terdepan: 15
        masukkan operasi yang diinginkan :
        1. Enqueue
        2. Dequeue
        3. Print
        4. Peek
        5. Clear
        -------------

Jelaskan QueueMain

yang pertama import java.util.scanner untuk dapat memasukkan input pengguna kemudian lakukan psvm untuk method main. instansiasi objek dengan nama Q dengan parameter n.

kedua, lakukan iterasi dengan menggunakna looping do while. dalam iterasi tersebut, diawali dengan memanggil method menu, method menu berisi opsi operasi yang diinginkan. dalam perulangan do, program melakukan operasi switch case untuk memproses input pengguna dengan angka. 

case 1 akan memanggil method enqueue dengan objek q. terdapat deklarasi datamasuk yang berasal dari input pengguna dan berfungsi sebagai argumen dari parameter method enqueue. method enqueue berfungsi untuk menambah data dengan antrian urut dari awal ke belakang

case 2 akan memanggil method dequeue dengan deklarasi integer datakeluar yang berfungsi untuk menyimpan angka yang dikeluarkan dari queue dan proses berlanjut pada pemilihan jika datakeluar tidak sama dengan 0, maka akan ditampilkan juga pada output nilai yang dikeluarkan dari antrian.

case 3 akan memanggil method print, yaitu menampilkan seluruh nilai dalam antrian

case 4: akan memanggil method peek untuk menampilkan nilai yang paling depan atau paling awal

case 5: akan menghapus semua queue yang ada pada seluruh proses.

iterasi while digunakan untuk melakukan operator logika dengan variable pilih untuk disamakan dengan pilihan 1-5


### pertanyaan

1. pada kosntruktor, mengapa nilai awal atribut front dan rear bebrnilai -1. sementara atribut size bernilai 0?

pada konstruktor queue nilai -1 pada front dan rear menunjukan bahwa pada posisi indeks dimulai dari 0, dan nilai 0 yang terdapat pada size menunjukan queue tersebut dimulai dengan elemen kosong.

2. pada method enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut.

                    }else{
                        if(isEmpty()){
                            front = rear = 0;
                        }else{
                            if(rear == max -1){
                                rear = 0;
                            }else{
                                rear++;
                            }
                        }

pada method tersebut berguna untuk mengecek jika nilai antrian yang pada barisan terakhir (rear) sama dengan max -1 yang menunjukan antrian sudah penuh, maka input tersebut masuk pada indeks pertama.

3. pada method dequeue, jelaskan masuk dan keguanan dari potongan kode berikut.

                        if(front == max -1){
                            front = 0;

maksud dari potongan kode tersebut adalah mengecek kondisi dimana jika nilai dari front sudah mencapai pada batas maksimum(nilai yang berada pada akhir queue), maka akan dieksekusi nilai tersebut menjadi 0. sehingga nilai selanjutnya yang akan masuk antrian tersebut akan mengisi indeks yang telah kosong tersebut.

4. pada method print, mengapa pada proses perulangan variable i tidak dimulai dari 0, melainkan int i=front?

karena indeks i diukur dari queue yang mana indeks tidak selalu dimulai dari 0

5. perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

i = (i + 1) % max;

6. Tunjukkan potongan kode program yang merupakan queue overflow!


7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!

### praktikum 2

membuat classs nasabah

            package Pertemuan10;

            public class Nasabah06 {
                String norek;
                String nama;
                String alamat;
                int umur;
                double saldo;

                Nasabah06(String norek, String nama, String alamat, int umur, double saldo){
                    this.norek = norek;
                    this.nama = nama;
                    this.alamat = alamat;
                    this.umur = umur;
                    this.saldo = saldo;
                }

                Nasabah06(){
                    
                }
            }


membuat kelas queue

            package Pertemuan10;

            public class QueueBank {
                Nasabah06 [] data;
                int front;
                int rear;
                int size;
                int max;

                QueueBank(int n){
                    max = n;
                    data = new Nasabah06[max];
                    size = 0;
                    front = rear = -1;
                }

                boolean isEmpty(){
                    if(size == 0){
                        return true;
                    }else{
                        return false;
                    }
                }

                boolean isFull(){
                    if(size == max){
                        return true;
                    }else{
                        return false;
                    }
                }

                void peek(){//method untuk menampilkan elemen queue pada posisi paling depan
                    if(!isEmpty()){
                        System.out.println("elemen terdepan: " + data[front].norek + " " + data[front].nama + " " + data[front].alamat + " "+ data[front].umur + " " + data[front].saldo );
                    }else{
                        System.out.println("Queue masih kosong");
                    }
                }

                void print(){//menampilkan seluruh elemen pada queue dari posisi depan sampai dengan belakang
                    if(isEmpty()){
                        System.out.println("Queue masih kosong");
                    }else{
                        int i = front;
                        while (i != rear){
                            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " "+ data[i]. umur + " " + data[i].saldo );
                            i = (i + 1) % max;
                        }
                        System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " "+ data[i]. umur + " " + data[i].saldo );
                        System.out.println("jumlah elemen = " + size);
                    }
                }

                void clear(){//untuk menghappus semua elemen pada queue
                    if(!isEmpty()){
                        front = rear = -1;
                        size = 0;
                        System.out.println("Queue berhasil dikosongkan");
                    }else{
                        System.out.println("Queue masih kosong");
                    }
                }

                void Enqueue(Nasabah06 dt){
                    if (isFull()) {
                        System.out.println("Queue sudah penuh");
                    }else{
                        if(isEmpty()){
                            front = rear = 0;
                        }else{
                            if(rear == max -1){
                                rear = 0;
                            }else{
                                rear++;
                            }
                        }
                        data[rear] = dt;
                        size++;
                    }
                }

                Nasabah06 dequeue(){//mengeluarkan data pada queue di posisi belakang
                    Nasabah06 dt = new Nasabah06();
                    if (isEmpty()) {
                        System.out.println("Queue masih kosong");
                    }else{
                        dt = data[front];
                        size--;
                        if(isEmpty()){
                            front = rear = -1;
                        }else{
                            if(front == max -1){
                                front = 0;
                            }else{
                                rear++;
                            }
                        }
                    }
                    return dt;
                }
            }

membuat class main

            package Pertemuan10;
            import java.util.Scanner;
            public class Mainbank {
                static void menu(){
                    System.out.println("pilih menu = ");
                    System.out.println("1. Atrian baru");
                    System.out.println("2. Atrian keluar");
                    System.out.println("3. Cek Antrian terdepan");
                    System.out.println("4. Cek Semua Antrian");
                    System.out.println("----------------------");
                }

                public static void main(String[] args) {
                    int pilih;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("masukkan kapasitas queue : ");
                    int jumlah = sc.nextInt();
                    QueueBank antri = new QueueBank(jumlah);
                    do{
                        menu();
                        pilih = sc.nextInt();
                        sc.nextLine();
                        switch (pilih) {
                            case 1:
                                System.out.print("No rekening = ");
                                String norek = sc.nextLine();
                                System.out.print("Nama = ");
                                String nama = sc.nextLine();
                                System.out.print("Alamat = ");
                                String alamat = sc.nextLine();
                                System.out.print("Umur = ");
                                int umur = sc.nextInt();
                                System.out.print("Saldo = ");
                                double saldo = sc.nextDouble();
                                Nasabah06 nb = new Nasabah06(norek, nama, alamat, umur, saldo);
                                sc.nextLine();
                                antri.Enqueue(nb);
                                break;
                            case 2 : 
                                Nasabah06 data = antri.dequeue();
                                if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                                    System.out.println("antrian yang keluar = " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                                    break;
                                }
                            case 3 : 
                                antri.peek();
                                break;
                            case 4 :
                                antri.print();
                                break;
                            default:
                                break;
                        }
                    }while(pilih ==1 || pilih ==2 || pilih ==3 || pilih ==4);
                }
            }

### pertanyaan 

1. pada class QueueMain, jelaskan fungsi if pada potongan kode program tersebut!

                                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                                        System.out.println("antrian yang keluar = " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                                        break;
                                    }


fungsi dari pemilihan tersebut adalah melakakuan pengecekan dengan kondisi objek dari data tidak kosong, maka antrian tersebut dikeluarkan

2. lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek anttrian yang berada di posisi belakang! tambahkan pula daftar menu 5. cek antrian paling belakang pada class queuemain sehingga pada method peekrear dapat dipanggil!

buat method peekRear

            void peekrear(){//method untuk menampilkan elemen queue pada posisi paling depan
                    if(!isEmpty()){
                        System.out.println("antrian paling belakang : " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat + " "+ data[rear].umur + " " + data[rear].saldo );
                    }else{
                        System.out.println("Queue masih kosong");
                    }
                }

panggil pada class main


        case 5 : 
                            antri.peekrear();

### 10.4 Tugas
1. Buatlah program antrian untuk mengilustasikan pesanan disebuah warung. Ketika seorang 
pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang 
digambarkan pada Class diagram berikut:• Method create(), isEmpty(), isFull(), enqueue(), dequeue() dan print(), kegunaannya sama seperti 
yang telah dibuat pada Praktikum
• Method peek(): digunakan untuk menampilkan data Pembeli yang berada di posisi antrian paling 
depan
• Method peekRear(): digunakan untuk menampilkan data Pembeli yang berada di posisi antrian 
paling belakang
• Method peekPosition(): digunakan untuk menampilkan seorang pembeli (berdasarkan nama)
posisi antrian ke berapa
• Method daftarPembeli(): digunakan untuk menampilkan data seluruh pembeli 

sudah saya kerjakan pada package disini


