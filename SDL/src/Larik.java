
package Praktikum1;
    import java.util.Arrays;

public class Larik {
    public static int sequentialSearch(Mahasiswa[] arr, Mahasiswa key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(key) == 0) {
                return i; 
            }
        }
        return -1;
    }
    public static int binarySearch(Mahasiswa[] arr, Mahasiswa key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = arr[mid].compareTo(key);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }

    public static int interpolationSearch(Mahasiswa[] arr, Mahasiswa key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key.compareTo(arr[low]) >= 0 && 
                key.compareTo(arr[high]) <= 0) {
            if (low == high) {
                if (arr[low].compareTo(key) == 0) {
                    return low; 
                }
                return -1; 
            }

            int pos = low + (((high - low) / (arr[high].compareTo(arr[low]))) *
                    (key.compareTo(arr[low])));

            if (arr[pos].compareTo(key) == 0) {
                return pos; 
            } else if (arr[pos].compareTo(key) < 0) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1; 
    }
    
    public static void main(String[] args) {
        Mahasiswa[] arrMahasiswa = {
            new Mahasiswa("John", "12345"),
            new Mahasiswa("Jane", "67890"),
            new Mahasiswa("Alice", "54321"),
            new Mahasiswa("Bob", "98765"),
            new Mahasiswa("Eva", "13579")
        };

        // Sequential Search
       Mahasiswa keySequential = new Mahasiswa("Alice", "54321");
       int indexSequential = Larik.sequentialSearch(arrMahasiswa, keySequential);
        if (indexSequential != -1) {
            System.out.println("Mahasiswa dengan NIM " + keySequential.getNim() 
                    + " ditemukan di indeks " + indexSequential);
        } else {
            System.out.println("Mahasiswa dengan NIM " + keySequential.getNim() 
                    + " tidak ditemukan");
        }

        // Binary Search
        Mahasiswa keyBinary = new Mahasiswa("Bob", "98765");
        int indexBinary = Larik.binarySearch(arrMahasiswa, keyBinary);
        if (indexBinary != -1) {
            System.out.println("Mahasiswa dengan NIM " + keyBinary.getNim()
                    + " ditemukan di indeks " + indexBinary);
        } else {
            System.out.println("Mahasiswa dengan NIM " + keyBinary.getNim()
                    + " tidak ditemukan");
        }

        // Interpolation Search
        Mahasiswa keyInterpolation = new Mahasiswa("Eva", "13579");
        int indexInterpolation = Larik.interpolationSearch(arrMahasiswa, 
                keyInterpolation);
        if (indexInterpolation != -1) {
            System.out.println("Mahasiswa dengan NIM " + keyInterpolation.getNim()
                    + " ditemukan di indeks " + indexInterpolation);
        } else {
            System.out.println("Mahasiswa dengan NIM " + keyInterpolation.getNim()
                    + " tidak ditemukan");
        }
    }
}
    

