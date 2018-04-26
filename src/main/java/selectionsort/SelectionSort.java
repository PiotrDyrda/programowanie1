package selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void sortInt(int[] array) {
        int index, temp;
        for (int i = 0; i < array.length; i++) {
            index = findMinIndex(array, i);
            if (index != i) {
                temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }

    public static int findMinIndex(int[] array, int start) {
        int minIndex = array[start];
        int index = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minIndex) {
                minIndex = array[i];
                index = i;
            }
        }
        return index;
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        int index;
        T temp;
        for (int i = 0; i < array.length; i++) {
            index = findMinIndex2(array, i);
            if (index != 0) {
                temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }

    public static <T extends Comparable<T>> int findMinIndex2(T[] array, int start) {
        T minIndex = array[start];
        int index = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i].compareTo(minIndex) < 0) {
                minIndex = array[i];
                index = i;
            }
        }
        return index;
    }
}

