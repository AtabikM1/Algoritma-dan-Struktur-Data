package Pertemuan11;

public class mahasiswasll {

    Nodemahasiswa head, tail;
    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(!isEmpty()){
            Nodemahasiswa tmp = head;
            System.out.println("isi dalam linked list kosong");
            while (tmp != null) {
                System.out.println(tmp.nim + " \t" + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println(" ");
        }else{
            System.out.println("linked list masih kosong");
        }

        
    }
    void addfirst(int input, String nama){
        Nodemahasiswa ndinput = new Nodemahasiswa(input, nama, null);
        if(isEmpty()){
            head = ndinput;
            tail = ndinput;
        }else{
            ndinput.next = head;
            head = ndinput;
        }
    }

    void addlast(int input, String nama){
        Nodemahasiswa ndinput = new Nodemahasiswa(input, nama, null);
        if(isEmpty()){
            head = ndinput;
            tail = ndinput;
        }else{
            tail.next = ndinput;
            tail = ndinput;
        }
    }

    void insertAfter(int key, int input, String nama){
        Nodemahasiswa ndinput = new Nodemahasiswa(input, nama, null );
        Nodemahasiswa temp = head;
        do{
            if(temp.nim == key){
                ndinput.next = temp.next;
                temp.next = ndinput;
                if(ndinput.next == null){
                    tail = ndinput;
                    break;
                }
            }
            
            temp = temp.next;
        }
        while (temp!= null);

    }

    void insertAt (int index, int input, String nama){
        if(index<0){
            System.out.println("perbaiki logikanya");
        }else if (index == 0){
            addfirst(input, nama);
        }else{
            Nodemahasiswa temp = head;
            for(int i = 0; i< index-1; i++){
                temp = temp.next;
            }
            temp.next = new Nodemahasiswa(input, nama, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
        
    }
}