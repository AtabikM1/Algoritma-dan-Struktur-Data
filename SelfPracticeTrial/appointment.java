package SelfPracticeTrial;

public class appointment {
    String tanggal;
    int waktu;
    veterinarian veterinarian;
    pet pet;
    appointment(String tanggal, int waktu, veterinarian veterinarian){
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.veterinarian = veterinarian;
    }
   
    public veterinarian getVeterinarian() {
        return veterinarian;
    }
    public String getTanggal() {
        return tanggal;
    }
    public int getWaktu() {
        return waktu;
    }
    pet getpPet(){
        return pet;
    }

}
