package Practice;

public class Booku {
    String title;
    String author;
    double price;
    
    Booku (String judul, String pengarang, double harga){
        title = judul;
        author = pengarang;
        price = harga;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String getTitle() {
        return title;
    }
    
}
