package SelfPracticeTrial;

public class pet {
    String nama;
    String jenis;
    int usia;
    owner owner;
    pet pet;
    pet(String nama, String jenis, int usia, owner owner){
        this.nama = nama;
        this.jenis = jenis;
        this.usia = usia;
        this.owner = owner;
    }

    public String getJenis() {
        return jenis;
    }
    public String getNama() {
        return nama;
    }
    public owner getowner() {
        return owner;
    }
    public int getUsia() {
        return usia;
    }


}
