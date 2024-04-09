package Pertemuan7;

public class mergeSort06 {
    public void mergeSorting(int[] data){
        sort(data, 0, data.length - 1);
    }
    // public mergeSort(int[] data){
    // }
        void merge(int data[], int left, int middle, int right){
            int[] temp = new int[data.length];
            for (int i = left; i<= right; i++){
                temp[i] = data[i];
            }
            int a = left;
            int b = middle + 1;
            int c = left;
        
            while (a <= middle && b <= right) {
                if (temp[a] <= temp[b]){
                    data[c] = temp[a];
                    a++;
                } else {
                    data[c] = temp[b];
                    b++;
                }
                c++;
            }
            
            // Menyalin sisa elemen dari sub-array kiri jika masih ada.
            while (a <= middle) {
                data[c] = temp[a];
                a++;
                c++;
            }
            
            // Menyalin sisa elemen dari sub-array kanan jika masih ada
            while (b <= right) {
                data[c] = temp[b];
                b++;
                c++;
            }
        }

        void sort(int data[], int left, int right){
            if(left < right){
                int middle = (left + right)/2;
                sort(data, left, middle);
                sort(data, middle + 1, right);
                merge(data, left, middle, right);
            }
        }

        void printarray (int arr[]){
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }
    
}
