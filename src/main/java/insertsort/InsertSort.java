package insertsort;

public class InsertSort {

    public static void sortInt(int[] array) {
        int j, temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void sortStringByLength(String[] array) {
        int j;
        String temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i - 1;
            while (j >= 0 && temp.length() < array[j].length()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        int j;
        T temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i - 1;
            while (j >= 0 && temp.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
