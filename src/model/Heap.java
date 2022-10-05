package model;

import java.util.ArrayList;

public class Heap<T> implements IPriorityQueue<T>{
    private ArrayList<NodePriorityQueue<T>> arr;
    public Heap() {
        arr = new ArrayList<>();
        arr.add(null);
    }
    public void addElement(int priorityValue, Object element) {
        arr.add(new NodePriorityQueue(priorityValue,element));
        buildMaxHeapify();
    }
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
    public void buildMaxHeapify() {
        for(int i= arr.size()-1; i >=1;i--){
            maxHeapify(i);
        }
    }
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
    public ArrayList<NodePriorityQueue<T>> getArr() {
        return arr;
    }
    public void setArr(ArrayList<NodePriorityQueue<T>> arr) {
        this.arr = arr;
    }

    @Override
    public void insertElement(int priorityValue, T element) {
        addElement(priorityValue, element);
    }

    @Override
    public T extractMax() {
        if(arr.size() <2) {
            //Error
        }
        T max = arr.get(1).getElement();
        arr.set(1,arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
        maxHeapify(1);
        return max;
    }

    @Override
    public void increaseKey(T element, int newPriortyValue) {
        int index = -1;
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i).getElement().equals(element)) index = i;
        }
        if(newPriortyValue < arr.get(index).getPriorityValue()) {
            //
            //Error, the key is lower than the current key
        }
        while (index>1 && arr.get(index/2).getPriorityValue() <arr.get(index).getPriorityValue()){
            NodePriorityQueue<T> temp1 = arr.get(index/2);
            NodePriorityQueue<T> temp2 = arr.get(index);
            arr.set(index, temp1);
            arr.set(index/2, temp2);
            index = index/2;
        }

    }

    @Override
    public String showElements(T element) {
        return null;
    }

    @Override
    public T showMaximum(T element) {
        return arr.get(0).getElement();
    }
}
