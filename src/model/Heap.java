package model;

import java.util.ArrayList;

public class Heap<T> implements IHeap{
    private ArrayList<NodePriorityQueue<T>> arr;
    public Heap() {
        arr = new ArrayList<>();
        arr.add(null);
    }
    @Override
    public void addElement(int priorityValue, Object element) {
        arr.add(new NodePriorityQueue(priorityValue,element));
        buildMaxHeapify();
    }
    @Override
    public void maxHeapify(int index) {
        int l = 2*index;
        int r = 2*index + 1;
        int largest;
        if(l <= arr.size()-1 && arr.get(l).getPriorityValue() > arr.get(index).getPriorityValue()) {
            largest = l;
        } else {
            largest = index;
        }
        if(r<= arr.size()-1 && arr.get(r).getPriorityValue()  > arr.get(largest).getPriorityValue() ) {
            largest = r;
        }
        if(largest != index) {
            NodePriorityQueue<T> temp1= arr.get(index);
            NodePriorityQueue<T> temp2= arr.get(largest);
            arr.set(index,temp2);
            arr.set(largest,temp1);
            maxHeapify(largest);
        }
    }

    @Override
    public void buildMaxHeapify() {
        for(int i= arr.size()-1; i >=1;i--){
            maxHeapify(i);
        }
    }

    @Override
    public ArrayList heapSort(ArrayList arr) {
        return null;
    }

    public String print() {
        String ans = "";
        for (int i = 1; i <arr.size(); i++) {
            ans += arr.get(i).getPriorityValue() + " ";
        }
        return ans;
    }
}
