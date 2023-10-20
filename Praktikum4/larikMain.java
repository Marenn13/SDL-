

package sdliv;




public class larikMain {

    
    public static void main(String[] args) {
         int[] array = {5,8,26,15,11,31} ;
                 int[] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random()*10);
         }
        long tStart = System.nanoTime();
        Larik.InsertionSortDiscending(data);
        
        long tFinish = System.nanoTime();
        long t = tFinish-tStart;
        Larik.cetak(data);
        System.out.println();
        System.out.print("Waktu : "+t + " nano Time");
        System.out.println();
        
        
        
        System.out.println("Data Ascending ");Larik.InsertionSortDiscending(array);
        System.out.println("Buble sort");Larik.bubbleSortDescending(array);
      //  System.out.println("kiuk sort");Larik.partitionAscending(array, low, high);
    }
   
        
        
     
//        System.out.print("Insertion Ascending :");Larik.InsertionSortAscending(array);Larik.cetak(array);
//        System.out.println();
//        System.out.println("Insertion Discanding :");Larik.selectionSortDescending(array);Larik.cetak(array);
//        
//       
    }
    

