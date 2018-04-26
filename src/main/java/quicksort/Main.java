package quicksort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{0, -3, 4, 5, 1, 2};

        System.out.println(QuickSort.split(array));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
