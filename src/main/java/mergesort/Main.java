package mergesort;

public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[]{0, 1, 2, 3, 5, 10};
        int[] array2 = new int[]{0, 2, 6, 9};

        int[] merged = MergeSort.merge(array1, array2);

        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }

        int[] array = new int[]{2, 3, 0, -3, 10, 5, 7};

        int[] mergedSorted = MergeSort.mergeSort(array);

        for (int i = 0; i < mergedSorted.length; i++) {
            System.out.println(mergedSorted[i]);
        }
        int[] a = new int[]{5, 1, 3, 5, -2, 2, 4, 5};

        MergeSort.merge2(a, 1, 3, 6);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
