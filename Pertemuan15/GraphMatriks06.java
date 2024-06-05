package Pertemuan15;

public class GraphMatriks06 {
    int vertex;
    int[][] matriks;

    public GraphMatriks06(int v){
        vertex = v;
        matriks = new int[v][v];

    }

    void makeegde(int asal, int tujuan, int jarak){
        matriks[asal][tujuan]= jarak;
    }
    void removeedge(int asal, int tujuan){
        matriks[asal][tujuan] = -1;
    }
    void printGraph(){
        for(int i = 0; i < vertex; i++){
            System.out.println("Gedung "+ (char) ('A' + i) + ": ");
            for(int j = 0; j < vertex; j++){
                if(matriks[i][j] != -1){
                    System.out.println("Gedung "+ (char)('A' + j) + "( "+ matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }
    void degree(int asal){
        int k, totalIn = 0, totalout = 0;
        
            //indegree
            for(int j = 0; j < vertex; j++){
                if(matriks[j][asal] != 0){
                    totalIn++;
                }
            }
            //outdegree
            for(k = 0; k < vertex ; k++){
                if(matriks[k][asal] != 0){
                    totalout++;
                }
            }
            totalout = k;
        
        System.out.println("in Degree dari gedung " + (char)('A' + asal)+ ": "+ totalIn);
        System.out.println("out Degree dari gedung "+ (char)('A' + asal)+ ": "+totalout);
        System.out.println("Degree dari gedung "+ (char)('A' + asal)+ ": "+ (totalIn + totalout));

    }
}
