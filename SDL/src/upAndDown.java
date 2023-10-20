
public class upAndDown {
    
      public static void main(String[] args){
        upAndDown (3);
        //  System.out.println(""+ upAndDown  );
      }
    	public static void upAndDown (int n) 
	{
		System.out.print ("\nLevel: " +  n);
		if (n < 4)
			upAndDown (n+1);
		System.out.print ("\nLEVEL: " + n);

    
    
}
}
