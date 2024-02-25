package Pertemuan1;
import java.util.Scanner;

public class IPSemesterCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matakuliah dan bobot SKS yang sudah ditentukan
        String[] matakuliah = {"Ppkn", "KTI", "CTPS", "MatDas", "Bing", "Daspro", "P.Daspr", "K3"};
        int[] bobotSKS = {3, 3, 3, 4, 3, 3, 2, 2}; // Misalkan bobot SKS untuk setiap matakuliah

        // Array untuk menyimpan nilai angka, nilai huruf, dan bobot nilai
        double[] nilaiAngka = new double[matakuliah.length];
        String[] nilaiHuruf = new String[matakuliah.length];
        double[] bobotNilai = new double[matakuliah.length];

        // Input nilai angka untuk setiap matakuliah
        for (int i = 0; i < matakuliah.length; i++) {
            System.out.println("\nMatakuliah: " + matakuliah[i]);
            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = scanner.nextDouble();
            
            nilaiHuruf[i] = konversiAngkaKeHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversihurufkeangka(nilaiHuruf[i]);
        }

        // Tampilkan hasil
        System.out.println("\n==============================");
        System.out.println("Jenis Matakuliah\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.println("==============================");
        for (int i = 0; i < matakuliah.length; i++) {
            System.out.printf("%s\t\t\t%.2f\t\t%s\t\t%.2f\n", matakuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        double totalBobotNilai = 0;
        double totalSKS = 0;

        for (int i = 0; i < matakuliah.length; i++) {
            totalBobotNilai += bobotNilai[i];
            totalSKS += bobotSKS[i];
        }

        double ipSemester = totalBobotNilai / 8;

        System.out.println("==============================");
        System.out.println("IP Semester Anda: " + ipSemester);

        scanner.close();
    }

    // Metode untuk konversi nilai angka ke huruf
    private static String konversiAngkaKeHuruf(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka > 73) {
            return "B+";
        } else if (nilaiAngka > 65) {
            return "B";
        } else if (nilaiAngka > 60) {
            return "C+";
        } else if (nilaiAngka > 50) {
            return "C";
        } else if (nilaiAngka > 39) {
            return "D";
        } else {
            return "E";
        }
    }

    //metode konversi nilai huruf ke bobot nilai
//metode konversi nilai huruf ke bobot nilai
    private static double konversihurufkeangka(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0; // Nilai E atau nilai huruf tidak valid
        }
    }

}
