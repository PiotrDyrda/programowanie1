package mergesort;

public class MergeSort {

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[mid + i];
        }
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void merge2(int[] array, int start, int mid, int stop) {
        int[] copy = new int[stop - start + 1];
        for (int i = start; i <= stop; i++) {
            copy[i - start] = array[i];
        }
        int newMid = mid - start;
        int i = 0, j = newMid + 1, k = start;

        while (i <= newMid && j < copy.length) {
            if (copy[i] <= copy[j]) {
                array[k] = copy[i];
                i++;
            } else {
                array[k] = copy[j];
                j++;
            }
            k++;
            while (i <= newMid) {
                array[k] = copy[i];
                i++;
                k++;
            }

            while (j < copy.length) {
                array[k] = copy[j];
                j++;
                k++;
            }
        }
    }

    public static void sortInt2(int[] array, int start, int stop) {
        if (stop <= start) {
            return;
        }
        int mid = (start + stop / 2);
        sortInt2(array, start, mid);
        sortInt2(array, mid + 1, stop);
        merge2(array,start,mid,stop);
    }
}
