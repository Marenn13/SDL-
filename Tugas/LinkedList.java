
package tugassdl;
import javax.swing.DefaultListModel;
 import javax.swing.JOptionPane;

public class LinkedList<T> extends javax.swing.JFrame {
     private Node<T> front;

    public LinkedList() {
        front = null;
    }

    public void addFirst(T nodeValue) {
        Node<T> newNode = new Node<>(nodeValue);
        front = Node.tambahNode_Depan(front, newNode);
    }

    public void addLast(T nodeValue) {
        Node<T> newNode = new Node<>(nodeValue);
        front = Node.tambahNode_Akhir(front, newNode);
    }

    public void addBefore(T nodeValue, T targetValue) {
        Node<T> newNode = new Node<>(nodeValue);
        Node<T> target = new Node<>(targetValue);
        front = Node.tambahNode_Sebelum(front, newNode, target);
    }

    public void addAfter(T nodeValue, T targetValue) {
       Node<T> newNode = new Node<>(nodeValue);

    // cari node target
    Node<T> target = front;
    while (target != null && !target.nodeValue.equals(targetValue)) {
        target = target.next;
    }

    if (target != null) {
        // node target ditemukan, tambahkan newNode setelahnya
        front = Node.tambahNode_Setelah(front, newNode, target);
    } else {
        // node target tidak ditemukan
        System.out.println("Target node not found");
    }
    }

    public void remove(T nodeValue) {
        Node<T> target = new Node<>(nodeValue);
        front = Node.hapusNode(front, target);
    }

    public T get(int index) {
        Node<T> curr = front;
        int i = 0;
        while (curr != null && i < index) {
            curr = curr.next;
            i++;
        }
        return curr != null ? curr.nodeValue : null;
    }

  
    public int size(int fron) {
        Node<T> curr = front;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }

    public DefaultListModel<T> getData() {
        return Node.getData(front);
    }

    @Override
    public String toString() {
        return Node.toString(front);
    }
}
     


    
   
    

    
   
