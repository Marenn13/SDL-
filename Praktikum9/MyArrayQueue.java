
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyArrayQueue<E> implements Queue<E> {

    private E[] array;
    private int front;
    private int back;
    private int size;
    private static final int DEFAULT_CAPACITY = 5;

    public MyArrayQueue() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
        front = back = 0;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void makeEmpty() {
        size = 0;
        front = back = 0;
        Arrays.fill(array, null);
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            try {
                throw new EmptyQueueException();
            } catch (EmptyQueueException ex) {
                Logger.getLogger(MyArrayQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return array[front];

    }

    @Override
    public void dequeue() {
        if (isEmpty()) {
            try {
                throw new EmptyQueueException();
            } catch (EmptyQueueException ex) {
                Logger.getLogger(MyArrayQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        array[front] = null;
        front++;
        size--;
        if (isEmpty()) {
            front = back = 0;
        }
    }

    @Override
    public E getFrontAndDequeue() {
        if (isEmpty()) {
            try {
                throw new EmptyQueueException();
            } catch (EmptyQueueException ex) {
                Logger.getLogger(MyArrayQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        E element = array[front];
        array[front] = null;
        front++;
        size--;
        if (isEmpty()) {
            front = back = 0;
        }
        return element;
    }

    @Override
    public void enqueue(E x) {
        if (size == array.length) {
            resize(2 * array.length);
        }
        array[back] = x;
        back++;
        size++;
        if (back == array.length) {
            back = 0;
        }
    }

    private void resize(int capacity) {
        E[] newArray = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(front + i) % array.length];
        }
        array = newArray;
        front = 0;
        back = size;
    }

}
