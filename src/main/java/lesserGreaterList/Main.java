package lesserGreaterList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        List<Integer> myList = Arrays.asList(new Integer[] {1,3,4,5,6,0,30,20,22});

        lesserGreater(list);
        System.out.println(list);
        lesserGreater(myList);
        System.out.println(myList);
    }

    public static void lesserGreater(List<Integer> list) {
        if (list.size() >= 2) {
            Integer tmp, order = list.get(1) - list.get(0);
            if (order == 0) {
                order = 1;
            }
            for (int i = 0; i < list.size() - 1; i++) {
                if ((list.get(i + 1) - list.get(i)) * order > 0) {
                    tmp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tmp);
                }
                order = -order;
            }
        }
    }
}