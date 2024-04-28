package SelfPracticeTrial;

public class owner {
    String nama;
    String alamat;
    int nomortelepon;
    owner(String nama, String alamat,int nomortelp){
        this.nama = nama;
        this.alamat = alamat;
        nomortelp = nomortelepon;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNama() {
        return nama;
    }
    public int getNomortelepon() {
        return nomortelepon;
    }
    
}
