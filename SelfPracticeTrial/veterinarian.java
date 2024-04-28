package SelfPracticeTrial;

public class veterinarian {
    String nama;
    String spesialisasi;
    int jadwal;
    
    veterinarian(String nama, String spesialisasi, int jadwal){
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.jadwal = jadwal;
    }
    public String getNama() {
        return nama;
    }
}
