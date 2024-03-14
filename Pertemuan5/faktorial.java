package Pertemuan5;
import java.util.Scanner;

public class faktorial {
    
    public int nilai;
    
    int faktorialBF(int n){
        int fakto = 1;
        for (int i = 1; i <= n; i++){
            fakto = fakto * i; // Perubahan disini
        }
        return fakto;
    }
    
    int faktorialdc(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n * faktorialdc(n-1);
            return fakto;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------");
        System.out.print("Masukkan jumlah elemen = ");
        int jumlahElemen = sc.nextInt();

        faktorial[] fk = new faktorial[jumlahElemen];
        for (int i=0; i<jumlahElemen; i++){
            fk[i] = new faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            int nilai = sc.nextInt();
            fk[i].nilai = nilai; // Menyimpan nilai ke atribut nilai
        }

        System.out.println("Hasil - Brute Force");
        for (int i = 0; i < jumlahElemen; i++){
            System.out.println("Hasil penghitungan faktorial menggunakan brute force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        
        System.out.println("Hasil - Divide Conquer");
        for (int i = 0; i < jumlahElemen; i++){
            System.out.println("Hasil penghitungan faktorial menggunakan Divide Conquer adalah " + fk[i].faktorialdc(fk[i].nilai));
        }
    }
}
