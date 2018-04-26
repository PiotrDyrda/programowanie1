package quicksort;

public class QuickSort {

    public static int split(int[] array) {
        int pivot = array[array.length - 1];
        int temp1 = 0, l = 0, h = array.length - 2;
        while (l <= h) {
            while (array[l] < pivot) {
                l++;
            }
            while (h >= l && array[h] >= pivot) {
                h--;
            }
            if (l < h) {
                temp1 = array[l];
                array[l] = array[h];
                array[h] = temp1;
            }
        }
        for (int i = array.length - 1; i > h + 1; i--) {
            array[i] = array[i - 1];
        }
        array[h + 1] = pivot;
        return h + 1;
    }

    public static void quickSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int[] less = new int[split(array) - 1];
        int[] more = new int[array.length - split(array) + 1];
        quickSort(less);
        quickSort(more);

    }
}
