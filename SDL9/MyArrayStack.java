package sdlix;
import java.util.EmptyStackException;
import java.util.Arrays;

public class MyArrayStack <E> extends ArrayStack<E>{
  private E[] array;
    private int topOfStack;
    private static final int DEFAULT_CAPACITY = 5;

    public MyArrayStack( ) {
        super(DEFAULT_CAPACITY);
      
    }  
    

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public void makeEmpty() {
        topOfStack = -1;
    }

    public E top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[topOfStack];
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        topOfStack--;
    }

    public E topAndPop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E result = array[topOfStack];
        topOfStack--;
        return result;
    }

    public void push(E x) {
        if (topOfStack == array.length - 1) {
            doubleArray();
        }
        topOfStack++;
        array[topOfStack] = x;
    }

    /**
     * Method untuk melakukan Array Doubling.
     * Akan digunakan oleh push(E x) ketika array sudah hampir penuh
     */
    private void doubleArray() {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }
}



   
    


   

