package Pertemuan12;

public class main06 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("size = " + dll.size());
        System.out.println("=====================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size = "+ dll.size());
        System.out.println("=====================");
        
        dll.add(40, 1);
        
        dll.print();
        System.out.println("size = " + dll.size());
        System.out.println("=====================");
        
        dll.clear();
        dll.print();
        System.out.println("size = "+ dll.size());
        System.out.println("=====================");
    }
}
