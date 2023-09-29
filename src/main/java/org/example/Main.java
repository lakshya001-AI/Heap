package org.example;

public class Main {
   public static void main(String[] args){
       Heap heap = new Heap();
       System.out.println(heap.getHeap());

       heap.insert(34);
       heap.insert(89);
       heap.insert(90);
       heap.insert(78);
       System.out.println();

       System.out.println(heap.getHeap());

       heap.insert(200);

       System.out.println();

       System.out.println(heap.getHeap());

       heap.remove();

       System.out.println();

       System.out.println(heap.getHeap());





   }

}