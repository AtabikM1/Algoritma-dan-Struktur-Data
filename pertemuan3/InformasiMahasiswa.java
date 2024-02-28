package pertemuan3;
import java.util.Scanner;

public class InformasiMahasiswa {
    private String[] namaMahasiswa;
    private String[] nimMahasiswa;
    private String[] jenisKelaminMahasiswa;
    private double[] ipkMahasiswa;

    public InformasiMahasiswa(int jumlahMahasiswa) {
        namaMahasiswa = new String[jumlahMahasiswa];
        nimMahasiswa = new String[jumlahMahasiswa];
        jenisKelaminMahasiswa = new String[jumlahMahasiswa];
        ipkMahasiswa = new double[jumlahMahasiswa];
    }

    public void inputInformasiMahasiswa(Scanner scanner, int index) {
        System.out.println("Masukkan informasi untuk Mahasiswa ke-" + (index + 1) + ":");
        System.out.print("Nama: ");
        namaMahasiswa[index] = scanner.nextLine();
        System.out.print("NIM: ");
        nimMahasiswa[index] = scanner.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelaminMahasiswa[index] = scanner.nextLine();
        System.out.print("IPK: ");
        ipkMahasiswa[index] = scanner.nextDouble();
        scanner.nextLine(); // Menangani newline character setelah input IPK
        System.out.println();
    }

    public void tampilkanInformasiMahasiswa() {
        System.out.println("Informasi Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            System.out.println("Nama: " + namaMahasiswa[i]);
            System.out.println("NIM: " + nimMahasiswa[i]);
            System.out.println("Jenis Kelamin: " + jenisKelaminMahasiswa[i]);
            System.out.println("IPK: " + ipkMahasiswa[i]);
            System.out.println();
        }
    }

    public void hitungDanTampilkanRataRata() {
        double totalIpk = 0;
        for (double ipk : ipkMahasiswa) {
            totalIpk += ipk;
        }

        double rataRataIpk = totalIpk / ipkMahasiswa.length;
        System.out.println("Rata-rata IPK: " + rataRataIpk);
    }

    public void tampilkanDataTerbesar() {
        double ipkTerbesar = ipkMahasiswa[0];
        int indeksTerbesar = 0;

        for (int i = 1; i < ipkMahasiswa.length; i++) {
            if (ipkMahasiswa[i] > ipkTerbesar) {
                ipkTerbesar = ipkMahasiswa[i];
                indeksTerbesar = i;
            }
        }

        System.out.println("Mahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + namaMahasiswa[indeksTerbesar]);
        System.out.println("IPK: " + ipkTerbesar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        InformasiMahasiswa informasi = new InformasiMahasiswa(jumlahMahasiswa);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            informasi.inputInformasiMahasiswa(scanner, i);
        }

        informasi.tampilkanInformasiMahasiswa();
        informasi.hitungDanTampilkanRataRata();
        informasi.tampilkanDataTerbesar();
    }
}
