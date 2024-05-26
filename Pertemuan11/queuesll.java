package Pertemuan11;


public class queuesll {
    int [] data;
    nodequeue head, tail;
    int size, max;
    
    queuesll(int n){
        max = n;
        data = new int[max];
        size = 0;
        head = tail;
    }
    boolean isEmpty(){
        return head == null;
    }

    boolean isFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("linked list masih kosong");
        }else{
            nodequeue tmp = head;
            System.out.println("isi dalam linked list masih kosong");
            while(tmp != null){
                System.out.println(tmp.nim + "\t" +tmp.nama);
                tmp = tmp.next;
            }
            System.out.println(" ");
        }
    }

    void Enqueuesll(int nim, String nama){
        if(isFull()){
            System.out.println("queue linked list sudah penuh");
        }else{
            nodequeue newNode= new nodequeue(nim, nama);
            if(isEmpty()){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            size++;
            
        }
    }
    
    void dequeuesll(){
        if(isEmpty()){
            System.out.println("masih kosong");
        }else if(head == null){
            head = head.next;
            tail = null;
        }
        size--;
    }
}