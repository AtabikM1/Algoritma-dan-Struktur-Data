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
}
