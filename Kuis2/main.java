package Kuis2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Linkedlist proliga = new Linkedlist();

        proliga.tambahtim(new TimVoli("JAKARTA STIN BIN"));
        proliga.tambahtim(new TimVoli("PALEMBANG BANK SUMSELBABEL"));
        proliga.tambahtim(new TimVoli("JAKARTA LAVANI ALLO BANK ELECTRIC"));
        proliga.tambahtim(new TimVoli("JAKARTA BHAYANGKARA PRESISI"));
        proliga.tambahtim(new TimVoli("JAKARTA PERTAMINA PERTAMAX"));
        proliga.tambahtim(new TimVoli("KUDUS SUKUN BADAK"));
        proliga.tambahtim(new TimVoli("JAKARTA GARUDA JAYA"));
        proliga.tambahtim(new TimVoli("ATABIK TRENTINO VOLLEY"));

        // Membuat beberapa pertandingan untuk memastikan tim "ATABIK TRENTINO VOLLEY" memenangkan semua pertandingan
        proliga.updatematch("JAKARTA STIN BIN", 3, "PALEMBANG BANK SUMSELBABEL", 0);
        proliga.updatematch("JAKARTA LAVANI ALLO BANK ELECTRIC", 3, "JAKARTA BHAYANGKARA PRESISI", 1);
        proliga.updatematch("JAKARTA PERTAMINA PERTAMAX", 3, "KUDUS SUKUN BADAK", 2);
        proliga.updatematch("ATABIK TRENTINO VOLLEY", 3, "JAKARTA GARUDA JAYA", 0);
        proliga.updatematch("JAKARTA STIN BIN", 3, "JAKARTA BHAYANGKARA PRESISI", 1);
        proliga.updatematch("JAKARTA LAVANI ALLO BANK ELECTRIC", 3, "PALEMBANG BANK SUMSELBABEL", 0);
        proliga.updatematch("JAKARTA PERTAMINA PERTAMAX", 3, "JAKARTA GARUDA JAYA", 1);
        proliga.updatematch("ATABIK TRENTINO VOLLEY", 3, "KUDUS SUKUN BADAK", 0);
        proliga.updatematch("JAKARTA STIN BIN", 3, "JAKARTA LAVANI ALLO BANK ELECTRIC", 2);
        proliga.updatematch("JAKARTA BHAYANGKARA PRESISI", 3, "PALEMBANG BANK SUMSELBABEL", 1);
        proliga.updatematch("JAKARTA PERTAMINA PERTAMAX", 3, "ATABIK TRENTINO VOLLEY", 2);
        proliga.updatematch("KUDUS SUKUN BADAK", 3, "JAKARTA GARUDA JAYA", 2);
        proliga.updatematch("ATABIK TRENTINO VOLLEY", 3, "JAKARTA STIN BIN", 1);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Klasemen Tim");
            System.out.println("2. Lakukan Semifinal dan Final");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    proliga.displaystanding();
                    break;
                case 2:
                    proliga.performEliminationAndPlayoffs();
                    break;
                case 3:
                    running = false;
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }
}
