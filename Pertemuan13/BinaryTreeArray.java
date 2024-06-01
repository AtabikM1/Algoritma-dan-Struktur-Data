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
