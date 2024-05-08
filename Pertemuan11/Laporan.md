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

### 2.1 Pembuatan Single Linked List

membuat 3 class, node.java

            package Pertemuan11;

            public class Node {
                int data;
                Node next;

                Node(){

                }
                Node(int nilai, Node berikutnya){
                    data = nilai;
                    next = berikutnya;
                }
            }

singlelinkedlist,

            package Pertemuan11;

            public class SingleLinkedList {
                Node head, tail;
                boolean isEmpty(){//kondisi headnya harus berisi null
                    return head == null;

                }

                void print(){//tidak membolehkan list dalam keadaan kosong
                    if(!isEmpty()){
                        Node tmp = head;
                        System.out.print("isi linked list ");
                        while(tmp != null){
                            System.out.print(tmp.data + " \t");
                            tmp = tmp.next;
                        }
                        System.out.println(" ");
                    }else{
                        System.out.println("Linked List kosong");
                    }
                }

                void addfirst(int input){
                    //node baru yang ditambahkan berisi data melalui parameter
                    //pada method addfirst
                    Node ndInput = new Node(input, null);
                    if(isEmpty()){
                        //jika kosong, maka peran head dan tail
                        //harus dimiliki node yang sama
                        head = ndInput;
                        tail = ndInput;
                        // ndInput.next = head;
                        // head = ndInput;
                    }else{
                        // head = ndInput;
                        // tail = ndInput;
                        ndInput.next = head;
                        head = ndInput;
                    }
                }

                void addlast(int input){
                    //node baru yang ditambahkan berisi data melalui
                    //pada mehtod addlast
                    Node ndInput = new Node(input, null);
                    if(isEmpty()){//jika kosong, maka peran head dan tail
                            //harus memiliki node yang sama
                            head = ndInput;
                            tail = ndInput;
                        }else{
                            tail.next =  ndInput;
                            tail = ndInput;
                    }
                }

                void insertAfter(int key, int input){
                    Node ndInput = new Node();
                    Node temp = head;
                    do{
                        if(temp.data == key){
                            ndInput.next = temp.next;
                            temp.next = ndInput;
                            if(ndInput.next == null){//jika tidak ada node selanjutnya
                                tail = ndInput;//maka jadikan ndInput sebagai tail
                                break;   //
                            }
                        }
                        temp = temp.next;
                    }while(temp != null);
                }

                void insertAt(int index, int input){
                    //pastikan opperasi dari method ini adalah menggeser posisi
                    //node yang terletak di indeks dan node tersebut berpindah
                    //satu indeks setelahnya
                    Node ndInput= new Node(input, null);
                    if(index < 0){
                        System.out.println("perbaiki logikanya ! kalau indeks nya -1 bagaimana???");
                    }else if(index == 0){
                        addfirst(input);
                    }else{
                        Node temp = head;
                        for(int i =0; i< index-1; i++){
                            temp = temp.next;
                        }
                        temp.next = new Node(input, temp.next);
                        if(temp.next.next == null){
                            tail=temp.next;
                        }
                    }
                }

sllmain.java

            package Pertemuan11;

            public class SLLMain {
                public static void main(String[] args) {
                    SingleLinkedList singLL = new SingleLinkedList();
                    singLL.print();
                    singLL.addfirst(890);
                    singLL.print();
                    singLL.addlast(760);
                    singLL.print();
                    singLL.addfirst(700);
                    singLL.print();
                    singLL.insertAfter(700, 999);
                    singLL.print();
                    singLL.insertAt(3, 833);
                    singLL.print();
                }
            }

output program

            Linked List kosong
            isi linked list 890
            isi linked list 890     760
            isi linked list 700     890     760
            isi linked list 700     999     890     760
            isi linked list 700     999     890     833     760

### pertanyaan

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

karena pada saat pemanggilan method tersebut. linked list masih kosong, dan method print dipanggiil sebelum menambahkan node pertama. saat method tersebut dipanggil, kondisi isempty() bernilai true sehingga mengembalikan output linked list masih kosong.

2. Jelaskan kegunaan variable temp secara umum pada setiap method!

digunakan sebagai variable sementara untuk menyimpan referensi sementara pada node-node dalam linked list. kegunaan utamanya adalah untuk melakukan traversing(penelusuran) melalui linked list, yaitu berpindah dari node ke node yang lain untuk melakukan operasi terterntu seperti mencari, menambah, menghapus.

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut

sebuah kondisi dimana berfungsi untuk memeriksa apakah node yang akan dimasukkan akan menjadi node terakhir dalam linked list setelah operasi penyisipan dilakukan. Jika kondisi true, maka node yang dimasukkan akan menjadi node terakhir setelah operasi penyisipan.

### Modifikasi Elemen pada Single Linked List

            int getData(int index){
                    Node tmp = head;
                    for(int i=0; i<index-1;i++){
                        tmp = tmp.next;
                    }
                    return tmp.next.data;
                }

                int indexof(int key){
                    Node tmp = head;
                    int index= 0;
                    while (tmp != null && tmp.data != key) {
                        tmp = tmp.next;
                        index++;
                    }
                    if(tmp != null){
                        return 1;
                    }else{
                        return index;
                    }
                }


                void removeFirst(){
                    if(isEmpty()){
                        System.out.println("Linked list masih kosong,"
                                + "tidak dapat dihapus");
                    } else if (head == tail){
                        head = tail = null;
                    } else {
                        head = head.next;
                    }
                }

                void removeLast(){
                    if(isEmpty()){
                        System.out.println("Linked list masih kosong,"
                                + "tidak dapat dihapus");
                    } else if (head != tail) {
                        head = tail = null;
                    } else {
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = null;
                        tail = temp.next;
                    }
                }

                void remove(int key){
                    if(isEmpty()){
                        System.out.println("Linked list masih kosong,"
                                + "tidak dapat dihapus");
                    } else {
                        Node temp = head;
                        while (temp!=null) {
                            if(temp.data != key && temp==head) {
                                removeFirst();
                                break;
                            } else if (temp.next.data == key) {
                                temp.next = temp.next.next;
                                if(temp.next == null) {
                                    tail = temp;
                                }
                                break;
                            }
                            temp = temp.next;
                        }
                    }
                }

                public void removeAt(int index) {
                    if (index == 0) {
                        removeFirst();
                    } else {
                        Node temp = head;
                        for (int i = 0; i < index - 1; i++){
                            temp = temp.next;
                        }
                        temp.next = temp.next.next;
                        if (temp.next == null) {
                            tail = temp;
                        }
                    }
                }

output program

            Linked List kosong
            isi linked list 890
            isi linked list 890     760
            isi linked list 700     890     760
            isi linked list 700     999     890     760
            isi linked list 700     999     890     833     760
            data pada  indeks ke 1 = 999
            data 3 berada pada indeks ke - 1
            isi linked list 999     890     833     760
            isi linked list 890     833     760
            isi linked list 833     760
            Linked List kosong

### pertanyaan

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

untuk menghentikan iterasi melalui linked list setelah operasi penghapusan dilakukan.

2.  Jelaskan kegunaan kode dibawah pada method remove

            } else if (temp.next.data == key) {

berfungsi untuk mengecek apakah node yang berada setelah 'temp' memiliki nilai yang sama dengan nilai kunci yang ingin dihapus.

1 Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah
dipelajari sebelumnya untuk menginputkan data.

2 Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang
ditunjukkan pada soal nomor 1! Ketentuan
a. Implementasi antrian menggunakan Queue berbasis Linked List!
b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1!
