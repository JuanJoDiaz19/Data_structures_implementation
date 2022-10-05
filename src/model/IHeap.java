package model;

import java.util.ArrayList;

public interface IHeap<T> {
    void addElement(int priorityValue, T element);
    void maxHeapify(int index);
    void buildMaxHeapify();
    ArrayList<T> heapSort(ArrayList<T> arr);
}
