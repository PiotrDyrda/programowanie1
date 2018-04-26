package heap;

public class Main {
    public static void main(String[] args) {

        Heap heap = new Heap(100);

        heap.add(1);
        heap.add(2);
        heap.add(5);
        heap.add(7);
        heap.add(1);
        heap.add(3);
        heap.add(4);
        heap.add(17);
        heap.add(10);
        heap.add(5);
        heap.pop();
        heap.printOut();


    }
}
