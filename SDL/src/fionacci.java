 
public class fionacci {
      public static void main(String[] args){
       
          System.out.println(""+fibonaci(6));
      }
    public static int fibonaci (int n){
        if ((n == 1) || (n == 0)){
            return n;
        } else {
            return fibonaci (n-2)+ fibonaci (n-1);
            
        }
    }
    
}
