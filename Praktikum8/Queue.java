package Praktikum8;
// Dinamis
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {
//    LinkedList antrian;{
//}
//      public Queue(){
//      antrian = new  LinkedList ();        
//   }
//      public void enqueue (int elemen){
//       antrian.addLast(elemen);
//      }
//      public int dequeue(){
//        if (isEmpty ()){
//           throw new NoSuchElementException("Queue Kosong");   
//        }  
//        return (int) antrian.remove();
//      }
//      public int size(){
//      return antrian.size();    
//      }
//      public boolean isEmpty(){
//        return antrian.isEmpty();
//      }
//      public void cetak() {
//          for (int i = 0; i < antrian.size(); i++) {
//            System.out.print(antrian.get(i) + " ");
//        }
//        System.out.println();
//    }
//}


    private LinkedList<Mahasiswa> antrian;

    public Queue() {
        antrian = new LinkedList<Mahasiswa>();
    }

    public void enqueue(Mahasiswa mhs) {
        antrian.addLast(mhs);
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue Kosong");
        }
        return antrian.remove();
    }

    public int size() {
        return antrian.size();
    }

    public boolean isEmpty() {
        return antrian.isEmpty();
    }

    public void cetak() {
        for (int i = 0; i < antrian.size(); i++) {
            System.out.println(antrian.get(i));
        }
    }
}
    
    
 
