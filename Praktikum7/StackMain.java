package sdl7;

public class StackMain {

    public static void main(String[] args) {

        Stack s = new Stack();//1
        s.push(23);//2
        s.push(45);//3
        s.push(56);//4
        System.out.println("Ukuran   :" + s.size() + "=>");
        s.cetak();//5
        if (s.pop() == -1)//6
        {
            System.out.println("Data Sudah Habis");//7
        } else {
            System.out.println("Ukuran  :" + s.size() + "=>");s.cetak();
        }
        int e = s.pop();
        if (s.isEmpty()) {
            System.out.println("Data Sudah Habis");
        } else {
            System.out.println("Ukuran   :" + s.size() + "=>");
            s.cetak();
        }
        s.push(56);
        if (s.pop() == -1) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran  :" + s.size() + "=>");
            s.cetak();
        }
        if (s.pop() == -1) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran   :" + s.size() + "=>");
            s.cetak();
        }

    }

}
