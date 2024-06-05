# Laporan Praktikum Algoritma dan Struktur Data

## Pertemuan 11

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="ATM gif" width="30%"> 
</p>

---

### 2.1 Percobaan 1: Implementasi Graph menggunakan Linked List

buat class node 

            package Pertemuan15;

            /**
            * Node06
            */
            public class Node06 {

                int data;
                Node06 prev, next;
                int jarak;

                Node06(Node06 prev, int data, int jarak, Node06 next){
                    this.prev = prev;
                    this.data = data;
                    this.next = next;
                    this.jarak = jarak;
                }
                
            }

class double linked list

                package Pertemuan15;

                public class DoubleLinkedList06 {
                    Node06 head;
                    int size;

                    public DoubleLinkedList06() {
                        head = null;
                        size = 0;
                    }

                    public boolean isEmpty() {
                        return head == null;
                    }

                    public void addFirst(int item, int jarak) {
                        if (isEmpty()) {
                            head = new Node06(null, item, jarak, null);
                        } else {
                            Node06 newNode = new Node06(null, item, jarak,  head);
                            head.prev = newNode;
                            head = newNode;
                        }
                        size++;
                    }

                    // public void addLast(int item) {
                    //     if (isEmpty()) {
                    //         addFirst(item);
                    //     } else {
                    //         Node current = head;
                    //         while (current.next != null) {
                    //             current = current.next;
                    //         }
                    //         Node newNode = new Node(current, item, null);
                    //         current.next = newNode;
                    //         size++;
                    //     }
                    // }

                    // public void add(int item, int index) throws Exception {
                    //     if (isEmpty()) {
                    //         addFirst(item);
                    //     } else if (index < 0 || index > size) {
                    //         throw new Exception("nilai indeks di luar batas");
                    //     } else {
                    //         Node current = head;
                    //         int i = 0;
                    //         while (i < index) {
                    //             current = current.next;
                    //             i++;
                    //         }
                    //         if (current == null) {
                    //             addLast(item);
                    //         } else if (current.prev == null) {
                    //             Node newNode = new Node(null, item, current);
                    //             current.prev = newNode;
                    //             head = newNode;
                    //         } else {
                    //             Node newNode = new Node(current.prev, item, current);
                    //             current.prev.next = newNode;
                    //             current.prev = newNode;
                    //         }
                    //     }
                    //     size++;
                    // }

                    int getjarak(int index)throws Exception{
                        if(isEmpty() || index >= size){
                            throw new Exception("nilai indeks diluar batas");
                        }
                        Node06 tmp = head;
                        for(int i = 0; i < index; i++){
                            tmp= tmp.next;
                        }
                        return tmp.jarak;
                    }

                    public int size() {
                        return size;
                    }

                    public void clear() {
                        head = null;
                        size = 0;
                    }

                    // public void print() {
                    //     if (isEmpty()) {
                    //         System.out.println("linked list kosong!");
                    //     } else {
                    //         Node tmp = head;
                    //         while (tmp != null) {
                    //             System.out.print(tmp.data + "\t");
                    //             tmp = tmp.next;
                    //         }
                    //         System.out.println("\nberhasil diisi");
                    //     }
                    // }

                    // void removeFirst() throws Exception{
                    //     if(isEmpty()){
                    //         throw new Exception("linked list kosong, tidak dapat dihapus");
                    //     } else if(size == 1){
                    //         removeLast();
                    //     } else{
                    //         head = head.next;
                    //         head.prev = null;
                    //         size--;
                    //     }
                    // }

                    // void removeLast() throws Exception{
                    //     if(isEmpty()){
                    //         throw new Exception("Linked list masih kosongm tidak dapat dihapus!");

                    //     }else if(head.next == null){
                    //         head = null;
                    //         size--;
                    //         return;
                    //     }
                    //     Node current = head;
                    //     while (current.next.next != null){
                    //         current = current.next;
                    //     }
                    //     current.next = null;
                    //     size--;
                    // }

                    void remove(int index) throws Exception {
                        // if (isEmpty() || index >= size || index < 0) {
                        //     throw new Exception("nilai indeks diluar batas");
                        // } else if (index == 0) {
                        //     removeFirst();
                        // } else {
                            Node06 current = head;
                            
                            while (current != null) {
                                if(current.data== index){
                                    if(current.prev != null){
                                        current.prev.next = current.next;
                                    }else{
                                        head = current.next;
                                    }
                                    if(current.next != null){
                                        current.next.prev = current.prev;
                                    }
                                    break;
                                }
                                current = current.next;
                            }
                            
                        
                    }

                    int getFirst() throws Exception{
                        if(isEmpty()){
                            throw new Exception("linked list kosong");
                        }
                        return head.data;
                    }

                    // int getLast() throws Exception{
                    //     if(isEmpty()){
                    //         throw new Exception("Linked list kosong");
                    //     }
                    //     Node tmp = head;
                    //     while (tmp.next != null){
                    //         tmp = tmp.next;
                    //     }
                    //     return tmp.data;
                    // }

                    // int get(int index) throws Exception{
                    //     if(isEmpty() || index >= size){
                    //         throw new Exception("nilai indeks diluar batas. "); 
                    //     }
                    //     Node tmp = head;
                    //     for (int i = 0; i < index; i++){
                    //         tmp = tmp.next;
                    //     }
                    //     return tmp.data;
                    // }
                    int get(int index) {
                        Node06 current = head;
                        for (int i = 0; i < index; i++) {
                            if (current != null) {
                                current = current.next;
                            } else {
                                return -1; // index out of bounds
                            }
                        }
                        return current != null ? current.data : -1; // return -1 if index is out of bounds
                    }

                    public void updateJarak(int index, int newJarak) throws Exception {
                        if (index < 0 || index >= size) {
                            throw new Exception("Index out of bounds");
                        }
                        Node06 current = head;
                        for (int i = 0; i < index; i++) {
                            current = current.next;
                        }
                        current.jarak = newJarak;
                    }
                    

                    
                }


