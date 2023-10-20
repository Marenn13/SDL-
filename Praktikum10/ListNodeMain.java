

package SDL10;

import java.util.NoSuchElementException;

public class ListNodeMain {
    public static void main(String[] args) {
             LinkedList list = new LinkedList();

      // Tambahkan data 8 di awal senarai
        list.addBefore(8, null);

        // Tambahkan data 15 di awal senarai
        list.addBefore(15, list.getFirst());

        // Tambahkan data 26 di akhir senarai
        list.addBefore(26, list.getLast());

        // Tambahkan data 14 di akhir senarai
        list.addBefore(14, list.getLast());

        // Hapus data di posisi akhir senarai
        try {
            list.remove(list.getLast());
        } catch (NoSuchElementException e) {
            System.out.println("Tidak dapat menghapus elemen. Senarai kosong.");
        }

        // Hapus data di posisi akhir senarai
        try {
            list.remove(list.getLast());
        } catch (NoSuchElementException e) {
            System.out.println("Tidak dapat menghapus elemen. Senarai kosong.");
        }

        // Hapus data di posisi awal senarai
        try {
            list.remove(list.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Tidak dapat menghapus elemen. Senarai kosong.");
        }

        // Hapus data di posisi awal senarai
        try {
            list.remove(list.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Tidak dapat menghapus elemen. Senarai kosong.");
        }

        // Hapus data di posisi awal senarai
        try {
            list.remove(list.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Tidak dapat menghapus elemen. Senarai kosong.");
        }

        // Tampilkan isi senarai
        list.displayList();

        // Cari data 14 dalam senarai
        ListNode foundNode = list.search(14);
        if (foundNode != null) {
            System.out.println("Data 14 ditemukan dalam senarai.");
        } else {
            System.out.println("Data 14 tidak ditemukan dalam senarai.");
        }
    }
}
    

        
    
    

