package UTS;

public class pengurutan06 {
    int[] data;


    public pengurutan06(int[] data){
        this.data = data;
    }

    public void selectionsorta(){
        int panjangdata = data.length;

        for (int i = 0; i < panjangdata - 1; i++){
            int minimumindeks = i;//menemukan elemen indeks supaya mendapat nilai minimum
            for(int j = i + 1; j < panjangdata; j++){
                if( data[j] < data[minimumindeks]){//ascending
                    minimumindeks = j;
                }

            }
            if (minimumindeks != i){
                int temp = data[minimumindeks];
                data[minimumindeks] = data[i];
                data[i] = temp;
            }
            
        }
    }
    public void selectionsortd(){
        int panjangdata = data.length;

        for (int i = 0; i < panjangdata - 1; i++){
            int maksimumindeks = i;//menemukan elemen indeks supaya mendapat nilai minimum
            for(int j = i + 1; j < panjangdata; j++){
                if( data[j] > data[maksimumindeks]){//descending
                    maksimumindeks = j;
                }

            }
            if (maksimumindeks != i){
                int temp = data[maksimumindeks];
                data[maksimumindeks] = data[i];
                data[i] = temp;
            }
            
        }

    }
    public int findBinarySearch(int cari, int kiri, int kanan) {
        if (kanan >= kiri) {
            int mid = kiri + (kanan - kiri) / 2;

            if (data[mid] == cari) {
                return mid;
            }

            if (data[mid] > cari) {
                return findBinarySearch(cari, kiri, mid - 1);
            }

            return findBinarySearch(cari, mid + 1, kanan);
        }
        return -1; // nilai tidak dapat di temukan 
    }
    //modifikasi  method find binary versi descending karena find binary pada dasarnya hanya melakukan ppencarian menggunakan engurutan ascending
    public int findBinarySearchDescending(int cari, int kiri, int kanan) {
        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;
            if (cari == data[tengah]) {
                return tengah;
            } else if (cari > data[tengah]) {
                kanan = tengah - 1;
            } else {
                kiri = tengah + 1;
            }
        }
        return -1 ;
    }

}

