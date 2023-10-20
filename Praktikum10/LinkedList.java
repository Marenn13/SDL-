
package SDL10;

import java.util.NoSuchElementException;

public class LinkedList {
    
    ListNode head;
    int size;
    
   public LinkedList (){
      head = null;
      size=0;
   }
   public void addBefore (int newElement,ListNode node){
       ListNode newNode = new ListNode (newElement);
       if (head == null){
           head = newNode;
       }else if (node == head){
           newNode.setNext(head);
           head.setPrev(newNode);
           head = newNode;
       }else {
           newNode.setNext(node);
           newNode.setPrev(node.getPrev());
           node.getPrev().setNext(newNode);
           node.setPrev(newNode);
       }
       size ++;
   }
   
   public int remove(ListNode node) {
        if (head == null) {
            throw new NoSuchElementException("Linked List Kosong");
        }
        if (node == head) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            }
        } else {
            ListNode prevNode = node.getPrev();
            ListNode nextNode = node.getNext();
            prevNode.setNext(nextNode);
            if (nextNode != null) {
                nextNode.setPrev(prevNode);
            }
        }
        node.setPrev(null);
        node.setNext(null);
        size--;
        return node.getElemen();
   }
   public boolean isEmpty (){
       return head == null;
   }
   public void displayList (){
       ListNode curtNode = head;
       while (curtNode !=null){
           System.out.println(curtNode.getElemen() +" ");
           curtNode = curtNode.getNext();
       }
       System.out.println();
   }public ListNode getLast() {
        if (head == null) {
            return null;
        }

        ListNode curtNode = head;
        while (curtNode.getNext() != null) {
            curtNode = curtNode.getNext();
        }

        return curtNode;
    }

    public ListNode getFirst() {
        return head;
    }
      
       
       public ListNode search(int value) {
        ListNode curtNode = head;
        while (curtNode != null) {
            if (curtNode.getElemen() == value) {
                return curtNode;
            }
            curtNode = curtNode.getNext();
        }
        return null;
    }
}


 
