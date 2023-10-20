
public class paijo {
     public static void main(String[] args){
        //paijo (4);
         
        System.out.println("" + paijo (3));
     }
     
    public static int paijo(int x) {
        if (x == 0) {
            return 0;
        }
        return 2 * paijo(x - 1) + x * x;
}

    
 }
