

package Larik;
import java.util.Arrays;

public class larikTest {

    
    public static void main(String[] args) {
       
    int [] array = {0,8,19,20,14,2,6};
     int key = 2;
        
    int [] sortedArray = {0,2,6,8,14,19,20};
    LarikJava.cetak(array);
    Arrays.sort (array);
    System.out.print("Array yang telah diurutkan" + Arrays.toString(array)+"\n");
    System.out.println("Angka Yang dicari adalah : " + key);
    System.out.print("Menggunakan Sequential search angka " + key +
      " berada pada indeks : " + LarikJava.sequentialSerch(array, key)+ " \n");
    System.out.print("Menggunakan Binary Search angka " + key + 
      " berada pada indeks  : " + LarikJava.binarySearch(sortedArray, key)+ " \n");
    System.out.print("Menggunakan Interpolation Search angka " + key + 
      "berada pada indeks : " +LarikJava.interpolationSearch(sortedArray,key)+ "\n");    
     LarikJava.bubleSort(array);
     LarikJava.cetak(array);
     LarikJava.selectionSort(array);
     LarikJava.cetak(array);

        
        
        
        
        
        
        
       
        
//        
//        System.out.print( LarikJava.sequentialSerch(array, key));
//       
        
//        LarikJava call = new LarikJava();
       
        
        
                
        
        
        
        
    }
    
}
