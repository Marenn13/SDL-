
package sdl13;
public class StackDinamis {
    LinkedList tumpukkan;
    
    StackDinamis(){
        tumpukkan = new LinkedList();
    }
    public  void push (Object elemen ){
        tumpukkan.addFirst(elemen);
    }
    public  Object pop(){
    if (isEmpty()){
        return null;
    }
    return tumpukkan.removeFirst();
}
    public  int size (){
        return tumpukkan.size();
    }
    public  boolean  isEmpty(){
       return tumpukkan.isEmpty();
      }
    public String toString() {
       return tumpukkan.toString();
    }
    
    
    
    public static void main(String[] args) {
        StackDinamis tump =new StackDinamis ();
        tump.push(10);
        tump.push(5);
        tump.push(7);
        
        System.out.println(tump);
        while (!tump.isEmpty()){
            System.out.println(String.valueOf(tump.pop()));
        }
    }
   
}
