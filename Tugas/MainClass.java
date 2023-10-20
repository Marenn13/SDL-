

package tugassdl;


public class MainClass {

   
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

    // Tambahkan elemen ke linked list
    linkedList.addFirst(1);
    linkedList.addLast(3);
    linkedList.addBefore(2, 3);
    linkedList.addAfter(4, 3);
// Cetak isi linked list
        System.out.println(linkedList);

        // Hapus elemen dari linked list
        linkedList.remove(2);

        // Cetak isi linked list
        System.out.println(linkedList);

        // Ambil elemen dari linked list berdasarkan index
        System.out.println("Elemen ke-0: " + linkedList.get(0));
        System.out.println("Elemen ke-1: " + linkedList.get(1));

        // Cetak jumlah elemen di linked list
        System.out.println("Jumlah elemen: " + linkedList.size());
    }
}

    

      





    
    

