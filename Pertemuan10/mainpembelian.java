package Pertemuan10;

public class mainpembelian {
    public static void main(String[] args) {
        Queue06 antrian = new Queue06(7);

        antrian.Enqueue(new pembeli06("antono", 1356549));
        antrian.Enqueue(new pembeli06("xusko", 1568549));
        antrian.Enqueue(new pembeli06("jumi", 1356859));
        
        

        antrian.print();
        antrian.dartarpembembeli();
    }
}
