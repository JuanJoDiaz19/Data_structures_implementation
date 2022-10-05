package model;

import java.util.ArrayList;

public class OurPriorityQueue<T> implements IPriorityQueue {
    private Heap<T> heap;

    public OurPriorityQueue () {
        heap = new Heap<>();
    }

    @Override
    public void insertElement(int priorityValue, Object element) {
        heap.addElement(priorityValue, element);
    }

    @Override
    public void extractMax(Object element) {

    }

    @Override
    public void increaseKey(Object element) {

    }

    @Override
    public void showElements(Object element) {

    }

    @Override
    public void showMaximum(Object element) {

    }
}
