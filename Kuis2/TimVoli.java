package Kuis2;

public class TimVoli {
    String nama;
    int menang;
    int kalah;
    int poin;

    public TimVoli(String nama) {
        this.nama = nama;
        kalah = 0;
        menang = 0;
        poin = 0;
    }

    public void menang(int tambahanPoin) {
        menang++;
        poin += tambahanPoin;
    }

    public void kalah(int tambahanPoin) {
        kalah++;
        poin += tambahanPoin;
    }
}
