package generics;

import java.util.LinkedList;

public class TestGenerics {
    public static <T extends Comparable<T>> T foo(T arg) {
        System.out.println(arg);
        arg.compareTo(arg);
        return arg;
    }

    public static void main(String[] args) {
        foo("test");
        foo(2);
        String s = foo("test");
        Integer n = foo(2);
//        foo(new LinkedList<Integer>());
    }
}
