package Pertemuan10;
import java.util.Scanner;
public class QueueMain {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan kapasitas queue:");
        int n = sc.nextInt();
        int pilih;
        Queue Q = new Queue(n);
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("masukkan data baru: ");
                    int datamasuk = sc.nextInt();
                    Q.Enqueue(datamasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if(dataKeluar != 0){
                        System.out.println("data yang dikeluarkan = " + dataKeluar);
                        break;
                    }
                case 3: 
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }

        }while(pilih == 1|| pilih ==2|| pilih ==3 || pilih == 4|| pilih == 5);
    }

    static void menu(){
        System.out.println("masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------");
    }

}
