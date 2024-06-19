package Pertemuan16;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    void hapus(int index) {
        mahasiswas.remove(index);
    }

    void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main app = new Main();

        // Create Mahasiswa objects
        Mahasiswa mhs1 = new Mahasiswa("001", "Alice", "081234567890");
        Mahasiswa mhs2 = new Mahasiswa("002", "Bob", "081234567891");

        // Add Mahasiswa objects to the list
        app.tambah(mhs1, mhs2);

        // Display the list
        app.tampil();

        // Update a Mahasiswa object
        Mahasiswa mhs3 = new Mahasiswa("003", "Charlie", "081234567892");
        app.update(1, mhs3);

        // Display the updated list
        app.tampil();

        // Search for a Mahasiswa by nim
        int index = app.linearSearch("003");
        System.out.println("Mahasiswa with NIM 003 is at index: " + index);

        // Remove a Mahasiswa object
        app.hapus(index);

        // Display the final list
        app.tampil();
    }
}
