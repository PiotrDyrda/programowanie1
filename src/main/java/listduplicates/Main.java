package listduplicates;

import java.util.ArrayList;
import java.util.HashSet;

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

        System.out.println(noDuplcates(list));
        System.out.println(listTOSet(list));
    }

    public static ArrayList<Integer> noDuplcates(ArrayList<Integer> list) {
        ArrayList<Integer> reformattedList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (reformattedList.contains(list.get(i))) {
                i++;
            } else {
                reformattedList.add(list.get(i));
            }
        }
        return reformattedList;
    }

    public static ArrayList<Integer> listTOSet(ArrayList<Integer> list) {
        HashSet<Integer> setList = new HashSet<Integer>();
        ArrayList newList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (setList.contains(list.get(i))) {
                i++;
            } else {
                setList.add(list.get(i));
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
