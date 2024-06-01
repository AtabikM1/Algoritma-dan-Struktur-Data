package Pertemuan13;

public class Binarytreemain06 {

    public static void main(String[] args) {
        BinaryTree06 bt = new BinaryTree06();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.println("peorder traversal = ");
        bt.traversePreOrder(bt.root);
        System.out.println(" ");
        System.out.println("in order traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println(" ");
        System.out.println("post order traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println(" ");
        System.out.println("find note = " + bt.find(5));
        System.out.println("delete node 8");
        bt.delete(8);
        System.out.println("");
        System.out.println("peorder traversal = ");
        bt.traversePreOrder(bt.root);
        System.out.println(" ");
        
    }
}