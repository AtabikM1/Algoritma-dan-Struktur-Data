package SelfPracticeTrial;
import java.util.Scanner;
public class svm {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int x =0;
        int y =0;
        for (int i =0; i <11; i++){//mengurutkan
            System.out.print(i + " ");
        }
        for (int i =45; i>4; i--){
            System.out.print(i+" ");
        }

        for (int i =0; i <101; i++){//menjumlahkan
           
           x+=i;
        }
        System.out.println(x);

        for (int i =0; i <101; i++){//menjumlahkan
           if(i%2 ==0){
               y+=i;
           }
        }
        System.out.println(y);

        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka = ");
        int input = sc.nextInt();
        for(int i = 0; i < 11; i++){
            System.out.println("hasil perkalian dari "+input+" X "+ i + " = " + input*i);
        }

        System.out.println("masukkan deret angka = ");
        int inpat = sc.nextInt();
        for(int i=0; i <= inpat; i++){
            System.out.println(fibonacci(i) + " ");
        }



    }


}
