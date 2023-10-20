
//Senarai berantai ganda berkepala berputar bertipe object
package sdl13;
public class LinkedList {
    private ListNode head;
    private int size;
    
    LinkedList (){
        head = null;
        size = 0;
        
    }
    private void addBefore (Object elemen,ListNode node){
        ListNode nodeBaru = new ListNode (elemen);
        nodeBaru.setNext(node);
        nodeBaru.setPrev(node.getPrev());
        node.getPrev().setNext(nodeBaru);
        node.setPrev(nodeBaru);
        size++;
        
    }
    private Object remove (ListNode node ){
        if (size == 1){
            head=null;
        }else {
            ListNode prevNode = node.getPrev();
            ListNode nextNode = node.getNext();
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
            if ( node== head){
                head = nextNode;
            }
        }
        
        size --;
        return node.getElemen();
    }
    public void addFirst (Object elemen){
        ListNode nodeBaru = new ListNode(elemen);
        if (isEmpty ()){
            head = nodeBaru;
            nodeBaru.setNext(nodeBaru);
            nodeBaru.setPrev(nodeBaru);
            
        }
        else {
            nodeBaru.setNext(head);
            nodeBaru.setPrev(head.getPrev());
            head.getPrev().setNext(nodeBaru);
            head.setPrev(nodeBaru);
            head = nodeBaru;
            
        }
        size++;
    }
    public void addLast (Object elemen){
         ListNode nodeBaru = new ListNode (elemen);
         if (isEmpty()){
             head = nodeBaru;
             nodeBaru.setNext(nodeBaru);
             nodeBaru.setPrev(nodeBaru);
         }else {
             nodeBaru.setNext(head);
             nodeBaru.setPrev(head.getPrev());
             head.getPrev().setNext(nodeBaru);
             head.setPrev(nodeBaru);
         }
         size++;
        
    }
    public Object removeFirst(){
        if (!isEmpty()){
       return  remove(head);
    }
       return null; 
    }
    public Object removeLast(){
         if (!isEmpty());{
        return  remove(head.getPrev());
    }
    }
    public ListNode search (Object elemen){
        ListNode current =head;
        for (int i =0; i<size; i++){
            if (current.getElemen().equals(elemen)){
                return current;
            }
            current =current.getNext();
             }
        return null;
        
    }
    public int size (){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    
    @Override
    public String toString(){
     StringBuilder sb = new StringBuilder();
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            sb.append(current.getElemen()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }
}
    
    
    

