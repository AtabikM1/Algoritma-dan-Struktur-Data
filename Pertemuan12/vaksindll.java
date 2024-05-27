package Pertemuan12;

public class vaksindll {
    Nodevaksin head;
    int size, max;

    vaksindll(int n) {
        max = n;
        size = 0;
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return size == max;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("masih kosong antrian linked list");
        } else {
            Nodevaksin tmp = head;
            System.out.println("no " +  " Nama " );
            while (tmp != null) {
                System.out.println(tmp.antrian +"   " + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println(" ");
            System.out.println("sisa antrian = " + (max-size));
        }
    }

    void enqueuedll(int antrian, String nama) {
        if (isFull()) {
            System.out.println("sudah penuh antriannya");
        } else {
            Nodevaksin newNode = new Nodevaksin(antrian, nama);
            if (isEmpty()) {
                head = newNode;
            } else {
                Nodevaksin current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.prev = current;
            }
            size++;
        }
    }

    void dequeuedll(){
        if(isEmpty()){
            System.out.print("linked list masih kosong");
        }else{
            String telahvaksin = head.nama;
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            size--;
            System.out.println(telahvaksin + " telah divaksinasi");
        }
    }
}
