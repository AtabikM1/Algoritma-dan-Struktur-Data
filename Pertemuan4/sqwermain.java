package Pertemuan4;

public class sqwermain {
    public static void main(String[] args) {
        sqwer cindi[] = new sqwer[5];

        for (int i = 0; i < cindi.length; i++){
            cindi[i] = new sqwer(i);
            System.out.println("hasil = " + cindi[i].luas);
        }
        sqwer lantai = new sqwer(0);
        // lantai.input();
    }
}
