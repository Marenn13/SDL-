package Praktikum8;
import java.util.NoSuchElementException;


public class QueueMain {

    
    public static void main(String[] args) {
        

        Queue queue = new Queue();

        // Enqueue 5 Mahasiswa objects
        queue.enqueue(new Mahasiswa("John", "1234", "Computer Science", "123 Main St"));
        queue.enqueue(new Mahasiswa("Jane", "5678", "Mathematics", "456 Maple Ave"));
        queue.enqueue(new Mahasiswa("Bob", "9012", "Biology", "789 Oak Blvd"));
        queue.enqueue(new Mahasiswa("Alice", "3456", "History", "321 Pine Rd"));
        queue.enqueue(new Mahasiswa("Charlie", "7890", "English", "654 Cedar Ln"));

        // Dequeue 3 Mahasiswa objects
        for (int i = 0; i < 3; i++) {
            Mahasiswa mhs = queue.dequeue();
            System.out.println("Dequeued Mahasiswa: " + mhs.getNama() + " - " + mhs.getNim() + " - " + mhs.getProdi() + " - " + mhs.getAlamat());
        }

        
        queue.cetak();
    }
}
    

       