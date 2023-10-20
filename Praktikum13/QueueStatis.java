
package sdl13;
public class QueueStatis {
    Object []elemen;
    int front;
    int rear;
    int size;
    
    QueueStatis (){
    elemen = new Object[5];
    front = 0;
    rear = -1;
    size = 0;
    }
    QueueStatis (int ukuran){
      elemen = new Object[ukuran];
        front=0;
        rear=-1;
        size=0;
    }
    public boolean enqueue(Object element){
       if (isFull()){
           return false;
       }
      rear++;
      this.elemen[rear]=element;
      size++;
      return true;
        
    }
    public Object dequeue(){
        if (isEmpty ()){
            return null;
        }
        Object element = elemen [front];
        front =(front +1)% elemen.length;
        size--;
        return element;
        
    }
    public int size (){
        return size;
        
    }
    public boolean isEmpty(){
        return size == 0;
        
    }
     private boolean isFull() {
        return size == elemen.length -1;
    }
     public static void main(String[] args) {
       QueueStatis antrian = new QueueStatis(5);

        antrian.enqueue(14);
        antrian.enqueue(25);
        antrian.enqueue(58);

        while (!antrian.isEmpty()) {
            System.out.println(antrian.dequeue()); 
    }
}
}
