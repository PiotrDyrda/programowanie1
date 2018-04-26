package bubblesort;

import java.util.Comparator;

public class MainGeneric {
    public static void main(String[] args) {
        Integer[] array = {2, -3, 0, 1, 15, 100, 2};
        BubbleSort.sort(array);
        for(Integer i:array){
            System.out.println(i);
        }

        BubbleSort.sort(array, new ReverseComparator() );
        for(Integer i:array){
            System.out.println(i);
        }
    }
}
