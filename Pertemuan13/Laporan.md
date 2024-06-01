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

implementasi binary search tree menggunakan linked list

membuat calss Node

                package Pertemuan13;

                public class Node06 {
                    int data;
                    Node06 left;
                    Node06 right;

                    Node06 (Node06 left, int data, Node06 right){
                        this.left = left;
                        this.data = data;
                        this.right = right;
                    }
                }

membuat class binarytree

                    package Pertemuan13;

                    public class BinaryTree06 {
                        Node06 root;

                        BinaryTree06() {
                            root = null;
                        }

                        boolean isEmpty() {
                            return root == null;
                        }

                        void add(int data) {
                            if (isEmpty()) {
                                root = new Node06(null, data, null);
                            } else {
                                Node06 current = root;
                                while (true) {
                                    if (data > current.data) {
                                        if (current.right == null) {
                                            current.right = new Node06(null, data, null);
                                            break;
                                        } else {
                                            current = current.right;
                                        }
                                    } else if (data < current.data) {
                                        if (current.left == null) {
                                            current.left = new Node06(null, data, null);
                                            break;
                                        } else {
                                            current = current.left;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }

                        boolean find(int data) {
                            Node06 current = root;
                            while (current != null) {
                                if (current.data == data) {
                                    return true;
                                } else if (data > current.data) {
                                    current = current.right;
                                } else {
                                    current = current.left;
                                }
                            }
                            return false;
                        }

                        void traversePreOrder(Node06 node) {
                            if (node != null) {
                                System.out.print(" " + node.data);
                                traversePreOrder(node.left);
                                traversePreOrder(node.right);
                            }
                        }

                        void traversePostOrder(Node06 node) {
                            if (node != null) {
                                traversePostOrder(node.left);
                                traversePostOrder(node.right);
                                System.out.print(" " + node.data);
                            }
                        }

                        void traverseInOrder(Node06 node) {
                            if (node != null) {
                                traverseInOrder(node.left);
                                System.out.print(" " + node.data);
                                traverseInOrder(node.right);
                            }
                        }

                        Node06 getSuccessor(Node06 del) {
                            Node06 successor = del.right;
                            Node06 successorParent = del;
                            while (successor.left != null) {
                                successorParent = successor;
                                successor = successor.left;
                            }
                            if (successor != del.right) {
                                successorParent.left = successor.right;
                                successor.right = del.right;
                            }
                            return successor;
                        }

                        void delete(int data) {
                            if (isEmpty()) {
                                System.out.println("Tree is empty");
                                return;
                            }
                            Node06 parent = root;
                            Node06 current = root;
                            boolean isLeftChild = false;
                            while (current != null) {
                                if (current.data == data) {
                                    break;
                                } else if (data < current.data) {
                                    parent = current;
                                    current = current.left;
                                    isLeftChild = true;
                                } else {
                                    parent = current;
                                    current = current.right;
                                    isLeftChild = false;
                                }
                            }
                            if (current == null) {
                                System.out.println("Couldn't find data");
                                return;
                            } else {
                                if (current.left == null && current.right == null) {
                                    if (current == root) {
                                        root = null;
                                    } else {
                                        if (isLeftChild) {
                                            parent.left = null;
                                        } else {
                                            parent.right = null;
                                        }
                                    }
                                } else if (current.left == null) {
                                    if (current == root) {
                                        root = current.right;
                                    } else {
                                        if (isLeftChild) {
                                            parent.left = current.right;
                                        } else {
                                            parent.right = current.right;
                                        }
                                    }
                                } else if (current.right == null) {
                                    if (current == root) {
                                        root = current.left;
                                    } else {
                                        if (isLeftChild) {
                                            parent.left = current.left;
                                        } else {
                                            parent.right = current.left;
                                        }
                                    }
                                } else {
                                    Node06 successor = getSuccessor(current);
                                    if (current == root) {
                                        root = successor;
                                    } else {
                                        if (isLeftChild) {
                                            parent.left = successor;
                                        } else {
                                            parent.right = successor;
                                        }
                                        successor.left = current.left;
                                    }
                                }
                            }
                        }
                    }

membuat class main

                package Pertemuan13;

                public class Binarytreemain06 {

                    public static void main(String[] args) {
                        BinaryTree06 bt = new BinaryTree06();
                        bt.add(6);
                        bt.add(4);
                        bt.add(8);
                        bt.add(3);
                        bt.add(5);
                        bt.add(7);
                        bt.add(9);
                        bt.add(10);
                        bt.add(15);
                        System.out.println("peorder traversal = ");
                        bt.traversePreOrder(bt.root);
                        System.out.println(" ");
                        System.out.println("in order traversal : ");
                        bt.traverseInOrder(bt.root);
                        System.out.println(" ");
                        System.out.println("post order traversal : ");
                        bt.traversePostOrder(bt.root);
                        System.out.println(" ");
                        System.out.println("find note = " + bt.find(5));
                        System.out.println("delete node 8");
                        bt.delete(8);
                        System.out.println("");
                        System.out.println("peorder traversal = ");
                        bt.traversePreOrder(bt.root);
                        System.out.println(" ");
                        
                    }
                }

hasil running program

                    peorder traversal = 
                    6 4 3 5 8 7 9 10 15   
                    in order traversal :   
                    3 4 5 6 7 8 9 10 15   
                    post order traversal : 
                    3 5 4 7 15 10 9 8 6   
                    find note = true       
                    delete node 8

                    peorder traversal =
                    6 4 3 5 9 7 10 15


### 13.2.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding 
binary tree biasa?
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan 
secara detil untuk apa baris program tersebut?

            if(data<current.data){
            if(current.left!=null){
            current = current.left;
            }else{
            current.left = new Node(data);
            break;
            }
            }

### program binary tree dengan array

buat class binrarytree array

                package Pertemuan13;

                public class BinaryTreeArray {
                    int[] data;
                    int idxlast;

                    BinaryTreeArray() {
                        data = new int[10];
                    }

                    void populateData(int[] data, int idxlast) {
                        this.data = data;
                        this.idxlast = idxlast;
                    }

                    void traverseInOrder(int idxstart) {
                        if (idxstart <= idxlast && data[idxstart] != 0) {
                            traverseInOrder(2 * idxstart + 1);
                            System.out.print(data[idxstart] + " ");
                            traverseInOrder(2 * idxstart + 2);
                        }
                    }
                }

buat class main

                package Pertemuan13;

                public class BinaryTreeArray06 {
                    public static void main(String[] args) {
                        BinaryTreeArray bta = new BinaryTreeArray();
                        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
                        int idxlast = 6;
                        bta.populateData(data, idxlast);
                        System.out.println("\nInorder traversal = ");
                        bta.traverseInOrder(0);
                        System.out.println("\n");
                    }
                }
                

### 13.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
2. Apakah kegunaan dari method populateData()?
3. Apakah kegunaan dari method traverseInOrder()?
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi 
left child dan rigth child masin-masing?
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?               


### 13.4 Tugas Praktikum
Waktu pengerjaan: 90 menit
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara 
rekursif.
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang 
paling besar yang ada di dalam tree.
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.
4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada 
di dalam tree.
5. Modifikasi class BinaryTreeArray, dan tambahkan : 
• method add(int data) untuk memasukan data ke dalam tree 
• method traversePreOrder() dan traversePostOrder()