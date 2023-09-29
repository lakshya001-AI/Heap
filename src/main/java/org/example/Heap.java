package org.example;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    //data in the heap class is always stored in the list
    private List<Integer> heap;

    //constructor of the heap
    public Heap(){
        this.heap = new ArrayList<>();
    }
    //getheap
    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }
    //leftchild
    public int leftchild(int index){
        return 2*index + 1;
    }

    //rightchild
    public int rightchild(int index){
        return 2*index + 2;
    }

    //parent
    public int parent(int index){
        return (index - 1)/2;
    }

    //swap
    public void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1 , heap.get(index2));
        heap.set(index2 , temp);
    }

    //insert
    public void insert(int value){
        heap.add(value);
        int currentindex = heap.size() - 1;

        while (currentindex > 0 && heap.get(currentindex) > heap.get(parent(currentindex))){
            swap(currentindex , parent(currentindex));
            currentindex = parent(currentindex);
        }
    }
    //remove

    public Integer remove(){
        if (heap.size() == 0){
            return null;
        }
        if (heap.size() == 1){
            return heap.remove(0);
        }

        int maxvalue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkdown(0);

        return maxvalue;
    }



    //sinkdown

    public void sinkdown(int index){
        int maxindex = index;
        while (true){
            int leftindex = leftchild(index);
            int rightindex = rightchild(index);

            if (leftindex < heap.size() && heap.get(leftindex) > heap.get(maxindex)){
                maxindex = leftindex;
            }
            if (rightindex < heap.size() && heap.get(rightindex) > heap.get(maxindex)){
                maxindex = rightindex;
            }
            if (maxindex != index){
                swap(index , maxindex);
                maxindex = index;
            }
            else {
                return;
            }
        }
    }











}
