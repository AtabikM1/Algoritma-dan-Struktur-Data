package Pertemuan7;

public class mergesortMain06 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("sorting dengan merge  sort");   
        mergeSort msort = new mergeSort();
        System.out.println("data awal");
        msort.printarray(data);
        msort.mergeSorting(data);
        System.out.println("setelah diurutkan");
        msort.printarray(data);

    }
    
}
