package addingSortedLists;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOne = Arrays.asList(new Integer[]{1, 2, 3, 5, 8, 10, 12});
        List<Integer> listTwo = Arrays.asList(new Integer[]{3, 4, 7, 10, 11, 12, 13, 15, 21});

        System.out.println(mergeLists(listOne, listTwo));

    }

    public static List<Integer> mergeLists(List<Integer> first, List<Integer> second) {
        Iterator<Integer> itFirst = first.iterator(), itSecond = second.iterator();
        Integer x, y;
        final List<Integer> result = new ArrayList<Integer>(first.size() + second.size());

        x = itFirst.next();
        y = itSecond.next();

        while (x != null & y != null) {
            if (x < y) {
                result.add(x);
                x = itFirst.hasNext() ? itFirst.next() : null;
            } else {
                result.add(y);
                y = itSecond.hasNext() ? itSecond.next() : null;
            }
        }
        if (x != null) {
            result.add(x);
        } else {
            result.add(y);
        }
        itFirst.forEachRemaining(result::add);
        itSecond.forEachRemaining(result::add);
        return result;
    }
}