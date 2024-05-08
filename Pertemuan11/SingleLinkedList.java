package Pertemuan11;

public class SingleLinkedList {
    Node head, tail;
    boolean isEmpty(){//kondisi headnya harus berisi null
        return head == null;

    }

    void print(){//tidak membolehkan list dalam keadaan kosong
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("isi linked list ");
            while(tmp != null){
                System.out.print(tmp.data + " \t");
                tmp = tmp.next;
            }
            System.out.println(" ");
        }else{
            System.out.println("Linked List kosong");
        }
    }

    void addfirst(int input){
        //node baru yang ditambahkan berisi data melalui parameter 
        //pada method addfirst
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            //jika kosong, maka peran head dan tail
            //harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
            // ndInput.next = head;
            // head = ndInput;
        }else{
            // head = ndInput;
            // tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addlast(int input){
        //node baru yang ditambahkan berisi data melalui
        //pada mehtod addlast
        Node ndInput = new Node(input, null);
        if(isEmpty()){//jika kosong, maka peran head dan tail
                //harus memiliki node yang sama
                head = ndInput;
                tail = ndInput;
            }else{
                tail.next =  ndInput;
                tail = ndInput;
        }
    }

    void insertAfter(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){//jika tidak ada node selanjutnya
                    tail = ndInput;//maka jadikan ndInput sebagai tail
                    break;   //
                }
            }
            temp = temp.next;
        }while(temp != null);
    }

    void insertAt(int index, int input){
        //pastikan opperasi dari method ini adalah menggeser posisi
        //node yang terletak di indeks dan node tersebut berpindah
        //satu indeks setelahnya 
        // Node ndInput= new Node(input, null);
        if(index < 0){
            System.out.println("perbaiki logikanya ! kalau indeks nya -1 bagaimana???");
        }else if(index == 0){
            addfirst(input);
        }else{
            Node temp = head;
            for(int i =0; i< index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null){
                tail=temp.next;
            }
        }
    }

    int getData(int index){
        Node tmp = head;
        for(int i=0; i<index-1;i++){
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexof(int key){
        Node tmp = head;
        int index= 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if(tmp != null){
            return 1;
        }else{
            return index;
        }
    }
    

    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong,"
                    + "tidak dapat dihapus");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong,"
                    + "tidak dapat dihapus");
        } else if (head != tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong,"
                    + "tidak dapat dihapus ");
        } else {
            Node temp = head;
            while (temp!=null) {
                if(temp.data != key && temp==head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if(temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
