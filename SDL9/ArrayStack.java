

package sdlix;


public class ArrayStack <E> implements Stack<E>{
    private E []array;
    private int top;
   
    public ArrayStack(int capacity) {
        array = (E[]) new Object[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void makeEmpty() {
        top = -1;
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return array[top];
    }

    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }

    public E topAndPop() {
        if (isEmpty()) {
            return null;
        }
        E result = array[top];
        top--;
        return result;
    }

    public void push(E x) {
        if (top == array.length - 1) {
            @SuppressWarnings("unchecked")
            E[] newArray = (E[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        top++;
        array[top] = x;
    }
} 
  
    

