package ui;
import priorityQueueImplementation.Heap;
import priorityQueueImplementation.IPriorityQueue;

public class Main {
    public static void main(String[] args) {
        Heap<String> heap = new Heap<String>();
        heap.addElement(5, "Juan");
        heap.addElement(1, "Francisco");
        heap.addElement(4, "Alberto");
        heap.addElement(6, "Javier");
        heap.addElement(9, "Nelson");
        heap.addElement(11, "Patricia");

        System.out.println(heap.print());
        IPriorityQueue<String> pq = new Heap<>();
        pq.insertElement(5, "Juan");
        pq.insertElement(10, "Federico");
        pq.insertElement(4, "Alberto");
        pq.insertElement(2, "Patricia");

        //Tests informales xd :)
        System.out.println("The top element is:");
        System.out.println(pq.showMaximum());
        System.out.println("Lets extract the maximun:");
        System.out.println(pq.extractMax());
        System.out.println("Lets extract the maximun:");
        System.out.println(pq.extractMax());
        System.out.println("Lets extract the maximun:");
        System.out.println(pq.extractMax());
        System.out.println("The elements in the list are:");
        System.out.println(pq.showElements());;

    }
}