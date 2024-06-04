# Laporan Praktikum Algoritma dan Struktur Data

## Pertemuan 11

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="ATM gif" width="30%"> 
</p>

---

Nama: Atabik Mutawakilalallah

NIM: 2341720090

No. Absen: 06

Kelas: TI-1B

---

### percobaan 1

buat paket baru double linked list, 
buat class node

            package Pertemuan12;


            public class Node {
               int data;
               Node prev, next;

               Node(Node prev, int data, Node next){
                  this.prev = prev;
                  this.next = next;
                  this.data = data;
               }
            }

buat class doublelinked list

            package Pertemuan12;

            public class DoubleLinkedList {
               Node head;
               int size;

               public DoubleLinkedList() {
                  head = null;
                  size = 0;
               }

               public boolean isEmpty() {
                  return head == null;
               }

               public void addFirst(int item) {
                  if (isEmpty()) {
                        head = new Node(null, item, null);
                  } else {
                        Node newNode = new Node(null, item, head);
                        head.prev = newNode;
                        head = newNode;
                  }
                  size++;
               }

               public void addLast(int item) {
                  if (isEmpty()) {
                        addFirst(item);
                  } else {
                        Node current = head;
                        while (current.next != null) {
                           current = current.next;
                        }
                        Node newNode = new Node(current, item, null);
                        current.next = newNode;
                        size++;
                  }
               }

               public void add(int item, int index) throws Exception {
                  if (isEmpty()) {
                        addFirst(item);
                  } else if (index < 0 || index > size) {
                        throw new Exception("nilai indeks di luar batas");
                  } else {
                        Node current = head;
                        int i = 0;
                        while (i < index) {
                           current = current.next;
                           i++;
                        }
                        if (current == null) {
                           addLast(item);
                        } else if (current.prev == null) {
                           Node newNode = new Node(null, item, current);
                           current.prev = newNode;
                           head = newNode;
                        } else {
                           Node newNode = new Node(current.prev, item, current);
                           current.prev.next = newNode;
                           current.prev = newNode;
                        }
                  }
                  size++;
               }

               public int size() {
                  return size;
               }

               public void clear() {
                  head = null;
                  size = 0;
               }

               public void print() {
                  if (isEmpty()) {
                        System.out.println("linked list kosong!");
                  } else {
                        Node tmp = head;
                        while (tmp != null) {
                           System.out.print(tmp.data + "\t");
                           tmp = tmp.next;
                        }
                        System.out.println("\nberhasil diisi");
                  }
               }

               void removeFirst() throws Exception{
                  if(isEmpty()){
                        throw new Exception("linked list kosong, tidak dapat dihapus");
                  } else if(size == 1){
                        removeLast();
                  } else{
                        head = head.next;
                        head.prev = null;
                        size--;
                  }
               }

               void removeLast() throws Exception{
                  if(isEmpty()){
                        throw new Exception("Linked list masih kosongm tidak dapat dihapus!");

                  }else if(head.next == null){
                        head = null;
                        size--;
                        return;
                  }
                  Node current = head;
                  while (current.next.next != null){
                        current = current.next;
                  }
                  current.next = null;
                  size--;
               }

               void remove(int index) throws Exception {
                  if (isEmpty() || index >= size || index < 0) {
                        throw new Exception("nilai indeks diluar batas");
                  } else if (index == 0) {
                        removeFirst();
                  } else {
                        Node current = head;
                        int i = 0;
                        while (i < index) {
                           current = current.next;
                           i++;
                        }
                        // After the loop, current is at the node to be removed.
                        if (current.next == null) { // Removing the last node
                           current.prev.next = null;
                        } else if (current.prev == null) { // Removing the head node
                           head = current.next;
                           head.prev = null;
                        } else { // Removing a middle node
                           current.prev.next = current.next;
                           current.next.prev = current.prev;
                        }
                        size--;
                  }
               }

               int getFirst() throws Exception{
                  if(isEmpty()){
                        throw new Exception("linked list kosong");
                  }
                  return head.data;
               }

               int getLast() throws Exception{
                  if(isEmpty()){
                        throw new Exception("Linked list kosong");
                  }
                  Node tmp = head;
                  while (tmp.next != null){
                        tmp = tmp.next;
                  }
                  return tmp.data;
               }

               int get(int index) throws Exception{
                  if(isEmpty() || index >= size){
                        throw new Exception("nilai indeks diluar batas. "); 
                  }
                  Node tmp = head;
                  for (int i = 0; i < index; i++){
                        tmp = tmp.next;
                  }
                  return tmp.data;
               }
               
            }

