package Pertemuan15;

public class GraphMainMatriks06 {
    public static void main(String[] args) {
        GraphMatriks06 gdg = new GraphMatriks06(4);
        gdg.makeegde(   0, 1, 50);
        gdg.makeegde(1, 0, 60);
        gdg.makeegde(1, 2, 70);
        gdg.makeegde(2, 1, 80);
        gdg.makeegde(2, 3, 40);
        gdg.makeegde(3, 0, 90);
        gdg.printGraph();
        System.out.println("hasil setelah penghapusan edge");
        gdg.removeedge(2, 1);
        gdg.printGraph();
    }
}
