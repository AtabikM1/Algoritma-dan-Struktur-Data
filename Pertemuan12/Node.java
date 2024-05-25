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