buat class main

            package Pertemuan12;

            public class main06 {
               public static void main(String[] args) throws Exception {
                  DoubleLinkedList dll = new DoubleLinkedList();
                  dll.print();
                  System.out.println("size = " + dll.size());
                  System.out.println("=====================");
                  dll.addFirst(3);
                  dll.addLast(4);
                  dll.addFirst(7);
                  dll.print();
                  System.out.println("size = "+ dll.size());
                  System.out.println("=====================");
                  
                  dll.add(40, 1);
                  
                  dll.print();
                  System.out.println("size = " + dll.size());
                  System.out.println("=====================");
                  
                  dll.clear();
                  dll.print();
                  System.out.println("size = "+ dll.size());

verifikasi hasil pekerjaan

            linked list kosong!
            size = 0
            =====================    
            7       3       4        
            berhasil diisi
            size = 3
            =====================    
            7       40      3       4
            berhasil diisi
            size = 4
            =====================
            linked list kosong!
            size = 0

### 12.2.3 Pertanyaan Percobaan
1. Jelaskan perbedaan antara single linked list dengan double linked lists!

ada pada bagian pointer prev di dll, yang menunjukan kode sebelumnya dan pointer next yang menunjukan ke node selanjutnya, sedangkan pada single linked list hanya memiliki pointer next

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut 
tersebut?
untuk menunjukkan objek setelah dan sebelumnya. 

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan 
size seperti pada gambar berikut ini?

untuk inisialisasi pada awal dll yang kosong.

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev 
dianggap sama dengan null?
Node newNode = new Node(null, item, head);

karena pada node pertama, prev dan next memang bernilai null

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?

jika head sebelumnya sudah memiliki nilai, maka sebelum dari head akan dibuat menjadi new node

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan 
parameter prev dengan current, dan next dengan null?
Node newNode = new Node(current, item, null);

posisi pada node akhir tidak perlu mengisi ppointer next

7. Pada method add(), terdapat potongan kode program sebagai berikut:
jelaskan maksud dari bagian yang ditandai dengan kotak kuning.

maksud dari potongan program tersebut adalah saat kita ingin menyisipkan node baru di awal dari dll, dengan langkah mengecek apakah current adalah node pppertama. jika node baru yang menunjuk current sebagai node berikutnya. node current akan memperbarui untuk menunjuk kembali ke node baru sebagai node sebelumnya, ppointer head berguna untuk menunjuk node baru sebagai node yang pertama.

### 12.3 Kegiatan Praktikum 2

tambah method remove frist, last, index;

            void removeFirst() throws Exception{
                  if(isEmpty()){
                        throw new Exception("linked list kosong, tidak dapat dihapus");
                  } else if(size == 1){
                        removeLast();
                  } else{
                        head = head.next;
                        head.prev = null;
                        size--;
                  }
               }

               void removeLast() throws Exception{
                  if(isEmpty()){
                        throw new Exception("Linked list masih kosongm tidak dapat dihapus!");

                  }else if(head.next == null){
                        head = null;
                        size--;
                        return;
                  }
                  Node current = head;
                  while (current.next.next != null){
                        current = current.next;
                  }
                  current.next = null;
                  size--;
               }

               void remove(int index) throws Exception {
                  if (isEmpty() || index >= size || index < 0) {
                        throw new Exception("nilai indeks diluar batas");
                  } else if (index == 0) {
                        removeFirst();
                  } else {
                        Node current = head;
                        int i = 0;
                        while (i < index) {
                           current = current.next;
                           i++;
                        }
                        // After the loop, current is at the node to be removed.
                        if (current.next == null) { // Removing the last node
                           current.prev.next = null;
                        } else if (current.prev == null) { // Removing the head node
                           head = current.next;
                           head.prev = null;
                        } else { // Removing a middle node
                           current.prev.next = current.next;
                           current.next.prev = current.prev;
                        }
                        size--;
                  }
               }

class main

                     System.out.println("modifikasi ke 2");
                     dll.addLast(50);
                     dll.addLast(40);
                     dll.addLast(10);
                     dll.addLast(20);
                     dll.print();
                     System.out.println("size = "+ dll.size());
                     System.out.println("=====================");
                     dll.removeFirst();
                     dll.print();
                     System.out.println("size = "+ dll.size());
                     System.out.println("=====================");
                     dll.removeLast();
                     dll.print();
                     System.out.println("size = "+ dll.size());
                     System.out.println("=====================");
                     dll.remove(1);
                     dll.print();
                     System.out.println("size = "+ dll.size());

hasil percobaan 

               50      40      10      20
               berhasil diisi
               size = 4
               =====================
               40      10      20
               berhasil diisi
               size = 3
               =====================
               40      10
               berhasil diisi
               size = 2
               =====================
               40
               berhasil diisi
               size = 1

### 12.3.3 Pertanyaan Percobaan
1. Apakah maksud statement berikut pada method removeFirst()?
head = head.next;
head.prev = null;

untuk merubah posisi head pada node selanjutnya, dan menghapus node pertama atau head sebelumnya.

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?

dengan menggunakan looping while hingga nixt dari node bernilai null yang berarti bahwa node tersebut adalah node paling ujung, node tersebut disimpan dalam variabel tmp dan data terakhir adalah tmp.

3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!

karena node yang dihapus merupakan node pertama (head). atau terakhir, maka perlu penanganan khusus. jika node pertama, maka head perlu diperbarui. jika node terakhir dan tmp adalah null. maka tmp.next.prev akan menimbulkan kesalahan, jika potongan tersebut tetap dijalankan, maka struktur data yang tersambung akan error karena hubungan pre-nextt yang tidak konsisten

4. Jelaskan fungsi kode program berikut ini pada fungsi remove!

sebagai pengganti referensi next dari node sebelum node current yang di remobe dengan node setelah node current, dan mengganti referensi prev node setelah current dengan node sebelum current
### percobaan 3

buat 3 method baru pada double linked list

            int getFirst() throws Exception{
               if(isEmpty()){
                     throw new Exception("linked list kosong");
               }
               return head.data;
            }

            int getLast() throws Exception{
               if(isEmpty()){
                     throw new Exception("Linked list kosong");
               }
               Node tmp = head;
               while (tmp.next != null){
                     tmp = tmp.next;
               }
               return tmp.data;
            }

            int get(int index) throws Exception{
               if(isEmpty() || index >= size){
                     throw new Exception("nilai indeks diluar batas. "); 
               }
               Node tmp = head;
               for (int i = 0; i < index; i++){
                     tmp = tmp.next;
               }
               return tmp.data;
            }
            
         }

tambahkan output pada main class

               System.out.println("modifikasi ke 3");
               System.out.println("size = "+ dll.size());
               System.out.println("=====================");
               dll.print();
               dll.addFirst(3);
               dll.addLast(4);
               dll.addFirst(7);
               dll.print();
               System.out.println("size = "+ dll.size());
               System.out.println("=====================");
               dll.add(40, 1);
               dll.print();
               System.out.println("size = "+ dll.size());
               System.out.println("=====================");
               System.out.println("data awal pada linked list adalah = " + dll.getFirst());
               System.out.println("data akhir pada linked list adalah = " + dll.getLast());
               System.out.println("data pada indeks ke 1 linked list adalah = "+ dll.get(1));

            }
         }


