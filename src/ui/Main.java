package ui;
import hashTableImplementation.HashTable;
import priorityQueueImplementation.Heap;
import priorityQueueImplementation.IPriorityQueue;
import priorityQueueImplementation.NodePriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        /*Heap<String> heap = new Heap<String>();
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
        System.out.println(pq.showElements());*/


        //Acontinuacion vamos a testear la Hash Table:

        Heap<String> heap=new Heap<>();


        heap.getArr().add(new NodePriorityQueue<>(16, "Juan"));
        heap.getArr().add(new NodePriorityQueue<>(4, "Francisco"));
        heap.getArr().add(new NodePriorityQueue<>(10, "Alberto"));
        heap.getArr().add(new NodePriorityQueue<>(14, "Javier"));
        heap.getArr().add(new NodePriorityQueue<>(7, "Nelson"));
        heap.getArr().add(new NodePriorityQueue<>(9, "Patricia"));
        heap.getArr().add(new NodePriorityQueue<>(3, "Nelly"));
        heap.getArr().add(new NodePriorityQueue<>(2, "Esteban"));
        heap.getArr().add(new NodePriorityQueue<>(8, "Julio"));
        heap.getArr().add(new NodePriorityQueue<>(1, "Andrew"));
        System.out.println(heap.print());
        heap.maxHeapify(2);
        System.out.println(heap.print());

        HashTable<String, String> mapa = new HashTable<>(1);
        mapa.insert("123", "Juan Jose");
        System.out.println(mapa.search("123"));
        mapa.insert("122", "Patricia");
        mapa.delete("123");
        System.out.println(mapa.search("123"));
        System.out.println(mapa.search("122"));
    }
}