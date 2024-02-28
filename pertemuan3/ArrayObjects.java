package pertemuan3;

import java.util.Scanner;

public class ArrayObjects{
    public int panjang;
    public int lebar;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = sc.nextInt();

        // Inisialisasi array berdasarkan input panjangArray
        ArrayObjects[] ppArray = new ArrayObjects[panjangArray];
        //looping untuk menginput data
        for(int i = 0; i < panjangArray; i++){
            ppArray[i] = new ArrayObjects();
            System.out.println("masukkan persegi panjang ke " + (i + 1));
            System.out.println("masukkan panjang = ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("masukkan lebar ");
            ppArray[i].lebar = sc.nextInt();
        }

       for(int i = 0; i < panjangArray; i++){
        System.out.println("persegi panjang ke "+ i);
        System.out.println("panjang " + ppArray[i].panjang + " lebar = "+ ppArray[i].lebar);
       }
    }
}

