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
        System.out.println("modifikasi ke 2");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("size = "+ dll.size());
        System.out.println("=====================");
        dll.removeFirst();
        dll.print();
        System.out.println("size = "+ dll.size());
        System.out.println("=====================");
        dll.removeLast();
        dll.print();
        System.out.println("size = "+ dll.size());
        System.out.println("=====================");
        dll.remove(1);
        dll.print();
        System.out.println("size = "+ dll.size());
        System.out.println("modifikasi ke 3");
        System.out.println("size = "+ dll.size());
        System.out.println("=====================");
        dll.print();
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size = "+ dll.size());
        System.out.println("=====================");
        dll.add(40, 1);
        dll.print();
        System.out.println("size = "+ dll.size());
        System.out.println("=====================");
        System.out.println("data awal pada linked list adalah = " + dll.getFirst());
        System.out.println("data akhir pada linked list adalah = " + dll.getLast());
        System.out.println("data pada indeks ke 1 linked list adalah = "+ dll.get(1));

    }
}
