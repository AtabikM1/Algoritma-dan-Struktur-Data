package Pertemuan10;

public class QueueBank {
    Nasabah06 [] data;
    int front;
    int rear;
    int size;
    int max;

    QueueBank(int n){
        max = n;
        data = new Nasabah06[max];
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
            System.out.println("antrian terdepan: " + data[front].norek + " " + data[front].nama + " " + data[front].alamat + " "+ data[front].umur + " " + data[front].saldo );
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    void peekrear(){//method untuk menampilkan elemen queue pada posisi paling depan
        if(!isEmpty()){
            System.out.println("antrian paling belakang : " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat + " "+ data[rear].umur + " " + data[rear].saldo );
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
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " "+ data[i]. umur + " " + data[i].saldo );
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " "+ data[i]. umur + " " + data[i].saldo );
            System.out.println("jumlah elemen = " + size);
        }
    }

    void clear(){//untuk menghapus semua elemen pada queue
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    void Enqueue(Nasabah06 dt){
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

    Nasabah06 dequeue(){//mengeluarkan data pada queue di posisi belakang
        Nasabah06 dt = new Nasabah06();
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

