package SelfPracticeTrial;
import java.util.ArrayList;
import java.util.List;

public class mainpeternakan {
    //psvm dont forget
    public static void main(String[] args) {
        
        //bangun klinik
        clinic clinicabc = new clinic();
        //menambahkan dokter
        veterinarian veterinarian1 = new veterinarian("osigr", "osidf", 59);
        //menambahkan peliharaan
        owner owner2 = new owner("aiusdhai", "iaushd", 3289752);
        //menambahkan pemilik
        pet pet2 = new pet("oaiwd", "oeiwfj", 86, owner2);
        //membuat janji temu
        appointment appointment2 = new appointment("289345", 450, veterinarian1);

        //menambahkan hewan ke klinik. rumusnya adalah objek clinic.method menambah pet
        clinicabc.addpet(pet2);

        //membaut jadwal janji temu
        clinicabc.Scheduleappoinment(appointment2);
        clinicabc.addveteranian(veterinarian1);

        //akhir nih, tampilkan semua janji temu
        System.out.println("janji temu hari ini");
        List<appointment> appointments = clinicabc.gAppointments("fsdikf");
        for (appointment app : appointments){
            System.out.println("waktu : " + app.getWaktu() + " pet " + app.getpPet().getNama() + " dokter nya " + app.getVeterinarian().getNama());
        }


    }
}
