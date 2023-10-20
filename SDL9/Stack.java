

package sdlix;


//public class Stack <E>{
    
    public interface Stack<E> {
    boolean isEmpty();
    void makeEmpty();
    E top();
    void pop();
    E topAndPop();
    void push(E x);
}
    

