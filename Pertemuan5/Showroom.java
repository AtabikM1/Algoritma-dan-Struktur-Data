package Pertemuan5;
public class Showroom {

    // Struktur data untuk merepresentasikan mobil
    class Mobil {
        String merk;
        String tipe;
        int tahun;
        int top_acceleration;
        int top_power;

        public Mobil(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
            this.merk = merk;
            this.tipe = tipe;
            this.tahun = tahun;
            this.top_acceleration = top_acceleration;
            this.top_power = top_power;
        }
    }

    // Metode untuk mencari top_acceleration tertinggi menggunakan Divide and Conquer
    private int maxAcceleration(Mobil[] mobil, int low, int high) {
        if (low == high) {
            return mobil[low].top_acceleration;
        }

        int mid = (low + high) / 2;
        int leftMax = maxAcceleration(mobil, low, mid);
        int rightMax = maxAcceleration(mobil, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }

    // Metode untuk mencari top_acceleration terendah menggunakan Divide and Conquer
    private int minAcceleration(Mobil[] mobil, int low, int high) {
        if (low == high) {
            return mobil[low].top_acceleration;
        }

        int mid = (low + high) / 2;
        int leftMin = minAcceleration(mobil, low, mid);
        int rightMin = minAcceleration(mobil, mid + 1, high);

        return Math.min(leftMin, rightMin);
    }

    // Metode untuk menghitung rata-rata top_power dari seluruh mobil menggunakan Brute Force
    private double averagePower(Mobil[] mobil) {
        double totalPower = 0;
        for (Mobil car : mobil) {
            totalPower += car.top_power;
        }
        return totalPower / mobil.length;
    }

    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        // Data mobil
        Mobil[] mobil = {
            showroom.new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
            showroom.new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
            showroom.new Mobil("Nissan", "370Z", 2009, 4360, 657),
            showroom.new Mobil("Subaru", "BRZ", 2014, 4058, 609),
            showroom.new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            showroom.new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
            showroom.new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
            showroom.new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        // Mencari top_acceleration tertinggi
        int maxAcc = showroom.maxAcceleration(mobil, 0, mobil.length - 1);
        System.out.println("Top acceleration tertinggi: " + maxAcc);

        // Mencari top_acceleration terendah
        int minAcc = showroom.minAcceleration(mobil, 0, mobil.length - 1);
        System.out.println("Top acceleration terendah: " + minAcc);

        // Menghitung rata-rata top_power
        double avgPower = showroom.averagePower(mobil);
        System.out.println("Rata-rata top power: " + avgPower);
    }
}
