package SelfPracticeTrial;

public class mainbooku {
    public static void main(String[] args) {
    bookstore kitabn = new bookstore();//membuat toko buku dulu
    
    //membuat objek buku
    Booku buku23 = new Booku("iwuehgf", "iowuhg", 3040);
    // kitabn.addBookuwo(new Booku("ikjdfh","iuefh",200));
    kitabn.addBookuwo(buku23);
    kitabn.addBookuwo(buku23);
    kitabn.addBookuwo(new Booku("oaifj","ouiewsfho",8924));
    kitabn.tampilsemua();
    }
        
}   
