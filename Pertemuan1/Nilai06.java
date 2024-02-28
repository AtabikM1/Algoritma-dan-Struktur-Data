package Pertemuan1;

import java.util.Scanner;

public class Nilai06 {
    public static void main(String[] args) {
        int NilaiTugas, NilaKuis, NilaiUAS, NilaiUTS;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Masukkan Nilai Tugas : ");
             NilaiTugas = sc.nextInt();
            if(NilaiTugas > 100 || NilaiTugas < 0){
                System.out.println("invalid input");
            }else{
                break;
            }
        }
        while (true) {
            System.out.println("Masukkan Nilai Kuis : ");
             NilaKuis = sc.nextInt();
            if (NilaKuis > 100 || NilaKuis < 0){
                System.out.println("invalid input");
            }else{
                break;
            }
        }
        while (true) {
            System.out.println("Masukkan Nilai UTS : ");
             NilaiUTS = sc.nextInt();
            if (NilaiUTS > 100 || NilaiUTS < 0){
                System.out.println("nilai invalid");
            }else{
                break;
            }
        }
        while (true) {
            System.out.println("Masukkan Nilai UAS : ");
             NilaiUAS = sc.nextInt();
            if (NilaiUAS < 0 || NilaiUAS > 100){
                System.out.println("invalid nilai");    
            }else{
                break;
            }
        }
        System.out.println("nilai Tugas = "+ NilaiTugas);
        System.out.println("nilai kuis = "+ NilaKuis);
        System.out.println("nilai UTS = " + NilaiUTS);
        System.out.println("nilai UAS = " + NilaiUAS);
        double nilaiakhir = (NilaiTugas * 0.2)  + (NilaKuis * 0.2) + (NilaiUAS * 0.3) + (NilaiUTS * 0.3);
        System.out.println("nilai akhir = " + nilaiakhir);
        if (80 < nilaiakhir && nilaiakhir <= 100){
            System.out.println("nilai huruf = A");
        }else if (73 < nilaiakhir && nilaiakhir <= 80){
            System.out.println("nilai huruf = B+");
        }else if (65 < nilaiakhir && nilaiakhir <= 73){
            System.out.println("nilai huruf = B");
        }else if (60 < nilaiakhir && nilaiakhir <= 65){
            System.out.println("nilai huruf = C+");
        }else if (50 < nilaiakhir && nilaiakhir <= 60){
            System.out.println("nilai huruf = C");
        }else if (39 < nilaiakhir && nilaiakhir <= 50){
            System.out.println("nilai huruf = D");
        }else if (nilaiakhir <= 39){
            System.out.println("nilai huruf = E");
        }

        if(nilaiakhir <= 50){
            System.out.println("Anda Tidak Lulus");
        }else{
            System.out.println("Selamat Anda Lulus");
        }
        
    }

}
