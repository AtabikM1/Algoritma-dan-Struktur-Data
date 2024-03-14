package Pertemuan5;

public class pangkat {
    public int nilai, pangkat;
    
    int pangkatBF(int a, int n){
        int hasil = 1; // Inisialisasi hasil ke 1
        for(int i = 0; i < n; i++){
            hasil *= a; // Melakukan operasi perkalian sebanyak n kali
        }
        return hasil;
    }
    
    int pangkatDC(int a, int n){
        if(n == 0){
            return 1;
        } else if(n % 2 == 0){
            int temp = pangkatDC(a, n/2);
            return temp * temp;
        } else {
            int temp = pangkatDC(a, n/2);
            return temp * temp * a;
        }
    }
}
