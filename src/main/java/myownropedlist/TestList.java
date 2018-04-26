package myownropedlist;

public class TestList {
    public static void main(String[] args) {
        MyList l = new MyList();
        l.add(4);
        l.add(3);
        l.add(12);
        l.add(128);
        l.add(7);

//        l.print();
//        System.out.println(l.get(4));
//        l.set(2,5);
//        System.out.println(l.get(2));
//        System.out.println(l.contains(128));
//        l.removeByIndex(0);
//        l.print();
        l.removeByValue(128);
        l.print();
    }
}
