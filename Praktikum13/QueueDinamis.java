
package sdl13;
public class QueueDinamis {
 LinkedList antrian;
 
 QueueDinamis(){
   antrian = new LinkedList();  
 }
 public boolean enqueue(Object element){
     antrian.addLast(element);
     return true;
 }
 public Object dequeue(){
     if (isEmpty()){
       return null;  
     }
     return antrian.removeFirst();
 }
 public int size(){
     return antrian.size();
     
 }
 public boolean isEmpty(){
     return antrian.isEmpty();
     
 }
 
 
    public static void main(String[] args) {
      QueueDinamis antrian = new QueueDinamis();
        antrian.enqueue(14);
        antrian.enqueue(25);
        antrian.enqueue(58);
        
        while (!antrian.isEmpty()) {
            System.out.println(antrian.dequeue());
        }
    }  
    }

