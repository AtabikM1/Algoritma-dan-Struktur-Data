package Pertemuan8;

import java.util.Scanner;

public class postfixmain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        postfix06 post = new postfix06(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
