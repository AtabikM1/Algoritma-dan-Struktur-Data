package Pertemuan12;

public class filmdll {
    nodefilm head;
    int size;

    filmdll(){
        head = null;
        size = 0;
    }

    boolean isEmpty(){
        return head == null;
    }

    // boolean isFull(){

    // }\

    void addfirst(int id, String judul, float rating){
        if(isEmpty()){
            head = new nodefilm(null, id, judul, rating, null);
        }else{
            nodefilm newNode = new nodefilm(null, id, judul, rating, null);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int id, String judul, float rating){
        if(isEmpty()){
            addfirst(id, judul, rating);
        }else{
            nodefilm current= head;
            while (current.next != null) {
                current = current.next;
            }
            nodefilm newNode = new nodefilm(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    void addtertentu(int id, String judul, float rating, int index){
        if(isEmpty()){
            addfirst(id, judul, rating);
        }else if(index < 0|| index >size){
            System.out.println("nilai indeks di luar batas");
        }else{
            nodefilm current = head;
            int i = 0; 
            while (i < index) { //iterasi ini akan terus berjalan dimulai dari 0 sampai indeks yang ditentukan
                current = current.next;//sampai current yang sebelumnya adalah head, berubah di posisi sesuai indeks yang diinginkan
                i++;//referensi dari double linked list pada praktikal
            }
            if (current == null) {//kondisi saat current belum terisi
                addLast(id, judul, rating);
            }else if(current.prev == null){//current sebelumnya bbelum terisi
                nodefilm newNode = new nodefilm(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            }else{
                nodefilm newNode = new nodefilm(current.prev, id, judul, rating, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    void removefirst(){
        if(isEmpty()){
            System.out.println("linked list masih kosong");
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    void removelast(){
        if(isEmpty()){
            System.out.println("linked list masih kosong");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        nodefilm current = head;
        while (current.next.next!=null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void remove(int index){
        if (isEmpty() || index >= size || index < 0) {
            System.out.println("nilai indeks melebihi batas");
        }else if(index == 0){
            removefirst();
        }else{
            nodefilm current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            //setelah loop ini, posisi current adalah node yang akan di hapus sesuai indeks
            if(current.next == null){
                current.prev.next = null;

            }else if(current.prev == null){
                head = current.next;
                head.prev = null;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;

        }
    }



    void cetak(){
        if (isEmpty()) {
            System.out.println("film masih kosong");
        }else{
            nodefilm tmp = head;
            while (tmp != null) {
                System.out.println("Id = " +tmp.id);
                System.out.println("judul = "+ tmp.judul);
                System.out.println("rating = "+ tmp.rating);
                tmp = tmp.next;
            }
        }
    }
    void sortingFilm() {
        if (head == null || head.next == null) {
            return;
        }
        
        boolean swapped;
        do {
            swapped = false;
            nodefilm current = head;
            nodefilm prev = null;
            while (current.next != null) {
                if (current.rating > current.next.rating) {
                    // Swap nodes
                    nodefilm temp = current.next;
                    current.next = temp.next;
                    temp.next = current;
                    if (prev == null) {
                        head = temp;
                    } else {
                        prev.next = temp;
                    }
                    swapped = true;
                }
                prev = current;
                current = current.next;
            }
        } while (swapped);
    }

    nodefilm carifilm(int cari){
        
        int index= 0;
        nodefilm current = head;
        
        while (current != null) {
            if(current.id == cari){
                System.out.println("data id film = " + cari + " berada di node ke-" + index);
                
                return current;
            }
            current.next = current;
            index++;
        }
        return null;
        
    }
}
