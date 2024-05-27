package Pertemuan12;

public class Nodevaksin {
    int antrian;
    Nodevaksin prev, next;
    String nama;
    Nodevaksin(Nodevaksin prev,Nodevaksin next  ,int antrian, String nama){
        this.prev= prev;
        this.next = next;
        this.antrian = antrian;
    }
}
