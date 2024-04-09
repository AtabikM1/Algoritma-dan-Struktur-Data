package Pertemuan6;

public class MainHotel06 {
    public static void main(String[] args) {
        HotelServis hotelservis = new HotelServis();
        Hotel h1 = new Hotel("valhalla", "surabaya", 200, (byte)5);
        Hotel h2 = new Hotel("jw marriot", "surabaya", 400, (byte)1);
        Hotel h3 = new Hotel("aston", "surabaya", 700, (byte)3);
        Hotel h4 = new Hotel("empire", "surabaya", 3400, (byte)4);
        Hotel h5 = new Hotel("grand impala", "surabaya", 100, (byte)5);
        hotelservis.tambah(h1);
        hotelservis.tambah(h2);
        hotelservis.tambah(h3);
        hotelservis.tambah(h4);
        hotelservis.tambah(h5);

        System.out.println("data hotel sebelum sorting =");
        hotelservis.tampilAll();

        System.out.println("Sorting dengan buble sort");
        hotelservis.bubblesort();
        hotelservis.tampilAll();

        System.out.println("sorting dengan selection sort");
        hotelservis.selectionsort();
        hotelservis.tampilAll();
    }
}
