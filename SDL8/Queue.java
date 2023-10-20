// data Statis 
package sdl8;

import java.util.NoSuchElementException;
public class Queue {

//   int[] element;
//    
//    int front;
//    int rear;
//    int size;
//
//    public Queue() {
//        this(10);
//    }
//
//    public Queue(int ukuran) {
//        element = new int[ukuran];// new Mahasiswa [ukuran]
//        front = 0;
//        rear = -1;
//        size = 0;
//    }
//
//    public boolean enqueue(int elemen) {
//        if (rear == element.length-1 ) {
//            return false;
//        } else {
//            rear++;
//            element[rear] = elemen;
//            size++;
//            return true;
//
//        }
//
//    }
//
//    public int dequeue() {
//        if (size == 0) {//sama
//            throw new NoSuchElementException("Queue Kosong");//return null
//        } else {
//            int data = element[front];
//            element[front] = 0;
//            front++;
//            size--;
//            return data;
//        }
//        //Mahasiswa temp=element [front];
//        //element[front] = 0;
////            front++;
////            size--;
////            return data;
//        
//    }
//
//    public int size() {
//        return size;
//
//    }
//
//    public boolean isEmpty() {
//        return (size == 0);
//
//    }
//
//    public void cetak() {
//        if (isEmpty()) {
//            System.out.println("Data Habis");
//        } else {
//
//            for (int i = front; i <= rear; i++) {
//                System.out.println(element[i] + " ");
//            }
//            System.out.println();
//      }
//
//        }
//
//    }
      


 
 Mahasiswa []element;
 int front;
 int rear;
 int size;
 
 public Queue (){
     this (10);
 }
 
 public Queue (int elemen){
     element= new Mahasiswa [elemen];
     front=0;
     rear=-1;
     size=0;
     
     
 }
 public boolean enqueue (Mahasiswa mhs){
     if (rear == element.length -1){
         return false;
     }
     else {
         rear ++;
         element [rear]=mhs;
         size ++;
         return true;
     }
    
 }
 public Mahasiswa dequeue (){
     if (size == 0){
         throw new NoSuchElementException ("Queue Kosong");
     }
     else {
         Mahasiswa mhs =element [front];
         front = (front + 1)% element.length;
         size--;
         return mhs;
     }
 }
 public boolean isEmpty() {
        return size == 0;
    }
 
  public int size() {
        return size;
    }
    public void cetak() {
        if (isEmpty()) {
            System.out.println("Data Habis");
        } else {

            for (int i = front; i <= rear; i++) {
                System.out.println(element[i] + " ");
            }
            System.out.println();
      }

        }

 
 

    }




