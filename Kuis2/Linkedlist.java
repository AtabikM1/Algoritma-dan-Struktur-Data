package Kuis2;

public class Linkedlist {
    public Node head;
    Node tail;

    Linkedlist() {
        head = null;
        tail = null;
    }

    void tambahtim(TimVoli tim) {
        Node newNode = new Node(tim);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    TimVoli temukanTim(String nama) {
        Node current = head;
        while (current != null) {
            if (current.tim.nama.equals(nama)) {
                return current.tim;
            }
            current = current.next;
        }
        return null;
    }

    void updatematch(String namawinner, int skormenang, String namaloser, int skorkalah) {
        TimVoli winner = temukanTim(namawinner);
        TimVoli loser = temukanTim(namaloser);
        if (winner != null && loser != null) {
            if (skormenang == 3 && (skorkalah == 0 || skorkalah == 1)) {
                winner.menang(3);
                loser.kalah(0);
            } else if (skormenang == 3 && skorkalah == 2) {
                winner.menang(2);
                loser.kalah(1);
            } else if (skormenang == 2 && skorkalah == 3) {
                winner.kalah(1);
                loser.menang(2);
            }
        }
    }

    int bandingkantim(TimVoli t1, TimVoli t2) {
        if (t1.menang != t2.menang) {
            return t2.menang - t1.menang;
        } else if (t1.poin != t2.poin) {
            return t2.poin - t1.poin;
        } else {
            return t1.nama.compareTo(t2.nama);
        }
    }

    public Node mergesorted(Node a, Node b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        Node hasil;
        if (bandingkantim(a.tim, b.tim) <= 0) {
            hasil = a;
            hasil.next = mergesorted(a.next, b);
        } else {
            hasil = b;
            hasil.next = mergesorted(a, b.next);
        }
        return hasil;
    }

    Node tengah(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node urutkantim(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = tengah(head);
        Node midnext = mid.next;
        mid.next = null;

        Node left = urutkantim(head);
        Node right = urutkantim(midnext);

        return mergesorted(left, right);
    }

    void displaystanding() {
        if (head == null) return;

        head = urutkantim(head);

        Node current = head;
        int rank = 1;
        while (current != null) {
            System.out.println(rank + ". " + current.tim.nama + " - Menang: " + current.tim.menang + ", Kalah: " + current.tim.kalah + ", Poin: " + current.tim.poin);
            current = current.next;
            rank++;
        }
    }

    void performEliminationAndPlayoffs() {
        if (head == null) return;

        // Sort teams
        head = urutkantim(head);

        // Get top 4 teams
        Node current = head;
        Node[] top4 = new Node[4];
        for (int i = 0; i < 4 && current != null; i++) {
            top4[i] = current;
            current = current.next;
        }

        if (top4[3] == null) {
            System.out.println("Tidak ada cukup tim untuk semifinal dan final.");
            return;
        }

        // Semifinals: 1st vs 4th and 2nd vs 3rd
        System.out.println("Semifinal:");
        TimVoli finalist1 = playMatch(top4[0].tim, top4[3].tim);
        TimVoli finalist2 = playMatch(top4[1].tim, top4[2].tim);

        // Final
        System.out.println("Final:");
        TimVoli champion = playMatch(finalist1, finalist2);

        System.out.println("Juara: " + champion.nama);
    }

    TimVoli playMatch(TimVoli TimVoli1, TimVoli TimVoli2) {
        // Simulate a match, assuming TimVoli1 wins for demonstration purposes
        System.out.println(TimVoli1.nama + " vs " + TimVoli2.nama + ": " + TimVoli1.nama + " menang");
        return TimVoli1; // Simulate team1 as the winner
    }
}
