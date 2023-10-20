
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyLinkedList<E> implements Queue<E> {
    
    private ListNode<E> front;
private ListNode<E> back;

public MyLinkedList() {
    front = back = null;
}

public boolean isEmpty() {
    return (front == null);
}

public void makeEmpty() {
    front = back = null;
}

public void enqueue(E x) {
    ListNode<E> node = new ListNode<>(x);
    if (isEmpty()) {
        front = back = node;
    } else {
        back.next = node;
        back = node;
    }
}

public void dequeue() {
    if (isEmpty()) {
        try {
            throw new EmptyQueueException();
        } catch (EmptyQueueException ex) {
            Logger.getLogger(MyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    front = front.next;
    if (front == null) {
        back = null;
    }
}

public E getFront() {
    if (isEmpty()) {
        try {
            throw new EmptyQueueException();
        } catch (EmptyQueueException ex) {
            Logger.getLogger(MyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return front.data;
}

public E getFrontAndDequeue() {
    if (isEmpty()) {
        try {
            throw new EmptyQueueException();
        } catch (EmptyQueueException ex) {
            Logger.getLogger(MyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    E element = front.data;
    front = front.next;
    if (front == null) {
        back = null;
    }
    return element;
}

private static class ListNode<E> {
    private E data;
    private ListNode<E> next;

    public ListNode(E data) {
        this.data = data;
        next = null;
    }
}
    
}
