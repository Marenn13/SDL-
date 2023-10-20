

package sdl8;

import java.util.NoSuchElementException;


public class QueueMain {

   
    public static void main(String[] args) {
        
       Queue mhs= new Queue (5);
       
        Mahasiswa m1 = new Mahasiswa("Budi", "101", "Teknik Informatika", "Jl. Raya 123");
        mhs.enqueue(m1);

        Mahasiswa m2 = new Mahasiswa("Andi", "102", "Teknik Industri", "Jl. Kebun Raya 456");
        mhs.enqueue(m2);

        Mahasiswa m3 = new Mahasiswa("Cindy", "103", "Ilmu Komunikasi", "Jl. Cendana 789");
        mhs.enqueue(m3);

        Mahasiswa m4 = new Mahasiswa("Diana", "104", "Psikologi", "Jl. Merdeka 321");
        mhs.enqueue(m4);
        Mahasiswa m5 = new Mahasiswa("Eva", "105", "Akuntansi", "Jl. Sukamaju 543");
        try {
       mhs.enqueue(m1);
       mhs.enqueue(m2);
       mhs.enqueue(m3);
       mhs.enqueue(m4);
        mhs.enqueue(m5);
        
           
        mhs.dequeue();
        mhs.dequeue();
        mhs.dequeue();

        // mencetak isi queue
        System.out.println("Isi queue:");
        while (!mhs.isEmpty()) {
            Mahasiswa m = mhs.dequeue();
            System.out.println(m.getNama() + " - " + m.getNim() + " - " + m.getProdi() + " - " + m.getAlamat());
        }
         
    }
           catch (NoSuchElementException e){
            System.out.println(e.getMessage());
}
        mhs.cetak();
       
        }
}
       
        
       

        
    
    

