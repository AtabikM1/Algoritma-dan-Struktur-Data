package Pertemuan6;

public class main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa06 m1 = new Mahasiswa06("Nusa", 2017, 25, 3);
        Mahasiswa06 m2 = new Mahasiswa06("Rara", 2012, 19, 4);
        Mahasiswa06 m3 = new Mahasiswa06("Dompu", 2018, 19, 3.5);
        Mahasiswa06 m4 = new Mahasiswa06("Abdul", 2017, 23, 2);
        Mahasiswa06 m5 = new Mahasiswa06("Ummi", 2019, 23, 3.75);
        //DaftarMahasiswaBerprestasi.tambah(new Mahasiswa("wokoko", 34, 45, 5.6));
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("data mahasiswa sebelum sorting = ");
        list.tampil();
        System.out.println("data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubblesort();
        list.tampil();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionsort();
        list.tampil();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionsort();
        list.tampil();
    }
}
