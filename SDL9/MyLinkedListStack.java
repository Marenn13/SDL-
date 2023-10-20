

package sdlix;
import java.util.EmptyStackException;

public class MyLinkedListStack<E> implements Stack<E> {
    private ListNode<E> tos;

    public MyLinkedListStack() {
        tos = null;
    }

    public boolean isEmpty() {
        return tos == null;
    }

    public void makeEmpty() {
        tos = null;
    }

    public E top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return tos.data;
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        tos = tos.next;
    }

    public E topAndPop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E result = tos.data;
        tos = tos.next;
        return result;
    }

    public void push(E x) {
        tos = new ListNode<>(x, tos);
    }

    /**
     * Inner class untuk merepresentasikan node dari LinkedList
     */
    private static class ListNode<E> {
        E data;
        ListNode<E> next;

        public ListNode(E data, ListNode<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}

