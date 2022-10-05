package model;

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
        return;
    }

    /*@Override
    public void increaseKey(T element) {

    }*/

    /*@Override
    public void showElements(T element) {

    }*/

    @Override
    public T showMaximum() {
        return heap.getArr().get(0).getElement();
    }
}
