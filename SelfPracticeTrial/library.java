package SelfPracticeTrial;

public class library {
    Book [] books;
    int countbook;
    library(){
        books = new Book[100];//inisialisasi array dengan ukuran tertentu
        countbook = 0;

    }
    void addBook(Book bukuargumen){
        if(countbook < books.length){
            books[countbook] = bukuargumen;
            countbook++;
        }else{
            System.out.println("bukunya penuh di library");

        }
    }
    Book[] getBookByauthor(String author){
        Book[] tempArray = new Book[countbook];//array sementara untuk menampung buku oleh author tertentu
        int count = 0;//penghitung atau buku ke array baru
        for (int i = 0; i < countbook; i++){
            if(books[i].getAuthor().equals(author)){
                tempArray[count] = books[i];
                count++;
            }
        }
        Book[] result = new Book[count]; //array akhir
        for (int i = 0; i < count; i++){
            result[i] = tempArray[i];//menyalin buku yang cocok ke array yang baru
        }
        return result; //return array yang diminta oleh author
    }

    void printallbooks(){
        System.out.println("judul = ");
        System.out.println("pengarang = ");
        System.out.println("tahun terbit");
    }
    Book[] getBookBeforeyear(int year){
        Book[] tempArray = new Book[countbook];
        int count = 0;
        for (int i = 0; i < countbook; i++){
            if(books[i].getYear() < year){
                tempArray[count] = books[i];
                count++;
            }
        }
        Book[] result = new Book[count];
        for(int i = 0; i < count; i++){
            result[i] = tempArray[i];
        }
        return result;
    }
    void printall(){
        System.out.println("daftar buku perpus ");
        for(int i = 0; i < countbook; i++){
            Book book = books[i];
            System.out.println("Buku " + (i + 1) + ":");
            System.out.println("Judul: " + book.getTitle());
            System.out.println("Pengarang: " + book.getAuthor());
            System.out.println("Tahun Terbit: " + book.getYear());
            System.out.println();
        }
    }
}