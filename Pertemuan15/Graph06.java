package Pertemuan15;

public class Graph06 {
    int vertex;
    DoubleLinkedList06 list[];
    Node06 head;
    
    Graph06(int v){
        vertex = v;
        list = new DoubleLinkedList06[v];
        for (int i = 0; i < v; i++){
            list[i] = new DoubleLinkedList06();
        }
    }
    void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }
    void degree(int asal){
        int k, totalIn = 0, totalout = 0;
        for(int i=0; i < vertex; i++){
            //indegree
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j) == asal){
                    ++totalIn;
                }
            }
            //outdegree
            for(k = 0; k < list[asal].size(); k++){
                list[asal].get(k);
            }
            totalout = k;
        }
        System.out.println("in Degree dari gedung " + (char)('A' + asal)+ ": "+ totalIn);
        System.out.println("out Degree dari gedung "+ (char)('A' + asal)+ ": "+totalout);
        System.out.println("Degree dari gedung "+ (char)('A' + asal)+ ": "+ (totalIn + totalout));

    }

    void removeAllEdges(){
        for(int i = 0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("graf berhasil dikosongkan");
    }
    void printGraph() {//yet
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    try {
                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getjarak(j) + " m), ");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    void removeEdge(int asal, int tujuan) throws Exception{
        for (int i =0; i < vertex; i++){
            if(i== tujuan){
                list[asal].remove(tujuan);
            }
        }
    }
    boolean checkEdge(int asal, int tujuan) {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                System.out.println("edge antara " + asal + " dan " + tujuan + " ada ");
                return true;

            }
        }
        return false;
    }
    void updateJarak(int asal, int tujuan, int newJarak) {
        boolean edgeFound = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                try {
                    list[asal].updateJarak(i, newJarak);
                    System.out.println("Jarak updated antara " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " menjadi " + newJarak + " m");
                    edgeFound = true;
                    break;
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        if (!edgeFound) {
            System.out.println("Edge antara " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak ditemukan");
        }
    }
    void hitungEdge() {
        int totalEdges = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdges += list[i].size();
        }
        System.out.println("Total jumlah tepi dalam graf: " + totalEdges);
    }

    
}
