package Kuis2;

public class Linkedlist {
    public Node head;
    Node tail;

    Linkedlist(){
        head = null;
        tail = null;

    }

    void tambahtim(TimVoli tim){
        Node newNode = new Node(tim);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    TimVoli temukanTim(String nama){
        Node current = head;
        while (current != null) {
            if(current.tim.nama.equals(nama)){
                return current.tim;
            }
            current = current.next;
        }
        return null;
    }

    void updatematch(string namawinner, int skormenang, string namaloser, int skorkalah){
        TimVoli winner = temukanTim(namawinner);
        TimVoli loser = temukanTim(namaloser);
        if(winner != null && loser != null){
            if(skormenang == 3 && (skorkalah == 0 || skorkalah == 1)){
                winner.menang(3);
                loser.kalah(0);
            } else if(skormenang == 3 && skorkalah == 2){
                winner.menang(2);
                loser.kalah(1);
            }else if(skormenang == 2 && skorkalah == 3){
                winner.menang(1);
                loser.kalah(2);
            }
        }
    }

    // void displaystanding(){
    //     if(head == null) return;

    //     head = sort
    // }

    // Node urutkantim(Node head){
    //     if(head == null || head.next == null){
    //         return head;

    //     }
    // }

    // Node mergesorted(Node a, Node b){
    //     if(a == null){
    //         return b;
    //     }
    //     if(b == null){
    //         return a;
    //     }
    //     Node hasil;
    //     if(com)
    // }

}
