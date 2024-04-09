package Pertemuan8;

public class gudang06 {
    barang06[] tumpukan;
    int size;
    int top;

    gudang06(int kapasitas){
        size = kapasitas;
        tumpukan = new barang06[size];
        top = -1;
    }
    boolean cekkosong(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    boolean cekpenuh(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }
    void tambahbarang(barang06 brg){
        if (!cekpenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("barang "+ brg.nama+ " berhasil ditambahkan ke Gudang");

        }else{
            System.out.println("gagal! tumpukan barang digudang sudah penuh");
        }
    }
    barang06 ambilbarang(){
        if(!cekkosong()){
            barang06 delete = tumpukan[top];
            top--;
            System.out.println("barang "+ delete.nama + "diambil dari gudang. ");
            System.out.println("Kode unik dalam biner : " + konversiDesimalkeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("tumpukan barang kosong. ");
            return null;
        }
    }
    barang06 lihatBarangTeratas(){
        if(!cekkosong()){
            barang06 barangTeratas = tumpukan[top];
            System.out.println("barang teratas ; "+ barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("tumpukkan barang kosong. ");
            return null;
        }
    }
    void tampilkanbarang(){
        if(!cekkosong()){
            System.out.println("rincian tumpukan barang di gudang: ");
            for (int i = top; i >= 0; i--) {
            // for (int i = 0; i <= top; i++){
                System.out.printf("kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);

            }
            
        }else{
            System.out.println("tumpukkan barang kosong");
        }
        
    }
    String konversiDesimalkeBiner(int kode){
        StackKonversi06 stack = new StackKonversi06();
        while (kode != 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
    
}
