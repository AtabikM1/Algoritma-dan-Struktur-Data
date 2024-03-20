package Pertemuan6;

public class HotelServis {
    Hotel rooms[] = new Hotel[5];
    int idx;

    void tambah(Hotel H){
        if(idx<rooms.length){
            rooms[idx] = H;
            idx++;
        }else{
            System.out.println("data hotel sudah penuh");
        }
    }

    void tampilAll(){
        for(int i = 0; i < idx; i++){
            System.out.println("Nama hotel = " + rooms[i].nama);
            System.out.println("Kota = "+ rooms[i].kota);
            System.out.println("Harga = " + rooms[i].harga);
            System.out.println("Bintang = "+ rooms[i].bintang);
            System.out.println("==========");

        }
        
    }
    

    void bubblesort(){
        for(int i = 0; i < rooms.length-1; i++){
            for(int j=1; j < rooms.length-i; j++){
                if(rooms[j].harga > rooms[j-1].harga){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionsort(){
        for(int i = 0; i < rooms.length -1; i++){
            int idxmin = i;
            for(int j = i+1; j < rooms.length; j++){
                if(rooms[j].bintang < rooms[idxmin].bintang){
                    idxmin = j;
                }
            }
            //swap 
            Hotel tmp = rooms[idxmin];
            rooms[idxmin] = rooms[i];
            rooms[i]= tmp;
        }
    }
}
