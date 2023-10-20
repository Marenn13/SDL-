
package SDL10;

public class ListNode {
    int elemen;
    ListNode next;
    ListNode prev;
    
     ListNode (){
     }
     ListNode(int elemen ){
         this.elemen=elemen;
     }
     
     ListNode(int elemen,ListNode next, ListNode Prev ){
         this.elemen=elemen;
         this.next=next;
         this.prev=prev;
     }

    public int getElemen() {
        return elemen;
    }

    public void setElemen(int elemen) {
        this.elemen = elemen;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
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
    

     
     
     
     
     
     
     
     
    
    

    
}
