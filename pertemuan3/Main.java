package pertemuan3;

import java.util.Scanner;

class Kerucut {
     double jariJari;
     double sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}

class LimasSegiEmpat {
    private double panjangSisiAlas;
    private double tinggiLimas;

    public LimasSegiEmpat(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggiLimas);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}

class Bola {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan atribut untuk Kerucut:");
        System.out.print("Jari-jari: ");
        double jariJariKerucut = scanner.nextDouble();
        System.out.print("Sisi miring: ");
        double sisiMiringKerucut = scanner.nextDouble();

        System.out.println("\nMasukkan atribut untuk Limas Segi Empat Sama Sisi:");
        System.out.print("Panjang sisi alas: ");
        double panjangSisiAlasLimas = scanner.nextDouble();
        System.out.print("Tinggi limas: ");
        double tinggiLimas = scanner.nextDouble();

        System.out.println("\nMasukkan atribut untuk Bola:");
        System.out.print("Jari-jari: ");
        double jariJariBola = scanner.nextDouble();

        // Membuat array objek
        Kerucut kerucut = new Kerucut(jariJariKerucut, sisiMiringKerucut);
        LimasSegiEmpat limas = new LimasSegiEmpat(panjangSisiAlasLimas, tinggiLimas);
        Bola bola = new Bola(jariJariBola);

        // Menampilkan hasil
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Luas Permukaan Kerucut: " + kerucut.hitungLuasPermukaan());
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());

        System.out.println("\nLuas Permukaan Limas Segi Empat Sama Sisi: " + limas.hitungLuasPermukaan());
        System.out.println("Volume Limas Segi Empat Sama Sisi: " + limas.hitungVolume());

        System.out.println("\nLuas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());
    }
}

