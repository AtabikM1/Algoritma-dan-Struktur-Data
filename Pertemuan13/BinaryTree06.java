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

    void addRecursive(int data) {
        root = rekursifkonsep(root, data);
    }

    private Node06 rekursifkonsep(Node06 current, int data) {
        if (current == null) {
            // Jika node saat ini kosong, buat node baru dengan data yang diberikan
            return new Node06(null, data, null);
        }

        if (data < current.data) {
            // Jika data yang akan ditambahkan lebih kecil, tambahkan ke subtree kiri
            current.left = rekursifkonsep(current.left, data);
        } else if (data > current.data) {
            // Jika data yang akan ditambahkan lebih besar, tambahkan ke subtree kanan
            current.right = rekursifkonsep(current.right, data);
        }
        // Jika data sama, tidak perlu melakukan apa-apa karena data sudah ada

        return current;
    }
    // Metode untuk menemukan nilai paling kecil di dalam tree
    int findMin() {
        if (isEmpty()) {
            throw new RuntimeException("Tree is empty");
        }
        Node06 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }
    // Metode untuk menemukan nilai paling besar di dalam tree
    int findMax() {
        if (isEmpty()) {
            throw new RuntimeException("Tree is empty");
        }
        Node06 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
    // Metode untuk menampilkan data di leaf (daun) pohon biner
    void displayLeafData(Node06 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {//saat kanan dan kiri sudah null berarti  node.data adalah daun karena tidak memiliki anak
            System.out.print(node.data + " ");
        } else {
            displayLeafData(node.left);
            displayLeafData(node.right);
        }
    }
    int hitungdaun(Node06 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return hitungdaun(node.left) + hitungdaun(node.right);
        }
    }
}
