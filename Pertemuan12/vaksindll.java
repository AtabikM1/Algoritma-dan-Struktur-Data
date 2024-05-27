package Pertemuan12;

public class vaksindll {
    int [] data;
    Nodevaksin head, tail;
    int size, max;

    vaksindll(int n){
        max = n;
        data = new int[max];
        size = 0;
        head = tail;
    }

    boolean isEmpty(){
        return head == null;
    }

    boolean isFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("masih kosong antrian linked list");
        }else{
            Nodevaksin tmp = head;
            while (tmp!=null) {
                System.out.println("antrian no = "+  " Nama =");
                System.out.println(tmp.antrian+"\t"+ tmp.nama);
            }
            System.out.println(" ");
        }
    }
}
