package myownropedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MyList implements Iterable<Integer> {

    private ListNode first, last;
    Integer count = 0;

    public void add(Integer value) {
        ListNode newNode = new ListNode(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        count += 1;
    }

    public void print() {
        String s = "";
        ListNode node = first;
        if (node != null) {
            while (node != null) {
                s += node.getValue() + " ";
                node = node.getNext();
            }
        } else {
            System.out.println("empty list.");
        }
        System.out.println(s);
    }

    public Integer get(Integer nodeNumber) {
        ListNode node = first;
        if (node != null) {
            for (int i = 0; i < nodeNumber; i++) {
                if (node == null) {
                    throw new IndexOutOfBoundsException("given number exceeds number of nodes.");
                }
                node = node.getNext();
            }
        } else
            return null;
        return node.getValue();
    }

    public void set(Integer nodeNumber, Integer value) {
        ListNode node = first;
        if (node != null) {
            for (int i = 0; i < nodeNumber; i++) {
                if (node == null) {
                    throw new IndexOutOfBoundsException("given number exceeds number of nodes.");
                }
                node = node.getNext();
            }
            node.setValue(value);
        }
    }

    public ListNode findNode(Integer nodeNumber) {
        ListNode node = first;
        if (node != null) {
            for (int i = 0; i < nodeNumber; i++) {
                if (node == null) {
                    throw new IndexOutOfBoundsException("given number exceeds number of nodes.");
                }
                node = node.getNext();
            }
        }
        return node;
    }

    public Integer size() {
        return count;
    }

    public boolean contains(Integer value) {
        ListNode node = first;
        if (node != null) {
            while (node != null) {
                if (node.getValue().equals(value)) {
                    return true;
                }
                node = node.getNext();
            }
        } else {
            System.out.println("empty list.");
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyListIterator(first);
    }

    public void removeByIndex(int index) {
        ListNode node = first;
        if (index == 0) {
            node = node.getNext();
            node.setNext(first.getNext().getNext());
            first = node;
        }
        node = findNode(index - 1);
        node.setNext(node.getNext().getNext());
        if (node.getNext().equals(null)) {
            last = node;
        }
    }

    public void removeByValue(Integer value) {
        ListNode node = first;
        while (node.getNext() != null) {
            if (node.getValue().equals(value)) {
                node = node.getNext();
                node.setNext(first.getNext().getNext());
                first = node;
            }
            if (node.getNext().getValue().equals(value)) {
                node.setNext(node.getNext().getNext());
            }
        }
        last = node;
    }
}







