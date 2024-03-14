package Pertemuan5;
import java.util.Scanner;
public class mainpangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.print("masukkan jumlah elemen yang dihitung = ");
        int elemen = sc.nextInt();

        pangkat[] png = new pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            png[i] = new pangkat();
            System.out.print("masukkan nilai yang hendak dipangkatkan :");
            png[i].nilai = sc.nextInt();
            System.out.print("masukkan nilai pemangkat : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("hasil pangkat brute force");
        for (int i =0; i < elemen; i++){
            System.out.println("hasil dari "+ png[i].nilai+" pangkat "+ png[i].pangkat+" adalah "+ png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("hasil pangkat divide and conquer");
        for(int i = 0; i < elemen; i++){
            System.out.println("hasil dari "+ png[i].nilai+" pangkat "+png[i].pangkat+ " adalah "+ png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
