package Pertemuan11;

public class mainsllmhs {
    public static void main(String[] args) {
        mahasiswasll singll = new mahasiswasll();
        singll.addfirst(111, "Anton");
        singll.insertAfter(111,112,"Prita");
        singll.insertAt(2, 113, "Yusuf");
        singll.addlast(114, "Doni");
        singll.print();
        singll.addlast(115, "sari");
        singll.print();
    }
}
