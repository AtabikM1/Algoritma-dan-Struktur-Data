package Pertemuan10;
import java.util.Scanner;
public class Mainbank {
    static void menu(){
        System.out.println("pilih menu = ");
        System.out.println("1. Atrian baru");
        System.out.println("2. Atrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Antrian paling belakang");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        QueueBank antri = new QueueBank(jumlah);
        do{
            menu();
             pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening = ");
                    String norek = sc.nextLine();
                    System.out.print("Nama = ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat = ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur = ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo = ");
                    double saldo = sc.nextDouble();
                    Nasabah06 nb = new Nasabah06(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2 : 
                    Nasabah06 data = antri.dequeue();
                    if (!data.norek.equals("") && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                        System.out.println("antrian yang keluar = " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3 : 
                    antri.peek();
                    break;
                case 4 :
                    antri.print();
                    break;
                case 5 : 
                    antri.peekrear();
                default:
                    break;
            }
        }while(pilih ==1 || pilih ==2 || pilih ==3 || pilih ==4 || pilih == 5);
    }
}
