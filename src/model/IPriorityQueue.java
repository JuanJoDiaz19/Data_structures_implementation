package model;

public interface IPriorityQueue<T> {
    void insertElement(int priorityValue, Object element);
    void extractMax(T element);
    void increaseKey(T element);
    void showElements(T element);
    void showMaximum(T element);
}
