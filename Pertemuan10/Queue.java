package Pertemuan10;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    Queue(int n){
        max = n;
        data = new int[max];
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

    void peek(){//method untuk menampilkan elemen queue pada posisi paling depan
        if(!isEmpty()){
            System.out.println("elemen terdepan: " + data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    void print(){//menampilkan seluruh elemen pada queue dari posisi depan sampai dengan belakang
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("jumlah elemen = " + size);
        }
    }

    void clear(){//untuk menghappus semua elemen pada queue
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    void Enqueue(int dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
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
            data[rear] = dt;
            size++;
        }
    }

    int dequeue(){//mengeluarkan data pada queue di posisi belakang
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            dt = data[front];
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
        return dt;
    }
}