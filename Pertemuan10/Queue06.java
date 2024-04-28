package Pertemuan10;

public class Queue06{
    pembeli06 [] antrian ;
    int front;
    int rear;
    int size;
    int max;

    Queue06(int n){
        max = n;
        antrian = new pembeli06[max];
        size = 0;
        front = rear = -1;

    }

    boolean isEmpty(){
        if(size == 0){
            return true;

        }else{
            return false;
        }
    }
    boolean isFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    void Enqueue(pembeli06 antrianbaru){
        if (isFull()){
            System.out.println("antrian sudah penuh");
        }else{
            if(isEmpty()){
                front = rear = 0;
            }else{
                if(rear == max -1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            antrian[rear] = antrianbaru;
            size++;
        }
    }
    pembeli06 dequeue(){
        pembeli06 antrianbaru = new pembeli06();
        if (isEmpty()){
            System.out.println("queue masih kosong");
        }else{
            antrianbaru = antrian[front];
            size--;
            if(isEmpty()){
                front = rear = -1;

            }else{
                if(front == max -1){
                    front = 0;
                }else{
                    rear++;
                }
            }
        }
        return antrianbaru;
    }

    void print(){
        if(isEmpty()){
            System.out.println("antrian masih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " "+ antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama+ " "+ antrian[i].noHP);
            System.out.println("jumlah elemen = " + size);
        }
    }

    void peek(){
        if(!isEmpty()){
            System.out.println("antrian terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        }else{
            System.out.println("antrian masih kosong");
        }

    }

    void peekrear(){
        if(isEmpty()){
            System.out.println("antrian masih kosong!");
        }else{
            System.out.println("antrian paling belakang : "+  antrian[rear].nama + " "+ antrian[rear].noHP);
        }
    }

    void peekposition(String nama){
        int count = size;
        int indeks = front;
        int posisi = 1;
        while(count > 0){
            if(antrian[indeks].nama.equals(nama)){
                System.out.println(nama + " berada pada antrian ke " + posisi);
            }
        }
    }

    void dartarpembembeli(){
        if(isEmpty()){
            System.out.println("antrian masih kosong");
        }else{
            System.out.println("daftar pembeli dalam antrian : ");
            print();
        }

    }

}   

