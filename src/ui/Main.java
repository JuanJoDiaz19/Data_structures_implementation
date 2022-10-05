package ui;
import model.Heap;

public class Main {
    public static void main(String[] args) {
        Heap<String> heap = new Heap<String>();
        heap.addElement(5, "Juan");
        heap.addElement(1, "Francisco");
        heap.addElement(4, "Alberto");
        heap.addElement(6, "Javier");
        heap.addElement(9, "Nelson");
        heap.addElement(11, "Patricia");

        System.out.println(heap.print());;
    }
}