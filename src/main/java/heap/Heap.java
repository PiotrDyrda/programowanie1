package heap;

public class Heap {

    private int[] array;
    private int size;

    public Heap(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public int getLeftChild(int i) {
        return 2 * i + 1;
    }

    public int getRightChild(int i) {
        return 2 * i + 2;
    }

    public int getParent(int i) {
        return (i - 1) / 2;
    }

    public void printOut(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void add(int i) {
        array[size] = i;
        sifUp(size);
        size++;
    }

    public void sifUp(int index) {
        int temp, parentIndex;
        while (index > 0 && array[index] < array[getParent(index)]) {
            parentIndex = getParent(index);
            temp = array[getParent(index)];
            array[getParent(index)] = array[index];
            array[index] = temp;
            index = parentIndex;
        }
    }

    public int pop(){
        int value = array[0];
        array[0] = array[size-1];
        size--;
        sifDown();
        return value;
    }

    public void sifDown() {
        int temp, childIndex;
        int index = 0;
        while (array[getLeftChild(index)] < size && array[getRightChild(index)] < size &&
                (array[index] > array[getLeftChild(index)] || array[index] > array[getRightChild(index)])) {
            if (array[getRightChild(index)] > array[getLeftChild(index)]) {
                childIndex = getLeftChild(index);
                temp = array[getLeftChild(index)];
                array[getLeftChild(index)] = array[index];
                array[index] = temp;
                index = childIndex;
            } else {
                childIndex = getRightChild(index);
                temp = array[getRightChild(index)];
                array[getRightChild(index)] = array[index];
                array[index] = temp;
                index = childIndex;
            }
        }
    }
}
