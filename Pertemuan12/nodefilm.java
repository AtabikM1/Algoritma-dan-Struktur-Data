package Pertemuan12;

public class nodefilm {
    int id;
    String judul;
    float rating;
    nodefilm prev, next;
    nodefilm(nodefilm prev, int id, String judul, float rating, nodefilm next ){
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
        this.prev = prev;
    }
}
