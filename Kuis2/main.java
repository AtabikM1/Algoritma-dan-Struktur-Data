package Kuis2;

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

        proliga.updatematch("JAKARTA STIN BIN", 3, "PALEMBANG BANK SUMSELBABEL", 0);
        proliga.updatematch("ATABIK TRENTINO VOLLEY", 3, "PALEMBANG BANK SUMSELBABEL", 0);
        proliga.updatematch("ATABIK TRENTINO VOLLEY", 3, "PALEMBANG BANK SUMSELBABEL", 0);
        proliga.displaystanding();

        // Melakukan eliminasi dan bermain di semifinal dan final
        proliga.performEliminationAndPlayoffs();
    }
}