output program

            modifikasi ke 3
            size = 1
            =====================
            40
            berhasil diisi
            7       3       40      4
            berhasil diisi
            size = 4
            =====================
            7       40      3       40      4
            berhasil diisi
            size = 5
            =====================
            data awal pada linked list adalah = 7
            data akhir pada linked list adalah = 4
            data pada indeks ke 1 linked list adalah = 40


### 12.4.3 Pertanyaan Percobaan
1. Jelaskan method size() pada class DoubleLinkedLists!

untuk menampilkan banyaknya node yang ada pada linked list

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1!

sebelum melakukan perulangan, tmp diisi dengan head.next

3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! 

konsep fungsi add sama seoerti menambah node baru pada index yang ditentukan, yang membedakan adalah add pada dll harus mengganti posisi prev dan next sedangkan single linked list hanya next

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!

yang pertama pada program adalah mengecek size, jika size = 0 maka esEmpty bernilai true, pada kode selanjutnya mengembalikan nilai null, jika nilai head == null akan mengembalikan nilai false ataupun sebaliknya


### 12.5 Tugas Praktikum
Waktu : 100 Menit
1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi 
dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang 
telah divaksinasi di menu Hapus Data(2) harus ada)
Contoh Ilustrasi Program
Menu Awal dan Penambahan Data

sudah saya buat pada package disini

2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked 
lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara 
descending. Class Film wajib diimplementasikan dalam soal ini.
Contoh Ilustrasi Program
Menu Awal dan Penambahan Data

sudah saya buat pada package disini