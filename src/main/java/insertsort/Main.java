package insertsort;

import bubblesort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{0, 3, 1, 10, 5, 2, 7, 24, 11, -5, 5, -3};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        InsertSort.sort(array);

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String[] stringArray = new String[]{"ala", "bundono", "mino", "nibuvy","cojhjasfaf"};
        InsertSort.sort(stringArray);
        System.out.println();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        System.out.println();

        BubbleSort.sort(stringArray,new StringComparator());
        for(String i:stringArray){
            System.out.println(i);
        }
    }
}
