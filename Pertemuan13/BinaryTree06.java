package Pertemuan13;

import Pertemuan12.nodefilm;

public class BinaryTree06 {
    Node06 root;
    int size;

    BinaryTree06(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if(isEmpty()){
            root = new Node06(root, data, root);
        }else{
            Node06 current = root;
            while (true) {
                if(data>current.data){
                    if (current.right==null) {
                        current = current.right;
                    }else{
                        current.right = new Node06(current, data, current);
                        break;
                    }
                }else if (data<current.data) {
                    if(current.left!=null){
                        current = current.left;
                    }else{
                        current.left = new Node06(current, data, current);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node06 current = root;
        while (current!=null) {
            if(current.data==data){
                result = true;
                break;
            }else if (data>current.data){
                current = current.right;
            }else{
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node06 node){
        if(node != null){
            System.out.println(" "+ node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversepostOrder(Node06 node){
        if(node != null){
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.println(" "+ node.data);
        }
    }

    void traverseinOrder(Node06 node){
        if(node != null){
            traversePreOrder(node.left);
            System.out.println(" "+ node.data);
            traversePreOrder(node.right);
        }
    }

}
