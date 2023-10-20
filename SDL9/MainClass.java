package sdlix;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Contoh penggunaan MyArrayStack:");
        MyArrayStack<Integer> myArrayStack = new MyArrayStack<>();
        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);
        myArrayStack.push(4);
        myArrayStack.push(5);
        System.out.println("top: " + myArrayStack.top()); // 5
        myArrayStack.push(6);
        System.out.println("top: " + myArrayStack.top()); // 6
        myArrayStack.pop();
        System.out.println("top: " + myArrayStack.top()); // 5
        
        // contoh penggunaan MyLinkedListStack
        System.out.println("\nContoh penggunaan MyLinkedListStack:");
        MyLinkedListStack<String> myLinkedListStack = new MyLinkedListStack<>();
        myLinkedListStack.push("satu");
        myLinkedListStack.push("dua");
        myLinkedListStack.push("tiga");
        System.out.println("top: " + myLinkedListStack.top()); // tiga
        myLinkedListStack.pop();
        System.out.println("top: " + myLinkedListStack.top()); // dua
        
        // contoh penggunaan ArrayStack
        System.out.println("\nContoh penggunaan ArrayStack:");
        ArrayStack<Double> arrayStack = new ArrayStack<>(3);
        arrayStack.push(1.0);
        arrayStack.push(2.0);
        arrayStack.push(3.0);
        System.out.println("top: " + arrayStack.top()); // 3.0
        arrayStack.pop();
        System.out.println("top: " + arrayStack.top()); // 2.0
    }
}

    

 
