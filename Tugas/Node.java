package tugassdl;

import javax.swing.DefaultButtonModel;
import javax.swing.DefaultListModel;

public class Node<T> {
    public T nodeValue;
    public Node<T> next;

     public Node( T nodeValue) {
         this.nodeValue = nodeValue;
    }
     public Node (){
         
     }
        

    public static <T> Node buatLinkedList1(Node<T> front) {
        Node<T> p = new Node("red");
        Node<T> q = new Node("green");
        p.next = q; // penedefinisian q sebagai node setelah node terdepan
        front = p; // penedefinisian p sebagai node terdepan
        return front;
    }
    
    public static <T> Node tambahNode_Depan(Node<T> front, Node<T> newNode) {
        Node<T> temp = front;
        if (front == null || front.nodeValue == null) {
            front = newNode; // jika front sama dengan null atau front nodeValue sama dengan null, maka front akan digantikan dengan node baru
        } else {
            newNode.next = front;
            front = newNode;
        }
        return front;
    }

    public static <T> Node tambahNode_Akhir(Node<T> front, Node<T> newNode) {
        Node<T> temp = front;
        if (front == null || front.nodeValue == null) {
            front = newNode; // jika front sama dengan null atau front nodeValue sama dengan null, maka front akan digantikan dengan node baru
        } else {
            while (temp.next != null) { // melakukan iterasi sampai menemukan node terakhir
                temp = temp.next;
            }
            temp.next = newNode; // menambahkan newNode ke akhir node
        }
        return front;
    }
    
    public static <T> Node tambahNode_Sebelum(Node<T> front, Node<T> newNode, Node<T> curr) {
        Node<T> temp = front;
        while (temp.next != null) {
            if (temp.next.nodeValue.equals(curr.nodeValue)) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return front;
    }
    public static <T> Node<T> tambahNode_Setelah(Node<T> front, Node<T> newNode, Node<T> target) {
    if (front == null || target == null) {
        return front;
    }
    if (front == target) {
        newNode.next = target.next;
        target.next = newNode;
    } else {
        Node<T> curr = front;
        while (curr.next != null && curr.next != target) {
            curr = curr.next;
        }
        if (curr.next != null) {
            newNode.next = target.next;
            target.next = newNode;
        }
    }
    return front;
    
    }
    
    public static <T> Node hapusNode(Node<T> front, Node<T> target) {
        Node<T> temp = front;
        if (front == null) {
            return front;
        }
        if (front.nodeValue.equals(target.nodeValue)) {
            front = front.next;
            return front;
        }
        while (temp.next != null) {
            if (temp.next.nodeValue.equals(target.nodeValue)) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return front;
    }
    
    public static <T> DefaultListModel<T> getData(Node<T> front) {
        DefaultListModel model = new DefaultListModel();
        if (front == null) {
            return null;
        }
        Node<T> curr = front;
        while (curr != null) {
            model.addElement(curr.nodeValue);
            curr = curr.next;
        }
        return model;
    }
     public static <T> String toString(Node<T> front) {
        if (front == null) {
            return "null";
        }
        Node<T> curr = front;
        StringBuilder str = new StringBuilder(curr.nodeValue.toString());
        while (curr.next != null) {
              curr = curr.next;
         str.append(curr.nodeValue.toString());
    }
    str.append(" ");
    return str.toString();
   
     }
}
     