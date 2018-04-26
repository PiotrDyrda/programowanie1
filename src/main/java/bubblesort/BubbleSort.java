package bubblesort;

import java.util.Comparator;

public class BubbleSort {

    public static void sortInt(int[] array) {
        int temp;
        for (int i = array.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable> void sort(T[] array) {
        T temp;
        for (int i = array.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static <T> void sort(T[] array, Comparator<T> cmp) {
        T temp;
        for (int i = array.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (cmp.compare(array[j],array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
