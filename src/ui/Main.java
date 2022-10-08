package ui;
import hashTableImplementation.HashTable;
import priorityQueueImplementation.Heap;
import priorityQueueImplementation.IPriorityQueue;
import priorityQueueImplementation.NodePriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        HashTable<String, String> mapa = new HashTable<>(1);
        /*mapa.insert("123", "Juan Jose");
        System.out.println(mapa.search("123"));
        mapa.insert("122", "Patricia");
        mapa.deleteKey("122");
        System.out.println(mapa.search("123"));
        System.out.println(mapa.search("122"));*/

        mapa.insert("123", "Juan Jose");
        mapa.insert("456", "Patricia");
        mapa.deleteKey("123");
        System.out.println(mapa.search("123"));;
        System.out.println(mapa.search("456"));
    }
}