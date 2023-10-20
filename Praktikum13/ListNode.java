// Senarai berantai ganda berkepala berputar bertipe object

package sdl13;

public class ListNode {

    Object elemen;
    ListNode next;
    ListNode prev;
   
     ListNode(Object elemen){
         this.elemen=elemen;
         this.next=null;
         this.prev=null;
    }

    public Object getElemen() {
        return elemen;
    }

    public void setElemen(Object elemen) {
        this.elemen = elemen;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
     
}

