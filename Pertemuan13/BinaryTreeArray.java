package Pertemuan13;

public class BinaryTreeArray {
    int[] data;
    int idxlast;
    int size;

    BinaryTreeArray() {
        data = new int[10];
    }

    void populateData(int[] data, int idxlast) {
        this.data = data;
        this.idxlast = idxlast;
    }
    void add(int data) {
        if (size == this.data.length) {
            tambahkapasitas();
        }
        idxlast++;
        this.data[idxlast] = data;
        size++;
    }

    void tambahkapasitas() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    void traverseInOrder(int idxstart) {
        if (idxstart <= idxlast && data[idxstart] != 0) {
            traverseInOrder(2 * idxstart + 1);
            System.out.print(data[idxstart] + " ");
            traverseInOrder(2 * idxstart + 2);
        }
    }
    void traversePreOrder() {
        traversePreOrder(0);
    }

    void traversePreOrder(int idx) {
        if (idx <= idxlast && data[idx] != 0) {
            System.out.print(data[idx] + " ");
            traversePreOrder(2 * idx + 1);
            traversePreOrder(2 * idx + 2);
        }
    }

    void traversePostOrder() {
        traversePostOrder(0);
    }

    void traversePostOrder(int idx) {
        if (idx <= idxlast && data[idx] != 0) {
            traversePostOrder(2 * idx + 1);
            traversePostOrder(2 * idx + 2);
            System.out.print(data[idx] + " ");
        }
    }
    
    
}