class graph

                package Pertemuan15;

                public class Graph06 {
                    int vertex;
                    DoubleLinkedList06 list[];
                    Node06 head;
                    
                    Graph06(int v){
                        vertex = v;
                        list = new DoubleLinkedList06[v];
                        for (int i = 0; i < v; i++){
                            list[i] = new DoubleLinkedList06();
                        }
                    }
                    void addEdge(int asal, int tujuan, int jarak){
                        list[asal].addFirst(tujuan, jarak);
                    }
                    void degree(int asal){
                        int k, totalIn = 0, totalout = 0;
                        for(int i=0; i < vertex; i++){
                            //indegree
                            for(int j = 0; j < list[i].size(); j++){
                                if(list[i].get(j) == asal){
                                    ++totalIn;
                                }
                            }
                            //outdegree
                            for(k = 0; k < list[asal].size(); k++){
                                list[asal].get(k);
                            }
                            totalout = k;
                        }
                        System.out.println("in Degree dari gedung " + (char)('A' + asal)+ ": "+ totalIn);
                        System.out.println("out Degree dari gedung "+ (char)('A' + asal)+ ": "+totalout);
                        System.out.println("Degree dari gedung "+ (char)('A' + asal)+ ": "+ (totalIn + totalout));

                    }

                    void removeAllEdges(){
                        for(int i = 0; i < vertex; i++){
                            list[i].clear();
                        }
                        System.out.println("graf berhasil dikosongkan");
                    }
                    void printGraph() {//yet
                        for (int i = 0; i < vertex; i++) {
                            if (list[i].size() > 0) {
                                System.out.print("gedung " + (char) ('A' + i) + " terhubung dengan ");
                                for (int j = 0; j < list[i].size(); j++) {
                                    try {
                                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getjarak(j) + " m), ");
                                    } catch (Exception e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                }
                                System.out.println();
                            }
                        }
                        System.out.println();
                    }
                    void removeEdge(int asal, int index) {
                        try {
                            list[asal].remove(index);
                            System.out.println("Edge removed from vertex " + (char) ('A' + asal) + " at index " + index);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    boolean checkEdge(int asal, int tujuan) {
                        for (int i = 0; i < list[asal].size(); i++) {
                            if (list[asal].get(i) == tujuan) {
                                System.out.println("edge antara " + asal + " dan " + tujuan + " ada ");
                                return true;

                            }
                        }
                        return false;
                    }
                    void updateJarak(int asal, int tujuan, int newJarak) {
                        boolean edgeFound = false;
                        for (int i = 0; i < list[asal].size(); i++) {
                            if (list[asal].get(i) == tujuan) {
                                try {
                                    list[asal].updateJarak(i, newJarak);
                                    System.out.println("Jarak updated antara " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " menjadi " + newJarak + " m");
                                    edgeFound = true;
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Error: " + e.getMessage());
                                }
                            }
                        }
                        if (!edgeFound) {
                            System.out.println("Edge antara " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak ditemukan");
                        }
                    }

                    
                    
                }

class main 

                package Pertemuan15;

                import java.util.Scanner;

                public class GraphMainMatriks06 {
                    public static void main(String[] args) {
                        
                        GraphMatriks06 gdg = new GraphMatriks06(4);
                        gdg.makeegde(   0, 1, 50);
                        gdg.makeegde(1, 0, 60);
                        gdg.makeegde(1, 2, 70);
                        gdg.makeegde(2, 1, 80);
                        gdg.makeegde(2, 3, 40);
                        gdg.makeegde(3, 0, 90);
                        gdg.printGraph();
                        System.out.println("hasil setelah penghapusan edge");
                        gdg.removeedge(2, 1);
                        gdg.printGraph();


                        
                    }

                }

hasil percobaan

            in Degree dari gedung A: 0
            out Degree dari gedung A: 2
            Degree dari gedung A: 2
            gedung A terhubung dengan C (100 m), B (50 m),
            gedung B terhubung dengan D (70 m),
            gedung C terhubung dengan D (40 m),
            gedung D terhubung dengan E (60 m),
            gedung E terhubung dengan F (80 m),


### 2.1.3 Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!
sudah saya perbaiki
2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan
variabel tersebut!
tujuannya adalah untuk merepresentasikan graf menggunakan representasi daftar tetangga.
3. Jelaskan alur kerja dari method removeEdge!
pertama method tersebut melakukan looping sebanyak vertex yang ada, kemudian mengejek tujuan, dengan apakah indeks looping sama dengan tujuan. tujuannya supaya mengarah dari asal ke tujuan. kemudian program selanjutnya adalah mengecek jika indeks iterasi sama dengan tujuan, maka itu artinya ada tepi yang mengara dari simpul ke tujuan, maka method memanggil methode remmove dari objek dll yang sesuai. kemudian terdapat exception supaya pada penanganan pemilihan, jika diluar kondisi yang diberikan maka tidak perlu tindakan apa apa.
4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add
jenis lain saat digunakan pada method addEdge pada class Graph?
karena saat kita menambah edge baru pada addfirst, kita tidak perlu melakukan looping cukup panjang untuk menuju pada urutan terakhir, sehingga lebih efisien dalam waktu dan lebih sedarhana dan mudah dipahami
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara
suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner).

            boolean checkEdge(int asal, int tujuan) {
                for (int i = 0; i < list[asal].size(); i++) {
                    if (list[asal].get(i) == tujuan) {
                        System.out.println("edge antara " + asal + " dan " + tujuan + " ada ");
                        return true;

                    }
                }
                return false;
            }

main class nya

                    system.out.println("masukkan asal nilai = ");
                    int awal = sc.nextInt();
                    System.out.println("masukkan nilai tujuan = ");
                    int sampai = sc.nextInt();
                    gedung.checkEdge(awal, sampai);
                    break;

percobaan 2

package Pertemuan15;

        public class GraphMatriks06 {
            int vertex;
            int[][] matriks;

            public GraphMatriks06(int v){
                vertex = v;
                matriks = new int[v][v];

            }

            void makeegde(int asal, int tujuan, int jarak){
                matriks[asal][tujuan]= jarak;
            }
            void removeedge(int asal, int tujuan){
                matriks[asal][tujuan] = -1;
            }
            void printGraph(){
                for(int i = 0; i < vertex; i++){
                    System.out.println("Gedung "+ (char) ('A' + i) + ": ");
                    for(int j = 0; j < vertex; j++){
                        if(matriks[i][j] != -1){
                            System.out.println("Gedung "+ (char)('A' + j) + "( "+ matriks[i][j] + " m), ");
                        }
                    }
                    System.out.println();
                }
            }
        }

class main

                package Pertemuan15;

                import java.util.Scanner;

                public class GraphMainMatriks06 {
                    public static void main(String[] args) {
                        
                        GraphMatriks06 gdg = new GraphMatriks06(4);
                        gdg.makeegde(   0, 1, 50);
                        gdg.makeegde(1, 0, 60);
                        gdg.makeegde(1, 2, 70);
                        gdg.makeegde(2, 1, 80);
                        gdg.makeegde(2, 3, 40);
                        gdg.makeegde(3, 0, 90);
                        gdg.printGraph();
                        System.out.println("hasil setelah penghapusan edge");
                        gdg.removeedge(2, 1);
                        gdg.printGraph();


                        
                    }

                }

output

                    Gedung A: 
                    Gedung A( 0 m), 
                    Gedung B( 50 m),
                    Gedung C( 0 m),
                    Gedung D( 0 m),

                    Gedung B:
                    Gedung A( 60 m),
                    Gedung B( 0 m),
                    Gedung C( 70 m),
                    Gedung D( 0 m),

                    Gedung C:
                    Gedung A( 0 m),
                    Gedung B( 80 m),
                    Gedung C( 0 m),
                    Gedung D( 40 m),

                    Gedung D:
                    Gedung A( 90 m),
                    Gedung B( 0 m),
                    Gedung C( 0 m),
                    Gedung D( 0 m),

                    hasil setelah penghapusan edge
                    Gedung A:
                    Gedung A( 0 m),
                    Gedung B( 50 m),
                    Gedung C( 0 m),
                    Gedung D( 0 m),

                    Gedung B:
                    Gedung A( 60 m),
                    Gedung B( 0 m),
                    Gedung C( 70 m),
                    Gedung D( 0 m),

                    Gedung C:
                    Gedung A( 0 m),
                    Gedung C( 0 m),
                    Gedung D( 40 m),

                    Gedung D:
                    Gedung A( 90 m),
                    Gedung B( 0 m),
                    Gedung C( 0 m),
                    Gedung D( 0 m),
### 2.2.3 Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!
sudah
2. Apa jenis graph yang digunakan pada Percobaan 2?
matriks
3. Apa maksud dari dua baris kode berikut?
membuat atau menentukan edge dengan parameter asal, tujuan, dan jarak
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk
inDegree dan outDegree!

            void degree(int asal){
                    int k, totalIn = 0, totalout = 0;
                    
                        //indegree
                        for(int j = 0; j < vertex; j++){
                            if(matriks[j][asal] != 0){
                                totalIn++;
                            }
                        }
                        //outdegree
                        for(k = 0; k < vertex ; k++){
                            if(matriks[k][asal] != 0){
                                totalout++;
                            }
                        }
                        totalout = k;
                    
                    System.out.println("in Degree dari gedung " + (char)('A' + asal)+ ": "+ totalIn);
                    System.out.println("out Degree dari gedung "+ (char)('A' + asal)+ ": "+totalout);
                    System.out.println("Degree dari gedung "+ (char)('A' + asal)+ ": "+ (totalIn + totalout));

                }

### 3. Latihan Praktikum
Waktu percobaan: 90 menit
1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat
dinamis, setidaknya terdiri dari:
a) Add Edge
b) Remove Edge
c) Degree
d) Print Graph
e) Cek Edge

sudah saya tambah pada file package disini
Pengguna dapat memilih menu program melalui input Scanner
2. Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak
antara dua node asal dan tujuan!
sudah saya tambah pada package disini
3. Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf!