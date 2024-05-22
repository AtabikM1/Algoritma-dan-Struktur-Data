package Pertemuan11;

public class Nodemahasiswa {
    int nim;
    Nodemahasiswa next;
    String nama;

    Nodemahasiswa(){

    }
    Nodemahasiswa(int nim, String nama, Nodemahasiswa next){
        this.nim = nim;
        this.nama = nama;
        this.next = next;
    }
}
