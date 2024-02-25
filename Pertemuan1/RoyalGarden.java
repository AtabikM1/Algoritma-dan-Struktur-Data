package Pertemuan1;
import java.util.HashMap;
import java.util.Map;

public class RoyalGarden {

    // Rincian Harga Bunga
    private static final int HARGA_AGLONEMA = 75000;
    private static final int HARGA_KELADI = 50000;
    private static final int HARGA_ALOCASIA = 60000;
    private static final int HARGA_MAWAR = 10000;

    // Daftar nama bunga
    private static final String[] NAMA_BUNGA = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    // Data penjualan bunga
    private int[][] penjualan;

    // Konstruktor untuk RoyalGarden
    public RoyalGarden(int[][] penjualan) {
        this.penjualan = penjualan;
    }

    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
    public void tampilkanPendapatan() {
        for (int i = 0; i < penjualan.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 1; j < penjualan[i].length; j++) {
                pendapatanCabang += penjualan[i][j] * getHargaBunga(j - 1);
            }
            System.out.println("Pendapatan Cabang " + penjualan[i][0] + ": " + pendapatanCabang);
        }
    }

    // Fungsi untuk mendapatkan jumlah stock setiap jenis bunga pada cabang RoyalGarden
    public void tampilkanJumlahStock() {
        Map<String, Integer> jumlahStock = new HashMap<>();

        for (int j = 1; j < penjualan[0].length; j++) {
            int totalStock = 0;
            for (int i = 0; i < penjualan.length; i++) {
                totalStock += penjualan[i][j];
            }
            jumlahStock.put(NAMA_BUNGA[j - 1], totalStock);
        }

        System.out.println("Jumlah Stock pada Cabang RoyalGarden 4:");
        for (Map.Entry<String, Integer> entry : jumlahStock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Fungsi untuk mengurangi stock karena bunga mati
    public void kurangiStockMati() {
        // Rincian pengurangan stock karena bunga mati
        int[] penguranganStock = {-1, -2, 0, -5};

        for (int j = 1; j < penjualan[0].length; j++) {
            for (int i = 0; i < penjualan.length; i++) {
                penjualan[i][j] += penguranganStock[j - 1];
            }
        }
    }

    // Fungsi untuk mendapatkan harga bunga berdasarkan indeks
    private int getHargaBunga(int indeks) {
        switch (indeks) {
            case 0:
                return HARGA_AGLONEMA;
            case 1:
                return HARGA_KELADI;
            case 2:
                return HARGA_ALOCASIA;
            case 3:
                return HARGA_MAWAR;
            default:
                return 0;
        }
    }
        // Fungsi untuk mendapatkan jumlah stock setiap jenis bunga pada cabang RoyalGarden 4
    public void tampilkanJumlahStockCabang4() {
        Map<String, Integer> jumlahStock = new HashMap<>();

        int cabangKe = 4;

        for (int j = 1; j < penjualan[cabangKe - 1].length; j++) {
            int totalStock = penjualan[cabangKe - 1][j];
            jumlahStock.put(NAMA_BUNGA[j - 1], totalStock);
        }

        System.out.println("Jumlah Stock pada Cabang RoyalGarden " + cabangKe + ":");
        for (Map.Entry<String, Integer> entry : jumlahStock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        int[][] penjualan = {
                {1, 10, 5, 15, 7},
                {2, 6, 11, 9, 12},
                {3, 2, 10, 10, 5},
                {4, 5, 7, 12, 9}
        };

        RoyalGarden royalGarden = new RoyalGarden(penjualan);

        // Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        royalGarden.tampilkanPendapatan();

        // Menampilkan jumlah stock setiap jenis bunga pada cabang RoyalGarden 4
        royalGarden.tampilkanJumlahStockCabang4();

        // Mengurangi stock karena bunga mati
        royalGarden.kurangiStockMati();

        // Menampilkan jumlah stock setiap jenis bunga setelah pengurangan stock
        royalGarden.tampilkanJumlahStockCabang4();
    }
}

