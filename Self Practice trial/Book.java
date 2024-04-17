package Practice;

public class Book {
    String title;
    String author;
    int year;

    Book(String judul, String penulis, int tahunterbit){
        title = judul;
        author = penulis;
        year = tahunterbit;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}


