
public class fibo {
      public static void main(String[] args){
          fibo (6);
          System.out.println(""+ fibo (6));
      }
    public static int fibo (int n){
        if (n == 2){
            return 1;
        } else if (n==1){
            return 1;
    } else {
            return fibo (n-2) + fibo (n-1);
        }
    }
    
}
