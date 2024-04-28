package SelfPracticeTrial;

public class karyawan {
    String jabatan;
    String nama;
    int gaji;
    
    karyawan(String nama, String jabatan, int gaji){
        this.gaji = gaji;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gaji;
    }
    public String getJabatan() {
        return jabatan;
    }
    public String getNama() {
        return nama;
    }
    
}
