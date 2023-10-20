package Larik;

public class LarikJava {

    static int sequentialSerch(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (key < sortedArray[mid]) {
                high = mid - 1;
            } else if (key > sortedArray[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int interpolationSearch(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;
        while (low < high) {
            int mid = low + ((key - sortedArray[low]) * (high - low))
                    / (sortedArray[high] - sortedArray[low]);
            if (key > sortedArray[mid]) {
                low = mid + 1;
            } else if (key < sortedArray[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
       }
      static void bubleSort (int [] array){
//         System.out.println("data sebelum di Ascending");
//         for (int i=0; i < array.length; i++){
//             System.out.println(" "+ (i+1)+ "");
//             for (int j =0; j < array.length; j++)
//                 System.out.println(array [i]+ "");
//         }
//         
         System.out.print("data yang sudah di Ascending");
         for ( int i=0; i < array.length;i++){
              for (int j=0; j < array.length-i-1; j++){
                  if (array[i]> array [j+1]){ 
                      int a= array [j];
                      array[j]=array [j+1];
                      array [j+1]= a;
                  } 
     }
     }
      }
       
     public static void selectionSort (int [] array){
//         System.out.println("data sebelum di sorting");
//         for (int i=0; i < array.length; i++){
//             System.out.println(array[i]+ "");}
         
          System.out.print(" data yang Discending");
            for ( int i=0; i < array.length-1;i++){
                System.out.println("" + (i+1)+ "");
                for (int j=0; j < array.length;j++)
                    System.out.println(array [j]+ "");
                
               
         
     }
}

    static void cetak(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
      }
      }
