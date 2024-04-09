package Pertemuan6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa06 listMhs[] = new Mahasiswa06[5];
    int idx;

    void tambah(Mahasiswa06 m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for(Mahasiswa06 m : listMhs){
            m.tampil();
            System.out.println("--------");
        }
    }
    void bubblesort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j = 1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa06 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionsort(){
        for(int i = 0; i < listMhs.length-1; i++){
            int idxmin = i; 
            for(int j = i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxmin].ipk){
                    idxmin = j;
                }
            }
            //swap
            Mahasiswa06 tmp = listMhs[idxmin];
            listMhs[idxmin] = listMhs[i];
            listMhs[i] = tmp;

        }
    }
    void insertionsort(){
        for (int i =1; i < listMhs.length; i++){
            Mahasiswa06 temp = listMhs[i];
            int j = i;
            while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;

            }
            listMhs[j] = temp;
        }
    }
}
