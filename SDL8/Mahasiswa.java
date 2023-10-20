
package sdl8;


public class Mahasiswa {
    String nama,nim,prodi,alamat;
   
   
    
    public Mahasiswa(String nama, String nim, String prodi, String alamat){
        this.nama=nama;
        this.nim=nim;
        this.prodi=prodi;
        this.alamat=alamat;
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

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
