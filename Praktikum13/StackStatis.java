
package sdl13;
public class StackStatis {
    
    Object []elemen;
    int front;
    int size;
    
    StackStatis (){
        this.elemen = new Object [5];
        this.front=-1;
        this.size=0;
        
    }
    StackStatis (int ukuran){
        this.elemen=new Object [ukuran];
        this.front=-1;
        this.size = 0;    
    }
    public boolean push (Object element){
      if (isFull ()) {
          return false;
      } 
        front++;
        elemen [front] = element;
        size++;
        return true;
    }
    public Object pop (){
       if (isEmpty()) {
           return null;
       }
       Object element = elemen [front];
       front --;
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
        return front == elemen.length - 1;
    }
     
     
     
     
     
     public static void main(String[] args) {
        StackStatis tump = new StackStatis ();
        tump.push(10);
        tump.push(5);
        tump.push(7);
        
        
        while (!tump.isEmpty()){
            System.out.println(tump.pop());
        }
    }
}

    

