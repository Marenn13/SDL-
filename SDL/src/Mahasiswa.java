
package Praktikum1;

import java.lang.Comparable;
public class Mahasiswa implements Comparable <Mahasiswa>  {
    String nama;
    String nim;
    
    
    Mahasiswa (String nama, String nim){
        this.nama=nama;
        this.nim=nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

   @Override
    public int compareTo(Mahasiswa other) {
        return nim.compareTo(other.nim);
    }

    @Override
    public String toString() {
        return "Mahasiswa [nim=" + nim + ", nama=" + nama + "]";
    }
    
    
    
    
}
