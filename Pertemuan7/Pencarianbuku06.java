package Pertemuan7;

public class Pencarianbuku06 {
    Buku lisBuku[] = new Buku[5];
    int idx;

    void tambah(Buku m){
        if (idx < lisBuku.length){
            lisBuku[idx] = m;
            idx++;
        } else {
            System.out.println("Data Penuh");
        }
    }
    void tampil(){
        for (Buku m :lisBuku){
            m.tampilDataBuku();
        }
    }
    public int findSeqSearch(int cari){
        int posisi = -1;
        for (int j  =0; j < lisBuku.length; j++){
            if (lisBuku[j].kodebuku==cari){
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if(pos!= -1){
            System.out.println("data :" + x  + " ditemukan pada indeks ke "+ pos);

        }else{
            System.out.println("data "+ x + " tidak ditemukan");
        }
    }
    public void tampildata(int x, int pos){
        if (pos != -1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("judul\t : "+lisBuku[pos].judul);
            System.out.println("Tahun Terbit\t : "+lisBuku[pos].pengarang);
            System.out.println("pengarang\t : "+lisBuku[pos].pengarang);
            System.out.println("Stock\t : "+lisBuku[pos].stok);

        }else{
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }
    public Buku FindBuku(int cari) {
        int posisi = -1;
        for (int j = 0; j < lisBuku.length; j++) {
            if (lisBuku[j].kodebuku == cari) {
                posisi = j;
                break;
            }
        }
        return lisBuku[posisi];
    }

    void bubbleSort() {
        for (int i = 0; i < lisBuku.length - 1; i++) {
            for (int j = 1; j < lisBuku.length - i; j++) {
                if (lisBuku[j].kodebuku < lisBuku[j - 1].kodebuku) {
                    Buku tmp = lisBuku[j];
                    lisBuku[j] = lisBuku[j - 1];
                    lisBuku[j - 1] = tmp;
                }
            }
        }
    }

    public int findBinarySearch(int cari, int left, int right){
        if (right >= left){
            int mid = left + (right - left) / 2; // Perhitungan nilai mid yang benar
    
            if (lisBuku[mid].kodebuku == cari){
                return mid; // Kode buku ditemukan di tengah
            }
    
            // Jika kode buku yang dicari lebih kecil dari kode buku di tengah
            if (lisBuku[mid].kodebuku > cari){
                return findBinarySearch(cari, left, mid - 1); // Pencarian dilakukan pada setengah kiri
            }
    
            // Jika kode buku yang dicari lebih besar dari kode buku di tengah
            return findBinarySearch(cari, mid + 1, right); // Pencarian dilakukan pada setengah kanan
        }
    
        return -1; // Jika kode buku tidak ditemukan dalam rentang tertentu
    }


}
