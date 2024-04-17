package UTS;

public class main {
    //data array
    public static void main(String[] args) {
        int[] atabik = {26, 43, 47, 50, 0, 36, 50, 43, 38, 31, 38, 31, 38, 50, 2, 0, 31, 10, 23};
        
        pengurutan06 atabikm = new pengurutan06(atabik);
        //nilai yang dapat ditemukan(sebelum pengurutan)
        int index = atabikm.findBinarySearch(0, 0, atabik.length-1);
        System.out.println("indeks dari 26 = " + index);
        
        atabikm.selectionsorta();//pengurutan ascending
        for (int i = 0; i < atabik.length; i++){
            System.out.print(atabik[i]+ " ");
        }
        System.out.println();
        //nilai yang dapat ditemukan setelah ascending
        int index1 = atabikm.findBinarySearch(50, 0, atabik.length-1);
        System.out.println("indeks dari 50 = " + index1);

        
        
        atabikm.selectionsortd();
        for (int i = 0; i < atabik.length; i++){
            System.out.print(atabik[i]+ " ");
        }
        System.out.println();
        //nilai yang dapat ditemukan setelah descending
        int index2 = atabikm.findBinarySearchDescending(23, 0, atabik.length-1);
        System.out.println("indeks dari 23 = " + index2);

        int index3 = atabikm.findBinarySearchDescending(13, 0, atabik.length-1);
        System.out.println("indeks dari 13 = " + index3);
    }
     


}
