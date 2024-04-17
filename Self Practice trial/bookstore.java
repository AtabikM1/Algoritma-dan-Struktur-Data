package Practice;

public class bookstore {
    Booku [] bookss;
    int bookpenghitung;

    bookstore(){
        bookss = new Booku[100];
        bookpenghitung = 0;
    }
    void addBookuwo(Booku bukuwu){
        
            if (bookpenghitung < bookss.length){
                bookss[bookpenghitung] = bukuwu;
                bookpenghitung++;
            }else{
                System.out.println("buku penuuh");
            }
        
    }
    void tampilsemua(){
        for(int i =0; i < bookpenghitung; i++){
            Booku bukuwu = bookss[i];
            System.out.println("nama pengarang = " + bukuwu.getAuthor());
            System.out.println("juddul buku = "+ bukuwu.getTitle());
            System.out.println("harga buku = "+ bukuwu.getPrice());
        }
    }

}
