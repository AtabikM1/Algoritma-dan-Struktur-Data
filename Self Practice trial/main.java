package Practice;

public class main {
    public static void main(String[] args) {
        //objek dari klass library(ini bikin perpusnya)
        library mulibrary = new library();
        //membuat objek dari klaa buku(bikin buku)
        Book book1 = new Book("hari puter", "jk rowling", 1982);
        Book book2 = new Book("hari puwesfger", "jk rowling", 1945);
        Book book3 = new Book("hari puliouer", "jk rowling", 1952);
        mulibrary.addBook(new Book("woiuhjfg", "wosejfh", 924));;
        //menambahkan buku itu ke perpus
        mulibrary.addBook(book3);
        mulibrary.addBook(book2);
        mulibrary.addBook(book1);

        //cetak semua buku
        mulibrary.printall();

        //menampilkan buku berdasarkan pengarang
        Book[] tolkienBooks = mulibrary.getBookByauthor("jk rowling");
        System.out.println("Buku oleh J.R.R. Tolkien:");
        for (Book book : tolkienBooks) {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }
        // Menampilkan buku yang diterbitkan sebelum tahun tertentu
        Book[] oldBooks = mulibrary.getBookBeforeyear(1950);
        System.out.println("Buku yang diterbitkan sebelum tahun 1950:");
        for (Book book : oldBooks) {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }
    }
}
