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