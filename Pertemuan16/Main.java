package Pertemuan16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mahasiswa> mahasiswas = new ArrayList<>();

        void tambah(Mahasiswa... mahasiswa){
            mahasiswas.addAll(Array.asList(mahasiswa));
        }

        void hapus(int index){
            mahasiswas.remove(index);
        }

        void update(int index, Mahasiswa mhs){
            mahasiswa.set(index, mhs);
        }

        void tampil(){
            mahasiswas.stream().forEach(mhs ->{
                System.out.println("" + mhs.toString());
            });
        }

        int linearSearch(String nim){
            for (int i = 0; i < mahasiswas.size(); i++){
                if(nim.equals(mahasiswas.get(i).nim)){
                    return i;
                }
            }
            return-1;
        }
    }
}
