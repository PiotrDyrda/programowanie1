package bubblesort;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{0, -3, 1, 10, 5, 2, 7, 24, 11, 3, 3, 5, -3};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        BubbleSort.sortInt(array);

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
