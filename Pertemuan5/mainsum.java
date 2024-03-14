package Pertemuan5;
import java.util.Scanner;
public class mainsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("==================================");
        System.out.println("program menghitung keuntungan total (satuan juta. misal 5.9)");
        System.out.print("masukkan jumlah bulan :");
        int elm = sc.nextInt();

        sum sm = new sum(elm);
        System.out.println("==================================");
        for(int i =0; i < sm.elemen; i++){
            System.out.print("masukkan untung bulan ke "+(i + 1)+ " = ");
            sm.keuntungan[i] = sc.nextDouble();

        }

        System.out.println("=====================================");
        System.out.println("algoritma bruto force");
        System.out.println("total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah = "+ sm.totalBF(sm.keuntungan));
        System.out.println("=====================================");
        System.out.println("algoritma divide conquer");
        System.out.println("total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
