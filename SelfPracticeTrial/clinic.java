package SelfPracticeTrial;

import java.util.ArrayList;
import java.util.List;

public class clinic {
    List<pet> pets;
    List<veterinarian> veterinarians;
    List<appointment> appointments;
    List<owner> owners;

    clinic(){
        this.pets = new ArrayList<>();
        this.veterinarians = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    //method menambah hewan peliharaan ke klinik
    void addpet(pet peto){
        pets.add(peto);
    }

    //method menghapus hewan peliharaan dari klinik
    void removepet(pet peto){
        pets.remove(peto);
    }

    //method menambah owner
    void addowner(owner ownero){
        owners.add(ownero);
    }

    //menambahkan dokter hewan ke klinik
    void addveteranian(veterinarian dokterhewan) {
        veterinarians.add(dokterhewan);
    }

    //menghapus dokter hewan ke klinik
    void removeveteranian(veterinarian dokterhewan){
        veterinarians.remove(dokterhewan);
    }
    // mendapatkan semua daftar hewan di klinik
    List<pet> getAllpet(){
        return new ArrayList<>(pets);
    }
    // mendapatkan semua daftar dokter di klinik
    List<veterinarian> getAllDoc(){
        return new ArrayList<>(veterinarians);
    }
    // menemukan hewan berdasarkan nama
    pet findpetbyname(String name){
        for (pet peto : pets){
            if(peto.getNama().equals(name)){
                return peto;
            }
        }
        return null;
    }

    veterinarian findVeterinarianbbyname(String nama){
        for (veterinarian dokterhewan : veterinarians){
            if(dokterhewan.getNama().equals(nama)){
                return dokterhewan;
            }
        }
        return null;
    }
    List<appointment> gAppointments(String data){
        List<appointment>result = new ArrayList<>();
        for (appointment app : appointments){
            if(app.getTanggal().equals(data)){
                result.add(app);
            }
        }
        return result;
    }
    void Scheduleappoinment (appointment appointment){
        appointments.add(appointment);
    }

}
