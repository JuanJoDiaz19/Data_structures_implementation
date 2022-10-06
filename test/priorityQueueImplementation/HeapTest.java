package priorityQueueImplementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {
    private Heap<String> heap;

    private void setUp1(){
        heap=new Heap<>();
    }
    private void setUp2(){
        heap=new Heap<>();
        heap.addElement(5, "Juan");
        heap.addElement(1, "Francisco");
        heap.addElement(4, "Alberto");
        heap.addElement(6, "Javier");
        heap.addElement(9, "Nelson");
        heap.addElement(11, "Patricia");
    }
    private void setUp3(){
        Heap<String> heap =  new Heap<>();
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
    }
    private void setUp4(){
        heap=new Heap<>();
        heap.getArr().add(new NodePriorityQueue<>(5, "Juan"));
        heap.getArr().add(new NodePriorityQueue<>(1, "Francisco"));
        heap.getArr().add(new NodePriorityQueue<>(4, "Alberto"));
        heap.getArr().add(new NodePriorityQueue<>(6, "Javier"));
        heap.getArr().add(new NodePriorityQueue<>(9, "Nelson"));
        heap.getArr().add(new NodePriorityQueue<>(11, "Patricia"));

    }


    @Test
    public void addElementTest(){
        setUp1();
        heap.addElement(10,"Hola");
        assertEquals("Hola",heap.extractMax());
    }

    @Test
    public void maxHeapifyTest1(){
        setUp3();
        heap.maxHeapify(2);
        assertEquals("16 14 10 8 7 9 3 2 4 1 ",heap.print());
    }


}